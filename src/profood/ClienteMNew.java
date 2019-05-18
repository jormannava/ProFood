
package profood;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ClienteMNew extends javax.swing.JFrame {

    public ClienteMNew() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        
        TextAutoCompleter ac;
  ac = new TextAutoCompleter(etFind);
  Cliente cl = new Cliente();
     
        try {
            
 String nombre[] = cl.findClienteByName();


   for(int i=0;i<nombre.length;i++){
    if(nombre[i]!=null){
  ac.addItem(nombre[i]);
  
  }}} catch (SQLException ex) {
            Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        
    }
String nombre,telefono,descripcion,direccion;
int id,idPedido;
Conectar con = new Conectar();
Connection cn = con.getConnection(); 

    void getDatos() throws SQLException{
  
    nombre=etFind.getText();
        
String SQLID="SELECT id_cliente,telefono,direccion,descripcion FROM cliente WHERE nombre=?";    
PreparedStatement ps = cn.prepareStatement(SQLID);
ps.setString(1, nombre);


ResultSet rs;
rs = ps.executeQuery();


if(rs.next()){

id=rs.getInt(1);
telefono=rs.getString(2);
direccion=rs.getString(3);
descripcion=rs.getString(4);
}

etDes.setText(descripcion);

}
    void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etDes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lbId1 = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        btDeliverySv = new javax.swing.JButton();
        etFind = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setWheelScrollingEnabled(false);

        etDes.setColumns(20);
        etDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDes.setForeground(new java.awt.Color(0, 0, 0));
        etDes.setRows(5);
        etDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDes.setCaretColor(new java.awt.Color(255, 255, 255));
        etDes.setEnabled(false);
        jScrollPane1.setViewportView(etDes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit black.png"))); // NOI18N
        jLabel3.setAlignmentX(50.0F);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        lbId1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId1.setForeground(new java.awt.Color(0, 0, 0));
        lbId1.setText("Nombre:");
        jPanel1.add(lbId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 30));

        des.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des.setForeground(new java.awt.Color(0, 0, 0));
        des.setText("Descripción:");
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 30));

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
        jPanel1.add(btDeliverySv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, 40));

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
        jPanel1.add(etFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void btDeliverySvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySvActionPerformed
        pmaker pm = null;
        try {
            pm = new pmaker();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMNew.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cliente cl = new Cliente();
        try {
            //SINO EXISTE
            nombre=etFind.getText();

            if(cl.existe(nombre)==false){

                cl.newClienteM(nombre);
                cl.setCliente(idPedido, nombre);

                pm.setVisible(false);
            }else{

                pm.setVisible(false);
               cl.setDes(idPedido, etDes.getText());
                cl.setCliente(idPedido, id);}

        } catch (SQLException ex) {
            Logger.getLogger(ClienteMNew.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "¡Listo!");
        menu m= new menu();
        m.setVisible(true);
    }//GEN-LAST:event_btDeliverySvActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked
boolean crear;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteMNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeliverySv;
    private javax.swing.JLabel des;
    private javax.swing.JTextArea etDes;
    private javax.swing.JTextField etFind;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbId1;
    // End of variables declaration//GEN-END:variables
 
}
