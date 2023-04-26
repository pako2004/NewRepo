import java.util.ArrayList;
import java.util.Collections;

import Clases.ComparatorMuni;
import Clases.LeerInformacion;
import Clases.Municipio;

public class Main {
    

    public static void main(String[] args) {
        
        //ArrayList<Municipio> asdada = LeerInformacion.leerFicheroMunicipio();
        ArrayList<Municipio> asdada = LeerInformacion.leerFicheroMunicipio(2010);
        // for (int i = 0; i < asdada.size(); i++) {
        //     System.out.println(asdada.get(i));
        // }
        Collections.sort(asdada, new ComparatorMuni());
            for (int i = 0; i < asdada.size(); i++) {
             System.out.println(asdada.get(i));
         }
        

    }
}
