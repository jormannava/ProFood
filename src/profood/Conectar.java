
package profood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conectar {
    
    //variables
    
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver"; 
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/gourmetdb";

    
    //metodos
    
    public Conectar() {
        
       con = null;
       try {
       Class.forName(driver);
       
       con = (Connection) DriverManager.getConnection(url, user, password);
      
       if (con != null){
       
       }
       } catch(ClassNotFoundException | SQLException e){
      System.out.println("Error al conectar"+ e);
       }
       
       
    }
    
    public Connection getConnection(){
           
       return con;}
    
    public void desconectar(){
    con=null;
    if (con == null){System.out.println("Se desconecto de la base de datos");}
    }

  
    
    
}
