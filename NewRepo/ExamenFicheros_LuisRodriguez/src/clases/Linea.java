package clases;

public class Linea {
    

    private Integer idLinea;
    private Integer codigoProducto;
    private Integer cantidad;



    public Linea()
    {

    }

    
    @Override
    public String toString() {

        return this.idLinea+" codProducto: "+this.codigoProducto+" cantidad: "+ this.cantidad;
    }

    /***************************************************++ */
    public Integer getIdLinea() {
        return idLinea;
    }
    public void setIdLinea(Integer idLinea) {
        this.idLinea = idLinea;
    }
    public Integer getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    

}
