package restaurante;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class Restaurante 
{

    private Map<Integer, MiLista<Producto>> comandas;
    private Carta carta;

    public Restaurante()
    {
        this.comandas = new HashMap<>();
        
        for (int i = 1; i < 11; i++) 
        {
            this.comandas.put(i, null);
        }

        FactoriaProductos factoriaProductos = new FactoriaProductos();
        
        this.carta = new Carta(factoriaProductos.crearProductosRestaurante());

    }

    public boolean addProducto(Integer mesa, Producto producto)
    {

        if(producto!= null)
        {
            this.comandas.get(mesa).add(producto);
            return true;
        }else{
            return false;
        }

    }

    public boolean deleteProducto(Integer mesa, Producto producto)
    {
        return this.comandas.get(mesa).remove(producto);
    }

    public String mostrarComanda(Integer mesa)
    {     
        MiLista<Producto> comanda = this.comandas.get(mesa);
        
        String cadena = "";

        for (int i = 0; i < comanda.size(); i++) 
        {

            cadena += "Codigo = "+comanda.get(i).getCodigo()+", nombre = '"+comanda.get(i).getNombre()
                    +"', Tipo= "+comanda.get(i).getTipo()+", indredientes ="+comanda.get(i).getIngredientes().toString()+
                    ", precio= "+comanda.get(i).getPrecio()+"\n";
        }

        return cadena;
    }

    //////////////

    public Map<Integer, MiLista<Producto>> getComandas() {
        return comandas;
    }

    public void setComandas(Map<Integer, MiLista<Producto>> comandas) {
        this.comandas = comandas;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public double obtenerFacturaMesa(Integer mesa)
    {
        double total = 0;
        for (int index = 0; index < this.comandas.get(mesa).size(); index++)
        {
            
            total += this.comandas.get(mesa).get(index).getPrecio();

        }

        return total;

    }



}
