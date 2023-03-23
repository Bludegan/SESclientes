package DAO;
import ConexionBD.ConexionBD;
import ConexionBD.IConexionBD;
import Negocio.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class ControlEmpleados {
    public IConexionBD conexion = new ConexionBD();

    public ControlEmpleados(IConexionBD conexion) {
        this.conexion = conexion;
    }

    public ControlEmpleados() {
    }

       public boolean insertarUsuario(Usuario usuario) {
       try{ 
        String query="INSERT INTO `SESclientes`.`Usuarios`(`Contraseña`,`Nombres`,`Apellidos`,`Email`,`Telefono`,`Tipo`) VALUES ('"+ usuario.contraseña+ "', '" +usuario.nombres+ "', '"+usuario.apellidos +"', '"+usuario.email+ "', '"+usuario.telefono+"', '"+usuario.tipo+"')";
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
    
    public boolean modificarUsuario(Usuario usuario) {
        try{
        String query = "UPDATE `SESclientes`.`Usuarios` SET `Contraseña`='" + usuario.contraseña + "', `Nombres`='" + usuario.nombres + "', `Apellidos`='" + usuario.apellidos + "', `Email`='" + usuario.email + "', `Telefono`='" + usuario.telefono + "', `Tipo`='" + usuario.tipo + "' WHERE `idUsuarios`=" + usuario.id;
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
    
    public boolean eliminarUsuario(Usuario usuario) {
     try {
        String query = ("DELETE FROM SESclientes.Usuarios where idUsuarios="+usuario.id);
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

    
    public Usuario buscarUsuario(Integer id) {
    try {
        String query=" SELECT * FROM SESclientes.Usuarios WHERE idUsuarios="+id;
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet dato = comando.executeQuery(query);
            if (dato.next()) {
            Usuario u = new Usuario();
            u.id=dato.getInt("idUsuarios");
            u.nombres =dato.getString("Nombres");
            u.apellidos= dato.getString("Apellidos");
            u.email =dato.getString("Email");
            u.telefono =dato.getLong("Telefono");
            u.tipo =dato.getString("Tipo");
            u.comentarios =dato.getString("Comentarios");
            u.calificacion =dato.getString("Calificacion");
            
            con.close();
            return u;

            }else{
              return null;
            }

        } catch (Exception e) { 
            return null;
        }
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
    
    
    }
