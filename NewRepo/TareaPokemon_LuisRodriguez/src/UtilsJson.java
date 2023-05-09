import java.io.File;
import java.io.ObjectStreamException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsJson {


    public static Pokedex leerPokedex(String fichero)
    {
        File archivo = new File(fichero);

        ObjectMapper mapper = new ObjectMapper();

        Pokedex listaPokedex= null;

        try 
        {
            
            List<Pokemon> asdasasd = mapper.readValue(archivo, new TypeReference<List<Pokemon>>(){});

        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }

        return listaPokedex;
    }

    /*	public static List<Coche> leerListaCoches(String pathFile)
	{
		File ficheroCoche = new File(pathFile);

		//Crear object mapper 
		ObjectMapper objectMapper = new ObjectMapper();

		//Convertir json a objeto
		List<Coche> lista = null;

		try{

			lista = objectMapper.readValue(ficheroCoche,  new TypeReference<List<Coche>>(){});

		}catch(IOException e)
		{
			e.printStackTrace();
		}

		System.out.println(lista);
		return lista;
	} */


}
