import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import Clases.ComparatorMuni;
import Clases.LeerInformacion;
import Clases.Municipio;

public class Main {

    public static void main(String[] args) {
        /* 

                        PRUEBAS DE LOS METODOS DE LEERINFORMACION

        //ArrayList<Municipio> asdada = LeerInformacion.leerFicheroMunicipio();
        ArrayList<Municipio> asdada = LeerInformacion.leerFicheroMunicipio(2010);
        // for (int i = 0; i < asdada.size(); i++) {
        //     System.out.println(asdada.get(i));
        // }
        Collections.sort(asdada, new ComparatorMuni());
            for (int i = 0; i < asdada.size(); i++) {
             System.out.print(asdada.get(i)+" - ");
         }
        System.out.println();
         System.out.println("--------BUSCAR MUNICIPIO--------------");
         try {
            Municipio buscado = LeerInformacion.buscarMunicipio(asdada, "Marbella", 2016);
            System.out.println(buscado.toString());  
         } catch (Exception e) {
            System.out.println("No se encuentra en la lista ");
         }

         System.out.println("-------------- INCREMENTO POBLACION ----------");

         HashMap<String, Integer> municipios = LeerInformacion.incrementoPoblacion(asdada, 2010, 2011);

         System.out.println(municipios);
         */

         String cadena = ""; //Cadena que almacena toda la info

         ArrayList<Municipio> listaMunicipios = LeerInformacion.leerFicheroMunicipio();
         Collections.sort(listaMunicipios, new ComparatorMuni());
         for (int index = 0; index < listaMunicipios.size(); index++) {
            System.out.println(listaMunicipios.get(index).toString());
            cadena += listaMunicipios.get(index).toString()+"\n";

         }
         cadena += "\n";
         System.out.println("------- Informacion de Mijas en 2022 --------------------");
         cadena += "------- Informacion de Mijas en 2022 --------------------"+"\n";
         
         System.out.println();
         Municipio mija = LeerInformacion.buscarMunicipio(listaMunicipios, "Mijas", 2022);
         System.out.println(mija.toString());
         cadena += mija.toString()+"\n";
         System.out.println();
         System.out.println("----------- Incremento de poblacion Fuengirola 2016-2022 --------------------" );
         cadena += "----------- Incremento de poblacion Fuengirola 2016-2022 --------------------\n"; 
         System.out.println();
         HashMap<String, Integer> Fuengirola = LeerInformacion.incrementoPoblacion(listaMunicipios, 2016, 2022);
         System.out.println("La diferencia es de "+(Fuengirola.get("Fuengirola")*-1));
         cadena += "La diferencia es de "+(Fuengirola.get("Fuengirola")*-1)+"\n";
         System.out.println();
         System.out.println("----------- Incremento de la poblacion de Mijas 2016-2022 --------------------");
         cadena += "----------- Incremento de la poblacion de Mijas 2016-2022 --------------------\n";
         System.out.println();
         System.out.println("La diferencia es de "+(Fuengirola.get("Mijas")*-1));
         cadena += "La diferencia es de "+(Fuengirola.get("Mijas")*-1)+"\n";

         System.out.println();
         ArrayList<Municipio> municipios2022 = LeerInformacion.leerFicheroMunicipio(2022);
         int poblacionMenor = 99999999;
         try{

            int posicionMuni = 0;
            for (int i = 0; i < municipios2022.size(); i++) {
                if(municipios2022.get(i).getPoblacion() < poblacionMenor)
                {   
                    poblacionMenor = municipios2022.get(i).getPoblacion();
                    posicionMuni = i;
                }
            }
            System.out.println();
            System.out.println("------------- MUNICIPIO MENOS POBLADO 2021 ------------------------");
            cadena += "------------- MUNICIPIO MENOS POBLADO 2021 ------------------------\n";
            System.out.println();
            System.out.println("El municipio menos poblado de 2021 : "+municipios2022.get(posicionMuni).getNombre()
                              +" Poblacion: "+poblacionMenor);
            cadena += "El municipio menos poblado de 2021 : "+municipios2022.get(posicionMuni).getNombre()
            +" Poblacion: "+poblacionMenor+"\n";

            System.out.println(cadena);
         }catch(Exception ex)
         {
            System.out.println(ex.getMessage());
         }
        // -------- ESCRIBIR EL ARCHIVO DE TEXTO ----------------

         try (FileWriter fw  = new FileWriter("src/archivo/InfoMunicipios.txt", true);
              BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(cadena);
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }

    }
}           
