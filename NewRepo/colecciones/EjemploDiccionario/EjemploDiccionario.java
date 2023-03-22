package colecciones.EjemploDiccionario;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploDiccionario {
    

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pako1");
        Persona p2 = new Persona("Pako2");
        Persona p3 = new Persona("Pako3");
        Persona p4 = new Persona("Pako4");
        Persona p5 = new Persona("Pako5");


        HashMap<Integer, Persona> agenda = new HashMap<>();

        agenda.put(1, p1);
        agenda.put(2, p2);
        agenda.put(3, p3);

        System.out.println("Contenido Agenda: " +agenda.toString());

        Persona PersonaBuscada = agenda.get(p2);
        Persona PersonaBuscada2 = agenda.get(8);
        System.out.println("La persona con clave 2 es: "+PersonaBuscada.toString());

        //
         
        if  (PersonaBuscada2 != null)
        {
            System.out.println("La edad de la persona con clave 8 es " + PersonaBuscada.getEdad());
        }else{
            System.out.println("No existe un persona con clave 8");
        }

        //ArrayList<Integer> listaClaves = new ArrayList<>(agendas.keyset());
        ArrayList<Integer> listaClaves = new ArrayList<Integer>(agenda.keySet());

        System.out.println("Lista de claves: "+ listaClaves.toString());

        System.out.println("Lista de valores:: "+agenda.values().toString());

    }
}
