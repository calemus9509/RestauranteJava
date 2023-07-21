/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entorno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author CAMILO
 */
public class Conectar {
    String usuario= "root";
    String clave= "";
    String url= "jdbc:mysql://localhost:3306/restaurantesena";
    Connection cn;
    Statement st;
    ResultSet rs;
    
    public Connection conexion (){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           cn=DriverManager.getConnection(url,usuario,clave);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    }
    
}
