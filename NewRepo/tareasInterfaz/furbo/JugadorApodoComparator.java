package tareasInterfaz.furbo;

import java.util.Comparator;

public class JugadorApodoComparator implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        
        Jugador jug1 = (Jugador)arg0;
        Jugador jug2 = (Jugador)arg1;
        
        return jug1.getApodo().compareTo(jug2.getApodo());
    }
    
}
