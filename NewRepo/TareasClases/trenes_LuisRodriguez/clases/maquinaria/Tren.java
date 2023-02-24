package trenes_LuisRodriguez.clases.maquinaria;

import trenes_LuisRodriguez.clases.Empleados.Maquinista;;

public class Tren {


     
    //Atributos
    private Maquinista maquinista;
    private Vagon[] vagones = new Vagon[0];
    private Locomotora locomotora;
    private int contador = 0;

    //Constructores

    public Tren(Locomotora locomotora, Maquinista maquinista){

        this.maquinista = maquinista;
        this.locomotora = locomotora;

    }

    public void enganchaVagon(double cargaMax, double cargaActual, String mercancia)
    {
        if(this.contador < 5 && cargaMax >= cargaActual){
        Vagon v = new Vagon(cargaMax, cargaActual, mercancia);
        
        Vagon[] newArray = new Vagon[this.vagones.length+1];

        for (int i = 0; i < vagones.length; i++) {
            newArray[i] = vagones[i];
        }
        newArray[newArray.length-1] = v;
        this.vagones = newArray;

        this.contador++;
        }else{
            System.out.println("Este tren ya tiene el limite de vagones");
        }

        
    }

    //public Vagon[] agregarVagon(Vagon vagon)
    //{
//
    //    Vagon[] newArray = new Vagon[array.length+1];
//
    //    for (int i = 0; i < newArray.length; i++) {
    //        
    //        newArray[i] = array[i];
    //    }
    //    newArray[newArray.length]
    //}


    @Override
    public String toString()
    {
        String cadena = "";
        double cargaTot = 0;
        for (int i = 0; i < vagones.length; i++) {
            cadena += this.vagones[i].toString();
            cargaTot += this.vagones[i].getCargaActual();
        }
        return this.locomotora.toString() + cadena + "= "+ cargaTot +
        "Kgs de carga total -" + this.maquinista.toString()+ " ("+ this.maquinista.getRango()+")";
    }
    
}
