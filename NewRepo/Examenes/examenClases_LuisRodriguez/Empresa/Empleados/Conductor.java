package Examenes.examenClases_LuisRodriguez.Empresa.Empleados;

import java.time.LocalDate;

public class Conductor extends Empleado{

    //Atributos
    private LocalDate fechaCaducidadCarnet;

    //Constructor
    public Conductor(String nombre, String apellidos, Turno turno, LocalDate fecha) {
        super(nombre, apellidos, turno);
        super.sueldo = 1500;
        this.fechaCaducidadCarnet = fecha;
    }

    //Metodos
    @Override
    public String muestraInformacion() {
  
        return  this.codigo+" "+this.nombre+" "+this.apellidos+" - Conductor "+this.sueldo+" Fecha Caducidad Carnet:"+this.fechaCaducidadCarnet;
    }
    
}
