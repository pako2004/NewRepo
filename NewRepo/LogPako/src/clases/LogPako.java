package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogPako {

    public enum TipoMensaje{ERROR, INFORMACION}
    
    private String mensaje; 
    private LocalDateTime fecha;
    private TipoMensaje tipoMensaje;

    public static void nuevaEntradaLog(String mensaje, TipoMensaje tipoMensaje)
    {
        String rutaLog = "src/log.txt";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter("src/log.txt",true);
            bw = new BufferedWriter(fw);

            bw.newLine();
            String cadena = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)+
            " - "+tipoMensaje.toString()+ " - "+mensaje;
            bw.write(cadena);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
           try {
            if(bw != null)
            {
                bw.close();
            }
            if(fw != null)
            {
                fw.close();
            }
           } catch (IOException e) {
                System.out.println(e);
            }
        }
        
    }




    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
