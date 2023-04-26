package Clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.crypto.dsig.TransformException;

public class LeerInformacion {
    

    public static ArrayList<Municipio> leerFicheroMunicipio(int año)
    {
        ArrayList<Municipio> municipios = new ArrayList<>();

        FileReader fr = null;
        BufferedReader bf = null;

        try {

            fr = new FileReader("src/PoblacionMunicipiosMalaga.csv");
            bf = new BufferedReader(fr);
            String linea = bf.readLine();
            int numLinea = 0;
            
                while (linea != null)
            {
                try {
                    numLinea++;
                if(numLinea != 1)
                {
                    String[] trozos = linea.split(";");
                    String[] municipio = trozos[0].split(" ");
                    String nombre = "";

                    if(municipio.length >2)
                    {
                        for(int i = 1; i < municipio.length ; i++)
                        {
                            nombre += municipio[i]+" ";
                        }
                    }else {
                        nombre = municipio[1];
                    }

                    trozos[3] = trozos[3].replace(".", "");
                    //System.out.println();
                    
                    int codPostal = Integer.parseInt(municipio[0]);
                    int poblacion = Integer.parseInt(trozos[3]);
                    if (codPostal <29000)
                    {

                    }else if(año == Integer.parseInt(trozos[2]) && trozos[1].equals("Total"))
                    {
                    municipios.add(new Municipio(nombre, codPostal, año, poblacion));
                    }
                }

                linea = bf.readLine();
                } catch (Exception e) {
                    linea = bf.readLine();
                    
                }
            }

        } catch (IOException e) 
        {}
        catch (Exception ex)
        {}
        finally
        {}

        return municipios;

    }

    public static ArrayList<Municipio> leerFicheroMunicipio()
    {
        ArrayList<Municipio> municipios = new ArrayList<>();

        FileReader fr = null;
        BufferedReader bf = null;

        try {

            fr = new FileReader("src/PoblacionMunicipiosMalaga.csv");
            bf = new BufferedReader(fr);
            String linea = bf.readLine();
            int numLinea = 0;
            
                while (linea != null)
            {
                try {
                    numLinea++;
                if(numLinea != 1)
                {
                    String[] trozos = linea.split(";");
                    String[] municipio = trozos[0].split(" ");

                    String nombre = "";

                    if(municipio.length >2)
                    {
                        for(int i = 1; i < municipio.length ; i++)
                        {
                            nombre += municipio[i]+" ";
                        }
                    }else {
                        nombre = municipio[1];
                    }
                   

                    trozos[3] = trozos[3].replace(".", "");
                    
                    int codPostal = Integer.parseInt(municipio[0]);
                    int año = Integer.parseInt(trozos[2]);
                    int poblacion = Integer.parseInt(trozos[3]);
                    if(codPostal != 29)
                    {
                        municipios.add(new Municipio(nombre, codPostal, año, poblacion));
                    }
                    
                }

                linea = bf.readLine();
                } catch (Exception e) {
                    linea = bf.readLine();
                }
            }

        } catch (IOException e) {

            
        }catch (Exception ex)
        {
        }
        finally
        {
            
        }

        return municipios;
    }

    public static Municipio buscarMunicipio(ArrayList<Municipio> lista, String nombre, Integer año)
    {   
        Collections.sort(lista, new ComparatorMuni());
        
        return new Municipio(nombre, 0, 0, 0);
    }
}
