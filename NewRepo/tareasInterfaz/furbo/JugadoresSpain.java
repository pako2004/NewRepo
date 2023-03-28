package tareasInterfaz.furbo;
import java.util.Arrays;
public class JugadoresSpain { 
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("Luis Rodriguez", "Pako");
        Jugador j2 = new Jugador("Lorenzo Fuap", "Lore");
        Jugador j3 = new Jugador("ermelio esperanza", "El bicho");
        Jugador j4 = new Jugador("Roberto Araujo", "El mago");
        Jugador j5 = new Jugador("Mariano Pacheco", "El propio");

        Jugador[] jugadoresSpain = new Jugador[5];
        jugadoresSpain[0] = j4;
        jugadoresSpain[1] = j5;
        jugadoresSpain[2] = j3;
        jugadoresSpain[3] = j2;
        jugadoresSpain[4] = j1;

        
        //Ordenar por licencia

        
        Arrays.sort(jugadoresSpain);
        System.out.println("******************************************");
        System.out.println("Ordenamos por licencia: "+Arrays.toString(jugadoresSpain));


        //Ordenar por numero de goles
        generadorGoles(jugadoresSpain);
        Arrays.sort(jugadoresSpain, new JugadorGolesComparator());
        
        System.out.println("********************");
        System.out.println("Ordenados por numero goles: " + Arrays.toString(jugadoresSpain));

        //Ordenar por numero de faltas
        generadorFaltas(jugadoresSpain);
        Arrays.sort(jugadoresSpain, new JugadorFaltasComparator());
        System.out.println("*****************");
        System.out.println("Ordenamos por numero de faltas: "+ Arrays.toString(jugadoresSpain));

        System.out.println("********* EXTRA ***********");
        
        
        Jugador[] newTeam = UtilesJugadores.generarEquipo(5);

        System.out.println(Arrays.toString(newTeam));
       

    }

    static void generadorFaltas(Jugador[] jugadores)
    {
        for (int index = 0; index < jugadores.length; index++) {
            int random = (int)(Math.random()*9)+1;
            jugadores[index].setNumeroFaltas(random);

        }
    }

    static void generadorGoles(Jugador[] jugadores)
    {
        for (int index = 0; index < jugadores.length; index++) {
            int random = (int)(Math.random()*30)+1;
            jugadores[index].setNumeroGoles(random);

        }
    }

}
