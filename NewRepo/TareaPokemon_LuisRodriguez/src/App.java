import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokedex pokedex = UtilsJson.leerPokedex("src/recursos/pokemon.json");

       System.out.println(pokedex);

       System.out.println(pokedex.getPokedex().get(0).getNext_evolution());


        System.out.println();
       System.out.println("======== ULTIMOS 5 POKEMONS ========");

        ArrayList<Pokemon> ultimos5 = ultimos5(pokedex);

        System.out.println(ultimos5);

        System.out.println();
        System.out.println(" =================== BUSCAR POR NOMBRE =========");

        Pokemon buscado = pokedex.buscarPorNombre("Pikachu");
        
        if(buscado.equals(null))
        {
            System.out.println("No se ha encontrado al pokemon");
        }else{
            System.out.println(buscado);
        }
        
        System.out.println();
        System.out.println("========== BUSCAR EVOLUCION ===========");
        
        buscarEvolucion("Mew");
        System.out.println();
        System.out.println("========= BUSCAR TIPO =============");

        List<Pokemon> tipo = pokedex.buscarTipo("Fire");
        
        System.out.println(tipo);

        System.out.println();
        System.out.println("============= BUSCAR DEBILIDADES ============");

        List<Pokemon> debilidad  = pokedex.buscarDebilidades("Water");

        System.out.println(debilidad);

        System.out.println();
        System.out.println("=========== POKEMON CON MAS DEBILIDADES ===========");

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

        System.out.println(elMasDebil);

        System.out.println();
        System.out.println("============ POKEMON MAS ALTO =============");
        
        double altura = 0;
        Pokemon yaoMing = null;

        for (int i = 0; i < pokedex.getPokedex().size(); i++) 
        {   
            String[] cadena = pokedex.getPokedex().get(i).getHeight().split("m");
            String[] numero = cadena[0].split(" ");

            double pokAltura = Double.parseDouble(numero[0]); 
            if(pokAltura > altura)
            {   
                altura = pokAltura;
                yaoMing = pokedex.getPokedex().get(i);
            }

        }
        System.out.println(yaoMing);
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

    private static void buscarEvolucion(String nombre)
    {

        Pokedex pokedex = UtilsJson.leerPokedex("src/recursos/pokemon.json");


        Pokemon sinEvo = pokedex.buscarPorNombre(nombre); // Almaceno al pokemon sin evolucionar 

        try {
            
            List<Pokemon> evoluciones = new ArrayList<>();
            for (int i = 0; i < sinEvo.getNext_evolution().size(); i++) 
            {
                String nombreEvo = sinEvo.getNext_evolution().get(i).getName();
                
                evoluciones.add(pokedex.buscarPorNombre(nombreEvo));
            }  
            System.out.println("Las evoluciones de "+sinEvo.getName());
            System.out.println(evoluciones);

        } catch (Exception e) {
            System.out.println("El pokemon no tiene evoluciones");
        }
    }

 
}
