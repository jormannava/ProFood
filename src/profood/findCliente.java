
package profood;


import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class findCliente extends javax.swing.JFrame {

Cliente cl = new Cliente();

int idPedido;

 void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
  
    }

    
Conectar con = new Conectar();
Connection cn = con.getConnection(); 
   
int telefono,id;
String nombre, direccion, descripcion;
    String []num;
public findCliente()     
{
        initComponents();
   
  setLocationRelativeTo(null);


  Cliente cl = new Cliente();
 
        try {
            
num = cl.findCliente();

  
  } catch (SQLException ex) {
            Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
        }
     autocompletar(num,etFind); }


void autocompletar(String arg[],JTextField campo){

TextAutoCompleter ac;
  ac = new TextAutoCompleter(etFind);

    for (String arg1 : arg) {
        if (arg1 != null) {
            ac.addItem(arg1);
        }
    }
}



        
        
        
void getDatos() throws SQLException{
  
    telefono=Integer.parseInt(etFind.getText());
    
String SQLID="SELECT id_cliente,nombre,direccion,descripcion FROM cliente WHERE telefono=?";    
PreparedStatement ps = cn.prepareStatement(SQLID);
ps.setInt(1, telefono);


ResultSet rs;
rs = ps.executeQuery();


if(rs.next()){

id=rs.getInt(1);
nombre=rs.getString(2);
direccion=rs.getString(3);
descripcion=rs.getString(4);
}

lbId.setText(String.valueOf("000"+id));
etNombre.setText(nombre);
etDire.setText(direccion);
etDes.setText(descripcion);

}

@SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etDire = new javax.swing.JTextField();
        etNombre = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etDes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        etFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbId1 = new javax.swing.JLabel();
        lbId2 = new javax.swing.JLabel();
        lbId3 = new javax.swing.JLabel();
        lbId4 = new javax.swing.JLabel();
        btDeliverySv = new javax.swing.JButton();
        btDeliverySv2 = new javax.swing.JButton();
        btDeliverySv1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etDire.setBackground(new java.awt.Color(255, 255, 255));
        etDire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDire.setForeground(new java.awt.Color(0, 0, 0));
        etDire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDireActionPerformed(evt);
            }
        });
        jPanel1.add(etDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 120, 30));

        etNombre.setBackground(new java.awt.Color(255, 255, 255));
        etNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre.setForeground(new java.awt.Color(0, 0, 0));
        etNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombreActionPerformed(evt);
            }
        });
        jPanel1.add(etNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, 30));

        lbId.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbId.setForeground(new java.awt.Color(0, 0, 0));
        lbId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 120, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setWheelScrollingEnabled(false);

        etDes.setColumns(20);
        etDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDes.setForeground(new java.awt.Color(0, 0, 0));
        etDes.setRows(5);
        etDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDes.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(etDes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 370, 110));

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etFind.setBackground(new java.awt.Color(255, 255, 255));
        etFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etFind.setForeground(new java.awt.Color(0, 0, 0));
        etFind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etFindActionPerformed(evt);
            }
        });
        etFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etFindKeyPressed(evt);
            }
        });
        jPanel2.add(etFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Search_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit black.png"))); // NOI18N
        jLabel3.setAlignmentX(50.0F);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        lbId1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId1.setForeground(new java.awt.Color(0, 0, 0));
        lbId1.setText("Nombre:");
        jPanel1.add(lbId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 60, 30));

        lbId2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId2.setForeground(new java.awt.Color(0, 0, 0));
        lbId2.setText("Direccion:");
        jPanel1.add(lbId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 60, 30));

        lbId3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId3.setForeground(new java.awt.Color(0, 0, 0));
        lbId3.setText("Descripción:");
        jPanel1.add(lbId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, 30));

        lbId4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId4.setForeground(new java.awt.Color(0, 0, 0));
        lbId4.setText("Codigo:");
        jPanel1.add(lbId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 60, 30));

        btDeliverySv.setBackground(new java.awt.Color(255, 193, 7));
        btDeliverySv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDeliverySv.setForeground(new java.awt.Color(255, 255, 255));
        btDeliverySv.setText("Guardar");
        btDeliverySv.setBorder(null);
        btDeliverySv.setBorderPainted(false);
        btDeliverySv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeliverySvActionPerformed(evt);
            }
        });
        jPanel1.add(btDeliverySv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, 40));

        btDeliverySv2.setBackground(new java.awt.Color(255, 193, 7));
        btDeliverySv2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDeliverySv2.setForeground(new java.awt.Color(255, 255, 255));
        btDeliverySv2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/new user.png"))); // NOI18N
        btDeliverySv2.setBorder(null);
        btDeliverySv2.setBorderPainted(false);
        btDeliverySv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeliverySv2ActionPerformed(evt);
            }
        });
        jPanel1.add(btDeliverySv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 50, 50));

        btDeliverySv1.setBackground(new java.awt.Color(255, 193, 7));
        btDeliverySv1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDeliverySv1.setForeground(new java.awt.Color(255, 255, 255));
        btDeliverySv1.setText("Actualizar");
        btDeliverySv1.setBorder(null);
        btDeliverySv1.setBorderPainted(false);
        btDeliverySv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeliverySv1ActionPerformed(evt);
            }
        });
        jPanel1.add(btDeliverySv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etFindKeyPressed


        if(evt.getKeyCode()==KeyEvent.VK_ENTER)  { try {
            getDatos();
        } catch (SQLException ex) {
            Logger.getLogger(findCliente.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_etFindKeyPressed

    private void etFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etFindActionPerformed

    }//GEN-LAST:event_etFindActionPerformed

    private void etNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombreActionPerformed

    }//GEN-LAST:event_etNombreActionPerformed

    private void etDireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDireActionPerformed

    }//GEN-LAST:event_etDireActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 
            this.setVisible(false);

        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btDeliverySvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySvActionPerformed
        
        try {
        pmaker pm = new pmaker();

       
        cl.setCliente(idPedido, Integer.parseInt(lbId.getText()));
        
    } catch (SQLException ex) {
        Logger.getLogger(findCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "¡Listo!");
        menu m= new menu(); 
         m.setVisible(true);
    }//GEN-LAST:event_btDeliverySvActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    try {
        getDatos();
    } catch (SQLException ex) {
        Logger.getLogger(findCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btDeliverySv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeliverySv2ActionPerformed

    private void btDeliverySv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeliverySv1ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(findCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(findCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(findCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(findCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new findCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeliverySv;
    private javax.swing.JButton btDeliverySv1;
    private javax.swing.JButton btDeliverySv2;
    private javax.swing.JTextArea etDes;
    private javax.swing.JTextField etDire;
    private javax.swing.JTextField etFind;
    private javax.swing.JTextField etNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbId1;
    private javax.swing.JLabel lbId2;
    private javax.swing.JLabel lbId3;
    private javax.swing.JLabel lbId4;
    // End of variables declaration//GEN-END:variables
}
