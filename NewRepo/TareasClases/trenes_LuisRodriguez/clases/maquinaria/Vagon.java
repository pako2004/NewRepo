package trenes_LuisRodriguez.clases.maquinaria;

public class Vagon {
    

   //Atributos
   private String id = "V";
   private double cargaMax;
   private double cargaActual;
   private String mercancia;
   private static int count = 0;

   //Constructor
   public Vagon(double cargaMax, double cargaActual, String mercancia){

       if (cargaActual > cargaMax){
           System.out.println("La carga actual excede la capacidad maxima");
       }else{
           this.cargaActual = cargaActual;
           count++;
       this.id += count;
       this.cargaMax = cargaMax;
       this.mercancia = mercancia;
       }
           

   }

   public double getCargaActual() {
    return cargaActual;
}

@Override
   public String toString()
   {
    return " ["+this.id +" - "+this.cargaActual+" de "+this.cargaMax+this.mercancia+"] ";
   }
}
