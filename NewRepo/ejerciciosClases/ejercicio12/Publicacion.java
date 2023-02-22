package ejerciciosClases.ejercicio12;

public  abstract class Publicacion {
    
    protected int codigoISBN;
    protected String titulo;
    protected int añoPublicacion;


    public Publicacion(int codigoISBN, String titulo, int añoPublicacion)
    {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
    
    @Override
    public String toString()
    {
        return this.codigoISBN +" - "+this.titulo+" - "+this.añoPublicacion;
    }


}
