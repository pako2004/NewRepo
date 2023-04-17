package Examenes.examenInterfaz_LuisRodrigez;

import java.util.HashMap;


public class DescuentoPorCategoria {
    
    private HashMap<String, Integer> descuentos;

    public DescuentoPorCategoria()
    {
        descuentos = new HashMap<>();
        
    }

    public boolean insertar(String categoria, Integer descuento)
    {
        boolean resultado = descuentos.containsKey(categoria);

        if(!resultado)
        {
            descuentos.put(categoria, descuento);
            resultado = true;
        }else
        {
            System.out.println("Esta categoria ya tiene un descuento");
        }

        return resultado;
    }
    

    public boolean modificar(String categoria, Integer descuento)
    {
        boolean resultado = descuentos.containsKey(categoria);

        if(resultado)
        {
            descuentos.replace(categoria, descuento); //Replace remplaza el antiguo valor por uno nuevo                          
        }else
        {
            System.out.println("Esta categoria no existe");
        }

        return resultado;
    }

    public boolean eliminarDescuento(String categoria)
    {

        boolean resultado = descuentos.containsKey(categoria);

        if(resultado)
        {
           descuentos.remove(categoria);
                                                                
        }else
        {
            System.out.println("Esta categoria no existe");
        }

        return resultado;
    }

    public Integer obtenerDescuento(String categoria)
    {
        boolean existe = descuentos.containsKey(categoria);
        Integer resultado;
        if(existe)
        {
            resultado = descuentos.get(categoria);
        }else
        {
            resultado = 0;
            System.out.println("Esta categoria no existe");
        }

        return resultado;

    }

    public HashMap<String, Integer> getDescuentos() {
        return descuentos;
    }

    public String mostrarDescuentos()
    {
        return descuentos.toString();
    }

}
