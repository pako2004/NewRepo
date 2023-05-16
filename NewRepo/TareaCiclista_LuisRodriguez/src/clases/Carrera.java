package clases;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.spi.CalendarNameProvider;



public class Carrera {


    private List<Equipo> equipos;
    private List<Corredor> corredores;
    private String nombre;
    Integer dorsales =  0;
    Map<Integer,Integer> tiempos;
   

    public Carrera(List<Ciclista> ciclistas, String nombre )
    {
        this.dorsales++;

        for (int i = 0; i < ciclistas.size(); i++) //Añade los ciclistas a la collection de corredores
        {
            this.corredores.add(new Corredor(ciclistas.get(i), dorsales));     
        }

        
    }

    public void insertarTiemposEtapa(Map<Integer,Integer> tiempos2)
    {
        this.tiempos = tiempos2;
    }

    public void ordernarCorredoresPorTiempo()
    {
        Collections.sort(this.corredores, new Corredor());
    }

    public Corredor buscarPorDorsal(int dorsal)
    {   
        Corredor c = null;

        for (int i = 0; i < this.corredores.size(); i++) 
        {
            
            if(this.corredores.get(i).getDorsal() == dorsal)
            {
                c = this.corredores.get(i);
            }

        }

        return c;

    }

    public Integer posicionCorredor(Corredor c)
    {   

        Integer pos = -1;

        ordernarCorredoresPorTiempo();

        for (int i = 0; i < this.corredores.size(); i++) 
        {   
            if(this.corredores.get(i).equals(c))
            {
                pos = i+1;
            }
            
        }
        return pos;
    }

    public String clasificacionCompleta()
    {

        String peloton = "";

        ordernarCorredoresPorTiempo();


        for (int index = 0; index < this.corredores.size(); index++) 
        {
            
            peloton += "\n"+this.corredores.get(index).toString();

        }

        return peloton;
    }

    public String clasificacionPorEquipos()
    {
        ordernarCorredoresPorTiempo();

        Map<Equipo, Integer> equiposEnCarrera = new HashMap<>();

        for (int i = 0; i < this.equipos.size(); i++) 
        {

            String codEquipo = this.equipos.get(i).getCodigo();

            for (int j = 0; j < this.corredores.size(); j++) 
            {
                        //Si el codigo coincide con el cod del corr   y si el map no contiene ese equipo todavia
                if(codEquipo.equals(this.corredores.get(j).getCodigoEquipo()) && !equiposEnCarrera.containsKey(this.equipos.get(i)))
                {
                    equiposEnCarrera.put(this.equipos.get(i), this.corredores.get(j).getTiempo());
                            //Si el codigo coincide con el del corr  y el map ya tiene ese equipo registrado
                }else if(codEquipo.equals(this.corredores.get(j).getCodigoEquipo()) && equiposEnCarrera.containsKey(this.equipos.get(i)))
                {
                        Integer auxInteger = equiposEnCarrera.get(this.equipos.get(i)); //almacena el valor actual 
                        auxInteger += this.corredores.get(j).getTiempo(); // lo sumo con el tiempo del nuevo corredor
                        equiposEnCarrera.replace(this.equipos.get(i), equiposEnCarrera.get(this.equipos.get(i)), auxInteger); //Intercambio 
                }


            }

            //CONVIERTE EL DESPELOTE QUE HICISTE A UNA CADENA 


        }

    }


    /*****************************************************+ */

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDorsales() {
        return dorsales;
    }

    public void setDorsales(Integer dorsales) {
        this.dorsales = dorsales;
    }
    



    
    
}
