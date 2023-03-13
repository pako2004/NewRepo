package interfaz;

public class UsoAnimales {
    public static void main(String[] args) {
        
        Perro perro = new Perro("koko", "blanco", false);

        Lobo lobo = new Lobo("Lobo malvado");

        perro.comer();
        lobo.comer();

        perro.acariciar();

        Mascota_i.dientes();




    }
}
