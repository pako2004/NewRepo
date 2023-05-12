import java.io.File;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    
    public static Eventos leerFicheroJson(String pathFile)
    {
       Eventos listaMadrid = null;

        File archivo = new File(pathFile);

        ObjectMapper mapper = new ObjectMapper();


        try 
        {
			
			//listaPokedex = mapper.readValue(archivo, new TypeReference <Pokedex>(){});
			listaMadrid = mapper.readValue(archivo, Eventos.class);
			
        } catch (Exception e) {
			System.out.println(e.getClass());
            System.out.println(e.getMessage());    
        }



        return listaMadrid;

    }


}
