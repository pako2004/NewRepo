import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.spi.CalendarNameProvider;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokedex pokedex = UtilsJson.leerPokedex("src/recursos/pokemon.json");

        String cadena = "";

        System.out.println();
       System.out.println("======== ULTIMOS 5 POKEMONS ========");
        cadena += "======== ULTIMOS 5 POKEMONS ========\n";
        ArrayList<Pokemon> ultimos5 = ultimos5(pokedex);

        System.out.println(ultimos5);
        cadena += ultimos5.toString()+"\n";
        System.out.println();
        System.out.println(" =================== BUSCAR POR NOMBRE =========");
        cadena += " =================== BUSCAR POR NOMBRE =========\n";

        Pokemon buscado = pokedex.buscarPorNombre("Pikachu");
        
        if(buscado.equals(null))
        {
            System.out.println("No se ha encontrado al pokemon");
            cadena += "No se ha encontrado al pokemon\n";
        }else{
            System.out.println(buscado);
            cadena += buscado.toString()+"\n";
        }
        
        System.out.println();
        System.out.println("========== BUSCAR EVOLUCION ===========");
        cadena += "========== BUSCAR EVOLUCION ===========\n";
        cadena += buscarEvolucion("Charmander");
        
        System.out.println(buscarEvolucion("Charmander"));
        System.out.println("========= BUSCAR TIPO =============");
        cadena += "========= BUSCAR TIPO =============";
        List<Pokemon> tipo = pokedex.buscarTipo("Fire");
        
        System.out.println(tipo);
        cadena += tipo+"\n\n";
        System.out.println();
        System.out.println("============= BUSCAR DEBILIDADES ============");
        cadena += "============= BUSCAR DEBILIDADES ============\n\n";
        List<String> tipos = new ArrayList<>();
        tipos.add("Water");
        tipos.add("Electric");
        List<Pokemon> debilidad  = pokedex.buscarDebilidades(tipos);

        cadena += debilidad+"\n\n";
        System.out.println(debilidad);

        System.out.println();
        System.out.println("=========== POKEMON CON MAS DEBILIDADES ===========");
        cadena += "=========== POKEMON CON MAS DEBILIDADES ===========\n\n";
        int numDebilidades = 0;
        Pokemon elMasDebil = null;

        for (int i = 0; i < pokedex.getPokedex().size(); i++) 
        {
            
            if(pokedex.getPokedex().get(i).getWeaknesses().size() > numDebilidades)
            {   
                numDebilidades = pokedex.getPokedex().get(i).getWeaknesses().size(); 
                elMasDebil = pokedex.getPokedex().get(i);
            }

        }
        cadena += elMasDebil+"\n\n";
        System.out.println(elMasDebil);

        System.out.println();
        System.out.println("============ POKEMON MAS ALTO =============");
        cadena += "============ POKEMON MAS ALTO =============";
        double altura = 0;
        Pokemon yaoMing = null;

        for (int i = 0; i < pokedex.getPokedex().size(); i++) 
        {   
            String[] cadena1 = pokedex.getPokedex().get(i).getHeight().split("m");
            String[] numero = cadena1[0].split(" ");

            double pokAltura = Double.parseDouble(numero[0]); 
            if(pokAltura > altura)
            {   
                altura = pokAltura;
                yaoMing = pokedex.getPokedex().get(i);
            }

        }
        cadena += "\n\n"+yaoMing;
        System.out.println(yaoMing);

        // Escribo el fichero 

        try (FileWriter fw  = new FileWriter("src/archivo/InfoMPokes.txt", true);
        BufferedWriter bw = new BufferedWriter(fw)) {
          bw.write(cadena);
   } catch (Exception e) {
      System.out.println(e.getMessage());
   }

    }


    /**** metodos del main *********** */

    private static ArrayList<Pokemon> ultimos5(Pokedex pokedex)
    {
        ArrayList<Pokemon> ultimos5 = new ArrayList<>();

        List<Pokemon> POKEDEX = pokedex.getPokedex(); //Copio la pokedex para que el codigo sea mas legible 

        for (int i = 1; i <= 5 ; i++) 
        {
            
            ultimos5.add(POKEDEX.get(POKEDEX.size()-i));

        }

        return ultimos5;
    }

    private static String buscarEvolucion(String nombre)
    {

        Pokedex pokedex = UtilsJson.leerPokedex("src/recursos/pokemon.json");
                    
        Pokemon sinEvo = pokedex.buscarPorNombre(nombre); // Almaceno al pokemon sin evolucionar 
        String cadena = "";

        try {
        List<Pokemon> evoluciones = new ArrayList<>();
        for (int i = 0; i < sinEvo.getNext_evolution().size(); i++) 
            {
                String nombreEvo = sinEvo.getNext_evolution().get(i).getName();
                
                evoluciones.add(pokedex.buscarPorNombre(nombreEvo));
            }  
            cadena += "Las evoluciones de "+sinEvo.getName();
            System.out.println("Las evoluciones de "+sinEvo.getName());
            System.out.println(evoluciones);
            cadena += "\n"+evoluciones;

        } catch (Exception e) {
            System.out.println("El pokemon no tiene evoluciones");
            cadena = "El pokemon no tiene evoluciones";
        }

        return cadena;
    }

 
}
