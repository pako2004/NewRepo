package trenes_LuisRodriguez.clases.Empleados;

import java.time.LocalDate;

public class JefeEstacion {

    //Atributos
    private String nombre;
    private String dni;
    private LocalDate fechaAscenso;


    //Constructor
    public JefeEstacion( String nombre, String dni, LocalDate fechaAscenso){

        this.nombre = nombre;
        this.dni = nombre;
        this.fechaAscenso = fechaAscenso;
        
    }

    public JefeEstacion( String nombre, String dni){

        this.nombre = nombre;
        this.dni = nombre;
    
    }
        //Metodos

    //Modificar fecha a cargo 
    public void modificarFechaCargo(int año, int mes, int dia){

        this.fechaAscenso = LocalDate.of(año,mes,dia);
        
    }


    
}
