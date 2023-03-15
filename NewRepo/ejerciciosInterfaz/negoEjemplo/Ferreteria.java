package ejerciciosInterfaz.negoEjemplo;

import java.time.LocalDate;
import java.util.Arrays;

public class Ferreteria extends Negocio implements Tienda_i {


    private int tipoIVA;
    private Cliente[] cola;
    private double dineroEnCaja;

    public Ferreteria( String nombre)
    {
        this.nombre = nombre;
        cola = new Cliente[0];
        dineroEnCaja = 100;
        tipoIVA = 21;
    }


    public double pagarImpuesto()
    {
        return dineroEnCaja*tipoIVA;
    }


    @Override
    public void abrir() {
        System.out.println("La ferreteria: "+this.nombre+" abre ya :) "+LocalDate.now());
    }


    @Override
    public double cobrar() {
      double total = 0;
      if(cola.length>0)
      {
        Cliente clienteQueLeToca = cola[0];

        total = clienteQueLeToca.getDinero();
        System.out.println("Atiendo al cliente: "+clienteQueLeToca.getNombre());

        Cliente[] nuevaCola = new Cliente[cola.length-1];

        for (int i = 0; i < nuevaCola.length; i++) {
            
            nuevaCola[i] = cola[i+1];
        }
        cola = nuevaCola;
      }
      return total;

    }

    public int getTipoIVA() {
        return tipoIVA;
    }


    public void setTipoIVA(int tipoIVA) {
        this.tipoIVA = tipoIVA;
    }


    public Cliente[] getCola() {
        return cola;
    }


    public void setCola(Cliente[] cola) {
        this.cola = cola;
    }


    public double getDineroEnCaja() {
        return dineroEnCaja;
    }


    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }
    
    @Override
    public void ponerEnCola(Cliente cliente) {
        Cliente[] nuevaCola = Arrays.copyOf(cola, cola.length+1);
        nuevaCola[nuevaCola.length-1] = cliente;


    }
    
    
    
}
