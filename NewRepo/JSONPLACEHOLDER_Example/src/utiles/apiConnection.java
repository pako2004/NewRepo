package utiles;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.InputMap;

public class apiConnection {
    

    public static String BuscarUsuario(int codigoUsuario)
    {
        String resultado = "";

        try 
        {
            String urlConexion = "https://jsonplaceholder.typicode.com/users/";

            urlConexion += codigoUsuario;

            URL url = new URL(urlConexion);
            URLConnection urlConnection = url.openConnection();

            InputStream input = new BufferedInputStream(urlConnection.getInputStream());    

            resultado = input.toString();

            int caracter = input.read();
            while(caracter != -1)
            {
                resultado+= Character.toString(caracter);
                caracter = input.read();
            }

        } catch (Exception e) {
            System.out.println("ERROR" + codigoUsuario);
        }



        
        return resultado;

        
    }

}
