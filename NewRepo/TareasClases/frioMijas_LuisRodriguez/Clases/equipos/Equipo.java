package frioMijas_LuisRodriguez.Clases.equipos;

public abstract class Equipo {

    //Atributos
    protected double alto;
    protected double ancho;
    protected double profundidad;
    protected String marca;
    protected double frigorias;
    abstract double consumo();
    protected double consumo;


    public Equipo(double alto, double ancho, double profundidad, String marca, double frigorias)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.marca = marca;
        this.frigorias = frigorias;
    }

    @Override
    public String toString()
    {

        return "Alto: " + this.alto + " | Ancho: "+this.ancho+" | Profundidad: " + this.profundidad
        +" | Marca: " + this.marca +" | Frigorias: "+this.frigorias;
    }



}
