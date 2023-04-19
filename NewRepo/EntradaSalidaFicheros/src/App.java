import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        FileReader fr = null;
        FileReader fr2 = null;

        try {
            fr = new FileReader("src/recursos/fichero.txt");
            fr2 = new FileReader("/home/administrador/Escritorio/fichero2.txt");

            int caracterLeido = fr.read();

            while(caracterLeido != -1)
            {
                System.out.print((char)caracterLeido);
                caracterLeido = fr.read();
            }
            System.out.println();
        } catch (IOException exception)
        {
            System.out.println("Fichero no encontrado");
        }
        finally
        {
            if(fr!= null)
            {
                fr.close();
            }
            if(fr2!= null)
            {
                fr2.close();
            }
        }

        // BUEFFERED READER -------------------------------------------------
        System.out.println("BUFFERED READER -----------------");
        try {
            fr = new FileReader("src/recursos/fichero.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            
            String linea = bufferedReader.readLine();
            while (linea != null)
            {
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            System.out.println("Fin fichero ");
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }
        finally
        {
            
        }
    }
}
