import java.sql.Statement;
import java.util.Scanner;

import javax.xml.transform.Templates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Connection connection ;
        System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/people";
        String user = "administrador";
        String pass = "!Administrador123";
        //String consulta = "select nombre, apellidos, telefono from people where dni = '12345689'";
        String dni;
        String tel;
        String consulta = "delete from preople where telefono = ";
    try{    
        System.out.print("Introduzca el telefono de la persona a borrar de la BBDD : ");
        //dni=sc.nextLine();
        tel = sc.nextLine();
        connection = DriverManager.getConnection(url ,user, pass);
        System.out.println("Connection success.");
        Statement st = connection.createStatement();
        ResultSet rs;
        //consulta = consulta + "'" + dni + "'";
        consulta = consulta +"'"+tel+"'";
        rs=st.executeQuery(consulta);
        //abrir el cursor
        rs.next();
        //
        System.out.println("El borrado de la persona de telefono: "+tel+"ha sido melo ");
        String nombre = rs.getString("nombre");
        String apellidos = rs.getString("apellidos");
        String telefono = rs.getString("telefono");
        System.out.println("nombre -> " + nombre);
        System.out.println("apellidos -> " + apellidos);
        System.out.println("telefono -> " + telefono);

        connection.close();
        System.out.println("Connection closed.");
    }   catch (SQLException sqle){
        System.out.println(sqle.getMessage());
    }
    }
}