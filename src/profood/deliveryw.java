
package profood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class deliveryw extends javax.swing.JFrame {

    public deliveryw() {  this.setUndecorated(true);
        initComponents();
        
        this.setLocationRelativeTo(null);
       
    }

     Conectar con = new Conectar();
    Connection cn = con.getConnection();
    
    void setDelivery(String codigo, int importe) throws SQLException{
    lbCodPedido.setText(codigo);
        
      
        
        lbImporte.setText("$"+String.valueOf(importe));
        
        
        
        String SQL="SELECT pagacon AS total FROM pedidos WHERE id_pedido=?";
    PreparedStatement ps = cn.prepareStatement(SQL);
    ResultSet rs;
   ps.setInt(1,Integer.parseInt(codigo));
    rs = ps.executeQuery();
      int pagacon = 0;
   
    if(rs.next()){
    pagacon = rs.getInt("total");
      
        
    }
   
    
    lbCambio.setText("$"+String.valueOf(+pagacon-importe));
    lbPagaCon.setText("$"+String.valueOf(pagacon));
    
    }
    
    
    
    
    
    
    
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pdetalle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btDeliverySv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bxDelivery = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbCodPedido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbCambio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbPagaCon = new javax.swing.JLabel();
        lbImporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pdetalle.setBackground(new java.awt.Color(255, 255, 255));
        pdetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdetalle.setForeground(new java.awt.Color(0, 0, 0));
        pdetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit black.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        pdetalle.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

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
        pdetalle.add(btDeliverySv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Motoquero:");
        pdetalle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        bxDelivery.setBackground(new java.awt.Color(255, 255, 255));
        bxDelivery.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        bxDelivery.setForeground(new java.awt.Color(0, 0, 0));
        bxDelivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ezequiel", "Maxi" }));
        bxDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxDeliveryActionPerformed(evt);
            }
        });
        pdetalle.add(bxDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 121, 107));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pedido:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 12, -1, -1));

        lbCodPedido.setBackground(new java.awt.Color(255, 255, 255));
        lbCodPedido.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbCodPedido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lbCodPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 23, 200, 20));

        pdetalle.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cambio");
        pdetalle.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe:");
        pdetalle.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lbCambio.setBackground(new java.awt.Color(0, 0, 0));
        lbCambio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCambio.setForeground(new java.awt.Color(0, 0, 0));
        pdetalle.add(lbCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Abona con:");
        pdetalle.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        lbPagaCon.setBackground(new java.awt.Color(0, 0, 0));
        lbPagaCon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPagaCon.setForeground(new java.awt.Color(0, 0, 0));
        pdetalle.add(lbPagaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, 20));

        lbImporte.setBackground(new java.awt.Color(0, 0, 0));
        lbImporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbImporte.setForeground(new java.awt.Color(0, 0, 0));
        pdetalle.add(lbImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pdetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pdetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        deliveryw dw=this;
        dw.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btDeliverySvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeliverySvActionPerformed
Pedidos p1 = new Pedidos();
        try {
            p1.asignarDelivery(Integer.parseInt(lbCodPedido.getText()), bxDelivery.getItemAt(bxDelivery.getSelectedIndex()));
                    
p1.estadoPedido(Integer.parseInt(lbCodPedido.getText()), "En Camino");
            
            JOptionPane.showMessageDialog(null, "El pedido: "+lbCodPedido.getText()+" Esta en camino");
        } catch (SQLException ex) {
            Logger.getLogger(deliveryw.class.getName()).log(Level.SEVERE, null, ex);
        }
        
this.setVisible(false);
JOptionPane.showMessageDialog(null, "¡Listo!");
    }//GEN-LAST:event_btDeliverySvActionPerformed

    private void bxDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxDeliveryActionPerformed

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
            java.util.logging.Logger.getLogger(deliveryw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deliveryw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deliveryw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deliveryw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deliveryw().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeliverySv;
    private javax.swing.JComboBox<String> bxDelivery;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbCambio;
    private javax.swing.JLabel lbCodPedido;
    private javax.swing.JLabel lbImporte;
    private javax.swing.JLabel lbPagaCon;
    private javax.swing.JPanel pdetalle;
    // End of variables declaration//GEN-END:variables
}
