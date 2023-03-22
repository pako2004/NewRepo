package ejerciciosInterfaz.negoEjemplo;

import javax.print.DocFlavor.STRING;

public class Cliente {

    private String nombre;
    private double dinero;

    public Cliente(String nombre, double dinero)
    {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public Cliente ()
    {
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public int compareTo(Object o)
    {   
        Cliente c = (Cliente)o;

        int resultado;

        if(this.dinero < c.getDinero())
        {
            resultado = -1;

        }else if(this.dinero > c.getDinero())
        {
            resultado = 1;
        }else
        {
            resultado = this.nombre.compareTo(c.getNombre());
        }

        return resultado;
    }

}
