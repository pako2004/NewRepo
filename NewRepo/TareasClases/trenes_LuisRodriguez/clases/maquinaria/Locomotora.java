package trenes_LuisRodriguez.clases.maquinaria;

import trenes_LuisRodriguez.clases.Empleados.Mecanico;

public class Locomotora {


    private String matricula;
    private int potMotor;
    private int antiguedad;
    Mecanico mecanico;


    //Constructores
    public Locomotora(String matricula, int potMotor, int antiguedad, Mecanico mecanico){

        this.matricula = matricula;
        this.potMotor = potMotor;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;

    

    }

    public Locomotora(String matricula, int potMotor, int antiguedad){

        this.matricula = matricula;
        this.potMotor = potMotor;
        this.antiguedad = antiguedad;
    
    }

    public Locomotora(String matricula, int potMotor){

        this.matricula = matricula;
        this.potMotor = potMotor;

    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString()
    {
        return this.matricula +" ("+this.potMotor+") ";
    }    
}
