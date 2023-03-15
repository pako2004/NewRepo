package ejerciciosInterfaz.negoEjemplo;

import java.security.cert.PKIXReason;

public class usoNegocio {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("PAko", 100);
        Cliente c2 = new Cliente("paka" , 200);
        Cliente c5 = new Cliente("pake" , 20);
        Cliente c4 = new Cliente("pak5" , 2000);
        Cliente c3 = new Cliente("pak7" , 21200);
        

        Ferreteria ferreteriaPako = new Ferreteria("FERRETERIA_PAKO");
        
        ferreteriaPako.abrir();

        ferreteriaPako.cobrar();

        ferreteriaPako.ponerEnCola(c1);
        ferreteriaPako.ponerEnCola(c2);
        ferreteriaPako.ponerEnCola(c3);
        ferreteriaPako.ponerEnCola(c4);
        ferreteriaPako.ponerEnCola(c5);

        ferreteriaPako.cobrar();

        System.out.println("DInero en caja: "+ferreteriaPako.getDineroEnCaja());

        ferreteriaPako.cobrar();

        System.out.println("Impuestos que debe pagar: "+ferreteriaPako.pagarImpuesto());
    }
}
