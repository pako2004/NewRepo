package colecciones.contenedores;

public class Academico implements Comparable<Academico> {

    private String nombre;
    private int añoingreso;

    public Academico(String nombre, int añoingreso)
    {
        this.nombre = nombre;
        this.añoingreso = añoingreso;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombre + " "+this.añoingreso;
    }

    @Override
    public int compareTo(Academico o) 
    {    
        
        return this.nombre.compareTo(o.nombre);

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getAñoingreso() {
        return añoingreso;
    }


    public void setAñoingreso(int añoingreso) {
        this.añoingreso = añoingreso;
    }
    
}
