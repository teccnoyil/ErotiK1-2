/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.*;
import conexion.conexionSQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author big_a
 */
public class ResetearContraseña extends javax.swing.JFrame {
Connection con = null;
ResultSet rs = null;
PreparedStatement pst = null;
public String user;
    /**
     * Creates new form EnviarCodigo111
     */
    public ResetearContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 public ResetearContraseña(String usuarios) {
        this.user=usuarios;
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        candadito = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtContraseñaVER = new javax.swing.JPasswordField();
        cuerpo = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(120, 191, 127));
        jButton1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Resetear Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 240, 30));

        candadito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_RecuperarContraseña/Forgot_Password.png"))); // NOI18N
        candadito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candaditoMouseClicked(evt);
            }
        });
        jPanel3.add(candadito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 200, 30));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ResetearContra/Avatar_Container.png"))); // NOI18N
        jPanel3.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 450, 70));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ResetearContra/Card_Header.png"))); // NOI18N
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 360, 40));
        jPanel3.add(txtContraseñaVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 360, 40));

        cuerpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ResetearContra/Card_Content.png"))); // NOI18N
        jPanel3.add(cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 430, 370));

        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_RecuperarContraseña/Copyright_Container.png"))); // NOI18N
        jPanel3.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 514, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Content.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 450, 580));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ResetearContra/Light theme1.png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void candaditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candaditoMouseClicked
        login form= new login();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_candaditoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtContraseña.getPassword().equals(txtContraseñaVER.getPassword())){
            //check whether the user enter same password in both textfield
            try{
                String updateQuery = "UPDATE usuaruios set contraseña'";
                con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1", "root","Teccnoyil1@");
                pst=con.prepareStatement(updateQuery);
                pst.setString(1, txtContraseñaVER.getText());
                pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reset Successfully");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "password do not match");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ResetearContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetearContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetearContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetearContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetearContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel candadito;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel cuerpo;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseñaVER;
    // End of variables declaration//GEN-END:variables
}
