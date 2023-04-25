package tareasInterfaz.matrix;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
public class PersonaGenerica extends Personaje {

        // Atributos
        private int id;
        private String nombre;
        private String ciudadNacimiento;
        private LocalDateTime fechaCreacion;
        private int edad;
        private int probabilidadMorir;
    
        // Constructor
        public PersonaGenerica(int id, String nombre, String ciudadNacimiento, LocalDateTime fechaCreacion, int edad) 
        {
            super(id, nombre, ciudadNacimiento, fechaCreacion, edad);     
            this.probabilidadMorir = (int)(Math.random()*101);
        }

        // Métodos

        private static final String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
        private static final String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
        
        /*public static Collection<PersonaGenerica> FactoriaPersonas(int cantidad) {
          
            Collection<PersonaGenerica> personas = new ArrayList<>();
          
            for (int i = 0; i < cantidad+1; i++) {
                String ciudad = ciudades[((int)(Math.random()*ciudades.length))];
                String nombre = nombres[((int)(Math.random()*nombres.length))];
                int edad = (int)(Math.random()*101);
                LocalDateTime creacion = LocalDateTime.now();
                PersonaGenerica persona = new PersonaGenerica(i+1, nombre, ciudad, creacion, edad);
                personas.add(persona);
               
            }
            
            return personas;
        }*/

        public void mostrarInformacion() {
            System.out.println("Smith[id=" + getId()  + ", nombre=" + getNombre() + ", ciudadNacimiento=" + getCiudadNacimiento() +
            ", fechaCreacion=" + getFechaHoraCreacion() + ", edad=" + getEdad() + ", probabilidadMorir=" + getProbabilidadMorir());
        }

        public int getProbabilidadMorir() {
            return probabilidadMorir;
        }
    

}
