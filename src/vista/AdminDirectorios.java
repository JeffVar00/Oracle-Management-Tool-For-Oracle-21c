package vista;

import logica.Logica;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminDirectorios extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db;
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    

    public AdminDirectorios(){
        
        initComponents(); //Carda los elementos del JFrame o JPanel

        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(AdminDirectorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Administración de Directorios"); //Título
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnBorrarDir = new javax.swing.JButton();
        boxDirectorios = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxtArea = new javax.swing.JTextArea();
        btnCrearDirectorio = new javax.swing.JButton();
        comboUsuarios = new javax.swing.JComboBox<>();
        lblDirectorio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblListaRespaldos1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(java.awt.Color.white);
        panel.setForeground(java.awt.Color.lightGray);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrarDir.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrarDir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnBorrarDir.setForeground(java.awt.Color.white);
        btnBorrarDir.setText("Borrar ");
        btnBorrarDir.setBorder(null);
        btnBorrarDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDirActionPerformed(evt);
            }
        });
        panel.add(btnBorrarDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 20));

        boxDirectorios.setBackground(new java.awt.Color(255, 255, 51));
        boxDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxDirectorios.setForeground(java.awt.Color.white);
        boxDirectorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boxDirectorios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxDirectoriosItemStateChanged(evt);
            }
        });
        panel.add(boxDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 20));

        btnRegresar.setBackground(java.awt.Color.blue);
        btnRegresar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Volver");
        btnRegresar.setToolTipText("");
        btnRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 60, 30));

        JtxtArea.setEditable(false);
        JtxtArea.setColumns(20);
        JtxtArea.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        JtxtArea.setRows(5);
        jScrollPane1.setViewportView(JtxtArea);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 160));

        btnCrearDirectorio.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearDirectorio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearDirectorio.setText("Crear Directorio");
        btnCrearDirectorio.setBorder(null);
        btnCrearDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDirectorioActionPerformed(evt);
            }
        });
        panel.add(btnCrearDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 130, 30));

        comboUsuarios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        panel.add(comboUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, 20));

        lblDirectorio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDirectorio.setText("Usuario:");
        panel.add(lblDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 50));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Crear nuevo directorio para un usuario");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 230, 20));

        jSeparator1.setBackground(java.awt.Color.black);
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 620, 10));

        lblListaRespaldos1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblListaRespaldos1.setText("Directorios del usuario actual");
        panel.add(lblListaRespaldos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 322, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel3.setText("Directorios");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void boxDirectoriosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxDirectoriosItemStateChanged
        if(listDirectorios.size() > 0 && boxDirectorios.getSelectedIndex() != -1 ){
            JtxtArea.setText("");//para limpiar el jtext cada vez que se cambia de opcion
            String sDirectorio=listDirectorios.get(boxDirectorios.getSelectedIndex()); //Directorio de elemento seleccionado
            File f=new File(sDirectorio);

            if(f.exists()){
                File[] ficheros=f.listFiles();
                for(int x=0; x<ficheros.length; x++)
                    JtxtArea.append(ficheros[x].getName()+"\n");  
            }
        }
       
    }//GEN-LAST:event_boxDirectoriosItemStateChanged

    private void btnCrearDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDirectorioActionPerformed
        
        if(comboUsuarios.getSelectedIndex()!=-1){
            JFileChooser dirCarpeta = new JFileChooser();
            dirCarpeta.showSaveDialog(null);

            File crearCarpeta = dirCarpeta.getSelectedFile();


            if(!crearCarpeta.exists()){
                crearCarpeta.mkdir();

                String dirNuevo = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo directorio", "Nuevo Directorio", JOptionPane.OK_CANCEL_OPTION);
                if(dirNuevo!=null){
                    if(db.crearDirectorio(dirNuevo, dirCarpeta.getSelectedFile().getPath(),(String)comboUsuarios.getSelectedItem()))
                        JOptionPane.showMessageDialog(null, "El directorio fue creado con exito","",JOptionPane.INFORMATION_MESSAGE);
                
                    cargarDirectorios();
                    JtxtArea.setText("");
                }
                
            }else{
                if(crearCarpeta.exists())
                    JOptionPane.showMessageDialog(null, "El directorio ya existe"); 
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un usuario","", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCrearDirectorioActionPerformed

    private void btnBorrarDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDirActionPerformed
        if(boxDirectorios.getSelectedIndex()!=-1){
            if(db.EliminarDirectorio((String)boxDirectorios.getSelectedItem()))
              JOptionPane.showMessageDialog(null, "El directorio fue eliminado con exito","",JOptionPane.INFORMATION_MESSAGE);
            
            
            cargarDirectorios();
            JtxtArea.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un directorio para borrar","", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarDirActionPerformed

    
      //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    
    
    //metodo de cargar directorios
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

    
    //Carga los usuarios en la interfaz
    public void cargarUsuarios(){
        
      Logica fun = new Logica();

      fun.conectar("sys","0000");

      resultado=fun.usuarios();
      
        if(resultado!=null){

            try{
                comboUsuarios.removeAllItems();
                while(resultado.next()){
                    comboUsuarios.addItem(resultado.getString(1));
                }
                comboUsuarios.setSelectedIndex(-1);
                fun.Desconectar();

            }catch(SQLException ex){
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JtxtArea;
    private javax.swing.JComboBox<String> boxDirectorios;
    private javax.swing.JButton btnBorrarDir;
    private javax.swing.JButton btnCrearDirectorio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDirectorio;
    private javax.swing.JLabel lblListaRespaldos1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
