package colecciones.contenedores;

import java.util.Arrays;

public class usoPersona extends ContenedorBasico {
    
    public static void main(String[] args) {
        
        Notas<Alumno> notas = new Notas<>();

        System.out.println(notas.sacarNota());
        
        

    }

    public static <T> T[] insertar(T[] fuap, T objeto)
    {   
        T[] newArrray = Arrays.copyOf(fuap, fuap.length+1);
        newArrray[newArrray.length-1] = objeto;

        return newArrray; 
    }


}
