package colecciones.EjerciciosColecciones;

public class Elemento {

    //Atributos

    String nombre;
    double precio;
    int cantidad;

    public Elemento(String nombre, double precio, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {

        return this.nombre +" : Unidades "+this.cantidad+" Subtotal: "+(this.precio*this.cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }   


}
