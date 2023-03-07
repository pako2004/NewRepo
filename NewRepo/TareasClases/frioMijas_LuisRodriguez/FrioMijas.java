package frioMijas_LuisRodriguez;

import javax.print.event.PrintJobAttributeEvent;

import frioMijas_LuisRodriguez.Clases.personal.Empleado;
import frioMijas_LuisRodriguez.Clases.personal.Jefe;
import frioMijas_LuisRodriguez.Clases.personal.Password;
import frioMijas_LuisRodriguez.Clases.personal.Sede;

public class FrioMijas {

    /*
     * ---- EMPLEADOS -----
     *  Nombre, Edad, Apellidos, DNI, Salario y Codigo Unico AutoIncremental que los indentifica a todos 
     * 
     * ---- JEFES DE SEDES -----
     *  PASSWORD 
     * -------------------------
     * 
     * TODOS LOS EMPLEADOS TRABAJRAN EN UNA SEDA Y UNA SEDE TENDRA ASOCIADO UN JEFE   X
     * 
     * ---------------------------
     * 
     * ///// IMPLEMENTAR METODO EQUALS, se entiende que dos personas son la misma si tienen el mismo DNI,\\\\\
     * 
     * ///// NO SE DEBE PERMITIR QUE DOS PERSONAS IGUALES TRABAJEN EN LA MISMA SEDE\\\\\
     * 
     * 
     * ---- SEDE ------
     * CIUDAD, DIRECCION, codigo postal , CodigoSede(Codigo unico que se va autogenerando)
     * 
     *  //TENDRAN UN LISTADO DE EQUIPOS  frigoríficos que podrán ser -> minibars, Frigorífico, Arcón y  Cámara.
     * 
     * Todos los equipos tienen medidas (alto,ancho y profundidad) el número de frigorías y marca. 
     * Además tendrán un método para averiguar el consumo según el tipo de aparato y frigorías. Adema de esto:
     * 
     * Minibar: tiene el número de baldas y el consumo serán las frigorias * 2
     * Frigorífico: volumen() + consumo= frigorias * 3
     * Arcón: tipoApertura + consumo= frigorias * 2
     * Cámara: temperaturaMinimaMax + volumen() + consumo = frigorias * 5
     * 
     * 
     * ---- PASSWORD -----
     * Solo visible para clases vecinas
     * Todos los metodos seran privados excepto: (esFuerte(), generaPassword() y getContraseña())
     * 
     * Condiciones para crear una password
     * || Que tenga los atributos longitud y contraseña. POr defecto la longitud sera de 8 ||
     * ||                                                                                  ||
     * || Contructores: Uno por defecto,   COnstructor con la longitud que le pasemos      ||
     * || // Ambos generan una contraseña aleatorio con la longitud dada                   ||
     * ||                                                                                  ||
     * || METODOS:                                                                         ||
     * || esFuerte() devuelve un booleano si es fuerte o no, para que sea fuerte bede tener||
     * || mas de 2 Mayusculas, mas de 1 minuscula y mas de 5 numeros                       ||
     * ||                                                                                  ||
     * ||generarPassword()genera nueva contraseña del objeto con la longitud que hayamos   ||
     * ||indicado o la que tuviera su antigua contraseña                                   ||
     * || Metodo get apra contraseña y LOngitud                                            ||
     * ======================================================================================
     * 
     * 
     * 
     */




    public static void main(String[] args) {
        
        Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X" );
        Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P" );

        Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);
        
        Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
        sede2.setJefe(jefe2);

        Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W" );
        Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E" );
        Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R" );
        Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y" );
        Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T" );
        Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P" );
        Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P" );

        System.out.println(empleado1);
        System.out.println(empleado2);

        sede1.addEmpleado(empleado1);
        sede1.addEmpleado(empleado2);

        sede2.addEmpleado(empleado3);
        sede2.addEmpleado(empleado4);
        sede2.addEmpleado(empleado5);
        sede2.addEmpleado(empleado6);
        sede2.addEmpleado(empleado7);

        //Cambiamos contraseñas
        System.out.println(jefe1);
        jefe1.generaPassword(5);
        System.out.println("Nueva contraseña para jefe1");
        System.out.println(jefe1);

        System.out.println(jefe2);
        jefe2.generaPassword();
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);

        //Mostrar la información completa de cada una de las sedes + jefe + empleados
        System.out.println(sede1);
        
        System.out.println(sede2);

        /*
         * HACER *
         * Mostrar si la contraseña de los jefes es no Fuerte
         */


         if(jefe1.getPassword().esFuerte(jefe1))
         {  
             System.out.println(jefe1.getPassword().toString());
             System.out.println("La contraseña es fuerte");
         }else{
             System.out.println(jefe1.getPassword().toString());
             System.out.println("La contraseña no es fuerte");
         }
 

        if(jefe2.getPassword().esFuerte(jefe2))
        {  
            System.out.println(jefe2.getPassword().toString());
            System.out.println("La contraseña es fuerte");
        }else{
            System.out.println(jefe2.getPassword().toString());
            System.out.println("La contraseña no es fuerte");
        }

        
         /*
          * HACER
          * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
          */
        jefe1.generaFuerte();
        System.out.println(jefe1);

        jefe2.generaFuerte();
        System.out.println(jefe2);



         /*
         * HACER *
         * Empleados de la sede2 con sueldo entre 500 y 1500 
         */

        sede2.mostrarEmpleados(sede2);

        /*
         * HACER * ACUERDATE DE HACER LO DE LOS DNI CABESEÑAME
         * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos a continuación   
         */

         





        
        
    }
    
    
}
