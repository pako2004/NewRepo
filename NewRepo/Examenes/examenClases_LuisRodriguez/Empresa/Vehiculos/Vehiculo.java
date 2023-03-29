package Examenes.examenClases_LuisRodriguez.Empresa.Vehiculos;

import java.time.LocalDate;

import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Conductor;

public class Vehiculo {

    
    //Atributos
    private String matricula;
    private int kms; // Kilometros
    private Conductor conductor;
    private LocalDate fecha;

    //Constructor
    public Vehiculo(String matricula, int kms, LocalDate fecha, Conductor conductor)
    {
        this.matricula = matricula;
        this.kms = kms;
        this.fecha = fecha;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
    
        return this.matricula+" "+this.kms+"Km "+ this.fecha+" "+this.conductor.getNombre()+" "+this.conductor.getApellidos();
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
