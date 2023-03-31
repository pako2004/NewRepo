package colecciones.EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {
    
          /*
     * Realiza un programa que escoja al azar 10 cartas de la baraja española
        (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
        almacenarlas y asegúrate de que no se repite ninguna.
     */

     public static void main(String[] args) {
        
        ArrayList<Carta> baraja = new ArrayList<>() ;

        while (baraja.size()<10)
        {
            Carta cartaNueva = new Carta();
            if(!baraja.contains(cartaNueva))
            {
                baraja.add(cartaNueva);
            }
        }

        System.out.println(baraja);
        Collections.sort(baraja);
        System.out.println(baraja);
     }


}
