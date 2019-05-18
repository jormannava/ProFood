
package profood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Usuarios {
   //Variables
    
    Conectar con = new Conectar();
    Connection cn = con.getConnection();
    
    protected String username;
    protected String password;
    protected String gusername;
    protected String gpassword;
    
    
    private int nivel;




    //Metodos
    
public Boolean login (String user, String pass) throws SQLException{
ResultSet rs;
String SQL="SELECT * FROM usuarios WHERE nombre = ?";
PreparedStatement ps;

ps = cn.prepareStatement(SQL);

ps.setString(1, user);
rs = ps.executeQuery();
if(rs.next()){

if(rs.getString("clave").equals(pass)){
   nivel =rs.getInt("nivel"); 
    
    
return true;
        }


}
      
   return false;}

    
    public int getNivel() {
        return nivel;
    }


public void regisuser (String user , String pass, int usernivel) throws SQLException{
        
    
       
        PreparedStatement pps;

        String sql = "INSERT INTO usuarios (nombre,clave,nivel) VALUES (?,?,?)";

    pps = cn.prepareStatement(sql);
        
    pps.setString(1, user);
    pps.setString(2, pass);
    pps.setInt(3,usernivel);
    pps.executeUpdate();

    
    
    }
 
     //GETTERS
    
  public String getUsername() {
        return gusername;
    }
   
  public String getPassword() {
        return gpassword;
    }

   

}
