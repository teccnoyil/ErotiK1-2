package formularios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.conexionSQL;  // IMPORTAMOS TODOS ESTOS PAQUETES PARA QUE PUEDAN REALIZAR LAS FUNCIONALIDADES 
import java.sql.Statement;
import javax.swing.JOptionPane;



public class login extends javax.swing.JFrame { 

    conexionSQL cc=new conexionSQL();
   com.mysql.jdbc.Connection con=cc.conexion();  // con estas instrucciones invocamos a nuestras conexciones con estas 2 instrucciones
 
    /**
     * Creates new form index
     */
    public login() {
        initComponents();
        this.OCULTAR.setVisible(false);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Tcontraseña = new javax.swing.JPasswordField();
        Creditos = new javax.swing.JLabel();
        MensajeError = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        Candado = new javax.swing.JLabel();
        Tusuarios = new javax.swing.JTextField();
        Lusuarios = new javax.swing.JLabel();
        Lcontraseña = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        OLVIDAR = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();
        VER = new javax.swing.JLabel();
        fondoBlanco = new javax.swing.JLabel();
        bannerErotiK = new javax.swing.JLabel();
        bolafondo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(Tcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 350, 40));

        Creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Creditos.png"))); // NOI18N
        jPanel2.add(Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 250, 50));

        MensajeError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MensajeError.setForeground(new java.awt.Color(116, 120, 141));
        MensajeError.setText("En caso de error, contactar al Administrador");
        jPanel2.add(MensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        ingresar.setBackground(new java.awt.Color(250, 136, 182));
        ingresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Iniciar Sesion");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel2.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 360, 40));

        Candado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Lock.png"))); // NOI18N
        jPanel2.add(Candado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 20, 20));
        jPanel2.add(Tusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 350, 40));

        Lusuarios.setText("Usuario:");
        jPanel2.add(Lusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Lcontraseña.setText("Contraseña");
        jPanel2.add(Lcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Avatar_Container.png"))); // NOI18N
        jPanel2.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 450, 80));

        OLVIDAR.setText("¿Olvidaste tu contraseña?");
        jPanel2.add(OLVIDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/ojo tapado.png"))); // NOI18N
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });
        jPanel2.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 30, 20));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/OJO.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        jPanel2.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, 20));

        fondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Content.png"))); // NOI18N
        fondoBlanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(fondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 420));

        bannerErotiK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/arriba.png"))); // NOI18N
        bannerErotiK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(bannerErotiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 450, 530));

        bolafondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bolafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Ellipse 209.png"))); // NOI18N
        getContentPane().add(bolafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 320, 280));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contenido_Login/Light theme.png"))); // NOI18N
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
 validadUsuario(); // llamamos a este metodo para que ejecue todas las intrucciones al momento de hacer click en este boton
    }//GEN-LAST:event_ingresarActionPerformed

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        VER.setVisible(false);
        OCULTAR.setVisible(true);
        Tcontraseña.setEchoChar((char)0);
    }//GEN-LAST:event_VERMouseClicked

    private void OCULTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMouseClicked
        VER.setVisible(true);
        OCULTAR.setVisible(false);
        Tcontraseña.setEchoChar('*');
    }//GEN-LAST:event_OCULTARMouseClicked
    
    public void validadUsuario(){
        int resultado = 0; 
        String contraseña=String.valueOf(Tcontraseña.getPassword());  // Concertimos nuestro TextFiled en un String para poder recolectar la contraseña
        String usuario=Tusuarios.getText();  // Capturaremos el dato que esté dentor de este Textfield
        String SQL="select * from usuarios where user='"+usuario+"' and contraseña= '"+contraseña+"'  "; // Creamos la instrucción en SQL para introducir  los campos de nuestra tabla  
    
    try{
        Statement st=con.createStatement(); // creamos un Statement
                ResultSet rs=st.executeQuery(SQL); // ejecutamos la consulta que guardamos en nustro String SQL
                if (rs.next()){  // Creamos un if, para que al momento de ser el acceso correcto, aumentará el valor a uno de nuestro valor resultado
                    resultado=1;  
                    
                    if(resultado==1){
                        principal form=new principal();  // esto nos permitirá dar el acceso a nuestra plantalla principal
                        form.setVisible(true);
                        this.dispose();
                    }
    }else{
       JOptionPane.showMessageDialog(null,"Error de Acceso, Usuario no registrado"); // si existiria un error con las credenciales dara este error
       }
    
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error"); // en caso de que falle el acceso a nuestra base de datos dará este error
        
    }
    }
    
    
   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Candado;
    private javax.swing.JLabel Creditos;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Lcontraseña;
    private javax.swing.JLabel Lusuarios;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JLabel OLVIDAR;
    private javax.swing.JPasswordField Tcontraseña;
    private javax.swing.JTextField Tusuarios;
    private javax.swing.JLabel VER;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel bannerErotiK;
    private javax.swing.JLabel bolafondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fondoBlanco;
    private javax.swing.JButton ingresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
