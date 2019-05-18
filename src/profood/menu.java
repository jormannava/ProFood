
package profood;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;


public class menu extends javax.swing.JFrame {

    public menu() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        
        
      initComponents();
      
      Pedidos p1 = new Pedidos();
        try {
            listartabla1();
            lbMostrador.setText("      Pedidos Mostrador: "+String.valueOf(p1.getTipo(2)));
            lbDelivery.setText("      Pedidos Delivery: "+String.valueOf(p1.getTipo(1)));
    lbAnulado.setText("      Anulados: "+String.valueOf(p1.getEstado("Anulado")));
    lbEntregado.setText("      Entregados: "+String.valueOf(p1.getEstado("Entregado")));
Double importetotal=0.0;
        if(tListaPedidos.getColumnCount()>0){
        if(tListaPedidos.getRowCount()>0){
        
            for(int i=0;i<tListaPedidos.getRowCount();i++){
    
     importetotal += Integer.parseInt(tListaPedidos.getValueAt(i, 5).toString());

            }}}
    
     lbTotal.setText("      Total de Venta: $"+importetotal);
    lbConfirmado.setText("     Confirmados: "+String.valueOf(p1.getEstado("Confirmado")));
            //tListaPedidos.setDefaultRenderer(Object.class, new JTableColor());
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
  
     
        
     
        
    }
   Boolean lleno=true;
   public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    
 void listartabla1 () throws SQLException{

  
    String SQL = "SELECT pedidos.id_pedido AS Codigo, cliente.nombre AS Cliente, cliente.direccion AS Dirección, pedidos.estado AS Estado, pedidos.hora AS Hora, pedidos.importe AS Importe "
            + "FROM cliente, pedidos WHERE cliente.id_cliente = pedidos.id_cliente order by Codigo";
 
    Pedidos p1 = new Pedidos();
    
  lleno= p1.llenarTabla(tListaPedidos, SQL);
   if(lleno==true){
            TableColumnModel columnModel2 = tListaPedidos.getColumnModel();
            DefaultTableCellRenderer tcr2 = new DefaultTableCellRenderer();
            tcr2.setHorizontalAlignment(SwingConstants.CENTER);

       
        columnModel2.getColumn(0).setPreferredWidth(5);
        columnModel2.getColumn(0).setCellRenderer(tcr2);
        columnModel2.getColumn(0).setResizable(false);    
            
        columnModel2.getColumn(1).setPreferredWidth(100);
    
        columnModel2.getColumn(1).setResizable(false); 
            
        columnModel2.getColumn(2).setPreferredWidth(100);
   
        columnModel2.getColumn(2).setResizable(false); 
        
        columnModel2.getColumn(3).setPreferredWidth(5);
       columnModel2.getColumn(3).setCellRenderer(tcr2);
        columnModel2.getColumn(3).setResizable(false); 
        
        columnModel2.getColumn(4).setPreferredWidth(5);
       columnModel2.getColumn(4).setCellRenderer(tcr2);
        columnModel2.getColumn(4).setResizable(false); 
        
        columnModel2.getColumn(5).setPreferredWidth(5);
       columnModel2.getColumn(5).setCellRenderer(tcr2);
        columnModel2.getColumn(5).setResizable(false); }
   }
   
   void listartabla2 () throws SQLException{

  
    String SQL = "SELECT pedidos.id_pedido AS Codigo, cliente.nombre AS Cliente, cliente.direccion AS Dirección, pedidos.estado AS Estado, pedidos.hora AS Hora, pedidos.importe AS Importe "
            + "FROM cliente, pedidos WHERE cliente.id_cliente = pedidos.id_cliente AND tipo=1 order by Codigo";
 
    Pedidos p1 = new Pedidos();
    
  lleno= p1.llenarTabla(tListaPedidos, SQL);
  
   if(lleno==true){
            TableColumnModel columnModel2 = tListaPedidos.getColumnModel();
            DefaultTableCellRenderer tcr2 = new DefaultTableCellRenderer();
            tcr2.setHorizontalAlignment(SwingConstants.CENTER);

           
        columnModel2.getColumn(0).setPreferredWidth(5);
        columnModel2.getColumn(0).setCellRenderer(tcr2);
        columnModel2.getColumn(0).setResizable(false);    
            
        columnModel2.getColumn(1).setPreferredWidth(100);
    
        columnModel2.getColumn(1).setResizable(false); 
            
        columnModel2.getColumn(2).setPreferredWidth(100);
   
        columnModel2.getColumn(2).setResizable(false); 
        
        columnModel2.getColumn(3).setPreferredWidth(5);
       columnModel2.getColumn(3).setCellRenderer(tcr2);
        columnModel2.getColumn(3).setResizable(false); 
        
        columnModel2.getColumn(4).setPreferredWidth(5);
       columnModel2.getColumn(4).setCellRenderer(tcr2);
        columnModel2.getColumn(4).setResizable(false); 
        
        columnModel2.getColumn(5).setPreferredWidth(5);
       columnModel2.getColumn(5).setCellRenderer(tcr2);
        columnModel2.getColumn(5).setResizable(false); }
   }
   
