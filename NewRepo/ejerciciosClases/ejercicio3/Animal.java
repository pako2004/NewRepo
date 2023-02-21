package ejerciciosClases.ejercicio3;

public abstract class Animal {

    //Atributos
    public abstract int  num_Extemidades();
    public abstract String sonido();
    protected String color;
    
    
    public Animal()
    {

    }
    


    @Override
    public String toString()
    {
        return "Animal";
    }

    // Get y set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
