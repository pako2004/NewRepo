package tareasInterfaz.furbo;

import java.util.Comparator;


public class JugadorFaltasComparator implements Comparator<Jugador> {

    @Override
    public int compare(Jugador arg0, Jugador arg1) {

        int resul = 0;

        if(arg0.getNumeroFaltas() < arg1.getNumeroFaltas()){
            resul = 1;
        }else if(arg0.getNumeroFaltas() > arg1.getNumeroFaltas()){
            resul = -1;
        }else{resul = 0;}
        return resul;
    }
    
}
