package profood;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class pmaker extends javax.swing.JFrame {

    public pmaker() throws SQLException {
        initComponents();

        listap();

        pdetalle.setVisible(false);

        confTablas();

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
            java.util.logging.Logger.getLogger(pmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pmaker().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //variables
    Double importetotal=0.0, importe;
    String[] datos = new String[5];
    String preciototal,articulosv, preciosv, codigosv;
    int Contador, cposicion, recargo, idPedido, cantidadproductos;
    Double porcentaje = 0.0;
    Boolean nuevo;
    Double totalFinal;
    DefaultTableModel modelo2 = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {

            return false;

        }
    };
    String [] opciones ;
    //Metodos
    void setDetalle() {
        importe = 0.0;
        importetotal=0.0;
        cantidadproductos=0;
        
        if (modelo2.getRowCount() > 0) {

            for (int i = 0; i < modelo2.getRowCount(); i++) {

                importe += Integer.parseInt(modelo2.getValueAt(i, 4).toString());
                importetotal += Integer.parseInt(modelo2.getValueAt(i, 4).toString());
                cantidadproductos++;
            }
        }
        lbBruto.setText("$" + importetotal);
        importe = importetotal - (importetotal * porcentaje);
        totalFinal=importe + recargo;
        lbTotal.setText("$" + String.valueOf(totalFinal));
        lbDescuento.setText("$" + String.valueOf(importe * porcentaje));
    }

    void getDescuento() {

        String descuento = (String) cbdescuento.getSelectedItem();

        switch (descuento) {

            case "Clarin 365":
                porcentaje = 0.20;
                break;

            case "Al Costo":
                porcentaje = 0.40;
                break;
            case "Ninguno":
                porcentaje =0.0;
                break;

        }

    }

    void confTablas() {
        TableColumnModel columnModel = tProductos.getColumnModel();
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);

        columnModel.getColumn(0).setPreferredWidth(1);
        columnModel.getColumn(0).setCellRenderer(tcr);
        columnModel.getColumn(0).setResizable(false);

        columnModel.getColumn(1).setPreferredWidth(180);
        //columnModel.getColumn(0).setCellRenderer(tcr);
        columnModel.getColumn(1).setResizable(false);

        columnModel.getColumn(2).setPreferredWidth(5);
        columnModel.getColumn(2).setCellRenderer(tcr);
        columnModel.getColumn(2).setResizable(false);

        tProductos.setColumnModel(columnModel);

        //Lista carrito
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Articulo");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Opcion");
        modelo2.addColumn("Precio");

        tcarrito.setModel(modelo2);

        TableColumnModel columnModel2 = tcarrito.getColumnModel();
        DefaultTableCellRenderer tcr2 = new DefaultTableCellRenderer();
        tcr2.setHorizontalAlignment(SwingConstants.CENTER);

        columnModel2.getColumn(0).setPreferredWidth(5);
        columnModel2.getColumn(0).setCellRenderer(tcr2);
        columnModel2.getColumn(0).setResizable(false);

        columnModel2.getColumn(1).setPreferredWidth(150);

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

        tcarrito.setColumnModel(columnModel2);
    }

    void listap() throws SQLException {
        Pedidos p1 = new Pedidos();
        String SQL = "SELECT  id_producto AS Codigo, articulo AS Articulo, precio_sal AS Precio "
                + "FROM productos";
        p1.llenarTabla(tProductos, SQL);

    }

    void carrito(String codigo, String articulo, String cantidad, String opcion, String precio) {
        datos[0] = codigo;
        datos[1] = articulo;
        datos[2] = cantidad;
        datos[3] = opcion;
        datos[4] = precio;

        modelo2.addRow(datos);

    }

    void tipoPedido() {
        String tipo = bxtipo.getSelectedItem().toString();
        findCliente fc = new findCliente();

        if (tipo.equals("Delivery")) {
            fc.setVisible(true);

        } else {
        }
    }

    void getD_pedido() throws SQLException {

        for (int i = 0; i <= Contador - 1; i++) {

            modelo2.getValueAt(i, 0);
            int Cantidad
                    = Integer.parseInt(modelo2.getValueAt(i, 1).toString());
            modelo2.getValueAt(i, 2);

        }
    }
    
    void savePedido() {
        Pedidos pd = new Pedidos();

        Double importe = this.totalFinal;
        Double pagacon = Double.parseDouble(etPagacon.getText());
     
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.YEAR) + "-" + cal.get(cal.MONTH) + "-" + cal.get(cal.DATE);
        String hora = cal.get(cal.HOUR) + ":" + cal.get(cal.MINUTE);
       
                
                

        try {

            idPedido = pd.newPedido(1, fecha, hora, "Confirmado", importe, pagacon);

            for (int i = 0; i < tcarrito.getRowCount(); i++) {

                int Cantidad = Integer.parseInt(tcarrito.getValueAt(i, 2).toString());
                int idProducto = Integer.parseInt(tcarrito.getValueAt(i, 0).toString());
                String Opcion = tcarrito.getValueAt(i, 3).toString();
                pd.newD_Pedido(idPedido, idProducto, Cantidad,Opcion);

            }

        } catch (SQLException ex) {
            Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void limpiarDetalle(){ 
        spinnercan.setValue(((SpinnerNumberModel) spinnercan.getModel()).getMinimum());
        pdetalle.setVisible(false);
    bxopcion.removeAllItems();
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pdetalle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btDetalleSv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnercan = new javax.swing.JSpinner();
        bxopcion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbDetalleProducto = new javax.swing.JLabel();
        pcentral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        btmodped = new javax.swing.JButton();
        btcanped = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tcarrito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btMakerSv = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbdescuento = new javax.swing.JComboBox<>();
        bxtipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        etPagacon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbCambio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbTotal1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lbBruto = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbRecargo = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btMakerSv1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1370, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pdetalle.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

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
        pdetalle.add(btDetalleSv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Opcion");
        jLabel2.setEnabled(false);
        pdetalle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");
        pdetalle.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        spinnercan.setModel(new javax.swing.SpinnerNumberModel(1, 1, 299, 1));
        spinnercan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        spinnercan.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pdetalle.add(spinnercan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 20));

        bxopcion.setBackground(new java.awt.Color(255, 255, 255));
        bxopcion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        bxopcion.setForeground(new java.awt.Color(0, 0, 0));
        bxopcion.setEnabled(false);
        bxopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxopcionActionPerformed(evt);
            }
        });
        pdetalle.add(bxopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 70, -1));

        jPanel4.setBackground(new java.awt.Color(0, 121, 107));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Articulo: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 12, -1, -1));

        lbDetalleProducto.setBackground(new java.awt.Color(255, 255, 255));
        lbDetalleProducto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbDetalleProducto.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalleProducto.setText("Empanada de Carne Suave");
        jPanel4.add(lbDetalleProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 23, -1, -1));

        pdetalle.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 60));

        getContentPane().add(pdetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 270));

        pcentral.setBackground(new java.awt.Color(255, 255, 255));
        pcentral.setPreferredSize(new java.awt.Dimension(1370, 770));
        pcentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tProductos.setAutoCreateRowSorter(true);
        tProductos.setBackground(new java.awt.Color(255, 255, 255));
        tProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tProductos.setForeground(new java.awt.Color(0, 0, 0));
        tProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tProductos.setRowHeight(30);
        tProductos.setSelectionBackground(new java.awt.Color(0, 150, 136));
        tProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tProductos.getTableHeader().setResizingAllowed(false);
        tProductos.getTableHeader().setReorderingAllowed(false);
        tProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tProductos);

        pcentral.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 370, 510));
        pcentral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 35, -1, -1));

        btmodped.setBackground(new java.awt.Color(255, 193, 7));
        btmodped.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btmodped.setForeground(new java.awt.Color(255, 255, 255));
        btmodped.setText("Mod. Articulo");
        btmodped.setBorder(null);
        btmodped.setBorderPainted(false);
        btmodped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodpedActionPerformed(evt);
            }
        });
        pcentral.add(btmodped, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 110, 40));

        btcanped.setBackground(new java.awt.Color(255, 193, 7));
        btcanped.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btcanped.setForeground(new java.awt.Color(255, 255, 255));
        btcanped.setText("Eliminar Articulo");
        btcanped.setBorder(null);
        btcanped.setBorderPainted(false);
        btcanped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcanpedActionPerformed(evt);
            }
        });
        pcentral.add(btcanped, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 110, 40));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        tcarrito.setAutoCreateRowSorter(true);
        tcarrito.setBackground(new java.awt.Color(255, 255, 255));
        tcarrito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tcarrito.setForeground(new java.awt.Color(0, 0, 0));
        tcarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tcarrito.setGridColor(new java.awt.Color(255, 255, 255));
        tcarrito.setRowHeight(30);
        tcarrito.setSelectionBackground(new java.awt.Color(0, 150, 136));
        tcarrito.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tcarrito.getTableHeader().setResizingAllowed(false);
        tcarrito.getTableHeader().setReorderingAllowed(false);
        tcarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcarritoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tcarrito);

        pcentral.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 500, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/exit black.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        pcentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 121, 107));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ProFood ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 600, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 600, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        pcentral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1390, -1));

        jPanel2.setBackground(new java.awt.Color(0, 150, 136));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btMakerSv.setBackground(new java.awt.Color(255, 193, 7));
        btMakerSv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btMakerSv.setForeground(new java.awt.Color(255, 255, 255));
        btMakerSv.setText("Guardar");
        btMakerSv.setBorder(null);
        btMakerSv.setBorderPainted(false);
        btMakerSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMakerSvActionPerformed(evt);
            }
        });
        jPanel2.add(btMakerSv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 110, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Importe Bruto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descuento");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        cbdescuento.setBackground(new java.awt.Color(255, 255, 255));
        cbdescuento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbdescuento.setForeground(new java.awt.Color(0, 0, 0));
        cbdescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Clarin 365", "Al Costo" }));
        cbdescuento.setMinimumSize(new java.awt.Dimension(91, 25));
        cbdescuento.setPreferredSize(new java.awt.Dimension(93, 25));
        cbdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdescuentoActionPerformed(evt);
            }
        });
        jPanel2.add(cbdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        bxtipo.setBackground(new java.awt.Color(255, 255, 255));
        bxtipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bxtipo.setForeground(new java.awt.Color(0, 0, 0));
        bxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Delivery", "Mostrador" }));
        bxtipo.setMinimumSize(new java.awt.Dimension(93, 25));
        bxtipo.setPreferredSize(new java.awt.Dimension(93, 25));
        bxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxtipoActionPerformed(evt);
            }
        });
        jPanel2.add(bxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Categoria");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        etPagacon.setBackground(new java.awt.Color(255, 255, 255));
        etPagacon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etPagacon.setForeground(new java.awt.Color(0, 0, 0));
        etPagacon.setText("0");
        etPagacon.setBorder(null);
        etPagacon.setPreferredSize(new java.awt.Dimension(93, 25));
        etPagacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPagaconActionPerformed(evt);
            }
        });
        etPagacon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etPagaconKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                etPagaconKeyTyped(evt);
            }
        });
        jPanel2.add(etPagacon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 50, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Abona con:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, 20));

        lbCambio.setBackground(new java.awt.Color(255, 255, 255));
        lbCambio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCambio.setForeground(new java.awt.Color(255, 255, 255));
        lbCambio.setText("$0.0");
        jPanel2.add(lbCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 70, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cambio:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, 20));

        lbTotal.setBackground(new java.awt.Color(255, 255, 255));
        lbTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setText("$0");
        jPanel2.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 70, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Detalle");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 30));

        lbTotal1.setBackground(new java.awt.Color(255, 255, 255));
        lbTotal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotal1.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal1.setText("Recargo:");
        jPanel2.add(lbTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 70, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 197, 174));
        jSeparator2.setForeground(new java.awt.Color(0, 197, 174));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 170, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 197, 174));
        jSeparator3.setForeground(new java.awt.Color(0, 197, 174));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 10));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total a Pagar");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 20));

        setDetalle();
        lbBruto.setBackground(new java.awt.Color(255, 255, 255));
        lbBruto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBruto.setForeground(new java.awt.Color(255, 255, 255));
        lbBruto.setText("$0.0");
        jPanel2.add(lbBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 70, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 197, 174));
        jSeparator4.setForeground(new java.awt.Color(0, 197, 174));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, 10));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Descuento");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        lbDescuento.setBackground(new java.awt.Color(255, 255, 255));
        lbDescuento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDescuento.setForeground(new java.awt.Color(255, 255, 255));
        lbDescuento.setText("$0.0");
        jPanel2.add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 70, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 197, 174));
        jSeparator5.setForeground(new java.awt.Color(0, 197, 174));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 250, 10));

        lbRecargo.setBackground(new java.awt.Color(255, 255, 255));
        lbRecargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRecargo.setForeground(new java.awt.Color(255, 255, 255));
        lbRecargo.setText("$0.0");
        jPanel2.add(lbRecargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 30, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 197, 174));
        jSeparator6.setForeground(new java.awt.Color(0, 197, 174));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 170, 10));

        btMakerSv1.setBackground(new java.awt.Color(255, 193, 7));
        btMakerSv1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btMakerSv1.setForeground(new java.awt.Color(255, 255, 255));
        btMakerSv1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Back To_32px.png"))); // NOI18N
        btMakerSv1.setBorder(null);
        btMakerSv1.setBorderPainted(false);
        btMakerSv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMakerSv1ActionPerformed(evt);
            }
        });
        jPanel2.add(btMakerSv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 50, 40));

        pcentral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 300, 710));

        getContentPane().add(pcentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bxopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxopcionActionPerformed

  
    }//GEN-LAST:event_bxopcionActionPerformed
    
    private void btDetalleSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalleSvActionPerformed

        String opcionsv = bxopcion.getSelectedItem().toString();

        int precio = Integer.parseInt(preciosv);

        String cantidadsv = spinnercan.getValue().toString();

        int cantidad = Integer.parseInt(cantidadsv);

        preciototal = String.valueOf(precio * cantidad);

        if (nuevo == true) {

            Boolean existe = false;
            for (int i = 0; i < tcarrito.getRowCount(); i++) {

                if (tcarrito.getValueAt(i, 0) == codigosv && tcarrito.getValueAt(i, 3).equals(opcionsv)) {
   
       
                    
                    int totalcan = Integer.parseInt(tcarrito.getValueAt(i, 2).toString()) + Integer.parseInt(cantidadsv);

                    int preciou = Integer.parseInt(tcarrito.getValueAt(i, 4).toString()) / Integer.parseInt(tcarrito.getValueAt(i, 2).toString());

                    tcarrito.setValueAt(totalcan, i, 2);
                    tcarrito.setValueAt(totalcan * preciou, i, 4);

                    existe = true;
                }
            }

            if (existe == false) {
                carrito(codigosv, articulosv, cantidadsv, opcionsv, preciototal);
            }

        } else if (nuevo == false) {
cposicion = tcarrito.getSelectedRow();
            tcarrito.setValueAt(articulosv, cposicion, 1);
            tcarrito.setValueAt(cantidadsv, cposicion, 2);
            tcarrito.setValueAt(opcionsv, cposicion, 3);
            tcarrito.setValueAt(preciototal, cposicion, 4);
        }
        limpiarDetalle();
      
        Contador++;
        //pm.setVisible(false);

        
        setDetalle();

    }//GEN-LAST:event_btDetalleSvActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        pdetalle.setVisible(false);
        limpiarDetalle();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btMakerSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMakerSvActionPerformed

        String tipo = bxtipo.getSelectedItem().toString();
        ClienteMNew cm= new ClienteMNew();
        findCliente fc = new findCliente();
