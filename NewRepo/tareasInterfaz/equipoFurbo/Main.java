package tareasInterfaz.equipoFurbo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Spliterator.OfPrimitive;

import javax.print.StreamPrintServiceFactory;

import tareasInterfaz.equipoFurbo.Jugador.Posicion;

public class Main {

     static Scanner sc = new Scanner(System.in);
     //final String[] posiciones = new String[4]; posiciones[0] = "PORTERO";posiciones[1] = "DEFENSA";posiciones[2] = "CENTRO";posiciones[3] = "DELANTERO";

    public static void main(String[] args) {
        
        Map<Integer, Jugador> malagaCF = new HashMap<>();
        Jugador j1 = new Jugador("12345678Y", "Manuel Reina Rodriguez",1.85, Posicion.PORTERO);
        Jugador j2 = new Jugador("31265487U","Unai Bustinza Martinez",1.75, Posicion.DEFENSA);
        Jugador j3 = new Jugador("23154678A", "Moussa Diarra",1.88, Posicion.DEFENSA);
        Jugador j4 = new Jugador("123143Y", "Alejandro Gallar Falguera",1.78, Posicion.CENTRO);
        Jugador j5 = new Jugador("3421562O", "Arvin Amoakoh Appiah",1.77, Posicion.DELANTEDERO);
        Jugador j6 = new Jugador("LAJUMPAPEGA", "Issa Fomba",1.75, Posicion.DELANTEDERO);

        altaJugador(malagaCF, 1, j1);
        altaJugador(malagaCF, 2, j2);
        altaJugador(malagaCF, 3, j3);

       mostrar(malagaCF,"DEFENSA");
       
       eliminarJugador(malagaCF, 3);

       mostrar(malagaCF);
       
       editarJugador(malagaCF, 2);

       altaJugador(malagaCF, 10);
        
    }

    //--------------------------------------------------------------------------------------------------------------

    static void altaJugador (Map<Integer, Jugador> plantilla, Integer dorsal)
    {

        if(!plantilla.containsKey(dorsal))
        {
            System.out.print("Ingrese el DNI del jugador: ");
            String jugDni = sc.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            String name = sc.nextLine();
            System.out.println("Ingrese la estatura del jugador");
            double estatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            String jugPos = sc.nextLine().toUpperCase();
            Posicion pos = null;
            boolean valido = false;
            
            for (int i = 0; i <= 4 ; i++) 
            {
                if (jugPos.equals("PORTERO")||jugPos.equals("DEFENSA")||jugPos.equals("CENTRO")||jugPos.equals("DELANTERO"))
                {
                    pos = Posicion.valueOf(jugPos);
                    valido = true;
                }    

            }   
            if(valido)
            {
                Jugador newJugador = new Jugador(jugDni, name, estatura, pos);
                plantilla.put(dorsal, newJugador);
                
            }
        }else{
            System.out.println("Ya ha un jugador con ese dorsal");
        }
    }
    
    static void altaJugador(Map<Integer, Jugador>plantilla, Integer dorsal, Jugador jugador)
    {
        if(!plantilla.containsKey(dorsal))
        {
           plantilla.put(dorsal, jugador);
        }else{
            System.out.println("Ya ha un jugador con ese dorsal");
        }
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal)
    {

        Jugador jugador = plantilla.get(dorsal);
        plantilla.remove(dorsal);

        return jugador;
    }
    
    static void mostrar(Map<Integer,Jugador> plantilla)
    {
        System.out.println(plantilla);
    }

    static void mostrar(Map<Integer, Jugador>plantilla, String posicion)
    {
        Posicion pos = Posicion.valueOf(posicion);
        for (Integer clave: plantilla.keySet()) 
        {   
            
            if((plantilla.get(clave).posicion).equals(pos))
            {
                System.out.println(plantilla.get(clave));
            }
            //
            
        }
    }

    static boolean editarJugador(Map<Integer, Jugador>plantilla, Integer dorsal)
    {
        boolean cambio = false;

        if(plantilla.containsKey(dorsal))
        {
            System.out.print("Ingrese el DNI del jugador: ");
            String jugDni = sc.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            String name = sc.nextLine();
            System.out.println("Ingrese la estatura del jugador");
            double estatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            String jugPos = sc.nextLine().toUpperCase();
            Posicion pos = null;
            boolean valido = false;
            
            for (int i = 0; i <= 4 ; i++) 
            {
                if (jugPos.equals("PORTERO")||jugPos.equals("DEFENSA")||jugPos.equals("CENTRO")||jugPos.equals("DELANTERO"))
                {
                    pos = Posicion.valueOf(jugPos);
                    valido = true;
                }    

            }   
            if(valido)
            {
                Jugador newJugador = new Jugador(jugDni, name, estatura, pos);
                System.out.println("Se va a cambiar al jugador "+plantilla.get(dorsal)+" por "+newJugador);
                plantilla.replace(dorsal, newJugador);
                cambio = true;
                
            }
        }else{
            System.out.println("No existe ese dorsal");
        }


        return cambio;
    }
}
