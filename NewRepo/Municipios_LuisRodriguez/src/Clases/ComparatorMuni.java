package Clases;

import java.util.Comparator;

public class ComparatorMuni implements Comparator<Municipio> {

    @Override
    public int compare(Municipio arg0, Municipio arg1) {
        
        int resultado = arg0.getAño() - arg1.getAño();

        if(resultado > 0)
        {
            return 1;
        }
        if(resultado < 0)
        {
            return -1;
        }else
        {
            return 0;
        }
    }
    
}
