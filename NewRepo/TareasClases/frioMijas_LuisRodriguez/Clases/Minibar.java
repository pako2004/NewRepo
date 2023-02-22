package frioMijas_LuisRodriguez.Clases;

public class Minibar extends Equipo {
    
    

    private int numBaldas;



    public Minibar(double alto, double ancho, double profundidad, int numBaldas, String marca) {
        super(alto, ancho, profundidad,marca);
        this.numBaldas = numBaldas;
        //TODO Auto-generated constructor stub
    }


    @Override
    public double consumo()
    {


        throw new UnsupportedOperationException("Unimplemented method 'consumo'");
    }
    @Override
    public double frigorias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frigorias'");
    }





}
