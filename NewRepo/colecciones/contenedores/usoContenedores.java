package colecciones.contenedores;

import colecciones.contenedores.ejemploComodines.Contenedor;
import ejerciciosClases.pruebas;
import ejerciciosInterfaz.negoEjemplo.Cliente;
import interfaz.Lobo;

public class usoContenedores {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        Lobo lobo = new Lobo("Lobo malo");

        ContenedorBasico contenedorCliente = new ContenedorBasico<Cliente>();
        ContenedorBasico contenedorLobo = new ContenedorBasico<Lobo>();


        contenedorCliente.insertar(cliente);

        contenedorLobo.insertar(lobo);

            //----------------------------

        Persona[] personasArray = new Persona[0];

        Persona p1 = new Persona();
        p1.nombre = "Pepe";
        Persona p2 = new Persona();
        p2.nombre = "Pako";
        Persona p3 = new Persona();
        p2.nombre = "Ermenejildo";

        Contenedor<Persona> contenedorPersonas = new Contenedor<>(personasArray);
        contenedorPersonas.insertarAlFinal(p1);
        contenedorPersonas.insertarAlFinal(p2);
        contenedorPersonas.insertarAlFinal(p3);



    }


}
