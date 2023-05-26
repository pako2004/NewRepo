import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.print.attribute.standard.RequestingUserName;

public class CsvUtils {
    



    public static Eventos leerCsv(String path)
    {
        


        try (FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr) ) 
        {
            String linea = br.readLine();
            int numLinea = 1;
            while(linea != null)
            {
                if(numLinea != 1 )
                {
                    String[] productoLinea = linea.split(";");
/*
 * 0- ID-EVENTOO
 * 1 - TITULO 
 * 2 -PRECIO
 * 3- GRATUITO
 */

                }
                linea = br.readLine();
                numLinea++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }

    
}
