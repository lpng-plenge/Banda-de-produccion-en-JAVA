package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
   Connection conn;
   public Connection getConexion(){
         try{
               DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
               Connection con = DriverManager.getConnection (
                "jdbc:mysql://localhost/dbBandaProduccion","root", "");
               this.conn=con;
           } catch (Exception e){
               JOptionPane.showMessageDialog(null, "Error en la Conexion, vuelva mas tarde");
               System.exit(0);
           }
         return this.conn;
   }
  
   
}
