
package profood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Productos {
    
    
Conectar con = new Conectar();
Connection cn = con.getConnection(); 
    
int Codigo,Cantidad,Precioen,Preciosal;
String Articulo;
String [] Opciones;

    public int getCodigo() {
        return Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getPrecioen() {
        return Precioen;
    }

    public int getPreciosal() {
        return Preciosal;
    }

    public String getArticulo() {
        return Articulo;
    }

   
 

void setDetalleProductos(String Articulo) throws SQLException{


String SQL="SELECT id_producto, articulo, precio_en, precio_sal FROM productos WHERE articulo = ?";

PreparedStatement ps = cn.prepareStatement(SQL);
ps.setString(1, Articulo);

ResultSet rs = ps.executeQuery();

while(rs.next()){
Codigo=rs.getInt(1);
this.Articulo=rs.getString(2);

Precioen=rs.getInt(3);
Preciosal=rs.getInt(4);

}
   
   
   }
String[] getListaProductos () throws SQLException{

String[] productos = new String[500];    
    
String SQL="SELECT articulo from productos";
                                                             
PreparedStatement ps = cn.prepareStatement(SQL);


ResultSet rs = ps.executeQuery(); 

int i=0;   
    
while(rs.next()){
productos[i]=rs.getString("articulo");
i++;}
  
 return productos;  
        
}

String[] getOption (String Articulo) throws SQLException{

String[] opcion = new String[500];    
    
String SQL="SELECT n_opcion from opcion where id_producto=(SELECT id_producto FROM productos WHERE articulo=?)";
                                                             
PreparedStatement ps = cn.prepareStatement(SQL);

ps.setString(1, Articulo);

ResultSet rs = ps.executeQuery(); 

int i=0;   

    boolean existe=false;
    
while(rs.next()){
opcion[i]=rs.getString("n_opcion");
i++;
existe=true;}

if(existe==true){
  return opcion;          
}else {return null;}
    
}
   
void newProducto (String Articulo, int Precioen, int Preciosal,String[]Opciones) throws SQLException{
String sql="INSERT INTO productos (articulo,stock,estado,precio_en,precio_sal) VALUES (?,?,?,?,?)";
String sql2="INSERT INTO opcion VALUES ((SELECT id_producto FROM productos WHERE articulo=?),?) ";

PreparedStatement ps = cn.prepareStatement(sql);
ps.setString(1,Articulo);
ps.setInt(2, 0);
ps.setString(3, "A");
ps.setInt(4,Precioen);
ps.setInt(5,Preciosal);


ps.executeUpdate();



    for (String opcione : Opciones) {
        PreparedStatement ps2 = cn.prepareStatement(sql2);
        ps2.setString(1,Articulo);
        ps2.setString(2, opcione);
        ps2.executeUpdate();
    }

JOptionPane.showMessageDialog(null, "¡Listo!");

}

void updateProducto(int codigo, String articulo, int precioen, int preciosal, String[] opciones) throws SQLException{
    
    String sql="UPDATE productos SET articulo=?,precio_en=?,precio_sal=? WHERE id_producto=?";
    String sql2="DELETE FROM opcion WHERE id_producto=?";
    String sql3="INSERT INTO opcion VALUES (?,?)";

PreparedStatement ps = cn.prepareStatement(sql);


ps.setString(1,articulo);
ps.setInt(2,precioen);
ps.setInt(3,preciosal);
ps.setInt(4,codigo);
ps.executeUpdate();

PreparedStatement ps2 = cn.prepareStatement(sql2);
ps2.setInt(1,codigo);
ps2.executeUpdate();


    for (String opcione : opciones) {
        PreparedStatement ps3 = cn.prepareStatement(sql3);
        ps3.setInt(1,codigo);
        ps3.setString(2, opcione);
        ps3.executeUpdate();
    }

}

}
