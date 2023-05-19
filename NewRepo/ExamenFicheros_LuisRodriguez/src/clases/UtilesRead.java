package clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilesRead {
    


public static List<Clientes> leerClientesJson(String pathFile)
{   
    File file = new File(pathFile);

    ObjectMapper mapper = new ObjectMapper();

    List<Clientes> listaClientes = null; 
    
    try {
        listaClientes = mapper.readValue(file, new TypeReference<List<Clientes>>() {});
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    // Revisar los clientes leidos y retirar los repetidos

    //recorre un cliente
    for (int index = 0; index < listaClientes.size(); index++) 
    {
        
        //recorre toda la lista por cada cliente
        for (int i = 0; i < listaClientes.size(); i++) 
        {   
            //Evita que borre la posicion actual
            if(index != i)
            {   
                if(listaClientes.get(index).equals(listaClientes.get(i)))
                {
                    listaClientes.remove(i);
                }

            }
               
        }

    }



    return listaClientes;

}





public static List<Ventas> leerVentasJson(String pathFile)
{   
    File file = new File(pathFile);

    ObjectMapper mapper = new ObjectMapper();

    List<Ventas> listaVentas = null; 
    
    try {
        listaVentas = mapper.readValue(file, new TypeReference<List<Ventas>>() {});
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


    return listaVentas;

}





public static List<Producto> leerProductosCsv(String pathfile)
{
    List<Producto> listaProductos = new ArrayList<>();
    
    try (FileReader fr = new FileReader(pathfile);
        BufferedReader br = new BufferedReader(fr) ) 
    {
        String linea = br.readLine();
        int numLinea = 1;
        while(linea != null)
        {
            if(numLinea != 1 )
            {

                String[] productoLinea = linea.split(";");
                

                //En caso de que un producto del csv tenga valores invalidos va lanzar una Exception
                try 
                {


                    Producto newProducto = new Producto();

                    if(Integer.parseInt(productoLinea[4]) > 0)
                    {

                        newProducto.setCodigo(Integer.parseInt(productoLinea[0]));
                        newProducto.setNombre(productoLinea[1]);
                        newProducto.setDescripcion((productoLinea[2]));
                        newProducto.setPrecio(Double.parseDouble(productoLinea[3]));
                        newProducto.setStock(Integer.parseInt(productoLinea[4]));

                    }else{
                        throw new ExcepcionProductoSinStock("El producto "+productoLinea[1] +" con codigo "+productoLinea[0]+" no esta en stock");
                    }
                    
                    listaProductos.add(newProducto);
                    
                }catch (ExcepcionProductoSinStock noStock)
                {
                    System.out.println(noStock.getMessage());
                }catch (Exception e)
                {
                    System.out.println("ERROR en la lectura de un producto en la cadena: "+linea);
                }

            }
            linea = br.readLine();
            numLinea++;
        }
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

      // Revisar los productos leidos y retirar los repetidos

    //recorre un producto
    for (int index = 0; index < listaProductos.size(); index++) 
    {
        
        //recorre toda la lista por cada producto
        for (int i = 0; i < listaProductos.size(); i++) 
        {   
            //Evita que borre la posicion actual
            if(index != i)
            {   
                if(listaProductos.get(index).equals(listaProductos.get(i)))
                {
                    listaProductos.remove(i);
                }

            }
               
        }

    }



    return listaProductos;



}



}
