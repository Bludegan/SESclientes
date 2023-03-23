/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
import java.sql.*;

public class ConexionBD implements IConexionBD {
String cadenaConexion = "jdbc:mysql://sesclientes.cm2ubkgc3zbu.us-west-2.rds.amazonaws.com:3306/SESclientes";
String usuario = "aflores1";
String password = "15429Flo";
    private static Connection conexion;

    public ConexionBD() {
    }
    
    @Override
    public Connection crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(cadenaConexion,usuario ,password);
            return conexion;
        } catch(Exception ex){
          System.err.println(ex.getMessage());
        }
        return null;
    }
    
    public void provar() {
       try {
            Connection conexion = crearConexion();
            System.out.println("Conexión exitosa a la base de datos MySQL");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos MySQL: " + e.getMessage());
        }
    }
    
    
    
}
