package Examenes.examenInterfaz_LuisRodrigez;

public class Producto {
    
    //Atributos
    private String categoria;
    private String nombre;
    private String descripcion;
    private double precio;
    private int id;
    static int aux = 0;


    public Producto(String nombre, String descripcion, double precio, String categoria)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this. categoria = categoria;
        aux++;
        this.id = aux;
    }


    public String getCategoria() {
        return categoria;
    }


    public int getId() {
        return id;
    }


    public double getPrecio() {
        return precio;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.id+" - "+this.nombre+" - "+this.descripcion+" - "+this.precio+" - "+this.categoria;
    }
    
}
