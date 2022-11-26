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

public class AdminEstadisticas extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db;
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    
    
    public AdminEstadisticas(){
        
        initComponents(); //Carga los elementos del JFrame o JPanel
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(AdminEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Administración de Estadísticas"); //Título
        setResizable(false);
        this.buttonGroup1.add(this.rbTabla);
        this.buttonGroup1.add(this.rbSchema);
        this.cbTablas.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        btnGenerarStats = new javax.swing.JButton();
        cbTablas = new javax.swing.JComboBox<>();
        btnVerStats = new javax.swing.JButton();
        rbSchema = new javax.swing.JRadioButton();
        rbTabla = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblListaEstadisticas1 = new javax.swing.JLabel();
        lblListaEstadisticas3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(java.awt.Color.white);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerarStats.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarStats.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGenerarStats.setText("Generar Estadisticas");
        btnGenerarStats.setBorder(null);
        btnGenerarStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarStatsActionPerformed(evt);
            }
        });
        panel.add(btnGenerarStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 140, 30));

        cbTablas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTablasActionPerformed(evt);
            }
        });
        panel.add(cbTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        btnVerStats.setBackground(java.awt.Color.yellow);
        btnVerStats.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnVerStats.setText("Ver Estadisticas");
        btnVerStats.setBorder(null);
        btnVerStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerStatsActionPerformed(evt);
            }
        });
        panel.add(btnVerStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 140, 30));

        rbSchema.setBackground(new java.awt.Color(255, 255, 255));
        rbSchema.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        rbSchema.setText("Esquema");
        rbSchema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSchemaActionPerformed(evt);
            }
        });
        panel.add(rbSchema, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 20, -1));

        rbTabla.setBackground(new java.awt.Color(255, 255, 255));
        rbTabla.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        rbTabla.setText("Tabla");
        rbTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTablaActionPerformed(evt);
            }
        });
        panel.add(rbTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 20, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schema", "Tabla", "Registros", "Ultimo Analisis"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 600, 170));

        btnRegresar.setBackground(java.awt.Color.blue);
        btnRegresar.setForeground(java.awt.Color.white);
        btnRegresar.setText("Volver");
        btnRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel2.setText("Estadísticas");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        lblListaEstadisticas1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblListaEstadisticas1.setText("Estadistica por schema");
        panel.add(lblListaEstadisticas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 20));

        lblListaEstadisticas3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblListaEstadisticas3.setText("Estadistica por tabla");
        panel.add(lblListaEstadisticas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTablaActionPerformed
        // TODO add your handling code here:
        this.cbTablas.setEnabled(true);
        cbTablas.setSelectedItem(cbTablas.getItemAt(0));
    }//GEN-LAST:event_rbTablaActionPerformed

    private void btnGenerarStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarStatsActionPerformed
        // TODO add your handling code here:
        this.GenerarEstadisticas();
    }//GEN-LAST:event_btnGenerarStatsActionPerformed

    private void cbTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTablasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTablasActionPerformed

    private void btnVerStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerStatsActionPerformed
        // TODO add your handling code here:
        this.llenarGrid();
    }//GEN-LAST:event_btnVerStatsActionPerformed

    private void rbSchemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSchemaActionPerformed
        // TODO add your handling code here:
        this.cbTablas.setEnabled(false);
    }//GEN-LAST:event_rbSchemaActionPerformed

    //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    

    //metodo de cargar directorios
    public void cargarTablasUsuario(){
        
        ResultSet resultado = db.cargarTablasUsuario(usuario);

        cbTablas.removeAllItems();
        
        try{
            while(resultado.next()){
                cbTablas.addItem(resultado.getString("TABLE_NAME"));

            }
            cbTablas.setSelectedIndex(-1);

        }catch(SQLException ex){
            Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    public void GenerarEstadisticas(){
         
        if(this.rbTabla.isSelected()){
            db.GeneraStats(usuario,this.cbTablas.getSelectedItem().toString());       
        
        }else if(this.rbSchema.isSelected()){
            db.GeneraStats(usuario,"Schema");   
        }else{
           JOptionPane.showMessageDialog(null, "Debe seleccionar alguna opción", "Error al Generar Estadisticas",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void llenarGrid(){
        
        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
         
         
        for(int i = 0; i < jTable1.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
         
        if(this.rbTabla.isSelected()){
            
            resultado= db.ConsultaStats(usuario,this.cbTablas.getSelectedItem().toString());
              
            this.jTable1.removeAll();
            
            try{
                Object [] fila=new Object[4];
                resultado.next();
                fila[0]=resultado.getString("OWNER");
                fila[1]=resultado.getString("TABLE_NAME");
                fila[2]=resultado.getString("NUM_ROWS");
                fila[3]=resultado.getString("LAST_ANALYZED");
                modelo.addRow(fila);
                jTable1.setModel(modelo);
            
            }catch(SQLException ex){
                Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }else if(this.rbSchema.isSelected()){
            
            resultado = db.ConsultaStats(usuario,"Schema");
            
            try{
                   
                while(resultado.next()){
                    
                    Object [] fila=new Object[4];
                    fila[0]=resultado.getString("OWNER");
                    fila[1]=resultado.getString("TABLE_NAME");
                    fila[2]=resultado.getString("NUM_ROWS");
                    fila[3]=resultado.getString("LAST_ANALYZED"); 
                    modelo.addRow(fila);      
                }
                   
                jTable1.setModel(modelo);
            }catch(SQLException ex){
                Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar alguna opción", "Error al Cargar Estadisticas",JOptionPane.ERROR_MESSAGE);
        }
         
         
         
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarStats;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerStats;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTablas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblListaEstadisticas1;
    private javax.swing.JLabel lblListaEstadisticas3;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton rbSchema;
    private javax.swing.JRadioButton rbTabla;
    // End of variables declaration//GEN-END:variables
}
