package frioMijas_LuisRodriguez.Clases;

public class Sede {

    //Atributos 

    private String ciudad;
    private String direccion;
    public int codigoSede;
    private static int  count = 0;
    private Jefe jefe;

    public Sede(String ciudad, String direccion, Jefe jefe)
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = ++count;
        this.jefe = jefe;
    }

}
