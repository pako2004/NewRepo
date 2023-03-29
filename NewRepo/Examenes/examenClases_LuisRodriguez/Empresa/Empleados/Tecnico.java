package Examenes.examenClases_LuisRodriguez.Empresa.Empleados;

public class Tecnico extends Empleado{

    //Atrributos
    private String nombreTituloOficial;
    private int yearTitulo;
    
    //Constructor
    public Tecnico(String nombre, String apellidos, Turno turno, String titulo, int yearTitulo) {
        
        super(nombre, apellidos, turno);
        super.sueldo = 2000;
        this.nombreTituloOficial = titulo;
        this.yearTitulo = yearTitulo;
    }
    //Metodos
    @Override
    public String muestraInformacion() {
  
        return  this.codigo+" "+this.nombre+" "+this.apellidos+" - Tecnico "+this.sueldo+" Titulo:"+this.nombreTituloOficial+"("+this.yearTitulo+")";
  
  
    }
    
}
