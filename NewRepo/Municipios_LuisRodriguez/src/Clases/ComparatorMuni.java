package Clases;

import java.util.Comparator;

public class ComparatorMuni implements Comparator<Municipio> {

    @Override
    public int compare(Municipio arg0, Municipio arg1) {
        
        if (arg0.getNombre().equals(arg1.getNombre()))
        {
            return arg0.getAño() - arg1.getAño();
        }else{
            return arg0.getNombre().compareTo(arg1.getNombre());
        }

    }

    
}
