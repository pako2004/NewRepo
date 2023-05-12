
import java.util.ArrayList;
import java.util.List;

public class Pokedex {

    private List<Pokemon> pokedex;

    public Pokedex() {

    }


    public Pokemon buscarPorNombre(String nombre)
    {   
        Pokemon buscado = null;
        boolean encontrado = false;

        int i = 0;

        while (!encontrado) 
        {
        
            String name =this.pokedex.get(i).getName();
            if(name.equals(nombre))
            {
                buscado = this.pokedex.get(i);
                encontrado = true;
            }else{
                i++;
            }
        }

        return buscado;
    }

    public List<Pokemon> buscarTipo(String tipo)
    {

        List<Pokemon> lista = new ArrayList<>();

        for (int i = 0; i < this.pokedex.size(); i++) 
        {

            Pokemon pokemonActual = this.pokedex.get(i);

            //Recorre el array de los tipos del pokemon 
            for (int index = 0; index < pokemonActual.getType().size(); index++) 
            { 
                //Si consigue el pokemon tiene ese tipo lo agrega a la lista
                if  (pokemonActual.getType().get(index).equals(tipo))
                {
                    lista.add(pokemonActual);
                }

            }
        }



        return lista;
    }


    public List<Pokemon> buscarDebilidades(List<String> tipo)
    {

        List<Pokemon> lista = new ArrayList<>();

        for (int i = 0; i < this.pokedex.size(); i++) 
        {

            Pokemon pokemonActual = this.pokedex.get(i);

            //Recorre el array de los tipos del pokemon 
            for (int index = 0; index < pokemonActual.getWeaknesses().size(); index++) 
            { 
                //Si consigue el pokemon tiene ese tipo lo agrega a la lista
                for (int j = 0; j < tipo.size(); j++) 
                {
                    
                    if  (pokemonActual.getWeaknesses().get(index).equals(tipo.get(j)))
                    
                       if  (!lista.contains(pokemonActual))
                       {
                           lista.add(pokemonActual);
                       }   
                }
                    

            }
        }

        return lista;
    }





    @Override
    public String toString() {

        String cadena = "";
        for (int i = 0; i < this.pokedex.size(); i++) {

            cadena += this.pokedex.get(i).toString() + "\n";

        }

        return cadena;
    }

    public List<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(List<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

 

}
