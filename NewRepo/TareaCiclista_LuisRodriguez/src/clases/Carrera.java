package clases;


import java.net.ContentHandlerFactory;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;



public class Carrera {


    private List<Equipo> equipos;
    private List<Corredor> corredores;
    private String nombre;
    private Integer dorsales =  0;
    Map<Integer,Integer> tiempos; // Dorsal Corredor - tiempo
   


    public Carrera(List<Ciclista> ciclistas, String nombre )
    {
        this.dorsales++;

        this.corredores = new ArrayList<>();

        for (int i = 0; i < ciclistas.size(); i++) //Añade los ciclistas a la collection de corredores
        {
            this.corredores.add(new Corredor(ciclistas.get(i), dorsales));
            this.dorsales++;    
        }
        
        
    }

    public void crearEquipos(List<Equipo> crear)
    {
        this.equipos = crear;
    }


    public void insertarTiemposEtapa(Map<Integer,Integer> tiempos2)
    {   
            Integer max = 0;
          

            for (int i = 0; i < this.corredores.size(); i++) 
            {

                Corredor corredor = this.corredores.get(i);
                 //almaceno el mayor tiempo
                 for (int j = 0; j < this.corredores.size(); j++) 
                 {

                    Corredor temp = this.corredores.get(j);
                     if (tiempos2.containsKey(temp.getDorsal()))
                     {
                         if(tiempos2.get(temp.getDorsal()) > max)
                         {
                             max = tiempos2.get(temp.getDorsal());
                         }
                     }
                }         
                     if(tiempos2.containsKey(corredor.getDorsal()) )
                     {
                         corredor.setTiempo(corredor.getTiempo()+tiempos2.get(corredor.getDorsal()));
                     }else{
                         corredor.setTiempo(corredor.getTiempo()+max);
                     }
                  
            }


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
    //En este me complique mucho porque el dia antes habia hecho mucho progreso y luego me dijeron que se podia hacer 
    //con una clase tambien pero yo lo hice sin clase
    public String clasificacionPorEquipos()
    {   
        ordernarCorredoresPorTiempo();

        Map<Equipo, Integer> equiposEnCarrera = new HashMap<>();

        for (int i = 0; i < this.equipos.size(); i++) 
        {

            String codEquipo = this.equipos.get(i).getCodigo();
            int contador = 0;
            int aux = 0;
            while(contador < 3 && aux < this.corredores.size())
            {   //Profe, agarrese de su silla porque va a estar complicado entender esto 

                        //Si el codigo coincide con el cod de equipo del corredor   y si el map no contiene ese equipo todavia
                if(codEquipo.equals(this.corredores.get(aux).getCodigoEquipo()) && !equiposEnCarrera.containsKey(this.equipos.get(i)))
                {   
                    // Agrego el equipo junto con el tiempo del primer corredor 
                    equiposEnCarrera.put(this.equipos.get(i), this.corredores.get(aux).getTiempo());
                            contador++;
                        //Si el codigo coincide con el codigo del corredor  y el map ya tiene ese equipo registrado
                }else if(codEquipo.equals(this.corredores.get(aux).getCodigoEquipo()) && equiposEnCarrera.containsKey(this.equipos.get(i)))
                {
                        Integer auxInteger = equiposEnCarrera.get(this.equipos.get(i)); //almacena el valor actual 
                        auxInteger += this.corredores.get(aux).getTiempo(); // lo sumo con el tiempo del nuevo corredor
                        equiposEnCarrera.replace(this.equipos.get(i), equiposEnCarrera.get(this.equipos.get(i)), auxInteger); //Intercambio 
                        contador++;
                }
                aux++;

            }
            
        }

        String candena = "";

        //Almaceno los tiempo en un array paral uego ordenarlos
        List<Integer> equiposOrdenados = new ArrayList<>(equiposEnCarrera.values());
        Collections.sort(equiposOrdenados);
       

        //Recorre todos los tiempo 
        for (int j = 0; j < equiposOrdenados.size(); j++) 
        {
            //Recorre todos los equipos
            for (int i = 0; i < this.equipos.size(); i++) 
            {   

                //Si el equipo esta en la carrera y si el tiempo coincide con el almacenado en el array 
                if  (equiposEnCarrera.containsKey(this.equipos.get(i)) && equiposEnCarrera.get(this.equipos.get(i)) == equiposOrdenados.get(j))
                {
                    candena += this.equipos.get(i).getCodigo() + " "+equiposEnCarrera.get(this.equipos.get(i))+"\n";
                }

            } 


        }
        
        return candena;
    }

    public String podium()
    {
        ordernarCorredoresPorTiempo();
        
        String cadena = "============ PODIUM ============ \n";
        for (int i = 0; i < 3 ; i++) 
        {   

            cadena+= "Puesto "+(i+1)+": "+this.corredores.get(i)+"\n";
            
        }

        return cadena;
    }


    public int posicionCorredor(Integer dorsalBuscado)
    {   
        ordernarCorredoresPorTiempo();

        int posicion = -1;

        for (int i = 0; i < this.corredores.size(); i++) 
        {
            
            if (this.corredores.get(i).getDorsal().equals(dorsalBuscado))
            {
                posicion = i;
            }

        }

        return posicion+1;
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
    
    public Map<Integer, Integer> getTiempos() {
        return tiempos;
    }

    public void setTiempos(Map<Integer, Integer> tiempos) {
        this.tiempos = tiempos;
    }



    
    
}
