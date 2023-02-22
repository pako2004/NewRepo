package frioMijas_LuisRodriguez.Clases;

public abstract class Equipo {

    //Atributos
    protected double alto;
    protected double ancho;
    protected double profundidad;
    protected String marca;
    public abstract double frigorias();
    public abstract double consumo();



    public Equipo(double alto, double ancho, double profundidad, String marca)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.marca = marca;
    }



}
