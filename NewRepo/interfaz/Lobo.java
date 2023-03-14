package interfaz;

public class Lobo implements Animal_i{
    
    private String nombre;
    private String colorpelo;

    public Lobo(String nombre)
    {
        this.nombre = nombre;
        colorpelo = "negro";
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("Ñom ñom lobo");
    }

    @Override
    public String nombreCineti() {
        // TODO Auto-generated method stub
        return "LObus_Lobitus";
    }

    @Override
    public void dormir() {
        System.out.println("Zzzzzz lobo");
    }
}
