package Examenes.examenClases_LuisRodriguez.Empresa.Empleados;



public abstract class  Empleado {

    public enum Turno{MAÑANA, TARDE, NOCHE}
    //Atributos
    String nombre;
    String apellidos;
    float sueldo;
    Turno turno;
    int codigo;
    private static int cont = 0; //Contador para el codigo unico

    //COnstructor
    public Empleado(String nombre, String apellidos, Turno turno){
        
        cont++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.turno = turno;
        this.codigo = cont;

    }

    //Metodos
    public abstract String muestraInformacion();

    public float getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCodigo() {
        return codigo;
    }


}
