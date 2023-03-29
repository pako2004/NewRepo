package Examenes.examenClases_LuisRodriguez;

import java.time.LocalDate;

import Examenes.examenClases_LuisRodriguez.Empresa.EmpresaLimpieza;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Conductor;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Empleado;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Peon;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Tecnico;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Empleado.Turno;
import Examenes.examenClases_LuisRodriguez.Empresa.Empleados.Peon.TallaRopa;
import Examenes.examenClases_LuisRodriguez.Empresa.Vehiculos.Vehiculo;

public class PruebaEmpresaLimpieza {
    public static void main(String[] args) {
        

        Peon peon1 = new Peon("Juan", "Garcia", Turno.MAÑANA, TallaRopa.XL);
        Peon peon2 = new Peon("Maria", "Rodriguez", Turno.MAÑANA, TallaRopa.L);

        Tecnico tecnico1 = new Tecnico("Kique", "Gonzalez", Turno.TARDE, "Tecnico Limpieza", 2020);
        Tecnico tecnico2 = new Tecnico("Fran", "Lopez", Turno.TARDE, "Arquitecto Técnico", 2015);

        LocalDate fecha1 = LocalDate.of(2024, 5, 1); //1 de mayo del 2024
        Conductor conductor1 = new Conductor("Jose", "Gonzalez", Turno.NOCHE, fecha1);


        LocalDate fecha2 = LocalDate.of(2025, 1, 25); //25 de Enero del 2025
        Conductor conductor2 = new Conductor("Manoli", "Martin", Turno.NOCHE, fecha2);


        Conductor conductor3 = new Conductor("Pilar", "Garcia", Turno.MAÑANA, fecha2);

        EmpresaLimpieza empresa = new EmpresaLimpieza("LimpiaMijas", "23456789G");

        empresa.contratarEmpleado(peon1);
        empresa.contratarEmpleado(peon2);
        empresa.contratarEmpleado(tecnico1);
        empresa.contratarEmpleado(tecnico2);
        empresa.contratarEmpleado(conductor1);
        empresa.contratarEmpleado(conductor2);
        empresa.contratarEmpleado(conductor3);


        Vehiculo camion1 = new Vehiculo("1111AAA", 125000, LocalDate.of(2023, 1, 25), conductor1);
        Vehiculo camion2 = new Vehiculo("2222BBB", 5000, LocalDate.of(2023, 2, 25), conductor1);
        Vehiculo camion3 = new Vehiculo("1111AAA", 125000, LocalDate.of(2023, 1, 25), conductor2); //No debe entrar
        Vehiculo camion4 = new Vehiculo("3333CCC", 75000, LocalDate.of(2023, 4, 1), conductor2);
        Vehiculo camion5 = new Vehiculo("4444DDD", 99500, LocalDate.of(2023, 4, 25), conductor3);

        empresa.insertarVehiculo(camion1);
        empresa.insertarVehiculo(camion2);
        empresa.insertarVehiculo(camion3);
        empresa.insertarVehiculo(camion4);
        empresa.insertarVehiculo(camion5);

        //Muestra información trabajadores
        System.out.println("--- TRABAJADORES ---");
        empresa.muestraTrabajadores();

        System.out.println("\n--- Busca al trabajador con codigo: 3 ---");
        /*
            HACER devolver la información del conductor con codigo 10

            No logre hacer el metodo de obtener el trabajador 
         */


        System.out.println("Info del conductor con codigo 3");

        System.out.println("\n--- Busca al trabajador con codigo: 10 ---");
        /*
            HACER devolver la información del conductor con codigo 10
            No logre hacer el metodo de obtener el trabajador 
         */
        System.out.println("Info del conductor con codigo 10");



        System.out.println();
        System.out.println("Obtener vehiculo: con matricula: 2222BBB ");
        /*
         * HACER devolver la información del vehículo 2222BBB
         */
        System.out.println("Info del vehiculo 2222BBB");
        System.out.println(empresa.obtenerVehiculo("2222BBB").toString());
        System.out.println();
        System.out.println("Obtener vehiculo: con matricula: 1234CCC ");
        /*
         * HACER devolver la información del vehículo 1234CCC
         */
        
        System.out.println("Info del vehiculo 1234CCC");
      

        //Muestra información trabajadores
        System.out.println("\n--- Vehiculos ---");
        empresa.muestraVehiculos();

        //Limpio 2 vehiculos
        empresa.limpiarVehiculo();
        empresa.limpiarVehiculo();

        System.out.println("\n--- Vehiculos despues de limpiar ---");
        empresa.muestraVehiculos();

        System.out.println("\n--- Listado Empleados ---");
        System.out.println(empresa.listadoTrabajadores());

    }


    /*
     * SALIDA ESPERADA
     * 
     * 
     * --- TRABAJADORES ---
        1 Juan Garcia - Peon 1000.0 Talla Ropa:XL
        2 Maria Rodriguez - Peon 1000.0 Talla Ropa:L
        3 Kique Gonzalez - Tecnico 2000.0 Titulo:Tecnico Limpieza(2020)
        4 Fran Lopez - Tecnico 2000.0 Titulo:Arquitecto Técnico(2015)
        5 Jose Gonzalez - Conductor 1500.0 Fecha Caducidad Carnet:01/05/24
        6 Manoli Martin - Conductor 1500.0 Fecha Caducidad Carnet:25/01/25
        7 Pilar Garcia - Conductor 1500.0 Fecha Caducidad Carnet:25/01/25

        --- Busca al trabajador con codigo: 3 ---
        Info del conductor con codigo 3

        --- Busca al trabajador con codigo: 10 ---
        Info del conductor con codigo 10

        Obtener vehiculo: con matricula: 2222BBB 
        Info del vehiculo 2222BBB

        Obtener vehiculo: con matricula: 1234CCC 
        Info del vehiculo 1234CCC

        --- Vehiculos ---
        1111AAA(125000) Conductor: JoseFecha Impieza: 25/enero/23
        2222BBB(5000) Conductor: JoseFecha Impieza: 25/febrero/23
        3333CCC(75000) Conductor: ManoliFecha Impieza: 01/abril/23
        4444DDD(99500) Conductor: PilarFecha Impieza: 25/abril/23
        Se ha limpiado el vehículo: 1111AAA
        Se ha limpiado el vehículo: 2222BBB

        --- Vehiculos despues de limpiar ---
        3333CCC(75000) Conductor: ManoliFecha Impieza: 01/abril/23
        4444DDD(99500) Conductor: PilarFecha Impieza: 25/abril/23
        1111AAA(125000) Conductor: JoseFecha Impieza: 28/marzo/23
        2222BBB(5000) Conductor: JoseFecha Impieza: 28/marzo/23

        --- Listado Empleados ---
        Peónes: 2
        Técnicos: 2
        Conductores: 3
     */
    
}
