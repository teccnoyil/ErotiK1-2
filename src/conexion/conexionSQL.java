/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author big_a
 */
public class conexionSQL {

    Connection conectar=null;
    
    public Connection conexion(){  //IMPORTAMOS NUESTRA LIBRERIA SQL Y REALIZAMOS NUESTA CONFIGURACIÓN INICIAL
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyecto1","root","Teccnoyil1@"); // BD , TABLA, USUARIODB, CONTRASEÑADB
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion"+e.getMessage()); // en Caso de un error, nos mostrará un mensaje junto con el error
        }
        return conectar;
    
}

}
