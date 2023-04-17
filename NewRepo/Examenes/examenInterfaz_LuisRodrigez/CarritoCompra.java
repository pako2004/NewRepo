package Examenes.examenInterfaz_LuisRodrigez;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class CarritoCompra {
    
    //Atributos 
    ArrayList<Producto> listaCompra;


    public CarritoCompra()
    {
        this.listaCompra = new ArrayList<>();
    }

    public boolean insertar(Producto producto)
    {
        return this.listaCompra.add(producto);

    }
    public boolean eliminar(int id)
    {   
        int index = 0; // Variable que me ayuda a recorrer  el arrayList y almacenar la posicion en donde se encuentra el producto
        boolean buscar = false;
        while(buscar == false && index < listaCompra.size())
        {
            if((listaCompra.get(index).getId()) == id)
            {
                buscar = true;
                this.listaCompra.remove(index); 
            }else{
                index++;
            }
        }

        return buscar;

    }

    public void limpiarCarrito()
    {
        this.listaCompra.clear();
    }

    public String mostrarPorCodigo()
    {   
        String cadena = "";
        int[] codigos = new int[this.listaCompra.size()]; 
        for (int i = 0; i < this.listaCompra.size(); i++)//Almaceno los codigos en un array para luego ordenarlos  
        {      
            codigos[i] = this.listaCompra.get(i).getId();
               
        }
        Arrays.sort(codigos);

        for (int index = 0; index < codigos.length; index++) {
            
            cadena += codigos[index]+" - ";

        }
        return cadena;
        
    }

    public String mostrarPorNombre()
    {
        String cadena = "";

        String[] codigos = new String[this.listaCompra.size()]; 
        for (int i = 0; i < this.listaCompra.size(); i++)//Almaceno los codigos en un array para luego ordenarlos  
        {      
            codigos[i] = this.listaCompra.get(i).getNombre();
               
        }
        Arrays.sort(codigos);

        for (int index = 0; index < codigos.length; index++) {
            
            cadena += codigos[index]+" - ";

        }

        return cadena;
    }

    public ArrayList<Producto> getListaCompra() {
        return listaCompra;
    }

}
