/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JComboBox;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import ConexionBD.ConexionBD;
import ConexionBD.IConexionBD;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 *
 * @author Carlos
 */
public class ControlMensajes {
    public IConexionBD conexion = new ConexionBD();
    
    public void RellenarComboBox(JComboBox combo){
    String sql= "select * from SESclientes.Clientes";
    Statement st;    
    Connection con=conexion.crearConexion();    
        try {
            st = con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()) {                
                combo.addItem(""+rs.getString("Nombres")+","+rs.getString("Apellidos")+","+rs.getString("Empresa")+","+rs.getString("Email"));
            }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    
    }
   
   public void enviarMensaje(String asunto, String mensaje, String correoDestino,String rutaArchivo) throws MessagingException {
       // Información de la cuenta de correo electrónico
       String remitente = "sesobregonmensajes@gmail.com";
       String contraseña = "geitiamxwzmxnvnm";
       // Configuración de la conexión SMTP
       Properties props = new Properties();
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.starttls.enable", "true");
       props.put("mail.smtp.host", "smtp.gmail.com");
       props.put("mail.smtp.port", "587");
       // Autenticación con la cuenta de correo electrónico
       Session session = Session.getInstance(props, new javax.mail.Authenticator() {
           @Override
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(remitente, contraseña);
           }
       });
       session.setDebug(false);
       
       if (rutaArchivo.equals("")) {
       Message mensajeCorreo = new MimeMessage(session);
        mensajeCorreo.setFrom(new InternetAddress(remitente));
        mensajeCorreo.setRecipients(Message.RecipientType.TO, InternetAddress.parse(correoDestino));
        mensajeCorreo.setSubject(asunto);
        mensajeCorreo.setText(mensaje);

        Transport.send(mensajeCorreo);
        System.out.println("Correo electrónico enviado correctamente.");
       }else{
       // Creación del mensaje de correo electrónico
       Message mensajeCorreo = new MimeMessage(session);
       mensajeCorreo.setFrom(new InternetAddress(remitente));
       mensajeCorreo.setRecipients(Message.RecipientType.TO, InternetAddress.parse(correoDestino));
       mensajeCorreo.setSubject(asunto);
       // Creación del cuerpo del mensaje
       MimeBodyPart cuerpoMensaje = new MimeBodyPart();
       cuerpoMensaje.setText(mensaje);
       // Creación de la parte del archivo adjunto
       MimeBodyPart archivoAdjunto = new MimeBodyPart();
       DataSource fuenteArchivo = new FileDataSource(rutaArchivo);
       archivoAdjunto.setDataHandler(new DataHandler(fuenteArchivo));
       archivoAdjunto.setFileName(fuenteArchivo.getName());
       // Creación de las partes del mensaje
       Multipart partesMensaje = new MimeMultipart();
       partesMensaje.addBodyPart(cuerpoMensaje);
       partesMensaje.addBodyPart(archivoAdjunto);
       // Agregar las partes del mensaje al mensaje de correo electrónico
       mensajeCorreo.setContent(partesMensaje);
       // Envío del mensaje de correo electrónico
       Transport.send(mensajeCorreo);
       }
      
}
    
    
    
}
