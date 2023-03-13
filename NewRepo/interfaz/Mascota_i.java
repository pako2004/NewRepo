package interfaz;

import java.beans.VetoableChangeListenerProxy;

public interface Mascota_i {
    
    public void acariciar();
    public void vacuna(String nombreVacuna);
    public void pasear();

    default void voz()
    {
    System.out.println("Fuap fuap");
    }

    static void dientes()
    {
        System.out.println("30 dientes");
    }

}
