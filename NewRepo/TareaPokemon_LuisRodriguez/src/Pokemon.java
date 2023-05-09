import java.lang.reflect.Array;
import java.nio.channels.CancelledKeyException;
import java.util.ArrayList;
import java.util.Map;

public class Pokemon {
    

    //Atributos
    private Integer id;
    private Integer num;
    private String name;
    private ArrayList<String> type;
    private Double height;
    private Double weight;
    private ArrayList<String> weaknesses;
    private Map<Pokemon, Pokemon> next_evolution;



    @Override
    public String toString() {

        return this.num+" "+this.name+" "+this.type;
    }

    /* **************************** GETTERS Y SETTERS ************************ */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
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
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Map<Pokemon, Pokemon> getNext_evolution() {
        return next_evolution;
    }
    public void setNext_evolution(Map<Pokemon, Pokemon> next_evolution) {
        this.next_evolution = next_evolution;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }
    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }
   
    
}
