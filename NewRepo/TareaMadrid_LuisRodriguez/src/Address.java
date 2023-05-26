
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    private Area area;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }


}
