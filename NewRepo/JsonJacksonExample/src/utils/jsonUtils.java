package utils;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

import modelo.Address;
import modelo.Coche;
import modelo.Employee;
import modelo.Grupo;
import modelo.Persona;

public class jsonUtils {


    public static Employee LeerEmpleadoFromJsonFile(String relativePathFile)
    {

        //File ficheroEmpleado = new File("src/recursos/employee.txt");
		File ficheroEmpleado = new File(relativePathFile);
        //byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Employee emp = null;
        try {
            emp = objectMapper.readValue(ficheroEmpleado, Employee.class);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        System.out.println("Employee Object\n"+emp);
        return emp;
		
		
		 
    }



	public static List<Employee> LeerListEmpleadoFromJsonFile(String relativePathFile)
	{
		File ficheroEmpleado = new File(relativePathFile);

		ObjectMapper objectMapper = new ObjectMapper();

		List<Employee> listaEmpleados = null;
		try {
            listaEmpleados = objectMapper.readValue(ficheroEmpleado,  new TypeReference<List<Employee>>(){});
        } catch (IOException e) {
            
            e.printStackTrace();
        }

		return listaEmpleados;
	}

	/**
	 * Convierte un objeto en un Json
	 */
    public static void convertToJson()
    {
        try 
        {
            ObjectMapper objectMapper = new ObjectMapper();
            //convert Object to json string
            Employee emp1 = createEmployee();
            //configure Object mapper for pretty print
            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        
            
			//Puedo imprimirlo por consola 
            //writing to console, can write to any output stream such as file
            //StringWriter stringEmp = new StringWriter();
            //Sacar por consola el Json
            //objectMapper.writeValue(stringEmp, emp1);
            //System.out.println("Employee JSON is\n"+stringEmp);

			//Puedo guardarlo en un fichero
            File fileEmp1 = new File("src/recursos/empleado1.txt");
            objectMapper.writeValue(fileEmp1, emp1);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Alfonso");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}
    /*
    	
		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, emp1);
		System.out.println("Employee JSON is\n"+stringEmp);
		
		
		//converting json to Map
		byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
		Map<String,String> myMap = new HashMap<String, String>();
		
		myMap = objectMapper.readValue(mapData, HashMap.class);
		System.out.println("Map is: "+myMap);
		//another way
		myMap = objectMapper.readValue(mapData, new TypeReference<HashMap<String,String>>() {});
		System.out.println("Map using TypeReference: "+myMap);
		
		//read JSON like DOM Parser
		JsonNode rootNode = objectMapper.readTree(jsonData);
		JsonNode idNode = rootNode.path("id");
		System.out.println("id = "+idNode.asInt());
		JsonNode phoneNosNode = rootNode.path("phoneNumbers");
		Iterator<JsonNode> elements = phoneNosNode.elements();
		while(elements.hasNext()){
			JsonNode phone = elements.next();
			System.out.println("Phone No = "+phone.asLong());
		}
		
		//update JSON data
		((ObjectNode) rootNode).put("id", 500);
		//add new key value
		((ObjectNode) rootNode).put("test", "test value");
		//remove existing key
		((ObjectNode) rootNode).remove("role");
		((ObjectNode) rootNode).remove("properties");
		objectMapper.writeValue(new File("updated_emp.txt"), rootNode);
        */
    
	public static Coche leerCoche(String pathFile)
	{
		File ficheroCoche = new File(pathFile);

		//Crear object mapper 
		ObjectMapper objectMapper = new ObjectMapper();

		//Convertir json a objeto
		Coche carro = null;

		try{

			carro = objectMapper.readValue(ficheroCoche, Coche.class);

		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Carro: "+carro.toString());
		return carro;
	}

	public static List<Coche> leerListaCoches(String pathFile)
	{
		File ficheroCoche = new File(pathFile);

		//Crear object mapper 
		ObjectMapper objectMapper = new ObjectMapper();

		//Convertir json a objeto
		List<Coche> lista = null;

		try{

			lista = objectMapper.readValue(ficheroCoche,  new TypeReference<List<Coche>>(){});

		}catch(IOException e)
		{
			e.printStackTrace();
		}

		System.out.println(lista);
		return lista;
	}


	public static void CrearjsonCoches(List<Coche> lista)
	{
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			File fichero = new File("src/recursos/TodosCoches.json");

			objectMapper.writeValue(fichero, lista);
		}catch(IOException E)
		{
			System.out.println(E);
		}
		
	}

	// public static Persona leerPersona(String pathFile)
	// {
	// 	File ficheroPersona = new File(pathFile);

	// 	//Crear object mapper 
	// 	ObjectMapper objectMapper = new ObjectMapper();

	// 	//Convertir json a objeto
	// 	Persona persona = null;

	// 	try{

	// 		persona = objectMapper.readValue(ficheroPersona, Persona.class);

	// 	}catch(IOException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	System.out.println("Carro: "+persona.toString());
	// 	return persona;
	// }



	// public static List<Persona> leerListaPersona(String pathFile)
	// {
	// 	File ficheroPersona = new File(pathFile);

	// 	//Crear object mapper 
	// 	ObjectMapper objectMapper = new ObjectMapper();

	// 	//Convertir json a objeto
	// 	List<Persona> lista = null;

	// 	try{

	// 		lista = objectMapper.readValue(ficheroPersona,  new TypeReference<List<Persona>>(){});

	// 	}catch(IOException e)
	// 	{
	// 		e.printStackTrace();
	// 	}

	// 	System.out.println(lista);
	// 	return lista;
	// }

	// public static void CrearjsonPersonas(List<Persona> lista)
	// {
	// 	try{
	// 		ObjectMapper objectMapper = new ObjectMapper();
	// 		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	// 		File fichero = new File("src/recursos/TodosCoches.json");

	// 		objectMapper.writeValue(fichero, lista);
	// 	}catch(IOException E)
	// 	{
	// 		System.out.println(E);
	// 	}
		
	// }

	public static Grupo leerFicheroPersonas()
	{	
		Grupo grupo = null;

		try 
		{
			File fichero = new File("src/recursos/personas.json");

			ObjectMapper objectMapper = new ObjectMapper();

			//			Cualquiera de estas dos funciona
			//grupo = objectMapper.readValue(fichero, new TypeReference<Grupo>(){});
			grupo = objectMapper.readValue(fichero, Grupo.class);
		
		} catch (Exception e) {}

	return grupo;
	}

	public static void guardarFicheroGrupo(Grupo grupode24)
	{
		try 
		{
			File fichero = new File("src/recursos/Grupode24.json");
			
			ObjectMapper objectMapper = new ObjectMapper();

			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

			objectMapper.writeValue(fichero, grupode24);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void guardarFicheroMapa(Map<String, Persona> mapa)
	{

		try 
		{
			File fichero = new File("src/recursos/Mapa.json");

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.INDENT_OUTPUT,true);

			mapper.writeValue(fichero, mapa);
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static Map<String, Persona> leerFicheroMapa(String fichero)
	{

		Map<String, Persona> mapa = null;

		try{
			File archivo = new File(fichero);
			ObjectMapper mapper = new ObjectMapper();

			mapa = mapper.readValue(archivo, new TypeReference<Map<String, Persona>>() {});



		}catch(Exception Ex)
		{

		}

		return mapa;



	}

	public static double calcularMedia(Collection<Persona> value)
	{
		List<Persona> listaPersonas = new ArrayList<>();

		Integer totalPersonas = 0;
		Integer totalEdades = 0;

		for (int i = 0; i < listaPersonas.size(); i++) 
		{
			Persona persona = listaPersonas.get(i);
			if(persona.getAge()	!= null)
			{
			totalEdades += persona.getAge();
			totalPersonas++;
			}

		}

		return (double)(totalEdades/totalPersonas);
		

	}

}
