package tareasInterfaz.matrix;

import java.time.LocalDateTime;
import java.util.List;
import java.util.TreeMap;

public class Neo extends Personaje {
        private boolean esElegido;
        private int poder;
        private int capacidadDestruccionMaxima;
    
        public Neo(int id, String nombre, String ciudadNacimiento, LocalDateTime fechaHoraCreacion, int edad, boolean esElegido, int capacidadDestruccionMaxima) {
            super(id, nombre, ciudadNacimiento, fechaHoraCreacion, edad);
            this.esElegido = esElegido;
            this.poder = (int)(Math.random()*101);
            this.capacidadDestruccionMaxima = capacidadDestruccionMaxima;
        }
    
        // getters y setters
        public boolean isEsElegido() {
            return esElegido;
        }
    
        public void setEsElegido(boolean esElegido) {
            this.esElegido = esElegido;
        }
    
        public int getPoder() {
            return poder;
        }
    
        public void setPoder(int poder) {
            this.poder = poder;
        }
    
        public int getCapacidadDestruccionMaxima() {
            return capacidadDestruccionMaxima;
        }
    
        public void setCapacidadDestruccionMaxima(int capacidadDestruccionMaxima) {
            this.capacidadDestruccionMaxima = capacidadDestruccionMaxima;
        }
        /* 
        // método para eliminar agentes Smith a su alrededor
        public void eliminarAgentesSmithAlrededor(List<Personaje> matrix, TreeMap<LocalDateTime, Smith> depositoVirus) {
            // obtener posición actual de Neo
            int posX = getPosX();
            int posY = getPosY();
    
            // recorrer los elementos en un radio de destrucción máximo
            for (int i = posX - capacidadDestruccionMaxima; i <= posX + capacidadDestruccionMaxima; i++) {
                for (int j = posY - capacidadDestruccionMaxima; j <= posY + capacidadDestruccionMaxima; j++) {
                    // comprobar si está dentro de los límites de la matriz
                    if (i >= 0 && i < MATRIX_SIZE && j >= 0 && j < MATRIX_SIZE) {
                        // obtener personaje en la posición actual
                        Personaje p = matrix.get(i * MATRIX_SIZE + j);
    
                        // comprobar si es un agente Smith y eliminarlo
                        if (p instanceof Smith) {
                            Smith s = (Smith) p;
                            depositoVirus.put(s.getFechaHoraCreacion(), s); // añadir al depósito de virus
                            System.out.println("Neo ha eliminado al agente Smith " + s.getId() + " en la posición [" + i +
                                    ", " + j + "]");
                            matrix.set(i * MATRIX_SIZE + j, new EspacioLibre()); // dejar espacio libre en la matriz
                        }
                    }
                }
            }
        }*/
        /* 
        // método para mover a Neo a una posición aleatoria en la matriz
        public void mover(List<Personaje> matrix) {
            // obtener posición actual de Neo
            int posX = getPosX();
            int posY = getPosY();
    
            // buscar una posición aleatoria en la matriz
            int newPosX, newPosY;
            do {
                newPosX = (int) (Math.random() * MATRIX_SIZE);
                newPosY = (int) (Math.random() * MATRIX_SIZE);
            } while (newPosX == posX && newPosY == posY); // asegurarse de que no sea la misma posición
    
            // obtener personaje en la nueva posición
        }*/

        @Override
        public void mostrarInformacion() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
        }  
        }

