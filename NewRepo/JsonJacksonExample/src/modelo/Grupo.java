package modelo;

import java.util.List;

public class Grupo {

    private List<Persona> people;

    public Grupo()
    {
        
    }

    public List<Persona> getPeople() {
        return people;
    }

    public void setPeople(List<Persona> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return this.people.toString();
    }
    
}
