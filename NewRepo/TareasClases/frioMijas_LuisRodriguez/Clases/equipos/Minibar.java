package frioMijas_LuisRodriguez.Clases.equipos;

public class Minibar extends Equipo {
    
    

    private int numBaldas;
    



    public Minibar(double alto, double ancho, double profundidad, int numBaldas, String marca, double frigorias) {
        super(alto, ancho, profundidad,marca, frigorias);
        this.numBaldas = numBaldas;
        this.consumo = consumo();
    }


    @Override
    double consumo()
    {
        this.consumo = this.frigorias * 2;
        
        return this.consumo;
    }
   
    @Override
    public String toString() {
        
        return super.toString() + " | Baldas: "+this.numBaldas+" | Consumo: "+this.consumo;
    }





}
