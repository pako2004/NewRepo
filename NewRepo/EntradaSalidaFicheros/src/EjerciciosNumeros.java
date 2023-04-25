import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import clases.LogPako;

public class EjerciciosNumeros {


    public static void main(String[] args) {

        try{
            Scanner sc;
            FileReader fr;
            BufferedReader bf;
            String lineaFichero = "";

            fr = new FileReader("src/recursos/numeros.txt");
            bf = new BufferedReader(fr);
            
            while(lineaFichero != null)
            {

                sc = new Scanner(bf);
                
            
            }
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }



    }
    
}
