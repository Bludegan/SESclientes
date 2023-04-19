
package FramesYpaneles;

import DAO.ControlEmpleados;
import ConexionBD.ConexionBD;
import ConexionBD.IConexionBD;
import Negocio.Usuario;
import java.sql.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class AdministrarEmpleados extends javax.swing.JPanel {
ControlEmpleados control = new  ControlEmpleados();
DefaultTableModel modelo;    
    
    public AdministrarEmpleados() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Email");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo");
        this.tblEmpleados.setModel(modelo);
        actualizarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        txt_consultar = new javax.swing.JTextField();
        btn_Consultar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Contraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Empleados (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 80));

        Btn_Guardar.setBackground(new java.awt.Color(252, 178, 1));
        Btn_Guardar.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(49, 54, 56));
        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-guardar-30.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.setBorder(null);
        Btn_Guardar.setBorderPainted(false);
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 170, 40));

        Btn_Cancelar.setBackground(new java.awt.Color(252, 178, 1));
        Btn_Cancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Btn_Cancelar.setForeground(new java.awt.Color(49, 54, 56));
        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cancelar-2-30.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.setBorder(null);
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 170, 40));

        Btn_Editar.setBackground(new java.awt.Color(252, 178, 1));
        Btn_Editar.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        Btn_Editar.setForeground(new java.awt.Color(49, 54, 56));
        Btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-editar-fila-30.png"))); // NOI18N
        Btn_Editar.setText(" Editar");
        Btn_Editar.setBorder(null);
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });
        add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 170, 40));

        Btn_Eliminar.setBackground(new java.awt.Color(252, 178, 1));
        Btn_Eliminar.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        Btn_Eliminar.setForeground(new java.awt.Color(49, 54, 56));
        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-eliminar-30.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.setBorder(null);
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 170, 40));

        txt_consultar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultarActionPerformed(evt);
            }
        });
        add(txt_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 520, 40));

        btn_Consultar1.setBackground(new java.awt.Color(252, 178, 1));
        btn_Consultar1.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        btn_Consultar1.setForeground(new java.awt.Color(49, 54, 56));
        btn_Consultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-buscar-cliente-30.png"))); // NOI18N
        btn_Consultar1.setText("Consultar ID");
        btn_Consultar1.setBorder(null);
        btn_Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Consultar1ActionPerformed(evt);
            }
        });
        add(btn_Consultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 170, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 30, -1));

        txt_id.setEditable(false);
        txt_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 520, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombres:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txt_Contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_Contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 520, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, -1));

        txt_Apellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidosKeyTyped(evt);
            }
        });
        add(txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 520, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Mail:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 40, -1));

        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 520, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txt_telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 520, 40));

        txt_tipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });
        add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 520, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Tipo:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 40, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Contraseña: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txt_nombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });
        add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 520, 40));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 770, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
       Usuario usuario = new Usuario();
       usuario.setContraseña(txt_Contraseña.getText());
       usuario.setNombres(txt_nombres.getText());
       usuario.setApellidos(txt_Apellidos.getText());
       usuario.setEmail(txt_email.getText());
       usuario.setTelefono(Long.parseLong(txt_telefono.getText()));
       usuario.setTipo(txt_tipo.getText());
      
        
        if(control.insertarUsuario(usuario)){
           JOptionPane.showMessageDialog(null, "Se Agrego con Exito", "Usuario", JOptionPane.INFORMATION_MESSAGE);
           limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(null, "Fallo al guardar", "Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        actualizarTabla();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
            limpiarCampos();
            actualizarTabla();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
            Usuario usuarioEditar = new Usuario();
            usuarioEditar.setId(Integer.parseInt(txt_id.getText()));
            usuarioEditar.setContraseña(txt_Contraseña.getText());
            usuarioEditar.setNombres(txt_nombres.getText());
            usuarioEditar.setApellidos(txt_Apellidos.getText());
            usuarioEditar.setEmail(txt_email.getText());
            usuarioEditar.setTelefono(Long.parseLong(txt_telefono.getText()));
            usuarioEditar.setTipo(txt_tipo.getText());

        
        if(control.modificarUsuario(usuarioEditar)){
           JOptionPane.showMessageDialog(null, "Se Edito con exito", "Usuario", JOptionPane.INFORMATION_MESSAGE);
           limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(null, "Fallo al editar", "Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        actualizarTabla();
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
            Usuario usuarioEliminar = new Usuario();
            usuarioEliminar.setId(Integer.parseInt(txt_id.getText()));
            usuarioEliminar.setContraseña(txt_Contraseña.getText());
            usuarioEliminar.setNombres(txt_nombres.getText());
            usuarioEliminar.setApellidos(txt_Apellidos.getText());
            usuarioEliminar.setEmail(txt_email.getText());
            usuarioEliminar.setTelefono(Long.parseLong(txt_telefono.getText()));
            usuarioEliminar.setTipo(txt_tipo.getText());
        
        if(control.eliminarUsuario(usuarioEliminar)){
           JOptionPane.showMessageDialog(null, "Se Elimino con Exito", "Usuario", JOptionPane.INFORMATION_MESSAGE);
           limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(null, "Fallo al eliminar", "Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        actualizarTabla();

    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void txt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultarActionPerformed
          
        
    }//GEN-LAST:event_txt_consultarActionPerformed

    private void btn_Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Consultar1ActionPerformed
    Integer id = Integer.parseInt(this.txt_consultar.getText()) ;
    Usuario userBuscar =control.buscarUsuario(id);
    DefaultTableModel model= (DefaultTableModel) tblEmpleados.getModel();
    int rowCount = model.getRowCount();
    //Remove rows one by one from the end of the table
    for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
    }

    Object rowData[]=new Object[8];
    rowData[0]=userBuscar.id;
    rowData[1]=userBuscar.nombres;
    rowData[2]=userBuscar.apellidos;
    rowData[3]=userBuscar.email;
    rowData[4]=userBuscar.telefono;
    rowData[5]=userBuscar.tipo;
    rowData[6]=userBuscar.comentarios;
    rowData[7]=userBuscar.calificacion;
    model.addRow(rowData); 
    }//GEN-LAST:event_btn_Consultar1ActionPerformed

    private void actualizarTabla() {
        List<Usuario> list = control.listarUsuarios();
       
        DefaultTableModel model= (DefaultTableModel) tblEmpleados.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
          model.removeRow(i);
        }
        Object rowData[]=new Object[8];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).id;
            rowData[1]=list.get(i).nombres;
            rowData[2]=list.get(i).apellidos;
            rowData[3]=list.get(i).email;
            rowData[4]=list.get(i).telefono;
            rowData[5]=list.get(i).tipo;
            rowData[6]=list.get(i).comentarios;
            rowData[7]=list.get(i).calificacion;
            model.addRow(rowData);
        } 
}
    

    private void limpiarCampos() {
        txt_id.setText("");
        txt_nombres.setText("");
        txt_Contraseña.setText("");
        txt_Apellidos.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
        txt_tipo.setText("");
        txt_consultar.setText("");
    }
    
    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        int fila = tblEmpleados.getSelectedRow();
        if (fila != -1) {
            txt_id.setText(tblEmpleados.getValueAt(fila, 0).toString());
            txt_nombres.setText(tblEmpleados.getValueAt(fila, 1).toString());
            txt_Apellidos.setText(tblEmpleados.getValueAt(fila, 2).toString());
            txt_email.setText(tblEmpleados.getValueAt(fila, 3).toString());
            txt_telefono.setText(tblEmpleados.getValueAt(fila, 4).toString());
            txt_tipo.setText(tblEmpleados.getValueAt(fila, 5).toString());
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApellidosKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ApellidosKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txt_telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        // Definir la expresión regular para validar el correo electrónico
        String expresionRegular = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                                "[a-zA-Z0-9_+&*-]+)*@" + 
                                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(expresionRegular);
        
        // Validar el correo electrónico
        Matcher matcher = pattern.matcher(txt_email.getText());
        if (!matcher.matches()) {
           JOptionPane.showMessageDialog(null,"El correo no es válido");
        }
    }//GEN-LAST:event_txt_emailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton btn_Consultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_consultar;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
