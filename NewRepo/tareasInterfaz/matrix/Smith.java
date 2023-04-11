package tareasInterfaz.matrix;

import java.time.LocalDateTime;

public class Smith extends Personaje{
    
    private int capacidadInfectar;
    
    public Smith(int id, String nombre, String ciudadNacimiento, LocalDateTime fechaCreacion, int edad) {
        super(id, nombre, ciudadNacimiento, fechaCreacion, edad);
        this.capacidadInfectar = (int)(Math.random()*101);
    }
    
    public int getCapacidadInfectar() {
        return capacidadInfectar;
    }
    
    public void setCapacidadInfectar(int capacidadInfectar) {
        this.capacidadInfectar = capacidadInfectar;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Smith[id=" + getId()  + ", nombre=" + getNombre() + ", ciudadNacimiento=" + getCiudadNacimiento() +
       ", fechaCreacion=" + getFechaHoraCreacion() + ", edad=" + getEdad() +", capacidadInfectar=" + capacidadInfectar + "]");
    }
}


