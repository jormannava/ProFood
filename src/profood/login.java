
package profood;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
       this.setLocationRelativeTo(null);
         Central1.setVisible(false);
   
       
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    //METODOS
    
   void getColor(JPanel panelcolor){
     
     panelcolor.setBackground(new Color(0,150,136)); 
     }
   
   void resetColor(JPanel panelreset){
         
     panelreset.setBackground(new Color(0,121,107)); }
   
   void registrar() throws SQLException{
    String usernew="";
    String passnew="";
    String permiso="clave";
    
    Usuarios u1 = new Usuarios();
    
   
    if (etRegUser.getText().isEmpty()||etRegPass.getText().isEmpty()||etRegPer.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"¡No Puede dejar campos vacios!"); } 
    else if(etRegPer.getText().equals(permiso)){
    
   usernew = etRegUser.getText();
    passnew = etRegPass.getText();
    
    u1.regisuser(usernew, passnew, 1);
    
    JOptionPane.showMessageDialog(null, "¡El Usuario ha sido registrado con exito!");
    
    }
    
    
    
    }
   
   void ingresar() throws SQLException{  
        
        Usuarios u1 = new Usuarios();
       

        String passl, userl;
      
        passl = userpass.getText();

        
       
        userl = username.getText();
        userl = userl.toLowerCase();
     
         int lvl;
        
       if (userpass.getText().isEmpty()||username.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"¡No Puede dejar campos vacios!");
        
        }else  if (u1.login(userl, passl).equals(true)){
         lvl = u1.getNivel();
            menu pm1 = new menu();
            
            if(lvl==2){menuAdmin ma = new  menuAdmin();
            ma.setVisible(true);
            }else{ 
            
            pm1.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this,"¡Bienvenid@ "+userl+" al sistemas de control de ventas ProFood");}
        }else {JOptionPane.showMessageDialog(this,"¡Usuario y Contraseña no coinciden!");
            username.setText("");
            userpass.setText("");
        }}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Central = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        userpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btIniciar = new javax.swing.JButton();
        Central1 = new javax.swing.JPanel();
        etRegUser = new javax.swing.JTextField();
        etRegPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etRegPer = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btguardar = new javax.swing.JButton();
        Lateral = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        derechos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Central.setBackground(new java.awt.Color(255, 255, 255));
        Central.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        Central.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, 30));

        userpass.setBackground(new java.awt.Color(255, 255, 255));
        userpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        userpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpassActionPerformed(evt);
            }
        });
        userpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userpassKeyPressed(evt);
            }
        });
        Central.add(userpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(117, 117, 117));
        jLabel1.setText("Usuario");
        Central.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(117, 117, 117));
        jLabel2.setText("Contraseña");
        Central.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btIniciar.setBackground(new java.awt.Color(255, 193, 7));
        btIniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btIniciar.setText("Ingresar");
        btIniciar.setBorder(null);
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        Central.add(btIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, 40));

        getContentPane().add(Central, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 244));

        Central1.setBackground(new java.awt.Color(255, 255, 255));

        etRegUser.setBackground(new java.awt.Color(255, 255, 255));
        etRegUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etRegUser.setForeground(new java.awt.Color(51, 51, 51));
        etRegUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));

        etRegPass.setBackground(new java.awt.Color(255, 255, 255));
        etRegPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etRegPass.setForeground(new java.awt.Color(51, 51, 51));
        etRegPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        etRegPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etRegPassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(117, 117, 117));
        jLabel3.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(117, 117, 117));
        jLabel5.setText("Contraseña");

        etRegPer.setBackground(new java.awt.Color(255, 255, 255));
        etRegPer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etRegPer.setForeground(new java.awt.Color(51, 51, 51));
        etRegPer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        etRegPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etRegPerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(117, 117, 117));
        jLabel7.setText("Permiso");

        btguardar.setBackground(new java.awt.Color(255, 193, 7));
        btguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btguardar.setForeground(new java.awt.Color(255, 255, 255));
        btguardar.setText("Guardar");
        btguardar.setBorder(null);
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Central1Layout = new javax.swing.GroupLayout(Central1);
        Central1.setLayout(Central1Layout);
        Central1Layout.setHorizontalGroup(
            Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Central1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Central1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(etRegPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Central1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Central1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(etRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Central1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(etRegPer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Central1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        Central1Layout.setVerticalGroup(
            Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Central1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(etRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Central1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(etRegPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Central1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Central1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(etRegPer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Central1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        Lateral.setBackground(new java.awt.Color(0, 121, 107));
        Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ProFood ");
        Lateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 40));

        btnIniciar.setBackground(new java.awt.Color(0, 150, 136));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/user.png"))); // NOI18N
        jLabel6.setText("       Iniciar Sesión");

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        Lateral.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 121, 107));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/new user.png"))); // NOI18N
        jLabel8.setText("      Nuevo Usuario");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Lateral.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 220, -1));

        derechos.setBackground(new java.awt.Color(0, 121, 107));
        derechos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(222, 222, 222));
        jLabel11.setFont(new java.awt.Font("Dialog", 2, 9)); // NOI18N
        jLabel11.setText("ProSales S. A 2019 - 2020  ");
        derechos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        jLabel12.setBackground(new java.awt.Color(222, 222, 222));
        jLabel12.setFont(new java.awt.Font("Dialog", 2, 9)); // NOI18N
        jLabel12.setText("Todos los Derechos Reservados.");
        derechos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 10));

        Lateral.add(derechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit_1.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Lateral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 7, -1, -1));

        getContentPane().add(Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 0, 210, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpassActionPerformed
    
    private void etRegPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etRegPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etRegPassActionPerformed

    private void etRegPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etRegPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etRegPerActionPerformed

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed

        resetColor(btnIniciar);

        getColor(btnRegistrar);
        Central.setVisible(false);
        Central1.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked

    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMousePressed

        getColor(btnIniciar);

        resetColor(btnRegistrar);
        Central.setVisible(true);
        Central1.setVisible(false);

    }//GEN-LAST:event_btnIniciarMousePressed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        try {
            registrar();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btguardarActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        try {
            ingresar();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIniciarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    
              System.exit(0);

        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void userpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userpassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        
            try {
            ingresar();       
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_userpassKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Central;
    private javax.swing.JPanel Central1;
    private javax.swing.JPanel Lateral;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btguardar;
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel derechos;
    private javax.swing.JPasswordField etRegPass;
    private javax.swing.JPasswordField etRegPer;
    private javax.swing.JTextField etRegUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField username;
    private javax.swing.JPasswordField userpass;
    // End of variables declaration//GEN-END:variables

}
