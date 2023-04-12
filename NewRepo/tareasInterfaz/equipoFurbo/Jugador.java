package tareasInterfaz.equipoFurbo;

import java.util.Map;
import java.util.Scanner;

public class Jugador {
    
     
    static Scanner sc = new Scanner(System.in);
    enum Posicion{PORTERO, DEFENSA, DELANTEDERO, CENTRO};


    String dni;
    String nombre;
    Posicion posicion;
    double estatura;
    public Jugador( String dni, String nombre,double estatura, Posicion posicion)
    {
        this.dni = dni;
        this.nombre = nombre; 
        this.posicion = posicion;
    }

    static void altaJugador (Map<Integer, Jugador> plantilla, Integer dorsal)
    {
        System.out.print("Ingrese el DNI del jugador: ");
        String jugDni = sc.nextLine();
        System.out.println("Ingrese el nombre del jugador");
        String name = sc.nextLine();
        System.out.println("Ingrese la posicion del jugador");
        String jugPos = sc.nextLine().toUpperCase();
        Posicion pos;
        
    } 

    @Override
    public String toString() {
        return this.nombre + " "+this.posicion;
    }
}   
