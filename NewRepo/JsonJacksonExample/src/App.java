import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;

import modelo.Coche;
import modelo.Employee;
import modelo.Grupo;
import modelo.Persona;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        //Leer Json que contiene 1 objeto y convertirlo en objeto 
        jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/employee.txt");

        System.out.println("==============================================");



        //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto> 
        List<Employee> listaEmpleados = jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/employeeArray.txt");
        System.out.println("====== ARRAY EMPLEADOS ========================");

        for (Employee employee : listaEmpleados) {
            System.out.println(employee);
        }

        System.out.println("==============================================");

        //Convertir objeto a Json
        jsonUtils.convertToJson();


        jsonUtils.leerCoche("src/recursos/coche.txt");
        List<Coche> lista = jsonUtils.leerListaCoches("src/recursos/coches.txt");
        jsonUtils.CrearjsonCoches(lista);


                System.out.println("==============================================");
                System.out.println("============ PERSONAS ======================");
                System.out.println("==============================================");

        Grupo grupo = jsonUtils.leerFicheroPersonas();
        System.out.println(grupo.toString());

        // Para los grupos de 24 

        ArrayList<Persona> personas24 = new ArrayList<>();

        for (Persona persona : grupo.getPeople()) 
        {
            if  (persona.getAge() == 24)
            {
                personas24.add(persona);
            }
            
        }

        Grupo grupo24 = new Grupo();
        grupo24.setPeople(personas24);

        System.out.println("============== personas de 24 ============");
        System.out.println(grupo24.toString());
                
        jsonUtils.guardarFicheroGrupo(grupo24);

        System.out.println("========== CREAR MAPA EN JSON ============");

        Map<String, Persona> mapa = new HashMap<>();

        mapa.put("Y12423N", grupo.getPeople().get(0));
        mapa.put("U56432N", grupo.getPeople().get(1));
        mapa.put("t35672O", grupo.getPeople().get(2));
        
        jsonUtils.guardarFicheroMapa(mapa);

        Map<String, Persona> nuevoMap = jsonUtils.leerFicheroMapa("src/recursos/Mapa.json");

        System.out.println(nuevoMap.toString());


        // Calcula la media de la edad de las personas en el diccionario 2
        
    }

}
