
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)



public class Pokemon {
    

    //Atributos
    private Integer id;
    private String num;
    private String name;
    private ArrayList<String> type;
    private String height;
    private String weight;
    private ArrayList<String> weaknesses;
    // private List<Pokemon> nex_evolution;
    private List<Next_Evolution> next_evolution;
    




    @Override
    public String toString() {

        return "\n"+this.name+" "+this.type+" "+this.height+" Debilidades: "+this.weaknesses+
        " Evoluciones["+this.next_evolution+"]";
    }

    /* **************************** GETTERS Y SETTERS ************************ */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getType() {
        return type;
    }
    public void setType(ArrayList<String> type) {
        this.type = type;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
 
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }
    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Next_Evolution> getNext_evolution() {
        return next_evolution;
    }

    public void setNext_evolution(List<Next_Evolution> next_evolution) {
        this.next_evolution = next_evolution;
    }

    //public Map<String, String> getNext_evolution() {
    //    return next_evolution;
    //}
//
    //public void setNext_evolution(Map<String, String> next_evolution) {
    //    this.next_evolution = next_evolution;
    //}


   
   
    
}
