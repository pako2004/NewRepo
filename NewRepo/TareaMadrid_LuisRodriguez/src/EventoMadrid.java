import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class EventoMadrid {

    

    //Atributos

    private Integer free;

    private String id;
    private String title;
    private Address address;
    private String codPostal;
    private String audience;



    public void actualizarPostal()
    {   
        try 
        {
            if(this.address.getArea() != null && this.address.getArea().getPostalCode() != null )
            {
                this.codPostal = this.address.getArea().getPostalCode();
            }
            
        } catch (Exception e) 
        {
            
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
  
    public String getAudience() {
        return audience;
    }
    public void setAudience(String audience) {
        this.audience = audience;
    }


    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
