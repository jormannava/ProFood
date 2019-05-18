
package profood;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Cliente {

Conectar con = new Conectar();
Connection cn = con.getConnection(); 

void newClienteM(String nombre) throws SQLException{

String SQL="INSERT INTO cliente (nombre) VALUES(?)";
                                                             
PreparedStatement ps = cn.prepareStatement(SQL);

ps.setString(1, nombre);


ps.executeUpdate();
    

}


String [] findCliente() throws SQLException{
String SQL ="SELECT telefono AS TL FROM cliente";   
PreparedStatement ps = cn.prepareStatement(SQL);
ResultSet rs = ps.executeQuery();

String [] tlfn = new String[500];

int i = 0;

while(rs.next()){

tlfn[i]= rs.getString("TL");

i++;

}

    return tlfn;
}

String [] findClienteByName() throws SQLException{
String SQL ="SELECT nombre AS TL FROM cliente";   
PreparedStatement ps = cn.prepareStatement(SQL);
ResultSet rs = ps.executeQuery();

String [] name = new String[500];

int i = 0;

while(rs.next()){

name[i]= rs.getString("TL");

i++;

}

    return name;
}

void setCliente(int idPedido,int idCliente) throws SQLException{

String SQL ="UPDATE pedidos SET id_cliente=? WHERE id_pedido=?";

PreparedStatement ps = cn.prepareStatement(SQL);

ps.setInt(2, idPedido);
ps.setInt(1, idCliente);

ps.executeUpdate();

PreparedStatement p2 = cn.prepareStatement("UPDATE pedidos SET tipo=2 WHERE id_pedido=?");

p2.setInt(1, idPedido);

p2.executeUpdate();



}
void setCliente(int idPedido,String nCliente) throws SQLException{

String SQL ="UPDATE pedidos SET id_cliente=(SELECT id_cliente FROM cliente WHERE nombre=?) WHERE id_pedido=?";

PreparedStatement 
        ps = cn.prepareStatement(SQL);

ps.setString(1, nCliente);
ps.setInt(2, idPedido);

ps.executeUpdate();



}

void setDes(int idPedido,String cDes) throws SQLException{

String SQL ="UPDATE pedidos SET descripcion=? WHERE id_pedido=?";

PreparedStatement ps = cn.prepareStatement(SQL);

ps.setString(1, cDes);
ps.setInt(2, idPedido);

ps.executeUpdate();

PreparedStatement p2 = cn.prepareStatement("UPDATE pedidos SET tipo=1 WHERE id_pedido=?");

p2.setInt(1, idPedido);

p2.executeUpdate();

}


Boolean existe (String nombreactual) throws SQLException{
    
    Boolean exist = false;

String SQL ="SELECT nombre AS NM FROM cliente WHERE nombre=?";   
PreparedStatement ps = cn.prepareStatement(SQL);
ps.setString(1, nombreactual);
ResultSet rs = ps.executeQuery();

if(rs.next()){
  
    exist =true;
     
  
}else{exist=false;}
   
return exist;

}



}
