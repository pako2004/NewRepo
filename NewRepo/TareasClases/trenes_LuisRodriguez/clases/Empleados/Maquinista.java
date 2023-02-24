package trenes_LuisRodriguez.clases.Empleados;

public class Maquinista {
    
      //Atributos
      private String nombre;
      private String dni;
      private int sueldo;
      private String rango;
 
     
     //Constructores
 
     public Maquinista(String nombre, String dni, int sueldo, String rango){
 
         this.nombre= nombre;
         this.dni = dni;
         this.sueldo = sueldo;
         this.rango = rango;
 
     }
 
     public Maquinista(String nombre, String dni, int sueldo){
         this.nombre= nombre;
         this.dni = dni;
         this.sueldo = sueldo;
         this.rango = "Ayudante";
         
 
     }
 
     public void setRango(String rango) {
         this.rango = rango;
     }

    public String getRango() {
        return rango;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
 
     //Setter 
    
}
