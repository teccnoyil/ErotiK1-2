/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

 
import com.mysql.jdbc.Connection;
import conexion.conexionSQL;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author big_a
 */
public class ClientesFrecuentes extends javax.swing.JFrame {
 conexionSQL cc=new conexionSQL();
   Connection con=cc.conexion();
    /**
     * Creates new form ClientesFrecuentes
     */
    public ClientesFrecuentes() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtoferta = new javax.swing.JTextField();
        RegistrarCliente = new javax.swing.JButton();
        Formulario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuArchivos = new javax.swing.JMenu();
        ItemClientes = new javax.swing.JMenuItem();
        ItemProductos = new javax.swing.JMenuItem();
        ItemUsuarios = new javax.swing.JMenuItem();
        ItemCambiarUsuario = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 190, -1));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 180, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 400, 190, -1));
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 200, -1));
        jPanel1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 480, 190, -1));
        jPanel1.add(txtoferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 200, -1));

        RegistrarCliente.setBackground(new java.awt.Color(51, 153, 255));
        RegistrarCliente.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        RegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarCliente.setText("Registrar Cliente");
        RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 610, -1, -1));

        Formulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ClientesFrecuentes/Component List1.png"))); // NOI18N
        jPanel1.add(Formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 830, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_ClientesFrecuentes/cover_1.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/menu.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/inventario.png"))); // NOI18N
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Menu.add(jMenu1);

        MenuArchivos.setBorder(null);
        MenuArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/archivos.png"))); // NOI18N
        MenuArchivos.setText("Archivos");

        ItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/usuarios_1.png"))); // NOI18N
        ItemClientes.setText("Clientes");
        ItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClientesActionPerformed(evt);
            }
        });
        MenuArchivos.add(ItemClientes);

        ItemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/inventario.png"))); // NOI18N
        ItemProductos.setText("Productos");
        ItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProductosActionPerformed(evt);
            }
        });
        MenuArchivos.add(ItemProductos);

        ItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/clientes.png"))); // NOI18N
        ItemUsuarios.setText("Usuarios");
        ItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuariosActionPerformed(evt);
            }
        });
        MenuArchivos.add(ItemUsuarios);

        ItemCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/CambioUsuario.png"))); // NOI18N
        ItemCambiarUsuario.setText("Cambiar Usuario");
        ItemCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCambiarUsuarioActionPerformed(evt);
            }
        });
        MenuArchivos.add(ItemCambiarUsuario);

        Menu.add(MenuArchivos);

        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/movimientos1.png"))); // NOI18N
        MenuReportes.setText("Reportes");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/factura.png"))); // NOI18N
        jMenuItem3.setText("Nueva Factura");
        MenuReportes.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/movimientos.png"))); // NOI18N
        jMenuItem4.setText("Reporte Facturas");
        MenuReportes.add(jMenuItem4);

        Menu.add(MenuReportes);

        MenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Principal/ayuda.png"))); // NOI18N
        MenuAyuda.setText("Ayuda");
        Menu.add(MenuAyuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        principal form=new principal();
        form.setVisible(true);  // Con esto nor permitir?? acceder a otra pesta??ana al hacer click en el item
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemClientesActionPerformed

    private void ItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuariosActionPerformed
        CrearUsuarios form=new CrearUsuarios();
        form.setVisible(true);  // Con esto nor permitir?? acceder a otra pesta??ana al hacer click en el item
        this.dispose();
    }//GEN-LAST:event_ItemUsuariosActionPerformed

    private void ItemCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCambiarUsuarioActionPerformed
        ModificaUsuario form=new ModificaUsuario(); // Con esto nor permitir?? acceder a otra pesta??ana al hacer click en el item
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemCambiarUsuarioActionPerformed

    private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
       AgregarCliente();
    }//GEN-LAST:event_RegistrarClienteActionPerformed

    private void ItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProductosActionPerformed
       Inventario form= new Inventario();
       form.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_ItemProductosActionPerformed

    
    public void AgregarCliente(){
          // creamos un String, y en ese string pasaremos los datos del dato que se introduzca en el textfield, y lo guardaremos
        String SQL="insert into clientes_frecuentes (Nombre,Apellido,Email,numero,Ciudad,ofertas) values(?,?,?,?,?,?)";   // Instrucci??n SQL para poder introducir los campos necesarios para crear un nuevo usuario
        
        
        try{
            PreparedStatement pst= con.prepareStatement(SQL);  // creamos un statement
            String Nombre = txtnombre.getText();
            String Apellido = txtapellidos.getText();
            String Email = txtCorreo.getText();
            String numero = txtnumero.getText();
            String Ciudad = txtciudad.getText();
            String ofertas = txtoferta.getText();
            
            
            pst.setString(1, Nombre);  // creamos esta intruccion para poder introducir datos a nuestra tabla desde el textfield Nusuario
            pst.setString(2, Apellido);        // lo mismo pero desde la contrase??a
            pst.setString(3,Email );
            pst.setString(4, numero);
            pst.setString(5, Ciudad);
            pst.setString(6, ofertas);
            
            
            txtnombre.setText("");
            txtapellidos.setText("");
            txtCorreo.setText("");
            txtnumero.setText("");
            txtciudad.setText("");
            txtoferta.setText("");
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro de cliente exitoso"); // creamos esto para que en caso de que todo saliera bie, nos lanze un mensaje de confirmacion
                    
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error en el  Registro"+e.getMessage()); // y en caso de error nos lanzara este mensaje con el mensaje preciso de donde viene el error
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ClientesFrecuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesFrecuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesFrecuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesFrecuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesFrecuentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Formulario;
    private javax.swing.JMenuItem ItemCambiarUsuario;
    private javax.swing.JMenuItem ItemClientes;
    private javax.swing.JMenuItem ItemProductos;
    private javax.swing.JMenuItem ItemUsuarios;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JButton RegistrarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtoferta;
    // End of variables declaration//GEN-END:variables
}
