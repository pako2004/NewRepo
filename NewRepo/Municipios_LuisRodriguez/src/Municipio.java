public class Municipio {
    
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
}
