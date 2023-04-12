package colecciones.EjerciciosColecciones;

import java.util.ArrayList;

import colecciones.EjerciciosColecciones.Pieza.Piezas;

public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        //Creo las piezas
        Pieza dama = new Pieza(1, Piezas.DAMA);
        Pieza torre = new Pieza(2, Piezas.TORRE);
        Pieza alfil = new Pieza(2, Piezas.ALFIL);
        Pieza caballo = new Pieza(2, Piezas.CABALLO);
        Pieza peon = new Pieza(8, Piezas.PEON);

        ArrayList<Pieza> tablero = new ArrayList<>();
        tablero.add(dama);
        tablero.add(torre);
        tablero.add(alfil);
        tablero.add(caballo);
        tablero.add(peon);
        
        int capturas = (int)(Math.random()*16);
        int aux =0;
        int puntosTotales = 0;

        System.out.println("Fichas capturadas por el jugador");

        while( aux <= capturas)
        {
            int piezaCapturar = (int)(Math.random()*4)+1;
            
            if(capturarPieza(tablero.get(piezaCapturar)))
            {   
                aux++;
                puntosTotales += imprimirCaptura(tablero.get(piezaCapturar));
                
            }

        }
        System.out.println("Puntos totales : "+puntosTotales+" peones.");

    }

    /**
     * Captura la pieza y devuelve un booleano si se puedo 
     * @param pieza
     * @return
     */
    static boolean capturarPieza(Pieza pieza)
    {
        if(pieza.getCantidad() <1)
        {
            return false;

        }else{
            pieza.setCantidad(pieza.getCantidad()-1);
            return true;
        }
        
    }

    static int imprimirCaptura(Pieza ficha)
    {   
        int suma = 0;
        switch(ficha.getPieza())
        {
            case DAMA:
                System.out.println("Dama (9 peones)");
                suma += 9;
            break;
            case TORRE:
                System.out.println("Torre (5 peones)");
                suma += 5;
            break;
            case ALFIL:
                System.out.println("Alfil (3 peones)");
                suma += 3;
            break;
            case CABALLO:
                System.out.println("Caballo (2 peonres)");
                suma += 2;
            break;
            case PEON:
                System.out.println("Peon (1 peones)");
                suma += 1;
            break;
        }

        return suma;
    }



}