if(cantidadproductos>0){
    if(Double.parseDouble(etPagacon.getText())<importe){etPagacon.setText(String.valueOf(totalFinal));}
    
    
        if (tipo.equals("Delivery")) {
            savePedido();

            fc.setVisible(true);
            fc.setIdPedido(idPedido);

        }else if(tipo.equals("Mostrador")){

            cm.setVisible(true);
            cm.setIdPedido(idPedido);} else {JOptionPane.showMessageDialog(null, "Debes seleccionar una categoria antes de continuar");
            
           

        }}else{JOptionPane.showMessageDialog(null, "Debes seleccionar almenos un producto, antes de continuar");}


    }//GEN-LAST:event_btMakerSvActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int n = JOptionPane.showConfirmDialog(
                null,
                "¿Estas seguro que quieres salir del sistema?",
                "ATENCIÓN",
                JOptionPane.YES_NO_OPTION);

        if (n == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btcanpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcanpedActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tcarrito.getModel();
        
         int posicion = tcarrito.getSelectedRow();

   

        //CODIGO ERROR
        if (posicion >= 0) {
        dtm.removeRow(tcarrito.getSelectedRow());
        }
        tcarrito.setModel(dtm);
setDetalle();

    }//GEN-LAST:event_btcanpedActionPerformed

    private void btmodpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodpedActionPerformed
        nuevo = false;
        
        int posicion = tcarrito.getSelectedRow();

        //CODIGO ERROR
        if (posicion >= 0) {

            codigosv = tcarrito.getValueAt(posicion, 0).toString();
            String articulo = tcarrito.getValueAt(posicion, 1).toString();

            String cantidad = tcarrito.getValueAt(posicion, 2).toString();

            String opcion = tcarrito.getValueAt(posicion, 3).toString();
            
            int precio = Integer.parseInt(tcarrito.getValueAt(posicion, 4).toString()) / Integer.parseInt(tcarrito.getValueAt(posicion, 2).toString());

            pdetalle.setVisible(true);
            lbDetalleProducto.setText(articulo);
            spinnercan.setValue(Integer.parseInt(cantidad));
            bxopcion.setSelectedItem(opcion);
            articulosv = articulo;
            preciosv = String.valueOf(precio);
            
       try {
            opciones = pro.getOption(articulosv);
        if(opciones!=null){
            for(int i=0;i<opciones.length;i++){
   
        if(opciones[i]!=null){
       
        bxopcion.addItem(opciones[i]);}

        bxopcion.setEnabled(true);
        jLabel2.setEnabled(true);
  }}else{bxopcion.setEnabled(false);jLabel2.setEnabled(true); bxopcion.addItem("No Aplica");}
        } catch (SQLException ex) {
            Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            

        }
    }//GEN-LAST:event_btmodpedActionPerformed
