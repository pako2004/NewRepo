import java.util.Collection;
import java.util.List;
import java.util.Collection;

import clases.Ciclista;
import clases.Corredor;
import clases.Equipo;

public class App {
    public static void main(String[] args) throws Exception {

        List<Ciclista> listaCiclistas = UtilesJson.leerCiclistasJson("src/recursos/ciclistas.json");

        List<Equipo> equipos = UtilesJson.leerEquiposCsv("src/recursos/equipos.csv");


        Corredor c1 = new Corredor(listaCiclistas.get(0), 1);
        Corredor c2 = new Corredor(listaCiclistas.get(0), 2);
        
        if (c1.equals(c2))
        {
            System.out.println("AAAAAAAAAA");
        }
    }
}
