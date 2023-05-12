import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Eventos {

    @JsonProperty("@graph")
    private List<EventoMadrid> listaEventos;

    public List<EventoMadrid> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<EventoMadrid> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < this.listaEventos.size(); i++) 
        {
            cadena += this.listaEventos.get(i).toString()+"\n";
        }
        return cadena;
    }


    
}
