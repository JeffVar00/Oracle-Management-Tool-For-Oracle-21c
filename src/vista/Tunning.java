package vista;

import logica.Logica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tunning extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db = new Logica();
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    ResultSet resultado2;
    ResultSet resultado3;
    ResultSet resultado4;
    
    public Tunning(){
        
        initComponents(); //Carga los elementos del JFrame o JPanel
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Planes de Ejecución"); //Título
        setResizable(false);
        cargarUsuarios();
        cargarTablas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        btnCrearPlan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSql = new javax.swing.JTextField();
        btnEliminarPlanes = new javax.swing.JButton();
        btnverPlan1 = new javax.swing.JButton();
        btnCrearPlan1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearPlan.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearPlan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearPlan.setText("Crear plan de Ejecución");
        btnCrearPlan.setBorder(null);
        btnCrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanActionPerformed(evt);
            }
        });
        panel.add(btnCrearPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

        tablaPlanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operación", "Objeto", "Fecha de Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPlanes);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 720, 230));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 255));
        btnRegresar.setForeground(java.awt.Color.white);
        btnRegresar.setText("Volver");
        btnRegresar.setToolTipText("");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 70, 40));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Crear Indices");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Nombre : ");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 80, 20));

        txtSql.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSql.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(txtSql, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 430, 30));

        btnEliminarPlanes.setBackground(java.awt.Color.darkGray);
        btnEliminarPlanes.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnEliminarPlanes.setForeground(java.awt.Color.white);
        btnEliminarPlanes.setText("Limpiar tabla de planes");
        btnEliminarPlanes.setBorder(null);
        btnEliminarPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlanesActionPerformed(evt);
            }
        });
        panel.add(btnEliminarPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, 30));

        btnverPlan1.setBackground(java.awt.Color.darkGray);
        btnverPlan1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnverPlan1.setForeground(java.awt.Color.white);
        btnverPlan1.setText("Ver planes de Ejecución");
        btnverPlan1.setBorder(null);
        btnverPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverPlan1btnVerPlanesActionPerformed(evt);
            }
        });
        panel.add(btnverPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));

        btnCrearPlan1.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearPlan1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearPlan1.setText("Crear Indice");
        btnCrearPlan1.setBorder(null);
        btnCrearPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlan1ActionPerformed(evt);
            }
        });
        panel.add(btnCrearPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 110, 50));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese una consulta SQL a optimizar");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 140, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Tabla: ");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 70, 20));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Schema: ");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 70, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 140, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        panel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 140, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setText("Explain Plan");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 140, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Campo: ");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 70, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del Indice", "Nombre de la columna"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 320, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanActionPerformed
        // TODO add your handling code here:
        this.CrearPlan();        
    }//GEN-LAST:event_btnCrearPlanActionPerformed

    private void btnBorrarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlanesActionPerformed
        // TODO add your handling code here:
        if(db.BorrarTablaPlanes()){
            JOptionPane.showMessageDialog(null, "Se ha limpiado la tabla de planes", "Limpia completa",JOptionPane.INFORMATION_MESSAGE);
            this.llenarGrid();
        }
        
    }//GEN-LAST:event_btnBorrarPlanesActionPerformed

    private void btnverPlan1btnVerPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverPlan1btnVerPlanesActionPerformed
        // TODO add your handling code here:
        this.llenarGrid();
    }//GEN-LAST:event_btnverPlan1btnVerPlanesActionPerformed

    private void btnCrearPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlan1ActionPerformed
        if (db.crearIndice(String.valueOf(jComboBox3.getSelectedItem()), String.valueOf(jComboBox2.getSelectedItem()), String.valueOf(jComboBox1.getSelectedItem()), 
                jTextField1.getText())) {
            JOptionPane.showMessageDialog(null, "Se ha creado un indice para el campo " + String.valueOf(jComboBox1.getSelectedItem()) +
                    " de la tabla " + String.valueOf(jComboBox2.getSelectedItem()) + " en el schema " + String.valueOf(jComboBox3.getSelectedItem()), "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro crear un indice para el campo " + String.valueOf(jComboBox1.getSelectedItem()) +
                    " de la tabla " + String.valueOf(jComboBox2.getSelectedItem()) + " en el schema " + String.valueOf(jComboBox3.getSelectedItem()), "", JOptionPane.ERROR_MESSAGE);
        }
        
        llenarGrid2();
    }//GEN-LAST:event_btnCrearPlan1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        cargarTablas();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        cargarCampos();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    

    public void cargarUsuarios() {
        db.conectar("sys", "0000");
        resultado = db.usuarios();

        if (resultado != null) {

            try {
                jComboBox3.removeAllItems();
                while (resultado.next()) {
                    jComboBox3.addItem(resultado.getString(1));
                }
                jComboBox3.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void cargarTablas() {
        db.conectar("sys", "0000");
        resultado2 = db.verTablasXSchema(String.valueOf(jComboBox3.getSelectedItem()));

        if (resultado2 != null) {

            try {
                jComboBox2.removeAllItems();
                while (resultado2.next()) {
                    jComboBox2.addItem(resultado2.getString(1));
                }
                jComboBox2.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void cargarCampos() {
        db.conectar("sys", "0000");
        resultado3 = db.verCamposXTabla(String.valueOf(jComboBox2.getSelectedItem()));

        if (resultado3 != null) {

            try {
                jComboBox1.removeAllItems();
                while (resultado3.next()) {
                    jComboBox1.addItem(resultado3.getString(1));
                }
                jComboBox1.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    
    public void CrearPlan(){   
        
        String msj = db.executarQueryOptimizar(txtSql.getText());
        if(msj.equals("true")){
            JOptionPane.showMessageDialog(null, "Se ha creado el plan correctamente", "Plan Creado",JOptionPane.INFORMATION_MESSAGE);
            llenarGrid();//llama al metodo que llena la tabla para mostrar el resultado de una vez
            txtSql.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, msj, "Error al crear Plan",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void llenarGrid(){
        
        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.tablaPlanes.getModel();
         
         
        for(int i = 0; i < tablaPlanes.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
         
        resultado= db.obtenerExplainPlan();//metodo
              
        this.tablaPlanes.removeAll();
        
        if(resultado != null){
            try{
                while(resultado.next()){
                    Object [] fila=new Object[3];
                    fila[0]=resultado.getString("OPERACION");
                    fila[1]=resultado.getString("OBJETO");
                    fila[2]=resultado.getString("FECHA");
                    modelo.addRow(fila);
                }
                tablaPlanes.setModel(modelo);
            
            }catch(Exception ex){
                Logger.getLogger(Tunning.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Error al consulta", "Error de Consultar",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void llenarGrid2() {

        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        resultado = db.cargarIndicesTabla(String.valueOf(jComboBox2.getSelectedItem()));

        this.jTable1.removeAll();

        try {
            while (resultado.next()) {
                Object[] fila = new Object[2];
                fila[0] = resultado.getString("INDEX_NAME");
                fila[1] = resultado.getString("COLUMN_NAME");
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPlan;
    private javax.swing.JButton btnCrearPlan1;
    private javax.swing.JButton btnEliminarPlanes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnverPlan1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTextField txtSql;
    // End of variables declaration//GEN-END:variables
}
