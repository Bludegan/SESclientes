/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexionBD.ConexionBD;
import ConexionBD.IConexionBD;
import Negocio.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class ControlClientes {
    
    public IConexionBD conexion = new ConexionBD();

    public ControlClientes(IConexionBD conexion) {
        this.conexion = conexion;
    }

    public ControlClientes() {
    }

       public boolean insertarCliente(Cliente cliente) {
       try{ 
        String query="INSERT INTO `SESclientes`.`Clientes`(`Nombres`,`Apellidos`,`Empresa`,`Email`,`Telefono`,`Rfc`) VALUES ('"+ cliente.nombres+ "', '" +cliente.apellidos+ "', '"+cliente.empresa +"', '"+cliente.email+ "', '"+cliente.telefono+"', '"+cliente.rfc+"')";
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        comando.executeUpdate(query);
        con.close();
        return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }  
    }
    
    public boolean modificarCliente(Cliente cliente) {
        try{
        String query = "UPDATE `SESclientes`.`Clientes` SET `Nombres`='" + cliente.nombres + "', `Apellidos`='" + cliente.apellidos + "', `Empresa`='" + cliente.empresa + "', `Email`='" + cliente.email + "', `Telefono`='" + cliente.telefono + "', `Rfc`='" + cliente.rfc + "' WHERE `idClientes`=" + cliente.id;
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        comando.executeUpdate(query);
        con.close();
        return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
}
    
    public boolean eliminarCliente(Cliente cliente) {
     try {
        String query = ("DELETE FROM SESclientes.Clientes where idClientes="+cliente.id);
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        comando.executeUpdate(query);
        con.close();
        return true;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    
    public Cliente buscarCliente(Integer id) {
    try {
        String query=" SELECT * FROM SESclientes.Clientes WHERE idClientes="+id;
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet dato = comando.executeQuery(query);
            if (dato.next()) {
            Cliente c = new Cliente();
            c.id=dato.getInt("idClientes");
            c.nombres =dato.getString("Nombres");
            c.apellidos= dato.getString("Apellidos");
            c.empresa= dato.getString("Empresa");
            c.email =dato.getString("Email");
            c.telefono =dato.getLong("Telefono");
            c.rfc =dato.getString("Rfc");
            c.comentarios =dato.getString("Comentarios");
            c.calificacion =dato.getString("Calificacion");
            
            con.close();
            return c;

            }else{
              return null;
            }

        } catch (Exception e) { 
            return null;
        }
}
    
    public List<Cliente> listarClientes() {
    try{
        List<Cliente> list= new ArrayList();
        String query = "SELECT * FROM Clientes";
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet dato = comando.executeQuery(query);
        
        while(dato.next()){
         
            Cliente c = new Cliente();
            c.id=dato.getInt("idClientes");
            c.nombres =dato.getString("Nombres");
            c.apellidos= dato.getString("Apellidos");
            c.empresa= dato.getString("Empresa");
            c.email =dato.getString("Email");
            c.telefono =dato.getLong("Telefono");
            c.rfc =dato.getString("Rfc");
            c.comentarios =dato.getString("Comentarios");
            c.calificacion =dato.getString("Calificacion");
            list.add(c);
        }
            con.close();
            return list;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
            
    }
    
}
