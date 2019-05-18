
package profood;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pedidos {
    
    //variables
    
    Conectar con = new Conectar();
    Connection cn = con.getConnection();


    //metodos

void newD_Pedido(int id_pedido, int id_producto, int cantidad, String opcion) throws SQLException{

String SQL="INSERT INTO d_pedidos (id_pedido, id_producto, cantidad, n_opcion) VALUES(?,?,?,?)";
PreparedStatement ps = cn.prepareStatement(SQL);
ps.setInt(1, id_pedido);
ps.setInt(2, id_producto);
ps.setInt(3, cantidad);
ps.setString(4, opcion);
ps.executeUpdate();
con.desconectar();
}

int newPedido(int tipo, String fecha,String hora,String estado,Double importe,Double pagacon) throws SQLException{

String SQL="INSERT INTO pedidos (tipo, fecha, hora, estado, importe, pagacon) VALUES(?,?,?,?,?,?)";

Date fechad = Date.valueOf(fecha);
                                                                                                      
PreparedStatement ps = cn.prepareStatement(SQL);
ps.setInt(1, tipo);
ps.setDate(2, fechad);
ps.setString(3, hora);
ps.setString(4, estado);
ps.setDouble(5, importe);
ps.setDouble(6, pagacon);

ps.executeUpdate();
    
String SQLID="SELECT MAX(id_pedido) AS ID FROM pedidos";    
Statement psid = cn.createStatement();
ResultSet rs;
rs = psid.executeQuery(SQLID);
int idPedido=0;
if(rs.next()){
idPedido = rs.getInt("ID");
}


return idPedido;

}

Boolean llenarTabla(JTable table, String SQL) throws SQLException{

    ResultSet rs;
    DefaultTableModel modelo;
   
        modelo = new DefaultTableModel(){       
    
        public boolean isCellEditable (int fila, int columna) {
         
             return false;
        
     }
 }; 
    PreparedStatement ps = cn.prepareStatement(SQL);
    rs = ps.executeQuery();
      
    ResultSetMetaData md = rs.getMetaData();
    int colm = md.getColumnCount();

    
    for(int i = 1; i<=colm;i++){
    modelo.addColumn(md.getColumnLabel(i));
    }
    
     Object[] fila=null;
     
    while(rs.next()){
        fila= new Object[colm]; 
    
    for(int x=0;x<colm;x++) {
       
    if(x==0){ 
       
    fila[x]="000"+rs.getObject(x+1);
    
    }else{
    fila[x]=rs.getObject(x+1);
    }
    }    modelo.addRow(fila);
    modelo.fireTableDataChanged();
    
    

    }  

    table.setModel(modelo);
    
    
    
    

    
    
    return true;
    
}

int getEstado(String estado) throws SQLException{

String SQL ="SELECT estado FROM pedidos WHERE estado=?";

PreparedStatement ps = cn.prepareStatement(SQL);

ps.setString(1, estado);



ResultSet rs = ps.executeQuery();

int i = 0;

while(rs.next()){

i++;
}



return i;
}

int getTipo(int tipo) throws SQLException{

String SQL ="SELECT tipo FROM pedidos WHERE tipo=?";

PreparedStatement ps = cn.prepareStatement(SQL);

ps.setInt(1, tipo);



ResultSet rs = ps.executeQuery();

int i = 0;

while(rs.next()){

i++;
}



return i;
}

void estadoPedido(int ID,String Estado) throws SQLException{

String SQL ="UPDATE pedidos SET estado=? WHERE id_pedido=?";

PreparedStatement ps = cn.prepareStatement(SQL);

ps.setInt(2, ID);
ps.setString(1, Estado);

ps.executeUpdate();

}

void asignarDelivery(int ID, String nDelivery) throws SQLException{

String SQL ="UPDATE pedidos SET id_delivery=(SELECT id_delivery FROM delivery WHERE n_delivery=?) WHERE id_pedido=?;";

PreparedStatement ps = cn.prepareStatement(SQL);


ps.setString(1, nDelivery);
ps.setInt(2, ID);
ps.executeUpdate();


}












}


