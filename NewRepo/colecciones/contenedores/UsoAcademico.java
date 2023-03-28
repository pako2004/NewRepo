package colecciones.contenedores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UsoAcademico {
    
    public static void main(String[] args) {
        
        Academico academico1 = new Academico("Jeronimo", 1990);
        Academico academico2 = new Academico("Ermelio", 2004);
        Academico academico3 = new Academico("Oordan ", 2001);
        Academico academico4 = new Academico("Pelver", 2008);
        Academico academico5 = new Academico("Antonio", 2010);

        HashMap<Character, Academico> academia = new HashMap<>();
        nuevoAcademico(academia, academico1, 'L');
        nuevoAcademico(academia, academico2, 'i');
        nuevoAcademico(academia, academico3,'r');
        nuevoAcademico(academia, academico4, 'l');
        nuevoAcademico(academia, academico5, 'j');
        
        ArrayList<Academico> academicos = new ArrayList<Academico>(); //Solo academicos 
        academicos.addAll(academia.values());

        Collections.sort(academicos);
        System.out.println(academicos);

        //Or4denados por año 

        Collections.sort(academicos, new AcademicosComparaYear());
        System.out.println(academicos);

        //Listado por letras
        
        ArrayList<Character> listaLetras = new ArrayList<>(academia.keySet());
        Collections.sort(listaLetras);

        for (Character chara : listaLetras) {
            Academico academicoLeido = academia.get(chara);
            System.out.println("Letra: "+chara +" - "+academicoLeido.getNombre());
        }

        // Otra forma de ordenarlo por letras

        TreeMap<Character, Academico> arbolAcademia = new TreeMap<>(academia);
        System.out.println(arbolAcademia);







    }   

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra){
        boolean cambio = false;
        if  (!academia.containsKey(letra)){
        
            if((int)letra >= 65 && (int)letra <= 90 || (int)letra >=97 && (int)letra <=122 )
            {
                academia.put(letra, nuevo);
                cambio = true;
            }
        }
        return cambio;
    }

    static void nuevoAcademico(Map<Integer, Academico> academia, Academico nuevo, Integer year)
    {   
        academia.put(year, nuevo);
    }
}



