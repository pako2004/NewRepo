package modelo;
public class Coche {
    
    private String marca;
    private String modelo;
    private int año;
    private double precio;

   //  public Coche(String marca, String modelo, int año, double precio)
   //   {

   //      this.marca = marca;
   //      this.modelo = modelo;
   //      this.año = año;
   //      this.precio = precio;

   //   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getaño() {
      return año;
   }

   public void setaño(int año) {
      this.año = año;
   }

   public double getPrecio() {
      return precio;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   @Override
   public String toString() {
      return this.marca+" "+this.modelo+" "+this.año+" "+this.precio;
   }


}