    void listartabla3 () throws SQLException{

  
    String SQL = "SELECT pedidos.id_pedido AS Codigo, cliente.nombre AS Cliente, pedidos.estado AS Estado, pedidos.hora AS Hora, pedidos.importe AS Importe "
            + "FROM cliente, pedidos WHERE cliente.id_cliente = pedidos.id_cliente AND tipo=2 order by Codigo";
 
    Pedidos p1 = new Pedidos();
    
   lleno = p1.llenarTabla(tListaPedidos, SQL);
   if(lleno==true){
            TableColumnModel columnModel2 = tListaPedidos.getColumnModel();
            DefaultTableCellRenderer tcr2 = new DefaultTableCellRenderer();
            tcr2.setHorizontalAlignment(SwingConstants.CENTER);

      
        columnModel2.getColumn(0).setPreferredWidth(5);
        columnModel2.getColumn(0).setCellRenderer(tcr2);
        columnModel2.getColumn(0).setResizable(false);    
            
        columnModel2.getColumn(1).setPreferredWidth(100);
    
        columnModel2.getColumn(1).setResizable(false); 
            
   
        
        columnModel2.getColumn(2).setPreferredWidth(5);
       columnModel2.getColumn(2).setCellRenderer(tcr2);
        columnModel2.getColumn(2).setResizable(false); 
        
        columnModel2.getColumn(3).setPreferredWidth(5);
       columnModel2.getColumn(3).setCellRenderer(tcr2);
        columnModel2.getColumn(3).setResizable(false); 
        
        columnModel2.getColumn(4).setPreferredWidth(5);
       columnModel2.getColumn(4).setCellRenderer(tcr2);
        columnModel2.getColumn(4).setResizable(false); 
        }
    
   }
   
   
    String codigo;
int importe;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btmodped = new javax.swing.JButton();
        btdelivery = new javax.swing.JButton();
        btcanped = new javax.swing.JButton();
        pmakerbt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tListaPedidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        btdelivery2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbDelivery = new javax.swing.JLabel();
        lbMostrador = new javax.swing.JLabel();
        lbConfirmado = new javax.swing.JLabel();
        lbEntregado = new javax.swing.JLabel();
        lbAnulado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbTotal = new javax.swing.JLabel();
        btdelivery1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 35, -1, -1));

        btmodped.setBackground(new java.awt.Color(255, 193, 7));
        btmodped.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btmodped.setForeground(new java.awt.Color(255, 255, 255));
        btmodped.setText("Mod. Pedido");
        btmodped.setBorder(null);
        btmodped.setBorderPainted(false);
        btmodped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodpedActionPerformed(evt);
            }
        });
        jPanel1.add(btmodped, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, 40));

        btdelivery.setBackground(new java.awt.Color(255, 193, 7));
        btdelivery.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btdelivery.setForeground(new java.awt.Color(255, 255, 255));
        btdelivery.setText("Asig. Delivery");
        btdelivery.setBorder(null);
        btdelivery.setBorderPainted(false);
        btdelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeliveryActionPerformed(evt);
            }
        });
        jPanel1.add(btdelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 110, 40));

        btcanped.setBackground(new java.awt.Color(255, 193, 7));
        btcanped.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btcanped.setForeground(new java.awt.Color(255, 255, 255));
        btcanped.setText("Cancel. Pedido");
        btcanped.setBorder(null);
        btcanped.setBorderPainted(false);
        btcanped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcanpedActionPerformed(evt);
            }
        });
        jPanel1.add(btcanped, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 110, 40));

        pmakerbt.setBackground(new java.awt.Color(255, 193, 7));
        pmakerbt.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        pmakerbt.setForeground(new java.awt.Color(255, 255, 255));
        pmakerbt.setText("Nuevo Pedido");
        pmakerbt.setBorder(null);
        pmakerbt.setBorderPainted(false);
        pmakerbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pmakerbt.setFocusPainted(false);
        pmakerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmakerbtActionPerformed(evt);
            }
        });
        jPanel1.add(pmakerbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tListaPedidos.setAutoCreateRowSorter(true);
        tListaPedidos.setBackground(new java.awt.Color(255, 255, 255));
        tListaPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tListaPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tListaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        tListaPedidos.setGridColor(new java.awt.Color(255, 255, 255));
        tListaPedidos.setRowHeight(30);
        tListaPedidos.setSelectionBackground(new java.awt.Color(0, 150, 136));
        tListaPedidos.getTableHeader().setReorderingAllowed(false);
        tListaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tListaPedidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tListaPedidos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 950, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit black.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 17, -1, -1));

        cbFiltro.setBackground(new java.awt.Color(255, 255, 255));
        cbFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbFiltro.setForeground(new java.awt.Color(0, 0, 0));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Delivery", "Mostrador", "En Espera", "Confirmados", "En Camino", "Entregados", "Anulados" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 110, 40));

        txtFiltro.setBackground(new java.awt.Color(255, 255, 255));
        txtFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFiltro.setForeground(new java.awt.Color(0, 0, 0));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 110, 40));

        btdelivery2.setBackground(new java.awt.Color(255, 193, 7));
        btdelivery2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btdelivery2.setForeground(new java.awt.Color(255, 255, 255));
        btdelivery2.setText("Panel Delivery");
        btdelivery2.setBorder(null);
        btdelivery2.setBorderPainted(false);
        btdelivery2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelivery2ActionPerformed(evt);
            }
        });
        jPanel1.add(btdelivery2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1060, 770));

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ProFood ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 190, 40));

        jLabel4.setBackground(new java.awt.Color(117, 117, 117));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detalle de Venta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 240, 10));

        lbDelivery.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delivery.png"))); // NOI18N
        lbDelivery.setText("     Pedidos Delivery:  1");
        jPanel2.add(lbDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        lbMostrador.setBackground(new java.awt.Color(255, 255, 255));
        lbMostrador.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbMostrador.setForeground(new java.awt.Color(255, 255, 255));
        lbMostrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/shop.png"))); // NOI18N
        lbMostrador.setText("     Pedidos Mostrador: 1");
        jPanel2.add(lbMostrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        lbConfirmado.setBackground(new java.awt.Color(255, 255, 255));
        lbConfirmado.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbConfirmado.setForeground(new java.awt.Color(255, 255, 255));
        lbConfirmado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/sales.png"))); // NOI18N
        lbConfirmado.setText("     Confirmados:  2");
        jPanel2.add(lbConfirmado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lbEntregado.setBackground(new java.awt.Color(255, 255, 255));
        lbEntregado.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbEntregado.setForeground(new java.awt.Color(255, 255, 255));
        lbEntregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/good.png"))); // NOI18N
        lbEntregado.setText("     Entregados:  1");
        jPanel2.add(lbEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        lbAnulado.setBackground(new java.awt.Color(255, 255, 255));
        lbAnulado.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbAnulado.setForeground(new java.awt.Color(255, 255, 255));
        lbAnulado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/cancel.png"))); // NOI18N
        lbAnulado.setText("     Anulados: 1");
        jPanel2.add(lbAnulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/question2.png"))); // NOI18N
        jLabel11.setText("¿Alguna Pregunta? Haz Click Aqui");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 240, 30));

        lbTotal.setBackground(new java.awt.Color(255, 255, 255));
        lbTotal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/sales.png"))); // NOI18N
        lbTotal.setText("    Total de Venta: $15000");
        jPanel2.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        btdelivery1.setBackground(new java.awt.Color(255, 193, 7));
        btdelivery1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btdelivery1.setForeground(new java.awt.Color(255, 255, 255));
        btdelivery1.setText("CIERRE DE CAJA");
        btdelivery1.setBorder(null);
        btdelivery1.setBorderPainted(false);
        btdelivery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelivery1ActionPerformed(evt);
            }
        });
        jPanel2.add(btdelivery1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int n= JOptionPane.showConfirmDialog(
            null,
            "¿Estas seguro que quieres salir del sistema?",
            "ATENCIÓN",
            JOptionPane.YES_NO_OPTION);

        if(n==0){
            System.exit(0);

        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void pmakerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmakerbtActionPerformed
pmaker pm = null;
        try {
            pm = new pmaker();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
pm.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_pmakerbtActionPerformed

    private void btcanpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcanpedActionPerformed

        Pedidos p1 = new Pedidos();


        try {
            
             int n= JOptionPane.showConfirmDialog(
            null,
            "¿Estas seguro que quieres cancelar este pedido?",
            "ATENCIÓN",
            JOptionPane.YES_NO_OPTION);
             
        if(n==0){
            p1.estadoPedido(Integer.parseInt(codigo), "Anulado");
            listartabla1();
            JOptionPane.showMessageDialog(null, "El pedido: "+codigo+" ha sido anulado exitosamente.");

        }
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btcanpedActionPerformed

    private void btdeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeliveryActionPerformed
       

        
        deliveryw d1 = new deliveryw();
        d1.setVisible(true);
        try {
            
            d1.setDelivery(codigo, importe);
             
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btdeliveryActionPerformed

    private void btmodpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodpedActionPerformed

    }//GEN-LAST:event_btmodpedActionPerformed

    private void tListaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tListaPedidosMouseClicked
  
        int icod = 0,iimp = 0;
        
        int posicion = tListaPedidos.getSelectedRow();
        if(posicion>=0){
            
switch (indextab){case 1:
   icod=0;
   iimp=5;
    break;
    case 2:
   icod=0;
   iimp=5;
    break;
     case 3:
   icod=0;
   iimp=4;
    break;


}
            codigo = tListaPedidos.getValueAt(posicion,icod).toString();
        
            importe= Integer.parseInt(tListaPedidos.getValueAt(posicion, iimp).toString());
        }
    }//GEN-LAST:event_tListaPedidosMouseClicked
int indextab;
    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed

        switch (cbFiltro.getSelectedItem().toString()){
        
          
            
              case "Todos":
        {
            try {
                listartabla1();
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                indextab=1;
            }
        }break;
        
            case "Delivery":
        {
            try {
                listartabla2();
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                indextab=2;
            }
        }break;
           case "Mostrador":
        {
            try {
                listartabla3();
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                indextab=3;
            }
        }break;
        
        
        }
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btdelivery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelivery1ActionPerformed
          
         Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.YEAR) + "-" + cal.get(cal.MONTH) + "-" + cal.get(cal.DATE);
        String hora = cal.get(cal.HOUR) + ":" + cal.get(cal.MINUTE);
        
        int n= JOptionPane.showConfirmDialog(
            null,
            "¿Estas seguro que cerrar la caja y salir del sistema?",
            "ATENCIÓN",
            JOptionPane.YES_NO_OPTION);

        if(n==0){
            
            String texto= JOptionPane.showInputDialog("Cierre de caja del Dia: "+fecha+", Hora: "+hora+", "
                    + ""
                    + "Introduzca porfavor una descripción");
            
            System.exit(0);

            
            //ACTUALIZAR ACTUAL CAJA
            //CREAR NUEVA CAJA
            
            
        }
    }//GEN-LAST:event_btdelivery1ActionPerformed

    private void btdelivery2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelivery2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdelivery2ActionPerformed
public void filtro() {
trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltro.getText(), 2));
}
    private TableRowSorter trsfiltro;
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
     
        txtFiltro.addKeyListener(new KeyAdapter() {
@Override
public void keyReleased(final KeyEvent e) {
String cadena = (txtFiltro.getText());
txtFiltro.setText(cadena);
repaint();
filtro();
}
});
trsfiltro = new TableRowSorter(tListaPedidos.getModel());
tListaPedidos.setRowSorter(trsfiltro);
       
       
    }//GEN-LAST:event_txtFiltroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcanped;
    private javax.swing.JButton btdelivery;
    private javax.swing.JButton btdelivery1;
    private javax.swing.JButton btdelivery2;
    private javax.swing.JButton btmodped;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbAnulado;
    private javax.swing.JLabel lbConfirmado;
    private javax.swing.JLabel lbDelivery;
    private javax.swing.JLabel lbEntregado;
    private javax.swing.JLabel lbMostrador;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JButton pmakerbt;
    javax.swing.JTable tListaPedidos;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
