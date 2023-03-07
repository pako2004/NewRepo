package frioMijas_LuisRodriguez.Clases.personal;

public class Empleado {

    //Atributos
    protected String nombre;
    protected int edad;
    protected String apellidos;
    private int codUnico;
    private static int count = 0;
    public int codigoSede;
    private String dni;


    //Constructor 
    public Empleado(String nombre,String apellidos,int edad, int codigoSede, String dni)
    {
        count++;
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.codUnico = count;
        this.codigoSede = codigoSede;
        this.dni = dni;
        
    }


    public Empleado(String nombre2, int edad2, String apellidos2, int codigoSede2) 
    {
    }

    @Override
    public String toString()
    {
        return "Empleado "+this.codUnico+": "+this.nombre;
    }
    
}
