
package profood;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class menuAdmin extends javax.swing.JFrame {
DefaultListModel opcionl= new DefaultListModel();
int Codigo,Precioen,Preciosal;
String Articulo;
String [] Opciones;
Productos pro = new Productos();
DefaultListModel opcionEP = new DefaultListModel();   



    public menuAdmin() { 
        this.setUndecorated(true);
        initComponents();
      
         opcionl=new DefaultListModel();
         listOpcion.setModel(opcionl);
         listOpcionEP.setModel(opcionEP);
        listarProductos();
        newDelivery.setVisible(false);
        //editDelivery.setVisible(false);
        newProducto.setVisible(false);
        editProducto.setVisible(false);
        newCliente.setVisible(false);
        editCliente.setVisible(false);
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }
   
   void limpiarEditProducto(){
     etNombre.setText("");
    opcionl.removeAllElements();
    etPrecioen.setText("");
    etPreciosal.setText("");
    lbCodigo.setText("");
  
   }
   
   void listarProductos(){
   
   String[] listaProductos = new String[500];
   
    try {
        listaProductos=pro.getListaProductos();
    } catch (SQLException ex) {
        Logger.getLogger(menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(listaProductos!=null){
       for (String listaProducto : listaProductos) {
           if (listaProducto != null) {
               cbArticulos.addItem(listaProducto);
           }
       }
}
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbTittle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editCliente = new javax.swing.JPanel();
        etPreciosal4 = new javax.swing.JTextField();
        lbId20 = new javax.swing.JLabel();
        btDetalleSv4 = new javax.swing.JButton();
        etNombre5 = new javax.swing.JTextField();
        lbId21 = new javax.swing.JLabel();
        lbId22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        etDes1 = new javax.swing.JTextArea();
        lbId23 = new javax.swing.JLabel();
        cbArticulos1 = new javax.swing.JComboBox<>();
        newCliente = new javax.swing.JPanel();
        etPreciosal3 = new javax.swing.JTextField();
        lbId16 = new javax.swing.JLabel();
        btDetalleSv3 = new javax.swing.JButton();
        etNombre4 = new javax.swing.JTextField();
        lbId14 = new javax.swing.JLabel();
        lbId18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        etDes = new javax.swing.JTextArea();
        etDire = new javax.swing.JTextField();
        lbId19 = new javax.swing.JLabel();
        newDelivery = new javax.swing.JPanel();
        etNombre2 = new javax.swing.JTextField();
        lbId11 = new javax.swing.JLabel();
        etPreciosal2 = new javax.swing.JTextField();
        lbId12 = new javax.swing.JLabel();
        lbId13 = new javax.swing.JLabel();
        etPrecioen2 = new javax.swing.JTextField();
        btDetalleSv2 = new javax.swing.JButton();
        etNombre3 = new javax.swing.JTextField();
        lbId15 = new javax.swing.JLabel();
        newProducto = new javax.swing.JPanel();
        etNombreEP = new javax.swing.JTextField();
        lbId2 = new javax.swing.JLabel();
        etPreciosalEP = new javax.swing.JTextField();
        lbId4 = new javax.swing.JLabel();
        etOpcionesEP = new javax.swing.JTextField();
        lbId9 = new javax.swing.JLabel();
        lbId10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOpcionEP = new javax.swing.JList<>();
        btDeleteOpcion1 = new javax.swing.JButton();
        btAddOpcion1 = new javax.swing.JButton();
        etPrecioenEP = new javax.swing.JTextField();
        btDetalleSv1 = new javax.swing.JButton();
        editProducto = new javax.swing.JPanel();
        etNombre = new javax.swing.JTextField();
        lbId1 = new javax.swing.JLabel();
        etPreciosal = new javax.swing.JTextField();
        lbId3 = new javax.swing.JLabel();
        etOpciones = new javax.swing.JTextField();
        lbId5 = new javax.swing.JLabel();
        lbId6 = new javax.swing.JLabel();
        lbId7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOpcion = new javax.swing.JList<>();
        lbCodigo = new javax.swing.JLabel();
        btDeleteOpcion = new javax.swing.JButton();
        btAddOpcion = new javax.swing.JButton();
        etPrecioen = new javax.swing.JTextField();
        btDetalleSv = new javax.swing.JButton();
        cbArticulos = new javax.swing.JComboBox<>();
        lbId8 = new javax.swing.JLabel();
        btmodped = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbDelivery = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbDelivery1 = new javax.swing.JLabel();
        lbDelivery2 = new javax.swing.JLabel();
        lbDelivery3 = new javax.swing.JLabel();
        lbDelivery4 = new javax.swing.JLabel();
        lbDelivery5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 35, -1, -1));

        lbTittle.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(255, 255, 255));
        lbTittle.setText("Menu Admin");
        jPanel1.add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/84631.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 490, 60));

        editCliente.setBackground(new java.awt.Color(255, 255, 255));
        editCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etPreciosal4.setBackground(new java.awt.Color(255, 255, 255));
        etPreciosal4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPreciosal4.setForeground(new java.awt.Color(0, 0, 0));
        etPreciosal4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPreciosal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPreciosal4ActionPerformed(evt);
            }
        });
        editCliente.add(etPreciosal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        lbId20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId20.setForeground(new java.awt.Color(0, 0, 0));
        lbId20.setText("Telefono:");
        editCliente.add(lbId20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 70, 30));

        btDetalleSv4.setBackground(new java.awt.Color(255, 193, 7));
        btDetalleSv4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDetalleSv4.setForeground(new java.awt.Color(255, 255, 255));
        btDetalleSv4.setText("Guardar");
        btDetalleSv4.setBorder(null);
        btDetalleSv4.setBorderPainted(false);
        btDetalleSv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalleSv4ActionPerformed(evt);
            }
        });
        editCliente.add(btDetalleSv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, 40));

        etNombre5.setBackground(new java.awt.Color(255, 255, 255));
        etNombre5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre5.setForeground(new java.awt.Color(0, 0, 0));
        etNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombre5ActionPerformed(evt);
            }
        });
        editCliente.add(etNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 120, 30));

        lbId21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId21.setForeground(new java.awt.Color(0, 0, 0));
        lbId21.setText("Nombre:");
        editCliente.add(lbId21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 30));

        lbId22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId22.setForeground(new java.awt.Color(0, 0, 0));
        lbId22.setText("Descripción:");
        editCliente.add(lbId22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 80, 30));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setWheelScrollingEnabled(false);

        etDes1.setColumns(20);
        etDes1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDes1.setForeground(new java.awt.Color(0, 0, 0));
        etDes1.setRows(5);
        etDes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDes1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(etDes1);

        editCliente.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 220, 110));

        lbId23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId23.setForeground(new java.awt.Color(0, 0, 0));
        lbId23.setText("Direccion:");
        editCliente.add(lbId23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, 30));

        cbArticulos1.setBackground(new java.awt.Color(255, 255, 255));
        cbArticulos1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbArticulos1.setForeground(new java.awt.Color(0, 0, 0));
        cbArticulos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbArticulos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArticulos1ActionPerformed(evt);
            }
        });
        editCliente.add(cbArticulos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 30));

        jPanel1.add(editCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 890, 510));

        newCliente.setBackground(new java.awt.Color(255, 255, 255));
        newCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etPreciosal3.setBackground(new java.awt.Color(255, 255, 255));
        etPreciosal3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPreciosal3.setForeground(new java.awt.Color(0, 0, 0));
        etPreciosal3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPreciosal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPreciosal3ActionPerformed(evt);
            }
        });
        newCliente.add(etPreciosal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        lbId16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId16.setForeground(new java.awt.Color(0, 0, 0));
        lbId16.setText("Telefono:");
        newCliente.add(lbId16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 70, 30));

        btDetalleSv3.setBackground(new java.awt.Color(255, 193, 7));
        btDetalleSv3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDetalleSv3.setForeground(new java.awt.Color(255, 255, 255));
        btDetalleSv3.setText("Guardar");
        btDetalleSv3.setBorder(null);
        btDetalleSv3.setBorderPainted(false);
        btDetalleSv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalleSv3ActionPerformed(evt);
            }
        });
        newCliente.add(btDetalleSv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, 40));

        etNombre4.setBackground(new java.awt.Color(255, 255, 255));
        etNombre4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre4.setForeground(new java.awt.Color(0, 0, 0));
        etNombre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombre4ActionPerformed(evt);
            }
        });
        newCliente.add(etNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 30));

        lbId14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId14.setForeground(new java.awt.Color(0, 0, 0));
        lbId14.setText("Nombre:");
        newCliente.add(lbId14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 60, 30));

        lbId18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId18.setForeground(new java.awt.Color(0, 0, 0));
        lbId18.setText("Descripción:");
        newCliente.add(lbId18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 80, 30));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setWheelScrollingEnabled(false);

        etDes.setColumns(20);
        etDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDes.setForeground(new java.awt.Color(0, 0, 0));
        etDes.setRows(5);
        etDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDes.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(etDes);

        newCliente.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 220, 110));

        etDire.setBackground(new java.awt.Color(255, 255, 255));
        etDire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDire.setForeground(new java.awt.Color(0, 0, 0));
        etDire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etDire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDireActionPerformed(evt);
            }
        });
        newCliente.add(etDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, 30));

        lbId19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId19.setForeground(new java.awt.Color(0, 0, 0));
        lbId19.setText("Direccion:");
        newCliente.add(lbId19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 60, 30));

        jPanel1.add(newCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 890, 510));

        newDelivery.setBackground(new java.awt.Color(255, 255, 255));
        newDelivery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etNombre2.setBackground(new java.awt.Color(255, 255, 255));
        etNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre2.setForeground(new java.awt.Color(0, 0, 0));
        etNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombre2ActionPerformed(evt);
            }
        });
        newDelivery.add(etNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 30));

        lbId11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId11.setForeground(new java.awt.Color(0, 0, 0));
        lbId11.setText("Primer Nombre:");
        newDelivery.add(lbId11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 30));

        etPreciosal2.setBackground(new java.awt.Color(255, 255, 255));
        etPreciosal2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPreciosal2.setForeground(new java.awt.Color(0, 0, 0));
        etPreciosal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPreciosal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPreciosal2ActionPerformed(evt);
            }
        });
        newDelivery.add(etPreciosal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 30));

        lbId12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId12.setForeground(new java.awt.Color(0, 0, 0));
        lbId12.setText("Telefono:");
        newDelivery.add(lbId12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 70, 30));

        lbId13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId13.setForeground(new java.awt.Color(0, 0, 0));
        lbId13.setText("DNI:");
        newDelivery.add(lbId13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 40, 30));

        etPrecioen2.setBackground(new java.awt.Color(255, 255, 255));
        etPrecioen2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPrecioen2.setForeground(new java.awt.Color(0, 0, 0));
        etPrecioen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPrecioen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPrecioen2ActionPerformed(evt);
            }
        });
        newDelivery.add(etPrecioen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 120, 30));

        btDetalleSv2.setBackground(new java.awt.Color(255, 193, 7));
        btDetalleSv2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDetalleSv2.setForeground(new java.awt.Color(255, 255, 255));
        btDetalleSv2.setText("Guardar");
        btDetalleSv2.setBorder(null);
        btDetalleSv2.setBorderPainted(false);
        btDetalleSv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalleSv2ActionPerformed(evt);
            }
        });
        newDelivery.add(btDetalleSv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 110, 40));

        etNombre3.setBackground(new java.awt.Color(255, 255, 255));
        etNombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre3.setForeground(new java.awt.Color(0, 0, 0));
        etNombre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombre3ActionPerformed(evt);
            }
        });
        newDelivery.add(etNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, 30));

        lbId15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId15.setForeground(new java.awt.Color(0, 0, 0));
        lbId15.setText("Nombre Completo:");
        newDelivery.add(lbId15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jPanel1.add(newDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 890, 510));

        newProducto.setBackground(new java.awt.Color(255, 255, 255));
        newProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etNombreEP.setBackground(new java.awt.Color(255, 255, 255));
        etNombreEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombreEP.setForeground(new java.awt.Color(0, 0, 0));
        etNombreEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombreEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombreEPActionPerformed(evt);
            }
        });
        newProducto.add(etNombreEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 120, 30));

        lbId2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId2.setForeground(new java.awt.Color(0, 0, 0));
        lbId2.setText("Nombre:");
        newProducto.add(lbId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, 30));

        etPreciosalEP.setBackground(new java.awt.Color(255, 255, 255));
        etPreciosalEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPreciosalEP.setForeground(new java.awt.Color(0, 0, 0));
        etPreciosalEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPreciosalEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPreciosalEPActionPerformed(evt);
            }
        });
        newProducto.add(etPreciosalEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 30));

        lbId4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId4.setForeground(new java.awt.Color(0, 0, 0));
        lbId4.setText("Precio Venta:");
        newProducto.add(lbId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 90, 30));

        etOpcionesEP.setBackground(new java.awt.Color(255, 255, 255));
        etOpcionesEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etOpcionesEP.setForeground(new java.awt.Color(0, 0, 0));
        etOpcionesEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etOpcionesEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etOpcionesEPActionPerformed(evt);
            }
        });
        newProducto.add(etOpcionesEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 140, 30));

        lbId9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId9.setForeground(new java.awt.Color(0, 0, 0));
        lbId9.setText("Precio Compra:");
        newProducto.add(lbId9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, 30));

        lbId10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId10.setForeground(new java.awt.Color(0, 0, 0));
        lbId10.setText("Opciones:");
        newProducto.add(lbId10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 60, 30));

        listOpcionEP.setBackground(new java.awt.Color(255, 255, 255));
        listOpcionEP.setForeground(new java.awt.Color(0, 0, 0));
        listOpcionEP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(listOpcionEP);

        newProducto.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 140, 170));

        btDeleteOpcion1.setBackground(new java.awt.Color(255, 193, 7));
        btDeleteOpcion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDeleteOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        btDeleteOpcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        btDeleteOpcion1.setBorder(null);
        btDeleteOpcion1.setBorderPainted(false);
        btDeleteOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteOpcion1ActionPerformed(evt);
            }
        });
        newProducto.add(btDeleteOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 30, 30));

        btAddOpcion1.setBackground(new java.awt.Color(255, 193, 7));
        btAddOpcion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAddOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        btAddOpcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        btAddOpcion1.setBorder(null);
        btAddOpcion1.setBorderPainted(false);
        btAddOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddOpcion1ActionPerformed(evt);
            }
        });
        newProducto.add(btAddOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 30, 30));

        etPrecioenEP.setBackground(new java.awt.Color(255, 255, 255));
        etPrecioenEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPrecioenEP.setForeground(new java.awt.Color(0, 0, 0));
        etPrecioenEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPrecioenEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPrecioenEPActionPerformed(evt);
            }
        });
        newProducto.add(etPrecioenEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 120, 30));

        btDetalleSv1.setBackground(new java.awt.Color(255, 193, 7));
        btDetalleSv1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDetalleSv1.setForeground(new java.awt.Color(255, 255, 255));
        btDetalleSv1.setText("Guardar");
        btDetalleSv1.setBorder(null);
        btDetalleSv1.setBorderPainted(false);
        btDetalleSv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalleSv1ActionPerformed(evt);
            }
        });
        newProducto.add(btDetalleSv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 110, 40));

        jPanel1.add(newProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 890, 510));

        editProducto.setBackground(new java.awt.Color(255, 255, 255));
        editProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etNombre.setBackground(new java.awt.Color(255, 255, 255));
        etNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etNombre.setForeground(new java.awt.Color(0, 0, 0));
        etNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombreActionPerformed(evt);
            }
        });
        editProducto.add(etNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 120, 30));

        lbId1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId1.setForeground(new java.awt.Color(0, 0, 0));
        lbId1.setText("Nombre:");
        editProducto.add(lbId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 30));

        etPreciosal.setBackground(new java.awt.Color(255, 255, 255));
        etPreciosal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPreciosal.setForeground(new java.awt.Color(0, 0, 0));
        etPreciosal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPreciosal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPreciosalActionPerformed(evt);
            }
        });
        editProducto.add(etPreciosal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 120, 30));

        lbId3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId3.setForeground(new java.awt.Color(0, 0, 0));
        lbId3.setText("Precio Venta:");
        editProducto.add(lbId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 90, 30));

        etOpciones.setBackground(new java.awt.Color(255, 255, 255));
        etOpciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etOpciones.setForeground(new java.awt.Color(0, 0, 0));
        etOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etOpcionesActionPerformed(evt);
            }
        });
        editProducto.add(etOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 140, 30));

        lbId5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId5.setForeground(new java.awt.Color(0, 0, 0));
        lbId5.setText("Precio Compra:");
        editProducto.add(lbId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, 30));

        lbId6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId6.setForeground(new java.awt.Color(0, 0, 0));
        lbId6.setText("Opciones:");
        editProducto.add(lbId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 60, 30));

        lbId7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId7.setForeground(new java.awt.Color(0, 0, 0));
        lbId7.setText("Codigo:");
        editProducto.add(lbId7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 60, 30));

        listOpcion.setBackground(new java.awt.Color(255, 255, 255));
        listOpcion.setForeground(new java.awt.Color(0, 0, 0));
        listOpcion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listOpcion);

        editProducto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 140, 170));

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lbCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editProducto.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 30));

        btDeleteOpcion.setBackground(new java.awt.Color(255, 193, 7));
        btDeleteOpcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDeleteOpcion.setForeground(new java.awt.Color(255, 255, 255));
        btDeleteOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        btDeleteOpcion.setBorder(null);
        btDeleteOpcion.setBorderPainted(false);
        btDeleteOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteOpcionActionPerformed(evt);
            }
        });
        editProducto.add(btDeleteOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 30, 30));

        btAddOpcion.setBackground(new java.awt.Color(255, 193, 7));
        btAddOpcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAddOpcion.setForeground(new java.awt.Color(255, 255, 255));
        btAddOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        btAddOpcion.setBorder(null);
        btAddOpcion.setBorderPainted(false);
        btAddOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddOpcionActionPerformed(evt);
            }
        });
        editProducto.add(btAddOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 30, 30));

        etPrecioen.setBackground(new java.awt.Color(255, 255, 255));
        etPrecioen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etPrecioen.setForeground(new java.awt.Color(0, 0, 0));
        etPrecioen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etPrecioen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPrecioenActionPerformed(evt);
            }
        });
        editProducto.add(etPrecioen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 30));

        btDetalleSv.setBackground(new java.awt.Color(255, 193, 7));
        btDetalleSv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDetalleSv.setForeground(new java.awt.Color(255, 255, 255));
        btDetalleSv.setText("Guardar");
        btDetalleSv.setBorder(null);
        btDetalleSv.setBorderPainted(false);
        btDetalleSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalleSvActionPerformed(evt);
            }
        });
        editProducto.add(btDetalleSv, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 110, 40));

        cbArticulos.setBackground(new java.awt.Color(255, 255, 255));
        cbArticulos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbArticulos.setForeground(new java.awt.Color(0, 0, 0));
        cbArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArticulosActionPerformed(evt);
            }
        });
        editProducto.add(cbArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 30));

        lbId8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbId8.setForeground(new java.awt.Color(0, 0, 0));
        lbId8.setText("Lista de Articulos:");
        editProducto.add(lbId8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, 30));

        jPanel1.add(editProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 890, 510));

        btmodped.setBackground(new java.awt.Color(255, 193, 7));
        btmodped.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btmodped.setForeground(new java.awt.Color(255, 255, 255));
        btmodped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Back To_32px.png"))); // NOI18N
        btmodped.setBorder(null);
        btmodped.setBorderPainted(false);
        btmodped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodpedActionPerformed(evt);
            }
        });
        jPanel1.add(btmodped, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 50, 40));

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
        jLabel4.setText("Historial de Ventas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 240, 10));

        lbDelivery.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery.setText("Información");
        jPanel2.add(lbDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/question2.png"))); // NOI18N
        jLabel11.setText("¿Alguna Pregunta? Haz Click Aqui");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 240, 30));

        lbDelivery1.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery1.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery1.setText("Información");
        jPanel2.add(lbDelivery1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        lbDelivery2.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery2.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery2.setText("Información");
        jPanel2.add(lbDelivery2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        lbDelivery3.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery3.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery3.setText("Información");
        jPanel2.add(lbDelivery3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        lbDelivery4.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery4.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery4.setText("Información");
        jPanel2.add(lbDelivery4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        lbDelivery5.setBackground(new java.awt.Color(255, 255, 255));
        lbDelivery5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDelivery5.setForeground(new java.awt.Color(255, 255, 255));
        lbDelivery5.setText("Información");
        jPanel2.add(lbDelivery5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 350, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 790));

        jMenuBar1.setBackground(new java.awt.Color(0, 121, 107));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(251, 30));

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("            ProFood           ");
        jMenu2.setFocusable(false);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jMenu2.setOpaque(false);
        jMenu2.setRequestFocusEnabled(false);
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 121, 107));
        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("  Archivo  ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("Historial de Cajas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 121, 107));
        jMenu4.setBorder(null);
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Nuevo");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setText("Nuevo Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setText("Nuevo Producto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setText("Nuevo Usuario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem7.setText("Nuevo Delivery");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 121, 107));
        jMenu5.setBorder(null);
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("   Editar   ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setText("Editar Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem10.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem10.setText("Editar Producto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem11.setText("Editar Usuario");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem12.setText("Editar Delivery");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
lbTittle.setText("Nuevo Cliente");
 newDelivery.setVisible(false);
//editDelivery.setVisible(false);
newProducto.setVisible(false);
editProducto.setVisible(false);
newCliente.setVisible(true);
editCliente.setVisible(false);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
lbTittle.setText("Nuevo Producto");     
newDelivery.setVisible(false);
//editDelivery.setVisible(false);
newProducto.setVisible(true);
editProducto.setVisible(false);
newCliente.setVisible(false);
editCliente.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
   lbTittle.setText("Nuevo Delivery");
newDelivery.setVisible(true);
//editDelivery.setVisible(false);
newProducto.setVisible(false);
editProducto.setVisible(false);
newCliente.setVisible(false);
editCliente.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       lbTittle.setText("Editar Cliente");
newDelivery.setVisible(false);
//editDelivery.setVisible(false);
newProducto.setVisible(false);
editProducto.setVisible(false);
newCliente.setVisible(false);
editCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
lbTittle.setText("Editar Articulo");
newDelivery.setVisible(false);
//editDelivery.setVisible(false);
newProducto.setVisible(false);
editProducto.setVisible(true);
newCliente.setVisible(false);
editCliente.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         lbTittle.setText("Editar Delivery");
newDelivery.setVisible(true);
//editDelivery.setVisible(false);
newProducto.setVisible(false);
editProducto.setVisible(false);
newCliente.setVisible(false);
editCliente.setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void btmodpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodpedActionPerformed
        int n= JOptionPane.showConfirmDialog(
            null,
            "¿Estas seguro que quieres salir del sistema?",
            "ATENCIÓN",
            JOptionPane.YES_NO_OPTION);

        if(n==0){
            System.exit(0);

        }
    }//GEN-LAST:event_btmodpedActionPerformed

    private void etPrecioenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPrecioenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etPrecioenActionPerformed

    private void btAddOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddOpcionActionPerformed
        String newopcion=  etOpciones.getText().toString();

        opcionl.addElement(newopcion);

    }//GEN-LAST:event_btAddOpcionActionPerformed

    private void btDeleteOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteOpcionActionPerformed

        int posicion = listOpcion.getSelectedIndex();
        if (posicion >= 0) {
            opcionl.removeElementAt(posicion);
        }
    }//GEN-LAST:event_btDeleteOpcionActionPerformed

    private void etOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etOpcionesActionPerformed

    }//GEN-LAST:event_etOpcionesActionPerformed

    private void etPreciosalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPreciosalActionPerformed

    }//GEN-LAST:event_etPreciosalActionPerformed

    private void etNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombreActionPerformed

    }//GEN-LAST:event_etNombreActionPerformed

    private void btDetalleSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSvActionPerformed
    
    Articulo=etNombre.getText();
    Codigo=Integer.parseInt(lbCodigo.getText());
    Precioen=Integer.parseInt(etPrecioen.getText());
    Preciosal=Integer.parseInt(etPreciosal.getText());    
    Opciones = new String[opcionl.getSize()];
    
