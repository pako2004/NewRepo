package clases;

import java.util.List;

public class Ventas {


    private Integer codigoCliente;
    private String fecha;
    private List<Linea> lineas; 

    public Ventas()
    {}


    @Override
    public String toString() {
        
        return "Cliente: "+this.codigoCliente+" "+this.fecha+" Lineas["+this.lineas+"]\n"; 
    }

    /*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^`` */


    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }





 
    
}
