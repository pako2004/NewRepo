package tarea;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
    System.setProperty("jdbc.drivers", "com.mysql.cj.jdbc.Driver"); 
    String url = "jdbc:mysql://localhost:3306/people"; 
    String user = "admin"; 
    String pass = "admin"; 
    try{
          Connection connection = DriverManager.getConnection(url ,user, pass);
          System.out.println("Conexión a la base de datos OK.");
          boolean fin_bucle = false;
          do { 
                 mostrarMenu();
                 int opcion = sc.nextInt();
                switch (opcion) {
                                 case 1: consultar_Cliente(connection);
                                              break;
                                 case 2: dar_de_alta_Cliente(connection);
                                              break;
                                 case 3: dar_de_baja_Cliente(connection);
                                              break;
                                 case 4: modificar_Cliente(connection);
                                               break;
                                case 0: fin_bucle = true;
                                              break;
                               default: System.out.println("Indique una opción entre [0 - 4]");
                                           }
                 } while (!fin_bucle);
         connection.close();
         System.out.println("Connection closed.");
         } catch (SQLException sqle){
         System.out.println(sqle.getMessage()); 
     }
    
}
}
