package clases;

import java.util.Comparator;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class Corredor extends Ciclista implements Comparator<Corredor>{
    
    private Integer dorsal;
    private Integer tiempo;

    private String nombre;
    private String codigoEquipo;
    private int peso;
    private String pais;




    public Corredor(Ciclista c, Integer dorsal)
    {
        this.nombre = c.getNombre();
        this.codigoEquipo = c.getCodigoEquipo();
        this.peso = c.getPeso();
        this.pais = c.getPais();
        this.dorsal = dorsal;
    }


    public Corredor(){}


    @Override
    public int compare(Corredor arg0, Corredor arg1) {

        
        return arg1.getTiempo()-arg0.getTiempo();
    }


    @Override
    public boolean equals(Object obj) {

        Corredor c1 = (Corredor)obj;


        return this.dorsal == c1.dorsal || this.nombre == c1.nombre;
    }
    

    @Override
    public String toString() {

        return this.dorsal+" - "+this.nombre+"("+this.codigoEquipo+"): "+this.tiempo;
    }


    /*************************************************** */

    public Integer getDorsal() {
        return dorsal;
    }
    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }




    public Integer getTiempo() {
        return tiempo;
    }




    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
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
