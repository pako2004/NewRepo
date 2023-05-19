package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

public class Ferreteria {
    

    private List<Clientes> listaClientes;
    private List<Producto> listaProductos;
    private List<Ventas> listaVentas;


    public Ferreteria()
    {

        this.listaClientes = UtilesRead.leerClientesJson("src/recursos/clientes.json");
        this.listaProductos = UtilesRead.leerProductosCsv("src/recursos/productos.csv");
        this.listaVentas = UtilesRead.leerVentasJson("src/recursos/ventas.json");

    }


    public void FacturacionClientes()
    {   
        String cadena = "==== FACTURAS CLIENTE =====\n";
        Double totalGastado; 

        for (int i = 0; i < this.listaClientes.size(); i++) 
        {   
            totalGastado = 0.0;
            //Cod cliente || Lineas > codigoProducto


            //GUardo en una variable el cod del cliente
            Integer codliente = this.listaClientes.get(i).getCodigo();

            //Bucle que va a buscar las compras de este cliente 
            for (int j = 0; j < this.listaVentas.size(); j++) 
            {
                
                //Si el cod de cliente es el mismo en la venta
                if(this.listaVentas.get(j).getCodigoCliente().equals(codliente))
                {   
                    //Bucle que recorra la lista de lineas
                    for (int j2 = 0; j2 < this.listaVentas.get(j).getLineas().size(); j2++) 
                    {

                        Integer codProducto = this.listaVentas.get(j).getLineas().get(j2).getCodigoProducto();

                        for (int k = 0; k < this.listaProductos.size(); k++) 
                        {
                            //Si el codigo del producto es el mismo 
                            if  (codProducto.equals(this.listaProductos.get(k).getCodigo()))
                            {   
                                totalGastado += this.listaProductos.get(k).getPrecio(); 
                            }
                        }
                    }
                }

            }
            //agrego a la cadena la info del cliente
            
            
            cadena += "\n Cliente: "+this.listaClientes.get(i).getNombre()+" Total gastado: "+totalGastado;





        }

        try (FileWriter fw = new FileWriter("src/recursos/FacturacionClientes.txt");
        BufferedWriter bw = new  BufferedWriter(fw)) 
    {
    
            bw.write(cadena);



    } catch (Exception e) {
    }

    }  


    public void productosVendidos()
    {   
        String cadena = "==== PRODUCTOS VENDIDOS ==== ";
        Integer vecesVendido = 0;
        

            //Profe, a falta de tiempo me toca copiar y pegar el codigo, si tuviese mas tiempo buscaria 
            //una solucion que haga el codigo menos repetitivo
            
            for (int i = 0; i < this.listaClientes.size(); i++) 
            {   
                //Cod cliente || Lineas > codigoProducto
    
    
                //GUardo en una variable el cod del cliente
                Integer codliente = this.listaClientes.get(i).getCodigo();
    
                //Bucle que va a buscar las compras de este cliente 
                for (int j = 0; j < this.listaVentas.size(); j++) 
                {
                    
                    //Si el cod de cliente es el mismo en la venta
                    if(this.listaVentas.get(j).getCodigoCliente().equals(codliente))
                    {   
                        //Bucle que recorra la lista de lineas
                        for (int j2 = 0; j2 < this.listaVentas.get(j).getLineas().size(); j2++) 
                        {
                            //Almaceno el cod del producto actual en la linea
                            Integer codProducto = this.listaVentas.get(j).getLineas().get(j2).getCodigoProducto();
                            

                            //bucle que recorre la lista del de producots
                            for (int k = 0; k < this.listaProductos.size(); k++) 
                            {
                                //Si el codigo del producto es el mismo 
                                if  (codProducto.equals(this.listaProductos.get(k).getCodigo()))
                                {   
                                    cadena += "\n"+this.listaProductos.get(k).getNombre()+" Codigo: "
                                    +this.listaProductos.get(k).getCodigo();
                                }
                            }
                        }
                    }
    
                }
                //agrego a la cadena la info del cliente
    
    
            }
            try (FileWriter fw = new FileWriter("src/recursos/ProductosVendidos.txt");
            BufferedWriter bw = new  BufferedWriter(fw)) 
        {
        
                bw.write(cadena);
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public void facturacionTotal()
    {   
        String cadena = "====== FACTURACION TOTAL FERRETERIA PAKO =====\n";

           //Profe, a falta de tiempo me toca copiar y pegar el codigo, si tuviese mas tiempo buscaria 
            //una solucion que haga el codigo menos repetitivo
          Double totalGastado; 
          Double FacturaTotal = 0.0;

        for (int i = 0; i < this.listaClientes.size(); i++) 
        {   
            totalGastado = 0.0;
            //Cod cliente || Lineas > codigoProducto


            //GUardo en una variable el cod del cliente
            Integer codliente = this.listaClientes.get(i).getCodigo();

            //Bucle que va a buscar las compras de este cliente 
            for (int j = 0; j < this.listaVentas.size(); j++) 
            {
                
                //Si el cod de cliente es el mismo en la venta
                if(this.listaVentas.get(j).getCodigoCliente().equals(codliente))
                {   
                    //Bucle que recorra la lista de lineas
                    for (int j2 = 0; j2 < this.listaVentas.get(j).getLineas().size(); j2++) 
                    {

                        Integer codProducto = this.listaVentas.get(j).getLineas().get(j2).getCodigoProducto();

                        for (int k = 0; k < this.listaProductos.size(); k++) 
                        {
                            //Si el codigo del producto es el mismo 
                            if  (codProducto.equals(this.listaProductos.get(k).getCodigo()))
                            {   
                                totalGastado += this.listaProductos.get(k).getPrecio(); 
                                
                            }
                        }
                    }
                }

            }
            
            

            FacturaTotal += totalGastado;
        }

        cadena += "Total facturado = "+FacturaTotal;

        try (FileWriter fw = new FileWriter("src/recursos/FacturacionTotal.txt");
        BufferedWriter bw = new  BufferedWriter(fw)) 
    {
    
            bw.write(cadena);



    } catch (Exception e) {
    }
        

    }
    

    /************************** */

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }


    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }


    public List<Producto> getListaProductos() {
        return listaProductos;
    }


    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    public List<Ventas> getListaVentas() {
        return listaVentas;
    }


    public void setListaVentas(List<Ventas> listaVentas) {
        this.listaVentas = listaVentas;
    }


    

}
