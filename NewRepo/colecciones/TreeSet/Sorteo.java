package colecciones.TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T>  {


    private HashSet<T> bolsa;


    public Sorteo()
    {
        bolsa = new HashSet<T>();
    }

    boolean add (T elemento)
    {
        return bolsa.add(elemento);
    }
    
     public Set <T> premiados(int numpremiados)
    {
        ArrayList<T> premiados = new ArrayList<T>();

        //Para conseguir los premiados voy a ordenar el arraylist
        // y luego lo desordenare con shuffle, los ppremiados seran los x primeros del arraylist
        premiados.addAll(this.bolsa);
        //Con shuffle
        Collections.shuffle(premiados);

        HashSet<T> bolsaPremiados = new HashSet<T>();
        for (int i = 0; i < numpremiados; i++)
        {   
            T elemento = premiados.get(i);
            bolsaPremiados.add(elemento);
        }

        return bolsaPremiados;
    }


}
