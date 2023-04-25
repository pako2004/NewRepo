import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeerInformacion {
    

    public static ArrayList<Municipio> leerFicheroMunicipio(int año)
    {
        ArrayList<Municipio> municipios = new ArrayList<>();


        return municipios;
    }

    public static ArrayList<Municipio> leerFicheroMunicipio()
    {
        ArrayList<Municipio> municipios = new ArrayList<>();

        FileReader fr = null;
        BufferedReader bf = null;

        try {

            fr = new FileReader("src/PoblacionMunicipiosMalaga.csv");
            bf = new BufferedReader(bf);
            String linea = bf.readLine();
            int numLinea = 0;
            while (linea != null)
            {
                numLinea++;
                if(numLinea != 1)
                {
                    String[] trozos = linea.split(";");
                    String[] municipio = trozos[1].split(" ");
                    
                }
            }


            
        } catch (IOException e) {

            System.out.println(e.getMessage());
            
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            
        }

        return municipios;
    }
}
