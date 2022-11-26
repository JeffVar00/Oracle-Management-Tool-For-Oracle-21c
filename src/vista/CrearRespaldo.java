package vista;
import logica.Logica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CrearRespaldo extends JFrame{
    
    
    public String usuario;
    public String contrasena;
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    List<String> listDirectorios = new ArrayList<String>();
    public Logica db;
    ResultSet resultado;
    
    //Creacion del hilo para la exportacion
    Runnable run = new Runnable(){
        
        @Override
        public void run(){
            Exportar();
        }
    };
    

    //CONSTRUCTOR
    public CrearRespaldo(){
        
        initComponents(); //Carga los elementos del JFrame o JPanel
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearRespaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Creación de Respaldos"); //Título
        this.setResizable(false);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        radioSchema = new javax.swing.JRadioButton();
        radioTablas = new javax.swing.JRadioButton();
        radioFull = new javax.swing.JRadioButton();
        boxTablas = new javax.swing.JComboBox();
        lblDirectorios = new javax.swing.JLabel();
        boxDirectorios = new javax.swing.JComboBox();
        lblNombreArchivo = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();
        lblDirDirectorio = new javax.swing.JLabel();
        txtDirDirectorio = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTipoElegido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComando = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Respaldos");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 255));
        btnRegresar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Volver");
        btnRegresar.setToolTipText("");
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 50));

        radioSchema.setBackground(new java.awt.Color(255, 255, 255));
        radioSchema.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioSchema.setText("Esquema");
        radioSchema.setBorder(null);
        radioSchema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSchemaActionPerformed(evt);
            }
        });
        panel.add(radioSchema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        radioTablas.setBackground(new java.awt.Color(255, 255, 255));
        radioTablas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioTablas.setText("Tabla");
        radioTablas.setBorder(null);
        radioTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTablasActionPerformed(evt);
            }
        });
        panel.add(radioTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 20));

        radioFull.setBackground(new java.awt.Color(255, 255, 255));
        radioFull.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioFull.setText("Full");
        radioFull.setBorder(null);
        radioFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFullActionPerformed(evt);
            }
        });
        panel.add(radioFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        boxTablas.setBackground(java.awt.Color.darkGray);
        boxTablas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxTablas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boxTablas.setEnabled(false);
        panel.add(boxTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 310, -1));

        lblDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDirectorios.setText("Directorio");
        panel.add(lblDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        boxDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxDirectorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boxDirectorios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxDirectoriosItemStateChanged(evt);
            }
        });
        panel.add(boxDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 310, -1));

        lblNombreArchivo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNombreArchivo.setText("Nombre del Respaldo");
        panel.add(lblNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        txtNombreArchivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.add(txtNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 310, 20));

        lblDirDirectorio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDirDirectorio.setText("Dirección de Directorio");
        panel.add(lblDirDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 326, -1, 30));

        txtDirDirectorio.setEditable(false);
        txtDirDirectorio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDirDirectorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDirDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirDirectorioActionPerformed(evt);
            }
        });
        panel.add(txtDirDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 310, 20));

        btnCrear.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear.setText("Crear respaldo");
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panel.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 180, 30));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Resultado");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 80, -1));

        lblTipoElegido.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblTipoElegido.setText("...");
        panel.add(lblTipoElegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 560, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        areaComando.setEditable(false);
        areaComando.setColumns(1);
        areaComando.setLineWrap(true);
        areaComando.setRows(5);
        areaComando.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaComando);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 730, 180));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Tabla");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Ruta del Respaldo");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Respaldo");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void boxDirectoriosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxDirectoriosItemStateChanged
        if(listDirectorios.size() > 0 && boxDirectorios.getSelectedIndex() != -1 )
            txtDirDirectorio.setText(listDirectorios.get(boxDirectorios.getSelectedIndex()));
    }//GEN-LAST:event_boxDirectoriosItemStateChanged

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if(validaciones()){
            String mensaje="Creando respaldo "; //Variable con el mensaje "Creando respaldo "

            if(radioFull.isSelected()) //Si se selecciona la opción Full
                mensaje= mensaje+"Full..."; //El mensaje será "Creando respaldo Full..."
            
            else if(radioSchema.isSelected()) //Si se selecciona la opción Schema
                mensaje= mensaje+"del Schema..."; //El mensaje será "Creando respaldo de Schema..."
            
            else if(radioTablas.isSelected()) //Si se selecciona la opción Tablas
                mensaje= mensaje+"de Tabla..."; //El mensaje será "Creando respaldo de Tablas..."
            
            lblTipoElegido.setText(mensaje); //El label cambia su contenido con el texto
            
            btnCrear.setEnabled(false);//para bloquear el boton de crear
            btnRegresar.setEnabled(false);
            
            Thread h1 = new Thread(run);
            h1.start();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtDirDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirDirectorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirDirectorioActionPerformed

    private void radioSchemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSchemaActionPerformed
        boxTablas.enable(false);
        radioTablas.setSelected(false);
        radioFull.setSelected(false);
    }//GEN-LAST:event_radioSchemaActionPerformed

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void radioFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFullActionPerformed
        boxTablas.enable(false);
        radioTablas.setSelected(false);
        radioSchema.setSelected(false);
    }//GEN-LAST:event_radioFullActionPerformed

    private void radioTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTablasActionPerformed
        boxTablas.enable(true);
        radioSchema.setSelected(false);
        radioFull.setSelected(false);
        cargarTablasUsuario();
    }//GEN-LAST:event_radioTablasActionPerformed

    
    
    //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    
    
    //Metodo de cargar directorios
    public void cargarDirectorios(){
        
        ResultSet resultado = db.cargarDirectorios();

        boxDirectorios.removeAllItems();
        listDirectorios.clear();

        try{

            while(resultado.next()){                  
                boxDirectorios.addItem(resultado.getString(1));
                listDirectorios.add(resultado.getString(2));
            }
            boxDirectorios.setSelectedIndex(-1);
            
        }catch(SQLException ex){
            Logger.getLogger(CrearRespaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo de cargar directorios
    public void cargarTablasUsuario(){
        
        ResultSet resultado = db.cargarTablasUsuario(usuario);
       
        boxTablas.removeAllItems();
        
        try{
            while(resultado.next()){
                boxTablas.addItem(resultado.getString("TABLE_NAME"));
            }
            boxTablas.setSelectedIndex(-1);

        }catch(SQLException ex){
            Logger.getLogger(CrearRespaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    //Metodo para hacer la exportacion
    private void Exportar(){

        String s = null;
        String tipoRespaldo = "";//el tipo de respaldo que se hará
        String dir = "";//directorio donde se guardara el respaldo

           
        if(radioTablas.isSelected()){
            tipoRespaldo = "TABLES = "+boxTablas.getSelectedItem().toString();
        }
        if(radioSchema.isSelected()){
            tipoRespaldo = "SCHEMAS = "+usuario;
        }
        if(radioFull.isSelected()){
            tipoRespaldo = "FULL=Y";
        }
           
        dir = boxDirectorios.getSelectedItem().toString();

        try{
            
            String comando;
            comando = "cmd /c " + "EXPDP" + " " + usuario +"/"+ contrasena  + "@XE" + " " + tipoRespaldo +" DIRECTORY = "+ dir 
                    + " DUMPFILE = " + txtNombreArchivo.getText() +".dmp LOGFILE = " + txtNombreArchivo.getText() + "_log.log";

            //Ejecutamos el comando
            Process p = Runtime.getRuntime().exec(comando);
            
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                            p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                            p.getErrorStream()));

            //Leemos la salida del comando
            while ((s = stdInput.readLine()) != null){
                areaComando.append(s + "\n");
            }

            //Leemos los errores si los hubiera
            while ((s = stdError.readLine()) != null){
                areaComando.append(s + "\n");
            }
            
            lblTipoElegido.setText("El respaldo ha terminado");
            JOptionPane.showMessageDialog(null," La Exportación ha concluido..","Proceso Completado",JOptionPane.INFORMATION_MESSAGE);
            btnRegresar.setEnabled(true);
            
        }catch(IOException e){
            System.out.println("Excepción: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
    
    
    public boolean validaciones(){
        
        if(!radioTablas.isSelected() && !radioSchema.isSelected() && !radioFull.isSelected()){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el tipo de respaldo","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(radioTablas.isSelected() && boxTablas.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la tabla a respaldar","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(boxDirectorios.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un directorio","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(txtNombreArchivo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe darle un nombre al archivo de respaldo","", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComando;
    private javax.swing.JComboBox boxDirectorios;
    private javax.swing.JComboBox boxTablas;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDirDirectorio;
    private javax.swing.JLabel lblDirectorios;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblTipoElegido;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioFull;
    private javax.swing.JRadioButton radioSchema;
    private javax.swing.JRadioButton radioTablas;
    private javax.swing.JTextField txtDirDirectorio;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables
}
