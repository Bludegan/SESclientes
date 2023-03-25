/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FramesYpaneles;


import DAO.ControlMensajes;
import javax.mail.MessagingException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class MensajesPublicitarios extends javax.swing.JPanel {
ControlMensajes control = new  ControlMensajes();
DefaultTableModel modelo;  
private JFrame frame;
public static String adjunto = "";
    public static String[] adjuntos;
    /**
     * Creates new form PanMensajes
     */
    public MensajesPublicitarios() {
        initComponents();
        control.RellenarComboBox(cmbClientes);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Empresa");
        modelo.addColumn("Email");
        this.tblClientes.setModel(modelo);    
        limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Mensaje = new javax.swing.JTextArea();
        btnEnviarMensaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        btnAgregarAlista = new javax.swing.JButton();
        btnEliminarLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_Asunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_AgregarDocu = new javax.swing.JToggleButton();
        lbl_Adjunto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        TA_Mensaje.setColumns(20);
        TA_Mensaje.setRows(5);
        jScrollPane1.setViewportView(TA_Mensaje);

        btnEnviarMensaje.setBackground(new java.awt.Color(252, 178, 1));
        btnEnviarMensaje.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        btnEnviarMensaje.setForeground(new java.awt.Color(49, 54, 56));
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-enviar-30.png"))); // NOI18N
        btnEnviarMensaje.setText("Enviar");
        btnEnviarMensaje.setBorder(null);
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Asunto:");

        cmbClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });

        btnAgregarAlista.setBackground(new java.awt.Color(252, 178, 1));
        btnAgregarAlista.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        btnAgregarAlista.setForeground(new java.awt.Color(49, 54, 56));
        btnAgregarAlista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-más-2-matemáticas-30.png"))); // NOI18N
        btnAgregarAlista.setText("Agregar a la lista");
        btnAgregarAlista.setBorder(null);
        btnAgregarAlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlistaActionPerformed(evt);
            }
        });

        btnEliminarLista.setBackground(new java.awt.Color(252, 178, 1));
        btnEliminarLista.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        btnEliminarLista.setForeground(new java.awt.Color(49, 54, 56));
        btnEliminarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-eliminar-30.png"))); // NOI18N
        btnEliminarLista.setText("Eliminar de la lista");
        btnEliminarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarListaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Lista de correos a los que se enviara el mensaje:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClientes);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Texto del mensaje:");

        txt_Asunto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));
        txt_Asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AsuntoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Agregar documento:");

        btn_AgregarDocu.setBackground(new java.awt.Color(252, 178, 1));
        btn_AgregarDocu.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        btn_AgregarDocu.setForeground(new java.awt.Color(49, 54, 56));
        btn_AgregarDocu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-archivo-30.png"))); // NOI18N
        btn_AgregarDocu.setText("File");
        btn_AgregarDocu.setBorder(null);
        btn_AgregarDocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarDocuActionPerformed(evt);
            }
        });

        lbl_Adjunto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(252, 178, 1)));

        jButton1.setBackground(new java.awt.Color(252, 178, 1));
        jButton1.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(49, 54, 56));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cancelar-2-30.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensajes (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarLista)
                                    .addComponent(btnAgregarAlista, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_AgregarDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(lbl_Adjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarAlista, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Adjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_AgregarDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlistaActionPerformed
         String nombreSeleccionado = (String) cmbClientes.getSelectedItem(); // Obtener el nombre seleccionado del ComboBox
         String[] palabras = nombreSeleccionado.split(",");
         modelo.addRow(new Object[]{palabras[0], palabras[1], palabras[2], palabras[3]}); // Agregar una nueva fila a la tabla con el nombre seleccionado
        
    }//GEN-LAST:event_btnAgregarAlistaActionPerformed

    private void btnEliminarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarListaActionPerformed
        int numRows = modelo.getRowCount();
        for (int i = numRows-1; i >= 0; i--) {
            modelo.removeRow(i); // Eliminar cada fila de la tabla
        }
    }//GEN-LAST:event_btnEliminarListaActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
    for (int i = 0; i < tblClientes.getRowCount(); i++) {
        
        String asunto = txt_Asunto.getText();
        String mensaje = TA_Mensaje.getText()+"\n\n\n\nCorreo: sesobregon@hotmail.com\nTeléfono: 644 415 4422\nPagina web: https://soldadurasessonora.com/ \nDirección del local: C. Sufragio Efectivo 240-Local B, Centro, Cajeme, 85000 Cd Obregón, Son.";
        String correoDestino = (String) tblClientes.getValueAt(i, 3);
        String rutaArchivo = lbl_Adjunto.getText();
        try {
            // Enviar el mensaje de correo electrónico
            control.enviarMensaje(asunto, mensaje, correoDestino,rutaArchivo);
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo. Error: " + e.toString());
        }
    
    
    
    }
    limpiarCampos();
    
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btn_AgregarDocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarDocuActionPerformed
    // Abre un cuadro de diálogo para seleccionar un archivo
JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccionar archivo");
        int resultado = fc.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
// Si el usuario seleccionó un archivo, obtenemos su ruta y lo mostramos en el campo de texto
            adjunto = fc.getSelectedFile().getAbsolutePath();
            lbl_Adjunto.setText(adjunto);
            adjuntos = new String[]{adjunto};
        } else {
// Si el usuario canceló, mostramos un mensaje informativo
            JOptionPane.showMessageDialog(this, "No se seleccionó ningún archivo", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_AgregarDocuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_AsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AsuntoActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientesActionPerformed

   private void limpiarCampos() {
       txt_Asunto.setText("");
       TA_Mensaje.setText("");
       modelo.setRowCount(0); // Borrar todas las filas de la tabla
       lbl_Adjunto.setText("");
       adjunto = "";
       adjuntos = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA_Mensaje;
    private javax.swing.JButton btnAgregarAlista;
    private javax.swing.JButton btnEliminarLista;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JToggleButton btn_AgregarDocu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_Adjunto;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txt_Asunto;
    // End of variables declaration//GEN-END:variables

   

 
}
