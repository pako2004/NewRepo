package frioMijas_LuisRodriguez.Clases.equipos;

public class Camara extends Equipo {


    private double temperaturaMinimaMax;
    private double volumen;



    public Camara(double alto, double ancho, double profundidad, String marca, double frigorias,double temperaturaMinimaMax) {
        super(alto, ancho, profundidad, marca, frigorias);
        this.volumen = volumen();
        this.temperaturaMinimaMax  = temperaturaMinimaMax;
    }

    @Override
    double consumo() {
        
        this.consumo = frigorias * 5;

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
        return super.toString()+" | Volumen: "+this.volumen+" | Consumo: "+this.consumo+" |TemperaturaMinMax: " + this.temperaturaMinimaMax;
    }
    
}
