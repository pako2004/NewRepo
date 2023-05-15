
.


































import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class EventoMadrid {

    

    //Atributos

    private Integer free;

    private String id;
    private String title;
    private Ubicacion area;
    private String codPostal;
    private String audience;



    public static void actualizarPostal(Eventos eventos)
    {
        for (int i = 0; i < eventos.getListaEventos().size(); i++) 
        {
            //Actualizo todos los codigos postales de los eventos
            
            eventos.getListaEventos().get(i)
            .setPostalCode(eventos.getListaEventos().get(i).getArea().getPostalCode());

        }
    }

    @Override
    public String toString() {

        if  (this.free.equals(1))
        {
            return this.id +" "+title+" "+codPostal+" Audiencia: "+audience+" GRATIS\n"; 
        }else
        {
        return   this.id +" "+title+" "+codPostal+" Audiencia: "+audience;

        }

    }


    public Integer getFree() {
        return free;
    }
    public void setFree(Integer free) {
        this.free = free;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("postal-code")
    public String getPostalCode() {
        return codPostal;
    }

    @JsonProperty("postal-code")
    public void setPostalCode(String codPostal) {
        this.codPostal = codPostal;
    }
    public String getAudience() {
        return audience;
    }
    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Ubicacion getArea() {
        return area;
    }

    public void setArea(Ubicacion area) {
        this.area = area;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    
}
