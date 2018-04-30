package ConexionBd;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
   public static String User, Password, URL="jdbc:mysql://localhost:3306/SellPro",driver="com.mysql.jdbc.Driver";
   private static String Ruta;
   private static Connection con = null;
   
   public Conexion () {
      if (con == null) {
         try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, User , Password);
            
            Ruta = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\SellPro\\src";
            File archivo= new File(Ruta );
            BufferedWriter bw;
             
            if (archivo.exists()!=true){
                try {
                    bw=new BufferedWriter(new FileWriter (archivo));
                    bw.write("Usuario "+User+"Password "+Password);
                    System.out.println("Se guardo el Usuario y la contrasena");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "No se guardo el archivo de usuario por: "+ex);
                }
            } 
         } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar: "+ex);
         }
      }
   }
   
    public  Connection getConexion(){
       return con;
   }
   
   public static void cerrar() throws SQLException {
      if (con != null) {
         con.close();
         JOptionPane.showMessageDialog(null, "Se ha cerrado la Base de datos");
      }
   }
}