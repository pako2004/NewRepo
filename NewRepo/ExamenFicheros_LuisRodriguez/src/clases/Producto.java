package clases;

public class Producto {


    private Integer codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private Integer stock;


    @Override
    public String toString() {
        
        return this.codigo+" "+this.nombre + " " +this.descripcion+" "+ this.precio
                +" "+this.stock+" \n";
    }

    /**************************************************************++ */

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    

    
}
