package colecciones.contenedores.ejemploComodines;

import java.util.Arrays;

public class Contenedor<T> {
    
        T[] tabla;

    public Contenedor(  T[] tabla)
    {
        this.tabla = tabla;
    }


    public void insertarAlPrincipio(T nuevo)
    {   
        T[] newArray = Arrays.copyOf(tabla, tabla.length+1);
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = tabla[i-1]; 
        }
        newArray[0] = nuevo;
        tabla = newArray;
    }
    
    public void insertarAlFinal(T nuevo)
    {   
        T[] newArray = Arrays.copyOf(tabla, tabla.length+1);
        newArray[tabla.length-1] = nuevo;
        tabla = newArray;
    }
        
    public T extraerDelPrincipio()
    {
        T fuap;

        T[] newTabla = Arrays.copyOfRange(tabla, 1, tabla.length-1);

        fuap = tabla[0];
        tabla = newTabla;
        return fuap;
    }

    public T extraerDelFinal()
    {
        T fuap = tabla[tabla.length-1];

        T[] newTabla = Arrays.copyOf(tabla, tabla.length-1);

        tabla = newTabla;
        return fuap;
    }
    

}
