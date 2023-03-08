package frioMijas_LuisRodriguez.Clases.equipos;

public class Frigorifico extends Equipo{


    private double volumen;

    public Frigorifico(double alto, double ancho, double profundidad, String marca, double frigorias) {
        super(alto, ancho, profundidad, marca, frigorias);
        this.consumo = consumo();
        this.volumen = volumen();
    }

    @Override
    double consumo() {
        
        this.consumo = frigorias * 3;

        return this.consumo;
    }

    double volumen()
    {

        this.volumen = this.alto * this.ancho* this.profundidad;

        return this.volumen;
    }
    
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString()+" | Consumo: "+this.consumo+" | Volumen: "+this.volumen;
   }
}
