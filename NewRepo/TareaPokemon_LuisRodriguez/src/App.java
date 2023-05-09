
public class App {
    public static void main(String[] args) throws Exception {
        
        Pokedex pokedex = UtilsJson.leerPokedex("src/recursos/pokemon.json");

        System.out.println(pokedex);



    }
}
