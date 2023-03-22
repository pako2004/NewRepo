package colecciones.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.event.InternalFrameEvent;
public class Ej1ArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> conjunto1 = new ArrayList<Integer>();

        HashSet<Integer> elementosSinRepetir = new HashSet<>();
        HashSet<Integer> elementosRepetidos = new HashSet<>();


        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random()*10)+1;
            conjunto1.add(random);
        }
        System.out.println("PRINCIPIO "+conjunto1.size());
        System.out.println(conjunto1);

        for (int i = 0; i < conjunto1.size(); i++) {
            
            if  (conjunto1.get(i) == 5)
            {
                conjunto1.remove(i);
            }

        }
        System.out.println("ahora tiene "+conjunto1.size());
        System.out.println("DESPUES " + conjunto1);

        //CON interator

        Iterator<Integer> listaIterada = conjunto1.iterator();
        while(listaIterada.hasNext())
        {
            Integer numero = listaIterada.next();
            if(numero == 4)
            {
                listaIterada.remove();
            }
        }

        System.out.println("La lista ahora tiene: "+conjunto1.size());
        System.out.println(conjunto1);

        //-----------------------------------------------
        //Utilizamos iteator con SET

        Iterator<Integer> iteratorElementosRepetidos = elementosRepetidos.iterator();

        while(iteratorElementosRepetidos.hasNext())
        {
            Integer numeroLeido = iteratorElementosRepetidos.next();
            System.out.print("Numero: "+numeroLeido+" ");
        }


        /* 

        EJERCICIO 1 

        for (int i = 0; i < 20; i++) {
            int random = (int)(Math.random()*10)+1;
            conjunto1.add(random);
        }
        
        System.out.println(conjunto1.toString());
        // En elementosSinEEepetir guardo los elementos que solo estan 1 vez en l listanumeros 
        // y en elementosRepetidos los numeros que estan respetidos en listanumeros 
        for (Integer numero : conjunto1) {
            //Si el numerop NO estan en elementos reptido y tampoco estan en elementoSInRepetir
            // entoncesl o inserto en elementoSinRepetir
            if(!elementosSinRepetir.contains(numero) && !elementosRepetidos.contains(numero))
            {   
                elementosSinRepetir.add(numero);
            }else{ // Si el numero esta en alguno de los conjunetos entonces lo borro del sinrepetir y
                elementosSinRepetir.remove(numero);
                elementosRepetidos.add(numero);
            }
        }

        System.out.println("Elementos sin repetir "+ elementosSinRepetir);
        System.out.println("Elementos repetidos "+elementosRepetidos);

    }
    */


}
}
