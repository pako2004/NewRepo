package tareasInterfaz.matrix;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import ejerciciosInterfaz.negoEjemplo.Ferreteria;

public class UsoMatrix {

    private static final String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
    private static final String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
    
    public static void main(String[] args) {


        Neo neo = new Neo(777,"Neo" , "Mijas", LocalDateTime.now(), 25, false, 0);
        ArrayList<Personaje> personas = new ArrayList<>();
        personas.add(((int)(Math.random()*24)+1), neo);
        Smith smith = new Smith(666, "Smith", null, LocalDateTime.now(), 69);
        personas.add(((int)(Math.random()*24)+1), smith);
        Collection<Personaje> listado = FactoriaPersonas(200);

        for (int i = 0; i < 25; i++)
        {
            if(personas.get(i).equals(neo) || personas.get(i).equals(smith))
            {

            }else
            {
                personas.add(i,listado.iterator().next());
            }    
        }

        int iteraciones = 0;
        boolean genericasVivas = true;

        //Comienzo de la matrix
        while(iteraciones <= 300 && genericasVivas == true)
        {   
            //Evaluar la posibilidad de morir de los personajes
            for (int i = 0; i < personas.size(); i++) 
            {
                if(!personas.get(i).equals(neo) && !personas.get(i).equals(smith))
                {
                    personas.add(listado.)
                }
            }

            

            // Cada 2 iteraciones, el agente Smith entra en acción
            if (iteraciones % 2 == 0) {
                int poderInfeccion = Smith.generarPoderInfeccion();
                Smith.infectarPersonajes(poderInfeccion, personas);
            }
            
            // Cada 5 iteraciones, Neo actúa
            if (iteraciones % 5 == 0) {
                neo.decideSiEsElegido();
                neo.matarAgentesSmith(mundo);
            }
            
            // Cada 10 iteraciones, aparecen 5 personajes genéricos en posiciones aleatorias en Matrix
            if (iteraciones % 10 == 0) {
                mundo.agregarPersonajesGenericos(5);
            }
            
            // Cada 30 iteraciones, se crea un nuevo personaje genérico
            if (iteraciones % 30 == 0) {
                factoria.agregarPersona();
            }

        }
        
    }

    public static Collection<Personaje> FactoriaPersonas(int cantidad) {
          
        Collection<Personaje> personas = new ArrayList<>();
      
        for (int i = 0; i < cantidad+1; i++) {
            String ciudad = ciudades[((int)(Math.random()*ciudades.length))];
            String nombre = nombres[((int)(Math.random()*nombres.length))];
            int edad = (int)(Math.random()*101);
            LocalDateTime creacion = LocalDateTime.now();
            PersonaGenerica persona = new PersonaGenerica(i+1, nombre, ciudad, creacion, edad);
            personas.add(persona);
           
        }
        
        return personas;
    }


    

}
