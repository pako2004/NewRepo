package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeerInformacion {

    public static ArrayList<Municipio> leerFicheroMunicipio(int año) {
        ArrayList<Municipio> municipios = new ArrayList<>();

        FileReader fr = null;
        BufferedReader bf = null;

        try {

            fr = new FileReader("src/PoblacionMunicipiosMalaga.csv");
            bf = new BufferedReader(fr);
            String linea = bf.readLine();
            int numLinea = 0;

            while (linea != null) {
                try {
                    numLinea++;
                    if (numLinea != 1) {
                        String[] trozos = linea.split(";");
                        String[] municipio = trozos[0].split(" ");
                        String nombre = "";

                        if (municipio.length > 2) {
                            for (int i = 1; i < municipio.length; i++) {
                                nombre += municipio[i] + " ";
                            }
                        } else {
                            nombre = municipio[1];
                        }

                        trozos[3] = trozos[3].replace(".", "");
                        // System.out.println();

                        int codPostal = Integer.parseInt(municipio[0]);
                        int poblacion = Integer.parseInt(trozos[3]);
                        if (codPostal < 29000) {

                        } else if (año == Integer.parseInt(trozos[2]) && trozos[1].equals("Total")) {
                            municipios.add(new Municipio(nombre, codPostal, año, poblacion));
                        }
                    }

                    linea = bf.readLine();
                } catch (Exception e) {
                    linea = bf.readLine();

                }
            }

        } catch (IOException e) {
        } catch (Exception ex) {
        } finally {
        }

        return municipios;

    }

    public static ArrayList<Municipio> leerFicheroMunicipio() {
        ArrayList<Municipio> municipios = new ArrayList<>();

        FileReader fr = null;
        BufferedReader bf = null;

        try {

            fr = new FileReader("src/PoblacionMunicipiosMalaga.csv");
            bf = new BufferedReader(fr);
            String linea = bf.readLine();
            int numLinea = 0;

            while (linea != null) {
                try {
                    numLinea++;
                    if (numLinea != 1) {
                        String[] trozos = linea.split(";");
                        String[] municipio = trozos[0].split(" ");

                        String nombre = "";

                        if (municipio.length > 2) {
                            for (int i = 1; i < municipio.length; i++) {
                                nombre += municipio[i] + " ";
                            }
                        } else {
                            nombre = municipio[1];
                        }

                        trozos[3] = trozos[3].replace(".", "");

                        int codPostal = Integer.parseInt(municipio[0]);
                        int año = Integer.parseInt(trozos[2]);
                        int poblacion = Integer.parseInt(trozos[3]);
                        if (codPostal != 29) {
                            municipios.add(new Municipio(nombre, codPostal, año, poblacion));
                        }

                    }

                    linea = bf.readLine();
                } catch (Exception e) {
                    linea = bf.readLine();
                }
            }

        } catch (IOException e) {

        } catch (Exception ex) {
        } finally {

        }

        return municipios;
    }

    public static Municipio buscarMunicipio(ArrayList<Municipio> lista, String nombre, Integer año)
    {   
        Collections.sort(lista, new ComparatorMuni());
        Municipio buscado = new Municipio(nombre, 0, año, 0);
        int posicion = Collections.binarySearch(lista, buscado, new ComparatorMuni());
        return lista.get(posicion);
    }

    public static HashMap<String, Integer> incrementoPoblacion(ArrayList<Municipio> listaMuni, Integer year1, Integer year2)
    {
        HashMap<String, Integer> municipios = new HashMap<>();

        ArrayList<Municipio> lista1 = leerFicheroMunicipio(year1);
        Collections.sort(lista1, new Municipio(null, 0, 0, 0));
        ArrayList<Municipio> lista2 = leerFicheroMunicipio(year2);
        Collections.sort(lista2, new Municipio(null, 0, 0, 0));

        try {
            
            int index1 = 0;
            int index2 = 0;

            while(index1 < lista1.size() && index2 <lista2.size())
            {
                    if(lista1.get(index1).getNombre().equals(lista2.get(index2).getNombre()))
                    {
                    Integer diferencia = lista1.get(index1).getPoblacion() - lista2.get(index2).getPoblacion();

                    if(diferencia < 0)
                    {
                        diferencia = diferencia * 1;
                    }

                    municipios.put(lista1.get(index1).getNombre(), diferencia);

                    index1++;
                    index2++;
                    
                    }else{

                        if(lista1.get(index1).getNombre().compareTo(lista2.get(index2).getNombre()) < 0)
                        {
                            index2++;
                        }else if(lista1.get(index1).getNombre().compareTo(lista2.get(index2).getNombre()) > 0)
                        {
                            index1++;
                        }
                    }
            }


        } catch (Exception e) {
            
        }
        


        return municipios;
    }
}