Productos pro = new Productos();
    private void tProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMouseClicked
    limpiarDetalle();
    nuevo = true;
    
        int posicion = tProductos.getSelectedRow();
        
        if (posicion >= 0) {

            String codigo = tProductos.getValueAt(posicion, 0).toString();
            String articulo = tProductos.getValueAt(posicion, 1).toString();
            String precio = tProductos.getValueAt(posicion, 2).toString();
            codigosv = codigo;
            articulosv = articulo;
            preciosv = precio;
            //MANDAR ARTIUCLO Y PRECIO

            pdetalle.setVisible(true);
            lbDetalleProducto.setText(articulosv);
        }
        
        
          
        
        try {
            
            opciones = pro.getOption(articulosv);
 if(opciones!=null){
            for(int i=0;i<opciones.length;i++){
   
        if(opciones[i]!=null){
       
        bxopcion.addItem(opciones[i]);}

        bxopcion.setEnabled(true);
        jLabel2.setEnabled(true);
  }}else{bxopcion.setEnabled(false);jLabel2.setEnabled(true); bxopcion.addItem("No Aplica");}
        } catch (SQLException ex) {
            Logger.getLogger(pmaker.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_tProductosMouseClicked

    private void cbdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdescuentoActionPerformed

        getDescuento();
        setDetalle();
    }//GEN-LAST:event_cbdescuentoActionPerformed
   
    private void bxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxtipoActionPerformed

        if ("Delivery".equals(bxtipo.getSelectedItem().toString())) {
            recargo = 20;

        } else {
            recargo = 0;
        }

        lbRecargo.setText(String.valueOf("$"+recargo));
        setDetalle();
    }//GEN-LAST:event_bxtipoActionPerformed

    private void etPagaconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etPagaconKeyPressed
