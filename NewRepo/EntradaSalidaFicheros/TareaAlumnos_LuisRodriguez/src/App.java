import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import alumnos.Alumno;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader("src/recursos/ficheroAlumnos.txt"));

        try {
            
            //Declaracion de variables
            String lineaFichero = bf.readLine();
            int numeroLinea = 0;
            ArrayList<Alumno> listaAlumnos = new ArrayList<>();
            int numeroMujeres = 0;
            int mujeresSuspensas = 0;
            int suspensos = 0;
            int totaledades = 0;


            while(lineaFichero != null)
            {
                numeroLinea++;
                if(numeroLinea != 1)
                {
 
                    String []pedazos = lineaFichero.split("\\s+");

                    // Agrego alumno a la lista
                    int edad = Integer.parseInt(pedazos[1]);
                    pedazos[2] = pedazos[2].replace(',', '.');
                    double estatura = Double.parseDouble(pedazos[2]);
                    int puntuacion1 = Integer.parseInt(pedazos[3]); 
                    int puntuacion2 = Integer.parseInt(pedazos[4]);
                    listaAlumnos.add(new Alumno(pedazos[0], edad, estatura, puntuacion1, puntuacion2, pedazos[5])); 

                    //Registro de datos para el output
                    if(pedazos[0].equals("Mujer"))
                    {
                        numeroMujeres++;
                    }
                    if(pedazos[0].equals("Mujer") && pedazos[5].equals("Suspenso"))
                    {
                        mujeresSuspensas++;
                    }

                    if(pedazos[5].equals("Suspenso"))
                    {
                        suspensos++;
                    }
                    totaledades += edad;

                }

                //Cambio de linea
                lineaFichero =bf.readLine();

            }
            

            //Ordeno Array
            Collections.sort(listaAlumnos, new Comparator<Alumno>() {

                @Override
                public int compare(Alumno arg0, Alumno arg1) {

                    Alumno a1 = (Alumno)arg0;
                    Alumno a2 = (Alumno)arg1;
                    return a1.getEdad() - a2.getEdad();
                }
                
            });
            //Muestro informacion 
            System.out.println(listaAlumnos);
            System.out.println("Media edades: "+totaledades/listaAlumnos.size());
            System.out.println("Cantidad de alumnos: "+listaAlumnos.size());
            System.out.println("Alumnos suspensos: "+suspensos);
            System.out.println("Numero mujeres: "+numeroMujeres);
            System.out.println("Numero de mujeres suspensas: "+mujeresSuspensas);

        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            bf.close();
        }

    }
}
