import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;
import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

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

        System.out.println("---------------------------------------");

        System.out.println("-----  ESCRITURA EN FICHEROS  ---------");

        System.out.println("---------------------------------------");

        FileWriter fw = new FileWriter("src/recursos/fichero.txt");
        BufferedWriter bw = new BufferedWriter(fw);  
        try{

            fw.append("f");
            fw.close();

            //File newFile = new FieldPosition("src/recursos");

            
            bw.write("Etiqueten a mamameelmostro");
            bw.newLine();
            bw.write(LocalTime.now().toString());
            fw.close();
            bw.close();
            System.out.println("Fin escritura");
        }catch(Exception ex)
        {

        }

        EscrituraEnFichero();



    }

    static void EscrituraEnFichero() throws Exception
    {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = null;
        BufferedWriter bw = null;

        try{    
        
            fw = new FileWriter("src/recursos/nuevoFichero.txt", true);
            bw = new BufferedWriter(fw);

            boolean salir = false;

            while (salir == false)
            {   


                System.out.println("Introduzca una nueva linea (Escribe 'Salir' para cerrar el programa)");
                String nuevaLinea = sc.nextLine();

                if(nuevaLinea.toLowerCase().equals("salir"))
                {
                    salir = true;
                }else
                {
                    bw.write(nuevaLinea);
                    bw.newLine();
                }
            }

            fw.close();
            bw.close();


        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());

        }
        finally
        {
            fw.close();
            bw.close();
        }




    }
}
