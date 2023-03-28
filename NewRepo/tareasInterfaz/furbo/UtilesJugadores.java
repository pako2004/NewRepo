package tareasInterfaz.furbo;
import java.lang.Math;

public class UtilesJugadores {
    
    public static  Jugador[] generarEquipo(int numero)
    {   
        
        Jugador[] newEquipo = new Jugador[numero];

        for (int i = 0; i < newEquipo.length; i++) {
            
            String[] nombres =nombres(newEquipo);//Creo un array auxiliar que contiene los nombres de los jugadores 
            newEquipo[i] = GeneraJugadorAleatorio();

                for (int index = 0; index < newEquipo.length; index++)//Verificar si hay algun repetido  
                {
                    

                    if(newEquipo[i].getNombreCompleto().equals(nombres[index]))
                    {
                        while(newEquipo[i].getNombreCompleto().equals(nombres[index]))
                        {  
                            //Para verificar cuando salen los repetidos 
                           // System.out.println(newEquipo[i].getNombreCompleto());
                            //System.out.println(nombres[index]);
                            newEquipo[i] = GeneraJugadorAleatorio();
                            
                        }
                    }
                }
        }

        return newEquipo;
    }
/**
 * Genera un jugador
 * @return
 */
    public static Jugador GeneraJugadorAleatorio()
    {   
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
        String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};
        String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
        String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"};

        int nombre = (int)(Math.random()*nombres.length);
        int apellido = (int)(Math.random()*apellidos.length);
        int apo1 = (int)(Math.random()*apodo1.length);
        int ap2 = (int)(Math.random()*apodo2.length);

        String nomComple = nombres[nombre]+" "+apellidos[apellido];
        String apodo = apodo1[apo1]+" "+apodo2[ap2];

        Jugador newJugador = new Jugador(nomComple, apodo);
        return newJugador;
    }
/**
 * Copia los nombres de los jugadores en un array
 * @param equipo
 * @return 
 */
    public static String[] nombres(Jugador[] equipo)
    {   
        String[] nombres = new String[equipo.length];
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i] == null){

            }else{
            nombres[i] = equipo[i].getNombreCompleto();
            }

        }

        return nombres;
    }

}
