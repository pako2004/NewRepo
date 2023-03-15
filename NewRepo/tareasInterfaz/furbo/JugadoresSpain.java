package tareasInterfaz.furbo;

import java.lang.reflect.Array;
import java.security.cert.PKIXReason;
import java.util.Arrays;

public class JugadoresSpain {
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("Luis Rodriguez", "Pako");
        Jugador j2 = new Jugador("Lorenzo Fuap", "Lore");
        Jugador j3 = new Jugador("ermelio esperanza", "El bicho");
        Jugador j4 = new Jugador("Roberto Araujo", "El mago");
        Jugador j5 = new Jugador("Mariano Pacheco", "El propio");

        Jugador[] jugadoresSpain = new Jugador[5];
        jugadoresSpain[0] = j1;
        jugadoresSpain[1] = j2;
        jugadoresSpain[2] = j3;
        jugadoresSpain[3] = j4;
        jugadoresSpain[4] = j5;

        JugadorComparator comparator = new JugadorComparator();

        
        Arrays.sort(jugadoresSpain, comparator);

        System.out.println(Arrays.toString(jugadoresSpain));




    }
}
