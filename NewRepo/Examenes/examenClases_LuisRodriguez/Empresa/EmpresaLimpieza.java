package Examenes.examenClases_LuisRodriguez.Empresa;

import java.time.LocalDate;
import java.util.Arrays;


import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Empleado;
import Examenes.examenClases_LuisRodriguez.Empresa.Vehiculos.Vehiculo;

public class EmpresaLimpieza {

    //Atributos
    private String nombre;
    private String CIF;
    private Empleado[] empleados = new Empleado[0];
    private Vehiculo[] vehiculos = new Vehiculo[0];

    //Constructor
    public EmpresaLimpieza(String nombre, String cif)
    {
        this.nombre = nombre;
        this.CIF = cif;
    }
    
    //Metodos;

    public boolean contratarEmpleado(Empleado empleado)
    {
        boolean contratado = false;

        if  (empleado.getSueldo() >= 950){

        Empleado[] aux = new Empleado[this.empleados.length+1]; //Arrya auxiliar con una posicion mas

        for (int i = 0; i < this.empleados.length; i++)  //Bucle que copia la lista de trabajadores
        {
            aux[i] = this.empleados[i];   
        }

        aux[aux.length-1] = empleado;//Agrego al nuevo empleado

        this.empleados = aux;//Actualizo la lista de la empresa

        contratado = true;
        }

        return contratado;
    }
/**
 * si el largo del array es mayor a 0 se despide a un empleado
 * @return
 */
    public boolean despedirEmpleado()
    {
        boolean despido = false;

        if(this.empleados.length > 0)
        {  
            Empleado[] aux = new Empleado[this.empleados.length-1];

            for (int index = 0; index < aux.length; index++) {
                aux[index] = this.empleados[index+1];
            }

            this.empleados = aux;
            despido = true;
        }

        return despido;
    }
/**
 * Inserta un nuevo vehiculo si no esta repetido 
 * @param vehiculo
 * @return
 */
    public boolean insertarVehiculo(Vehiculo vehiculo)
    {
        boolean añadido = false;
        boolean repetido = false;

        Vehiculo[] aux = new Vehiculo[this.vehiculos.length+1];

        for (int i = 0; i < this.vehiculos.length; i++) {
            
            //Si el largo de la lista es igual a 0  o si la matricula es igual repetido es true
            if(this.vehiculos.length == 0 || this.vehiculos[i].getMatricula().equals(vehiculo.getMatricula()))
            {
                repetido = true;  
            }if(repetido == false) //Mientras repetido sea false se va a ir creando el array
            {
                aux[i] = this.vehiculos[i];
            }

        }

        if  (repetido == false) //Si nunca hubo un repetido
        {
            añadido = true;
        }
        
        return añadido;

    }

     //invoca por cada empleado el metodo de muestraInformacion de la clase empleado
    public void muestraTrabajadores()
    {
        for (int i = 0; i < this.empleados.length; i++) {
            System.out.println(this.empleados[i].muestraInformacion());
        }
    }

    public void muestraInfoTrabajador(Empleado empleado)
    {
        System.out.println(empleado.muestraInformacion());
    }
/**
 * Crea un vehiculo vacio, busca el vehiculo solicita, si lo encuentra el vehiculo vacio
 * se convierte en el busca, si se encontro devuelve el vehiculo, si no nulo
 * @param matricula
 * @return
 */
    public Vehiculo obtenerVehiculo(String matricula)
    {
        boolean encontrado = false;
        
        Vehiculo buscado = new Vehiculo(null, 0, null, null);

        for (int i = 0; i < this.vehiculos.length; i++) {
            
            if(this.vehiculos[i].getMatricula() == matricula)
            {
                encontrado = true;
                buscado = this.vehiculos[i];
            }
        }
        if(encontrado)
        {
            return buscado;
        }else{
            return null;
        }
    }

    public void muestraVehiculos()
    {
        for (int i = 0; i < this.vehiculos.length; i++) {
            System.out.println((i+1)+"#"+this.vehiculos[i].toString());
        }
    }

    public void limpiarVehiculo()
    {   
        if(this.vehiculos.length != 0){
        Vehiculo primerVehiculo = this.vehiculos[0]; // Copio el primer vehiculo de la lista
        
        Vehiculo[] aux = new Vehiculo[this.vehiculos.length]; // Creo un auxiliar

        for (int index = 0; index < this.vehiculos.length; index++) { //Recorro toda la lista de vehiculos
            
            aux[index]= this.vehiculos[index+1]; //Copio todas las posciones menos la primera, pero en el auxiliar dejo la ultima

        }
        LocalDate hoy = LocalDate.now();

        primerVehiculo.setFecha(hoy);

        aux[aux.length-1] = primerVehiculo; //Inserto el primerVehiculo en la ultima posicion

        this.vehiculos = aux;
        }else{
            System.out.println("Ta fallao");
        }

    }   

    public String listadoTrabajadores()
    {
        int peon = 0;//1000
        int conductor = 0;//1500
        int tecnico = 0; //2000


        for (int index = 0; index < this.empleados.length; index++) {
            
            if(this.empleados[index].getSueldo() == 1000)
            {
                peon++;
            }else if(this.empleados[index].getSueldo() == 1500)
            {
                conductor++;
            }else if(this.empleados[index].getSueldo() == 2000)
            {
                tecnico++;
            }
        }

        String listado = "Peón: "+peon+"\n Conductor: "+conductor+"\n Tecnico: "+tecnico;

        return listado;
    }
/* 
    public Empleado buscarEmpleado(int codigo)
    {
        boolean encontrado = false;

        Peon buscado = new Peon(null, null, null, null);


        for (int index = 0; index < this.empleados.length; index++)
        {
            

            if(this.empleados.length == 0)
            {
                
            }else if(codigo == this.empleados[index].getCodigo())
            {
                encontrado = true;
                buscado = (Empleado)this.empleados[index];
            }
        }
        if(encontrado == false)
        {
            return null;
        }
    }
    */
}

