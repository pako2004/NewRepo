import java.util.List;

import clases.Ciclista;
import clases.Equipo;

public class App {
    public static void main(String[] args) throws Exception {

        List<Ciclista> listaCiclistas = UtilesJson.leerCiclistasJson("src/recursos/ciclistas.json");

        List<Equipo> equipos = UtilesJson.leerEquiposCsv("src/recursos/equipos.csv");

    }
}
