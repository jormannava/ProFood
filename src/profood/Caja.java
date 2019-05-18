
package profood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class Caja {
    
Conectar con = new Conectar();
Connection cn = con.getConnection();
    
int newCaja () throws SQLException{
    
    Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.YEAR) + "-" + cal.get(cal.MONTH) + "-" + cal.get(cal.DATE);
          int hora= cal.get(cal.HOUR);
          
          String turno="Nulo";
          
          if (hora<=12){turno="Dia";}
          else if(hora>12&&hora<19){turno="Tarde";}
          else if (hora>18){turno="Noche";}
          
    String SQL="INSERT INTO caja (descricion,fecha,totalventa,cambio,dif_caja) VALUES ("+turno+","+fecha+",0.0,0.0,0.0)";
    PreparedStatement ps = cn.prepareStatement(SQL);
    
    ps.executeUpdate();
    
String SQLID="SELECT MAX(id_caja) AS ID FROM caja";    
Statement psid = cn.createStatement();
ResultSet rs;
rs = psid.executeQuery(SQLID);
int idCaja=0;

if(rs.next()){
idCaja= rs.getInt("ID");
}

return idCaja;
}


void updateCaja (String Descripcion, String Fecha, Double TotalVenta, Double Cambio, Double Dif_caja) throws SQLException{
   
    String SQL="INSERT INTO caja (descricion,fecha,totalventa,cambio,dif_caja) VALUES (?,?,?,?,?)";
    PreparedStatement ps = cn.prepareStatement(SQL);
    
    ps.setString(1, Descripcion);
    ps.setString(2, Fecha);
    ps.setDouble(1, TotalVenta);
    ps.setDouble(1, Cambio);
    ps.setDouble(1, Dif_caja);
    ps.executeUpdate();
    
}
    
    }






