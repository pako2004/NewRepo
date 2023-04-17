package Examenes.examenInterfaz_LuisRodrigez;

import java.nio.channels.ReadPendingException;
import java.util.ArrayList;
import java.util.Arrays;


public class Tienda implements Tienda_I {
    
    //Atributos
    CarritoCompra CarritoDeCompra;
    DescuentoPorCategoria DescuentosPorCategorias;
    ArrayList<Producto> listado;
    public Tienda()
    {
        this.CarritoDeCompra = new CarritoCompra();
        this.DescuentosPorCategorias = new DescuentoPorCategoria();
        this.listado = new ArrayList<>();
    }


    @Override
    public boolean insertarProducto(Producto producto) 
    {       
        boolean repetido = false;
        for (int i = 0; i < this.listado.size(); i++) //Recorre todo el array
        {
            if(listado.get(i).getNombre().equals(producto.getNombre()))//Compara el nombre de todos los elementos
            {
                repetido = true;
            }    
        }

        if  (repetido)
        {
            return false;
        }
        else
        {
            return this.listado.add(producto);
        }
           
    }
    @Override
    public String mostrarProductosPorNombre() {
        String cadena = "";

        String[] codigos = new String[this.listado.size()]; 
        for (int i = 0; i < this.listado.size(); i++)//Almaceno los codigos en un array para luego ordenarlos  
        {      
            codigos[i] = this.listado.get(i).getNombre();
               
        }
        Arrays.sort(codigos);

        for (int index = 0; index < codigos.length; index++) {
            
            cadena += codigos[index]+" - "; 
        }
        return cadena;
    }
    @Override
    public String mostrarProductosPorId() {
        String cadena = "";
        int[] codigos = new int[this.listado.size()]; 
        for (int i = 0; i < this.listado.size(); i++)//Almaceno los codigos en un array para luego ordenarlos  
        {      
            codigos[i] = this.listado.get(i).getId();
               
        }
        Arrays.sort(codigos);

        for (int index = 0; index < codigos.length; index++) {
            
            cadena += codigos[index]+" - ";

        }
        return cadena;
        
    }
    @Override
    public Producto buscarProducto(int id) 
    {
    boolean encontrado = false;
    Producto buscado = new Producto(null, null, id, null);
    for (int i = 0; i < this.listado.size(); i++)
    {
        if(this.listado.get(i).getId() == id)
        {
            encontrado = true;
            buscado = this.listado.get(i);
        }
    }

    if(encontrado)
    {
        return buscado;
    }else{
        return null;
    }

    }
    @Override
    public double obtenerCuentaTotal() {
        double subTotal = 0.0;
        double total = 0.0;
        String[] categorias = new String[this.DescuentosPorCategorias.getDescuentos().size()]; 
        

        for (int index = 0; index < this.CarritoDeCompra.getListaCompra().size(); index++) 
        {
            subTotal += this.CarritoDeCompra.getListaCompra().get(index).getPrecio(); //Va sumando el precio de todos los articulos que tiene el carrito
            if (this.DescuentosPorCategorias.getDescuentos().containsKey(this.CarritoDeCompra.getListaCompra().get(index).getCategoria()))
            {
                
            }  

            //Aqui iba a almacenar las key en un array para luego aplicar el descuento segun las categorias almacenadas en el array 
        }    
        
 




        return total;
    }


    public CarritoCompra getCarritoDeCompra() {
        return CarritoDeCompra;
    }


    public DescuentoPorCategoria getDescuentosPorCategorias() {
        return DescuentosPorCategorias;
    }

    
}