for(int i = 0; i<opcionl.getSize();i++){
    
    if ( (opcionl.elementAt(i) != null) && (!opcionl.elementAt(i).equals("")) ) {
        
        Opciones[i]=(String) opcionl.elementAt(i);}} 
    
    try {
        pro.updateProducto(Codigo,Articulo,Precioen,Preciosal,Opciones);
    } catch (SQLException ex) {
        Logger.getLogger(menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btDetalleSvActionPerformed

    private void cbArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArticulosActionPerformed

        limpiarEditProducto();
         Articulo=cbArticulos.getSelectedItem().toString();
        
    try {pro.setDetalleProductos(Articulo);
         Opciones=pro.getOption(Articulo);
    } catch (SQLException ex) {
        Logger.getLogger(menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    Codigo=pro.getCodigo();
    Precioen=pro.getPrecioen();
    Preciosal=pro.getPreciosal();
    
 
    etNombre.setText(Articulo);
    etPrecioen.setText(String.valueOf(Precioen));
    etPreciosal.setText(String.valueOf(Preciosal));
    lbCodigo.setText("000"+String.valueOf(Codigo));
   
    if(Opciones!=null){
    for(int i=0;i<Opciones.length;i++){
       
        if(Opciones[i]!=null){
    opcionl.addElement(Opciones[i]);
        }
    }}
    }//GEN-LAST:event_cbArticulosActionPerformed

    private void btDetalleSv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSv1ActionPerformed
   
    Articulo = etNombreEP.getText();
    Precioen = Integer.parseInt(etPrecioenEP.getText());
    Preciosal = Integer.parseInt(etPreciosalEP.getText());
    Opciones = new String[opcionEP.getSize()];
    
    for(int i = 0; i<opcionEP.getSize();i++){
    
         if ( (opcionEP.elementAt(i) != null) && (!opcionEP.elementAt(i).equals("")) ) {
             
               Opciones[i]=(String) opcionEP.elementAt(i);}}
    try {
        pro.newProducto(Articulo,Precioen,Preciosal,Opciones);
    } catch (SQLException ex) {
        Logger.getLogger(menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btDetalleSv1ActionPerformed

    private void etPrecioenEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPrecioenEPActionPerformed

    }//GEN-LAST:event_etPrecioenEPActionPerformed

    private void btAddOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddOpcion1ActionPerformed
        String newopcion=  etOpcionesEP.getText().toString();

        opcionEP.addElement(newopcion);
    }//GEN-LAST:event_btAddOpcion1ActionPerformed

    private void btDeleteOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteOpcion1ActionPerformed
        int posicion = listOpcionEP.getSelectedIndex();
        
        if (posicion >= 0) {
            opcionEP.removeElementAt(posicion);
        }

    }//GEN-LAST:event_btDeleteOpcion1ActionPerformed

    private void etOpcionesEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etOpcionesEPActionPerformed
       
    }//GEN-LAST:event_etOpcionesEPActionPerformed

    private void etPreciosalEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPreciosalEPActionPerformed
        
    }//GEN-LAST:event_etPreciosalEPActionPerformed

    private void etNombreEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombreEPActionPerformed
       
    }//GEN-LAST:event_etNombreEPActionPerformed

    private void etNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombre2ActionPerformed
     
    }//GEN-LAST:event_etNombre2ActionPerformed

    private void etPreciosal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPreciosal2ActionPerformed

    }//GEN-LAST:event_etPreciosal2ActionPerformed

    private void etPrecioen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPrecioen2ActionPerformed

    }//GEN-LAST:event_etPrecioen2ActionPerformed

    private void btDetalleSv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSv2ActionPerformed

    }//GEN-LAST:event_btDetalleSv2ActionPerformed

    private void btDetalleSv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSv3ActionPerformed

    }//GEN-LAST:event_btDetalleSv3ActionPerformed

    private void etNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombre4ActionPerformed

    }//GEN-LAST:event_etNombre4ActionPerformed

    private void etDireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDireActionPerformed

    }//GEN-LAST:event_etDireActionPerformed

    private void etPreciosal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPreciosal3ActionPerformed

    }//GEN-LAST:event_etPreciosal3ActionPerformed

    private void etPreciosal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPreciosal4ActionPerformed

    }//GEN-LAST:event_etPreciosal4ActionPerformed

    private void btDetalleSv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSv4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDetalleSv4ActionPerformed

    private void etNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNombre5ActionPerformed

    private void etNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNombre3ActionPerformed

    private void cbArticulos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArticulos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbArticulos1ActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddOpcion;
    private javax.swing.JButton btAddOpcion1;
    private javax.swing.JButton btDeleteOpcion;
    private javax.swing.JButton btDeleteOpcion1;
    private javax.swing.JButton btDetalleSv;
    private javax.swing.JButton btDetalleSv1;
    private javax.swing.JButton btDetalleSv2;
    private javax.swing.JButton btDetalleSv3;
    private javax.swing.JButton btDetalleSv4;
    private javax.swing.JButton btmodped;
    private javax.swing.JComboBox<String> cbArticulos;
    private javax.swing.JComboBox<String> cbArticulos1;
    private javax.swing.JPanel editCliente;
    private javax.swing.JPanel editProducto;
    private javax.swing.JTextArea etDes;
    private javax.swing.JTextArea etDes1;
    private javax.swing.JTextField etDire;
    private javax.swing.JTextField etNombre;
    private javax.swing.JTextField etNombre2;
    private javax.swing.JTextField etNombre3;
    private javax.swing.JTextField etNombre4;
    private javax.swing.JTextField etNombre5;
    private javax.swing.JTextField etNombreEP;
    private javax.swing.JTextField etOpciones;
    private javax.swing.JTextField etOpcionesEP;
    private javax.swing.JTextField etPrecioen;
    private javax.swing.JTextField etPrecioen2;
    private javax.swing.JTextField etPrecioenEP;
    private javax.swing.JTextField etPreciosal;
    private javax.swing.JTextField etPreciosal2;
    private javax.swing.JTextField etPreciosal3;
    private javax.swing.JTextField etPreciosal4;
    private javax.swing.JTextField etPreciosalEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDelivery;
    private javax.swing.JLabel lbDelivery1;
    private javax.swing.JLabel lbDelivery2;
    private javax.swing.JLabel lbDelivery3;
    private javax.swing.JLabel lbDelivery4;
    private javax.swing.JLabel lbDelivery5;
    private javax.swing.JLabel lbId1;
    private javax.swing.JLabel lbId10;
    private javax.swing.JLabel lbId11;
    private javax.swing.JLabel lbId12;
    private javax.swing.JLabel lbId13;
    private javax.swing.JLabel lbId14;
    private javax.swing.JLabel lbId15;
    private javax.swing.JLabel lbId16;
    private javax.swing.JLabel lbId18;
    private javax.swing.JLabel lbId19;
    private javax.swing.JLabel lbId2;
    private javax.swing.JLabel lbId20;
    private javax.swing.JLabel lbId21;
    private javax.swing.JLabel lbId22;
    private javax.swing.JLabel lbId23;
    private javax.swing.JLabel lbId3;
    private javax.swing.JLabel lbId4;
    private javax.swing.JLabel lbId5;
    private javax.swing.JLabel lbId6;
    private javax.swing.JLabel lbId7;
    private javax.swing.JLabel lbId8;
    private javax.swing.JLabel lbId9;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JList<String> listOpcion;
    private javax.swing.JList<String> listOpcionEP;
    private javax.swing.JPanel newCliente;
    private javax.swing.JPanel newDelivery;
    private javax.swing.JPanel newProducto;
    // End of variables declaration//GEN-END:variables

  
}
