package frioMijas_LuisRodriguez.Clases.equipos;

public class Arcon extends Equipo{


    private String tipoApertura;


    public Arcon(double alto, double ancho, double profundidad, String marca, double frigorias, String tipoApertura ) {
        super(alto, ancho, profundidad, marca, frigorias);
        this.tipoApertura = tipoApertura;
        this.consumo = consumo();
    }

    @Override
    double consumo() {
        
        this.consumo = frigorias * 2;

        return this.consumo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" | Consumo: "+this.consumo+" |Tipo de Apertura: "+this.tipoApertura;
    }
    


    
}
