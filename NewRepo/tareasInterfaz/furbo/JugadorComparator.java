package tareasInterfaz.furbo;

import java.util.Comparator;

public class JugadorComparator implements Comparator{

    public int comparatorApodo(Object arg0, Object arg1)
    {
        Jugador j1 = (Jugador)arg0;
        Jugador j2 = (Jugador)arg1;
        
        char nombrej1 = j1.getNombreCompleto().charAt(0);
        char nombrej2 = j2.getNombreCompleto().charAt(0); 

        return (int)nombrej1-(int)nombrej2;
    }

    public int comparatorFaltas(Object arg0, Object arg1)
    {
        Jugador j1 = (Jugador)arg0;
        Jugador j2 = (Jugador)arg1;

        return j1.getNumeroFaltas()-j2.getNumeroFaltas();   
    }



    @Override
    public int compare(Object arg0, Object arg1) { //Comparador numero de goles
        
        Jugador j1 = (Jugador)arg0;
        Jugador j2 = (Jugador)arg1;

        return j1.getNumeroGoles()-j2.getNumeroGoles();
    }

    
    
}
