/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


public class ClienteMostrador extends javax.swing.JFrame {

    public ClienteMostrador() {
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

etcod.setText(String.valueOf("000"+id));
etTele.setText(telefono);
etDire.setText(direccion);
etDes.setText(descripcion);

}
    void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etDire = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etDes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lbId1 = new javax.swing.JLabel();
        dire = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        btDeliverySv = new javax.swing.JButton();
        etFind = new javax.swing.JTextField();
        checkDomicilio = new javax.swing.JCheckBox();
        etcod = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();
        etTele = new javax.swing.JTextField();
        tele = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etDire.setBackground(new java.awt.Color(255, 255, 255));
        etDire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDire.setForeground(new java.awt.Color(0, 0, 0));
        etDire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDire.setEnabled(false);
        etDire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDireActionPerformed(evt);
            }
        });
        jPanel1.add(etDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 120, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 370, 110));

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
        jPanel1.add(lbId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 30));

        dire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dire.setForeground(new java.awt.Color(0, 0, 0));
        dire.setText("Direccion:");
        dire.setEnabled(false);
        jPanel1.add(dire, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 60, 30));

        des.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des.setForeground(new java.awt.Color(0, 0, 0));
        des.setText("Descripción:");
        des.setEnabled(false);
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, 30));

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
        jPanel1.add(etFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 30));

        checkDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        checkDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        checkDomicilio.setText("Habilitar Domicilio");
        checkDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDomicilioActionPerformed(evt);
            }
        });
        jPanel1.add(checkDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        etcod.setBackground(new java.awt.Color(255, 255, 255));
        etcod.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etcod.setForeground(new java.awt.Color(0, 0, 0));
        etcod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etcod.setEnabled(false);
        jPanel1.add(etcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 120, 30));

        cod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cod.setForeground(new java.awt.Color(0, 0, 0));
        cod.setText("Codigo:");
        cod.setEnabled(false);
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 60, 30));

        etTele.setBackground(new java.awt.Color(255, 255, 255));
        etTele.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTele.setForeground(new java.awt.Color(0, 0, 0));
        etTele.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etTele.setEnabled(false);
        etTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTeleActionPerformed(evt);
            }
        });
        jPanel1.add(etTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 30));

        tele.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tele.setForeground(new java.awt.Color(0, 0, 0));
        tele.setText("Telefono:");
        tele.setEnabled(false);
        jPanel1.add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etDireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDireActionPerformed

    }//GEN-LAST:event_etDireActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.setVisible(false);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void btDeliverySvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySvActionPerformed
       pmaker pm = null;
        try {
            pm = new pmaker();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMostrador.class.getName()).log(Level.SEVERE, null, ex);
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

            cl.setCliente(idPedido, id);}
                 
        
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMostrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
        
        
        
        
    

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "¡Listo!");
        menu m= new menu();
        m.setVisible(true);
    }//GEN-LAST:event_btDeliverySvActionPerformed

    private void etFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etFindKeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER)  { try {
            getDatos();
        } catch (SQLException ex) {
            Logger.getLogger(findCliente.class.getName()).log(Level.SEVERE, null, ex);
        }}    
    }//GEN-LAST:event_etFindKeyPressed

    private void etFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etFindActionPerformed

    }//GEN-LAST:event_etFindActionPerformed
boolean crear;
    private void checkDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDomicilioActionPerformed
    
        if(checkDomicilio.isSelected()==false){
        dire.setEnabled(false);
        etDire.setEnabled(false);
        des.setEnabled(false);
        etDes.setEnabled(false);
        cod.setEnabled(false);
        etcod.setEnabled(false);
        etTele.setEnabled(false);
         tele.setEnabled(false);
        }else if(checkDomicilio.isSelected()){  
        dire.setEnabled(true);
        etDire.setEnabled(true);
        des.setEnabled(true);
        etDes.setEnabled(true);
        cod.setEnabled(true);
        etcod.setEnabled(true);
        etTele.setEnabled(true);
         tele.setEnabled(true);}
        
        
        crear=true;
    }//GEN-LAST:event_checkDomicilioActionPerformed

    private void etTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTeleActionPerformed


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
            java.util.logging.Logger.getLogger(ClienteMostrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMostrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMostrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMostrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMostrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeliverySv;
    private javax.swing.JCheckBox checkDomicilio;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel des;
    private javax.swing.JLabel dire;
    private javax.swing.JTextArea etDes;
    private javax.swing.JTextField etDire;
    private javax.swing.JTextField etFind;
    private javax.swing.JTextField etTele;
    private javax.swing.JLabel etcod;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbId1;
    private javax.swing.JLabel tele;
    // End of variables declaration//GEN-END:variables
 
}
