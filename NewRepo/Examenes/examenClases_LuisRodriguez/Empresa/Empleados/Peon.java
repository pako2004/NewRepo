package Examenes.examenClases_LuisRodriguez.Empresa.Empleados;


public class Peon extends Empleado {

    public enum TallaRopa{XS, S, L, XL, XXL}
    

    //Atributos
    private TallaRopa talla;
    
    //Constructor
    public Peon(String nombre, String apellidos, Turno turno, TallaRopa talla) {
        super(nombre, apellidos, turno);
        super.sueldo = 1000;
        this.talla = talla;
    }
    //Metodos
    @Override
    public String muestraInformacion() {

        return  this.codigo+" "+this.nombre+" "+this.apellidos+" - Peon "+this.sueldo+" Talla Ropa"+talla;
    }
    
}
