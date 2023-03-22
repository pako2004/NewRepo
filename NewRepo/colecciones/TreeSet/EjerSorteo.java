package colecciones.TreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjerSorteo {
    public static void main(String[] args) {
        
        Sorteo<Integer> sorteoCamiseta = new Sorteo<Integer>();

        sorteoCamiseta.add(101);
        sorteoCamiseta.add(102);
        sorteoCamiseta.add(103);
        sorteoCamiseta.add(104);
        sorteoCamiseta.add(105);
        sorteoCamiseta.add(106);

        HashSet<Integer> ganadores = new HashSet<>(sorteoCamiseta.premiados(2));

        System.out.println(Arrays.toString(ganadores.toArray()));

        Sorteo<String> sorteoAlumno = new Sorteo<String>();

        sorteoAlumno.add("Pako1");
        sorteoAlumno.add("Pako2");
        sorteoAlumno.add("Pako3");
        sorteoAlumno.add("Pako4");
        sorteoAlumno.add("Pako5");
        sorteoAlumno.add("Pako6");
        sorteoAlumno.add("Pako7");

        HashSet<String> ganadoresAlumno = new HashSet<>(sorteoAlumno.premiados(3));

        System.out.println(Arrays.toString(ganadoresAlumno.toArray()));





    }
}
