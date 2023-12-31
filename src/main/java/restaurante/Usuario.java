/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante;

import entorno.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMILO
 */
public class Usuario extends javax.swing.JFrame {
    String nombre="";
    String Usuario = "";
    String Contrasena = "";
    //atributos de conexion
    Conectar con = new Conectar();
    Connection cn = con.conexion();

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt Usuario = new TextPrompt("Ingresar Usuario", txtusuario);
        TextPrompt Contrasena = new TextPrompt("Ingresar Contrseña", txtcontrasena);
        TextPrompt nombre = new TextPrompt("Ingresar nombre", txtNombre);

        //elementos de conexion
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jUsuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jContrasena = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        jnombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 51, 51));
        titulo.setText("Registro Usuario");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jUsuario.setText("Nombre de Usuario");
        jPanel1.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 40));

        txtusuario.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 220, 40));

        jContrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jContrasena.setForeground(new java.awt.Color(255, 51, 51));
        jContrasena.setText("Contraseña");
        jPanel1.add(jContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        txtcontrasena.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 220, 40));

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 51, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\CAMILO\\Downloads\\icon registrar.png")); // NOI18N
        btnAdd.setText("Registrarme");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jnombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jnombre.setForeground(new java.awt.Color(255, 51, 51));
        jnombre.setText("Nombre");
        jPanel1.add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 160, 110, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 40));

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\CAMILO\\Downloads\\usuario.jpg")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        this.Usuario = txtusuario.getText();
        this.Contrasena = txtcontrasena.getText();
        this.nombre =txtNombre.getText();

        String Usuario = this.txtusuario.getText();
        String Contrasena = this.txtcontrasena.getText();
        String nombre = this.txtNombre.getText();
        usuario.Usuario usua = new usuario.Usuario(Usuario, Contrasena);

        if (btnAdd.getText() == "Registrarme") {
            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO usuario (nombre,usuario,contrasena,tipo_usuario,estado)VALUES(?,?,?,?,?)");
                ps.setString(1, nombre);
                ps.setString(2, Usuario);
                ps.setString(3, Contrasena);
                ps.setString(4, "empleado");
                ps.setString(5, "A");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Registrado ");

            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Error al Registrar usuario ");

            }
        }
        new Login().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jContrasena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jUsuario;
    private javax.swing.JLabel jnombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
