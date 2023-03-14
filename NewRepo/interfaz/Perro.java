package interfaz;

public class Perro implements Animal_i, Mascota_i {
    
    private String nombre;
    private String colorPelo;
    private boolean esDeRaza;

    public Perro(String nombre, String coloPelo, boolean deRaza)
    {
        this.nombre = nombre;
        this.colorPelo = coloPelo;
        esDeRaza = deRaza;
    }

    @Override
    public void acariciar() {
        

        System.out.println("Acariacion el perro");
        
    }

    @Override
    public void vacuna(String nombreVacuna) {
        System.out.println("Le pongo al perro la vacuna : "+nombreVacuna);
    }

    @Override
    public void pasear() {
        System.out.println("Paseo a mi perro");
    }

    @Override
    public void comer() {

        System.out.println("Perro come carne");
    }

    @Override
    public String nombreCineti() {
        
        return "canis_can";
    }

    @Override
    public void dormir() {
       System.out.println("Zzzzzz dogg");
    }


}
