package colecciones.EjerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {
    
    
    HashSet<Elemento> compra = new HashSet();

    public Carrito()
    {}

    public void agrega(Elemento elemento)
    {           

        if(!this.compra.contains(elemento))
        {
            this.compra.add(elemento);
        }else{
              this.compra.  
        }

        
        
    }

    public int numeroDeElementos()
    {
        return this.compra.size();
    }

    public double importeTotal()
    {   
        double total = 0;

        for (Elemento elemento : this.compra) 
        {
            total += elemento.getPrecio();
        }

        return total;
    }

    @Override
    public String toString() {
        String cadena = "Contenido del carro \n ========================";

        for (Elemento elemento : this.compra) 
        {
            cadena+= "\n"+elemento.toString();
        }


        return cadena;
    }

}