if ( (etPagacon.getText() != null) && (!etPagacon.getText().equals("")) ) {

            if (Double.parseDouble(etPagacon.getText()) >= importe) {
                lbCambio.setText("$" + String.valueOf(Double.parseDouble(etPagacon.getText()) - totalFinal));
            } else {
                lbCambio.setText("$0");
            }

            setDetalle();}
    }//GEN-LAST:event_etPagaconKeyPressed
    
    private void etPagaconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etPagaconKeyTyped
        char Value = evt.getKeyChar();

        if (Character.isLetter(Value)) {

            evt.consume();
        }


        
    }//GEN-LAST:event_etPagaconKeyTyped

    private void tcarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcarritoMouseClicked

        

    }//GEN-LAST:event_tcarritoMouseClicked

    private void etPagaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPagaconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etPagaconActionPerformed

    private void btMakerSv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMakerSv1ActionPerformed
     int n = JOptionPane.showConfirmDialog(
                null,
                "¿Estas seguro que quieres volver al menu inicial?"
                        + "Se borraran todos los datos almacenados.",
                "ATENCIÓN",
                JOptionPane.YES_NO_OPTION);

        if (n == 0) {
           
            menu m =new menu();
m.setVisible(true);
            
            this.setVisible(false);

        }
    }//GEN-LAST:event_btMakerSv1ActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDetalleSv;
    private javax.swing.JButton btMakerSv;
    private javax.swing.JButton btMakerSv1;
    private javax.swing.JButton btcanped;
    private javax.swing.JButton btmodped;
    private javax.swing.JComboBox<String> bxopcion;
    private javax.swing.JComboBox<String> bxtipo;
    private javax.swing.JComboBox<String> cbdescuento;
    private javax.swing.JTextField etPagacon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbBruto;
    private javax.swing.JLabel lbCambio;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbDetalleProducto;
    private javax.swing.JLabel lbRecargo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTotal1;
    private javax.swing.JPanel pcentral;
    private javax.swing.JPanel pdetalle;
    private javax.swing.JSpinner spinnercan;
    private javax.swing.JTable tProductos;
    private javax.swing.JTable tcarrito;
    // End of variables declaration//GEN-END:variables
}
