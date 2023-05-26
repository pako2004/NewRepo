import java.io.File;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    
    public static Eventos leerFicheroJson(String pathFile)
    {
       Eventos listaMadrid = null;

        File archivo = new File(pathFile);

        ObjectMapper mapper = new ObjectMapper();


        try 
        {
			
			listaMadrid = mapper.readValue(archivo, Eventos.class);
			
        } catch (Exception e) {
			System.out.println(e.getClass());
            System.out.println(e.getMessage());    
        }

        for (int index = 0; index < listaMadrid.getListaEventos().size(); index++) 
        {   
           
            
            listaMadrid.getListaEventos().get(index).actualizarPostal();
      
        }



        return listaMadrid;

    }


}
