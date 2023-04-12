package tareasInterfaz.matrix;

import java.time.LocalDateTime;

public abstract class Personaje {

        protected int id;
        protected String nombre;
        protected String ciudadNacimiento;
        protected LocalDateTime fechaHoraCreacion;
        protected int edad;
        
    
        public Personaje(int id, String nombre, String ciudadNacimiento, LocalDateTime fechaHoraCreacion, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.ciudadNacimiento = ciudadNacimiento;
            this.fechaHoraCreacion = fechaHoraCreacion;
            this.edad = edad;
            
        }
    
        public int getId() {
            return id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public String getCiudadNacimiento() {
            return ciudadNacimiento;
        }
    
        public LocalDateTime getFechaHoraCreacion() {
            return fechaHoraCreacion;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public abstract void mostrarInformacion();
    }


