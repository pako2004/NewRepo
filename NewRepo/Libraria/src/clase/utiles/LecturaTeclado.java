package clase.utiles;

import java.util.Scanner;

public class LecturaTeclado {
    
    private Scanner sc;

    public LecturaTeclado()
    {
        sc = new Scanner(System.in);
    }

    public String leerCadena()
    {
        String cadena = "";
        boolean seguir = true;
        while(seguir){

            try{
                cadena = sc.nextLine();
                seguir = false;
            }catch(Exception e)
            {   
                System.out.println("Dato no valido, introduzca uno valido");
                seguir = true;
            }
        }
        return cadena;
    }

    public int leerInt()
    {
        int numero = 0;
        boolean seguir = true;
        while (seguir)
        {
            try {
                numero = Integer.parseInt(sc.nextLine());
                seguir = false;
            } catch (Exception e) {
                System.out.println("Dato no valido, introduzca uno valido");
                seguir = true;
            }
        }
        return numero;
    }

    public float leerFloat()
    {
        float numero = 0;
        boolean seguir = true;

        while (seguir)
        {
            try {
                numero = Float.parseFloat(sc.nextLine());
                seguir = false;
            } catch (Exception e) {
                System.out.println("Dato no valido, introduce uno valido");
                seguir = true;
            }
        }

        return numero;
    }

    public double leerDouble()
    {
        double numero = 0;

        boolean seguir = true;

        while (seguir)
        {
            try {
                numero = Double.parseDouble(sc.nextLine());
                seguir = false;
            } catch (Exception e) {
                System.out.println("Dato no valido, introduce uno valido");
                seguir = true;
            }
        }

        return numero;

    }

    public void finalizarLectura()
    {
        this.sc.close();
    }
}
