package clases;




public class Ciclista {
    
    //Atributos

    private String nombre;
    private String codigoEquipo;
    private int peso;
    private String pais;



    @Override
    public String toString() {
        return "\n "+this.nombre+" "+this.codigoEquipo+" "+this.peso+" "+this.pais;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigoEquipo() {
        return codigoEquipo;
    }
    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }


    

}
