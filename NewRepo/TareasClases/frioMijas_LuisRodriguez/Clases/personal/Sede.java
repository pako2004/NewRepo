package frioMijas_LuisRodriguez.Clases.personal;

import java.util.Arrays;

public class Sede {

    //Atributos 

    private String ciudad;
    private String direccion;
    public int codigoSede;
    private static int  count = 0;
    private Jefe jefe;
    private Empleado[] empleados = new Empleado[0];
    //Hacer array de los frigorificos

    

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

    public void addEmpleado(Empleado empleado)
    {
        this.empleados = addArray(empleado);
    }



    public Empleado[]  addArray(Empleado empleado)
    {

        Empleado[] newArrays = Arrays.copyOf(this.empleados, this.empleados.length+1);

        for (int i = 0; i < this.empleados.length; i++) {
                newArrays[i] = this.empleados[i];

        }
        newArrays[newArrays.length-1] = empleado;

        return newArrays;
    }

    @Override   //TERMINA ESTO 
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
