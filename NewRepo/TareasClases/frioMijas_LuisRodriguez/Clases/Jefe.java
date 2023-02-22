package frioMijas_LuisRodriguez.Clases;

public class Jefe extends Empleado {

    private String password;


    public Jefe(String nombre, int edad, String apellidos, int codigoSede, String password) {
        super(nombre, edad, apellidos, codigoSede);
        this.password = password;
    }

    
    
}
