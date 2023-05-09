package restaurante;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.Set;

public class Producto {

    public enum TipoProducto{BOCATA, SANDWICH, PIZZA, CAMPERO, BEBIDA, POSTRE}

    //Atributos

    private String nombre;
    private TipoProducto tipo;
    private Set<String> ingredientes;
    private double precio;
    private int codigo;
    private static int aux = 0;

    
    public Producto(String nombre, TipoProducto tipo, Set<String> ingredientes, double precio)
    {   

        this.nombre = nombre;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.precio = precio;
        aux++;
        this.codigo = aux;
        

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public TipoProducto getTipo() {
        return tipo;
    }


    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }


    public Set<String> getIngredientes() {
        return ingredientes;
    }


    public void setIngredientes(Set<String> ingredientes) {
        this.ingredientes = ingredientes;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public static int getAux() {
        return aux;
    }


    public static void setAux(int aux) {
        Producto.aux = aux;
    }


   
    
}
