package frioMijas_LuisRodriguez.Clases;

public class Empleado {

    //Atributos
    protected String nombre;
    protected int edad;
    protected String apellidos;
    private int codUnico;
    private static int count = 0;
    public int codigoSede;


    //Constructor 
    public Empleado(String nombre, int edad, String apellidos, int codigoSede)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.codUnico = ++count;
        this.codigoSede = codigoSede;
        
    }


    
}
