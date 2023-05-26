import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class App {

    /*

Desde una asociación de jubilados de Madrid nos piden encontrar los
eventos gratuitos que se realizan en madrid.


Para ello tenemos la información de los eventos que se producen tanto en csv como en json y además un
documento donde se explican los diferentes campos del fichero.


Debemos procesar los eventos y sacar la siguiente información:
  
Listado de eventos gratuitos
   
Listado de eventos gratuitos de un código postal en concreto
   
Numero de eventos totales por código postal. Debe devolver un diccionario con el código portal y el número de eventos


Crea un fichero principal donde pruebes estos métodos y pruebes además si ambos ficheros tienen la misma información


 */

static Eventos  eventosJSON = JsonUtils.leerFicheroJson("src/recursos/206974-0-agenda-eventos-culturales-100.json");
static Eventos eventosCSV = CsvUtils.leerCsv("src/recursos/206974-0-agenda-eventos-culturales-100.csv");

    public static void main(String[] args) throws Exception 
    {
        for (int i = 0; i < eventosJSON.getListaEventos().size(); i++) 
        {
                
        }
        System.out.println(eventosJSON);
        
        //CsvUtils.leerCsv("src/recursos/206974-0-agenda-eventos-culturales-100.csv");

        //HashMap<String, Integer> eventosTotalPorCod = eventosTotalPorCodPostal(eventosJSON);

        List<EventoMadrid> eventosGratisPorCod = eventoPorCodPostal("28035", eventosJSON);
        System.out.println(eventosGratisPorCod);
        
    }   

    private static List<EventoMadrid> eventosGratuitos(Eventos ficherEventos)
    {   
        List<EventoMadrid> listaGratis = new ArrayList<>();
        //Copio la variable para un codigo mas legible
        List<EventoMadrid> listaEventos= ficherEventos.getListaEventos(); 

        
        for (int i = 0; i < listaEventos.size(); i++) 
        {
            
            if(listaEventos.get(i).getFree().equals(1))
            {
                listaGratis.add(listaEventos.get(i));
            }

        }        

        return listaGratis;
    }

 

    private static List<EventoMadrid> eventoPorCodPostal(String codigoBuscado, Eventos ficherEventos)
    {
        List<EventoMadrid> eventosBuscado = new ArrayList<>();

        for (int i = 0; i < ficherEventos.getListaEventos().size(); i++) 
        {   

            if(ficherEventos.getListaEventos().get(i).getCodPostal() != null &&ficherEventos.getListaEventos().get(i).getCodPostal().equals(codigoBuscado))
            {
                eventosBuscado.add(ficherEventos.getListaEventos().get(i));
            }    
        }
        return eventosBuscado;

    }

   
    private static HashMap<String, Integer> eventosTotalPorCodPostal(Eventos ficheroEventos)
    {

        HashMap<String, Integer> eventosTotal = new HashMap<>();


        for (int index = 0; index < ficheroEventos.getListaEventos().size(); index++) 
        {
            
            try {
                if(eventosTotal.containsKey(ficheroEventos.getListaEventos().get(index).getCodPostal()))
                {      
                    if(ficheroEventos.getListaEventos().get(index).getCodPostal() != null)
                    {
                        Integer auxInteger = eventosTotal.get(ficheroEventos.getListaEventos().get(index).getCodPostal());
                        auxInteger++;
                        eventosTotal.replace(ficheroEventos.getListaEventos().get(index).getCodPostal(), auxInteger);

                    }else{
                        Integer auxInteger = eventosTotal.get("Sin Codigo");
                        auxInteger++;
                        eventosTotal.replace("Sin codigo", auxInteger); }
                }else{
                    if(ficheroEventos.getListaEventos().get(index).getCodPostal() != null)
                    {
                         eventosTotal.put(ficheroEventos.getListaEventos().get(index).getCodPostal(), 1);     
                    }else{
                        eventosTotal.put("Sin codigo", 1);
                    }

                  
                }
            } catch (Exception e) {
                
                System.out.println("EEEEERRRRRRORRR "+ficheroEventos.getListaEventos().get(index));
            }
        }
        return eventosTotal;
    }


}
