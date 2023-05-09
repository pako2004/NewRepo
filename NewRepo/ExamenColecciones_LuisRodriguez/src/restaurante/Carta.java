package restaurante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import restaurante.Producto.TipoProducto;

public class Carta {
    
    MiLista<Producto> carta;

    public Carta(List<Producto> carta)
    {
        for (int index = 0; index < carta.size(); index++) 
        {
            
            this.carta.add(carta.get(index));

        }
    }

    public boolean addNuevoProducto(Producto producto)
    {
        return this.carta.add(producto); 
    }

    public boolean deleteProducto(int codigo)
    {   
        boolean remove = false;
        for (int i = 0; i < carta.size(); i++) 
        {
            
            if (carta.get(i).getCodigo() == codigo)
            {
                this.carta.remove(i);
                remove = true;
            }   

        }

        return remove;

    }

    public Set<Producto> productosConIngrediente(List<String> ingredientes)
    {
        Set<Producto> listaProductos = new HashSet<Producto>();

        for (int i = 0; i < ingredientes.size(); i++) //Recorro todos los ingredientes
        {   
            String ingrediente = ingredientes.get(i);

            for (int j = 0; j < carta.size(); j++) //recorre todos los productos
            {
                if(carta.get(i).getIngredientes().contains(ingrediente))//si en los ingredientes de ese producto esta el ingrediente pedido
                {
                    listaProductos.add(carta.get(i));
                }
                
            }
            
        }

        return listaProductos;
    }
    
    public List<Producto> productosPorTipo(TipoProducto tipo)
    {
        List<Producto> listaProductos = new ArrayList<Producto>();

        for (int i = 0; i < this.carta.size(); i++) 
        {
            
            if(this.carta.get(i).getTipo().equals(tipo))
            {
                listaProductos.add(this.carta.get(i));
            }
        }

        return listaProductos;
    }

    public MiLista<Producto> getProductos()
    {
        return this.carta;
    }

    public Producto getProducto(int codigo)
    {   

        int pos = 0;
        boolean encontrado = false;
        for (int index = 0; index < this.carta.size(); index++) 
        {
            
            if (this.carta.get(index).getCodigo() == codigo)
            {
                pos = index;
                encontrado = true;
            }

        } 

        if(encontrado)
        {
            return this.carta.get(pos);
        }else{
            return null;
        }
    }

}
