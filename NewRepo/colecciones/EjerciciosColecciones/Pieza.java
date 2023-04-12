package colecciones.EjerciciosColecciones;

public class Pieza {
    
  public enum Piezas{DAMA,TORRE,ALFIL,CABALLO,PEON}

  Piezas pieza;
  int cantidad;

  public Pieza(int cantidad, Piezas pieza)
  {
    this.cantidad = cantidad;
    this.pieza = pieza;
  }

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

public Piezas getPieza() {
    return pieza;
}
}
