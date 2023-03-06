package frioMijas_LuisRodriguez.Clases.personal;

public class Jefe extends Empleado {

    private Password password;


    public Jefe(String nombre, String apellidos, int edad, int codigoSede, String dni) {
        super(nombre, apellidos, edad, codigoSede, dni);
        
    }


    public void generaPassword(int longitud)
    {

    Password newPassword = new Password(longitud);
    
    this.password = newPassword;
    }

    public void generaPassword()
    {

    Password newPassword = new Password(8);
    
    this.password = newPassword;
    }

    @Override
    public String toString()
    {
        return "Nombre jefe: "+this.nombre + "Contraseña: "+this.password.toString();
    }
    
    
}
