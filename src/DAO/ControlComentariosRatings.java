/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexionBD.ConexionBD;
import ConexionBD.IConexionBD;
import Negocio.Cliente;
import Negocio.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */

public class ControlComentariosRatings{
public IConexionBD conexion = new ConexionBD();
    

public ControlComentariosRatings(IConexionBD conexion) {
        this.conexion = conexion;
    }

    public ControlComentariosRatings() {
    }

    public List<Usuario> listarUsuarios() {
    try{
        List<Usuario> list= new ArrayList();
        String query = "SELECT * FROM Usuarios";
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet dato = comando.executeQuery(query);
        
        while(dato.next()){
         
            Usuario  user =new Usuario();
            user.id=dato.getInt("idUsuarios");
            user.nombres =dato.getString("Nombres");
            user.apellidos= dato.getString("Apellidos");
            user.email =dato.getString("Email");
            user.telefono =dato.getLong("Telefono");
            user.tipo =dato.getString("Tipo");
            user.comentarios =dato.getString("Comentarios");
            user.calificacion =dato.getString("Calificacion");
            list.add(user);
        }
            con.close();
            return list;
        }catch(Exception ex){
            System.out.println(ex);
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
    
    
    public boolean CalificarYComentarUsuario(Usuario usuario) {
        try{
        String query = "UPDATE `SESclientes`.`Usuarios` SET `Comentarios`='" + usuario.comentarios + "', `Calificacion`='" + usuario.calificacion  + "' WHERE `idUsuarios`=" + usuario.id;
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
    
    
    public boolean CalificarYComentarCliente(Cliente cliente) {
        try{
        String query = "UPDATE `SESclientes`.`Clientes` SET `Comentarios`='" + cliente.comentarios + "', `Calificacion`='" + cliente.calificacion+ "' WHERE `idClientes`=" + cliente.id;
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
   
}
