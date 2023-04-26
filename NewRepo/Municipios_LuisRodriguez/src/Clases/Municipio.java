package Clases;
import java.util.Collections;
import java.util.Comparator;

public class Municipio implements Comparator<Municipio>{
    
    //Atributos
    private String nombre;
    private int año;
    private int poblacion;
    private int codigoPostal;

    public Municipio(String nombre, int codigoPostal, int año, int poblacion)
    {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.año = año;
        this.poblacion = poblacion;
    }

    @Override
    public boolean equals(Object obj) {
        Municipio muni = (Municipio)obj;

        return this.nombre == muni.nombre && this.año == muni.año;
    }

    @Override
    public String toString() {
        
        return this.nombre+" "+this.año;
    }

    @Override
    public int compare(Municipio arg0, Municipio arg1) {

        return arg0.nombre.compareTo(arg1.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

   
}
