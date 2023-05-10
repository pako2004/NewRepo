import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsJson {


    public static Pokedex leerPokedex(String fichero)
    {
        File archivo = new File(fichero);

        ObjectMapper mapper = new ObjectMapper();

        Pokedex listaPokedex = null;

        try 
        {
			
			//listaPokedex = mapper.readValue(archivo, new TypeReference <Pokedex>(){});
			listaPokedex = mapper.readValue(archivo, Pokedex.class);
			
        } catch (Exception e) {
			System.out.println(e.getClass());
            System.out.println(e.getMessage());    
        }

        return listaPokedex;
    }



}
