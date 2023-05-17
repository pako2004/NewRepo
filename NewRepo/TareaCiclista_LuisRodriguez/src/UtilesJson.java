import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Ciclista;
import clases.Equipo;

public class UtilesJson {
    


public static List<Ciclista> leerCiclistasJson(String pathFile)
{   
    File file = new File(pathFile);

    ObjectMapper mapper = new ObjectMapper();

    List<Ciclista> listaCiclistas = null; 
    
    try {
        listaCiclistas = mapper.readValue(file, new TypeReference<List<Ciclista>>(){});
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


    return listaCiclistas;

}


public static List<Equipo> leerEquiposCsv(String pathfile)
{
    List<Equipo> equipos = new ArrayList<>();
    
    try (FileReader fr = new FileReader(pathfile);
        BufferedReader br = new BufferedReader(fr) ) 
    {
        String linea = br.readLine();
        int numLinea = 1;
        while(linea != null)
        {
            if(numLinea != 1 )
            {

                String[] equipoLinea = linea.split(",");

                int presupuesto = Integer.parseInt(equipoLinea[equipoLinea.length-1]);

                Equipo creado = new Equipo(equipoLinea[0],equipoLinea[1],equipoLinea[2], presupuesto);

                equipos.add(creado);

            }
            linea = br.readLine();
            numLinea++;
        }
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return equipos;

}

public static Map<Integer,Integer> leerEtapa(String pathfile)
{
    Map<Integer, Integer> etapa = new HashMap<>();

    File file = new File(pathfile); 

    ObjectMapper mapper = new ObjectMapper();

    try  
    {

        etapa = mapper.readValue(file, new TypeReference<Map<Integer, Integer>>() {});

    } catch (Exception e)
    {    System.out.println(e.getMessage());}

    return etapa;
}


}
