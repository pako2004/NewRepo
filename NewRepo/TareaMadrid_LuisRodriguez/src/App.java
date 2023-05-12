import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

import org.w3c.dom.events.Event;

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

 static Eventos  eventos = JsonUtils.leerFicheroJson("src/recursos/206974-0-agenda-eventos-culturales-100.json");


    public static void main(String[] args) throws Exception 
    {
        for (int i = 0; i < eventos.getListaEventos().size(); i++) 
        {
                
        }
        System.out.println(eventos);

    }   

    // private static List<EventoMadrid> eventosGratuitos()
    // {   
    //     List<EventoMadrid> listaGratis = new ArrayList<>();
    //     //Copio la variable para un codigo mas legible
    //     List<EventoMadrid> listaEventos= eventos.getListaEventos(); 

        
    //     for (int i = 0; i < listaEventos.size(); i++) 
    //     {
            
    //         if(listaEventos.get(i).getFree().equals(1))
    //         {
    //             listaGratis.add(listaEventos.get(i));
    //         }

    //     }        

    //     return listaGratis;
    // }


}
