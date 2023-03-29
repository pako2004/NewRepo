package colecciones.EjerciciosColecciones;


import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        int cantidadNumero = (int)(Math.random()*11)+10;

        for (int i = 0; i < cantidadNumero; i++) {
            
            lista.add(((int)(Math.random()*99)+1));
        }

        System.out.println(lista);




    }

    public static int suma(ArrayList<Integer>lista)
    {
        int suma = 0;

        for (Integer sum : lista) {
            
            suma +=sum;

        }

        return suma;
    }

    public static int media(ArrayList<Integer>lista)
    {
        return suma(lista)/lista.size();
    }

    public static int maximo(ArrayList<Integer>lista)
    {
        return Collections.max(lista);
    }

    public static int minimo(ArrayList<Integer>lista)
    {
        return Collections.min(lista);
    }

    
    


}
