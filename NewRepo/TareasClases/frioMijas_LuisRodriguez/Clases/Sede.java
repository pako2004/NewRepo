package frioMijas_LuisRodriguez.Clases;

import java.util.Arrays;

import javax.swing.border.EmptyBorder;

public class Sede {

    //Atributos 

    private String ciudad;
    private String direccion;
    public int codigoSede;
    private static int  count = 0;
    private Jefe jefe;
    private Empleado[] empleados = new Empleado[0];

    

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

    public void  setJefe(Jefe jefe)
    {
        this.jefe = jefe;
    }

    public void  addEmpleado(Empleado empleado)
    {

        Empleado[] newArrays = Arrays.copyOf(empleados, empleados.length+1);

        for (int i = 0; i < empleados.length; i++) {
                newArrays[i] = empleados[i];

        }
        newArrays[newArrays.length-1] = empleado;


    }



}
