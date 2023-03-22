package frioMijas_LuisRodriguez.Clases.personal;

import java.util.Arrays;
import frioMijas_LuisRodriguez.Clases.equipos.Equipo;


public class Sede {

    //Atributos 

    private String ciudad;
    private String direccion;
    public int codigoSede;
    private static int  count = 0;
    private Jefe jefe;
    private Empleado[] empleados = new Empleado[0];
    private Equipo[] frigorificos = new Equipo[0];

    public Sede(String ciudad, String direccion,int codigoSede, Jefe jefe)
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = ++count;
        this.jefe = jefe;
    }

    public Sede(String ciudad, String direccion, int codigoSede)
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;

    }

    boolean repetido(String dni)
    {
        boolean repedito = false;

        for (int i = 0; i < empleados.length; i++) {
            
            if (dni.equals((String)empleados[i].getDni()))
            {
                repedito = true;
            }
        }

        return repedito;
    }


    public void  setJefe(Jefe jefe)
    {
        this.jefe = jefe;
    }

    public void addEmpleado(Empleado empleado)
    {   
        if (repetido(empleado.getDni()))
        {
            System.out.println("DNI repetido");
        }else
        {
        this.empleados = addArray(empleado);
        }
    }   

    public void addFrigorificos(Equipo frigori)
    {
        this.frigorificos = addArray(frigori);
    }



    private Empleado[]  addArray(Empleado empleado) //Agregar empleados al array
    {

        Empleado[] newArrays = Arrays.copyOf(this.empleados, this.empleados.length+1);

        for (int i = 0; i < this.empleados.length; i++) {
                newArrays[i] = this.empleados[i];

        }
        newArrays[newArrays.length-1] = empleado;

        return newArrays;
    }

    private Equipo[]  addArray(Equipo frigo) // Agregar frigorificos al array de equipos
    {

        Equipo[] newArrays = Arrays.copyOf(this.frigorificos, this.frigorificos.length+1);

        for (int i = 0; i < this.frigorificos.length; i++) {
                newArrays[i] = this.frigorificos[i];

        }
        newArrays[newArrays.length-1] = frigo;

        return newArrays;
    }

    public void mostrarEmpleados(Sede sede)
    {
        for (int i = 0; i < empleados.length; i++) {
            
            if (empleados[i].salario >= 500 && empleados[i].salario <= 1500)
            {
                System.out.println(empleados[i].toString());
            }
            

        }
    }

    public void mostrarFrigorificos(Sede sede)
    {
        for (int i = 0; i < frigorificos.length; i++) {
            
            System.out.println(frigorificos[i]);

        }
    }


    @Override   
    public String toString()
    {
        System.out.println("Sede de: " +this.ciudad);

        System.out.println(this.jefe.toString());

        for (int i = 0; i < empleados.length; i++) {
            
            System.out.println(this.empleados[i].toString());
        }
            
        return "";
    }


}
