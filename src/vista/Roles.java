
package vista;

import logica.Logica;



import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Roles extends JFrame{
    
        
    public String usuario;
    public String contrasena;
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    List<String> listDirectorios = new ArrayList<String>();
    public Logica db;
    ResultSet resultado;
    
    public Roles(){
        
        initComponents();
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Roles de Usuarios"); //Título
        this.setResizable(false);
        cargarUsuarios();
        cargarUsuario1();
    }
    
    public void cargarUsuarios(){
        
      Logica fun = new Logica();

      fun.conectar("sys","0000");

      //db.conectar(usuario, contrasena);
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
    
    
    public void cargarUsuario1(){
        
      Logica fun = new Logica();

      fun.conectar("sys","0000");

      resultado=fun.usuarios();
      
        if(resultado!=null){

            try{
                ComboUsuario1.removeAllItems();
                while(resultado.next()){
                    ComboUsuario1.addItem(resultado.getString(1));
                }
                ComboUsuario1.setSelectedIndex(-1);
                fun.Desconectar();

            }catch(SQLException ex){
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void cargarRoles(){
        
      Logica fun = new Logica();

      fun.conectar("sys","0000");

      resultado=fun.cargarRoles(ComboUsuario1.getSelectedItem().toString());
      
        if(resultado!=null){

            try{
                comboRoles.removeAllItems();
                while(resultado.next()){
                    comboRoles.addItem(resultado.getString(1));
                }
                comboRoles.setSelectedIndex(-1);
                fun.Desconectar();

            }catch(SQLException ex){
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  /*  public void cargarPrivilegios(){
        
      Logica fun = new Logica();
      fun.conectar("system","LantanidoS13");
      resultado=fun.cargarTotalPrivilegios();
      
        if(resultado!=null){

            try{
                comboUsuarios2.removeAllItems();
                while(resultado.next()){
                    comboUsuarios2.addItem(resultado.getString(1));
                }
                comboUsuarios2.setSelectedIndex(-1);
                fun.Desconectar();

            }catch(SQLException ex){
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        crearRol = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox<>();
        btnCrearRol = new javax.swing.JButton();
        txtNombreRol1 = new javax.swing.JTextField();
        crearRol4 = new javax.swing.JLabel();
        comboRoles = new javax.swing.JComboBox<>();
        param_header1 = new javax.swing.JLabel();
        crearRol1 = new javax.swing.JLabel();
        txtNombreRol = new javax.swing.JTextField();
        btnRemoverRol = new javax.swing.JButton();
        btnAsignarRol = new javax.swing.JButton();
        param_header2 = new javax.swing.JLabel();
        param_header3 = new javax.swing.JLabel();
        crearRol2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        ComboUsuario1 = new javax.swing.JComboBox<>();
        crearRol3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        crearRol5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 40));

        crearRol.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol.setText("Roles:");
        panel.add(crearRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 20));

        comboUsuarios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuariosActionPerformed(evt);
            }
        });
        panel.add(comboUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 20));

        btnCrearRol.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearRol.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearRol.setText("Crear Rol");
        btnCrearRol.setBorder(null);
        btnCrearRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRolActionPerformed(evt);
            }
        });
        panel.add(btnCrearRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        txtNombreRol1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRol1ActionPerformed(evt);
            }
        });
        panel.add(txtNombreRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 20));

        crearRol4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol4.setText("Seleccione el usuario:");
        panel.add(crearRol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, -1));

        comboRoles.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboRoles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRolesActionPerformed(evt);
            }
        });
        panel.add(comboRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 190, 20));

        param_header1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        param_header1.setText("Roles y Usuarios");
        panel.add(param_header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        crearRol1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol1.setText("Nombre del usuario");
        panel.add(crearRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        txtNombreRol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRolActionPerformed(evt);
            }
        });
        panel.add(txtNombreRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 20));

        btnRemoverRol.setBackground(new java.awt.Color(255, 102, 102));
        btnRemoverRol.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnRemoverRol.setForeground(java.awt.Color.white);
        btnRemoverRol.setText("Eliminar");
        btnRemoverRol.setBorder(null);
        btnRemoverRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverRolActionPerformed(evt);
            }
        });
        panel.add(btnRemoverRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 100, 30));

        btnAsignarRol.setBackground(new java.awt.Color(153, 255, 153));
        btnAsignarRol.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnAsignarRol.setText("Asignar");
        btnAsignarRol.setBorder(null);
        btnAsignarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRolActionPerformed(evt);
            }
        });
        panel.add(btnAsignarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 100, 30));

        param_header2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        param_header2.setText("Consultar roles de usuario");
        panel.add(param_header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        param_header3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        param_header3.setText("Asignar o eliminar rol a un usuario");
        panel.add(param_header3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        crearRol2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol2.setText("Indique el rol:");
        panel.add(crearRol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, -1));

        btnConsultar.setBackground(new java.awt.Color(204, 204, 255));
        btnConsultar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        panel.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 100, 30));

        ComboUsuario1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        ComboUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUsuario1ActionPerformed(evt);
            }
        });
        panel.add(ComboUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, 20));

        crearRol3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol3.setText("Nombre del Rol:");
        panel.add(crearRol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 320, 20));

        btnCrearUsuario.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearUsuario.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setBorder(null);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        panel.add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 30));

        crearRol5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        crearRol5.setText("Seleccione el usuario:");
        panel.add(crearRol5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCrearRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRolActionPerformed
        /*if(boxDirectorios.getSelectedIndex()!=-1){
            if(db.EliminarDirectorio((String)boxDirectorios.getSelectedItem()))
            JOptionPane.showMessageDialog(null, "El directorio fue eliminado con exito","",JOptionPane.INFORMATION_MESSAGE);

            cargarDirectorios();
            JtxtArea.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un directorio para borrar","", JOptionPane.ERROR_MESSAGE);
        }*/
        if(db.crearRol(txtNombreRol.getText())){
            //db.crearRol(txtNombreRol.getText());
            JOptionPane.showMessageDialog(null, "El rol fue creado con exito","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error, intente de nuevo","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearRolActionPerformed

    private void txtNombreRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRol1ActionPerformed

    private void comboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUsuariosActionPerformed

    private void comboRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRolesActionPerformed

    private void txtNombreRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRolActionPerformed

    private void btnRemoverRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverRolActionPerformed
        if(db.revocarRolUsuario(txtNombreRol1.getText(), comboUsuarios.getSelectedItem().toString())){
            //db.revocarRolUsuario(txtNombreRol1.getText(), comboUsuarios.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "El rol fue removido con exito","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error, intente de nuevo","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverRolActionPerformed

    private void btnAsignarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRolActionPerformed
        if(db.otorgarRolUsuario(txtNombreRol1.getText(), comboUsuarios.getSelectedItem().toString())){
            //db.otorgarRolUsuario(txtNombreRol1.getText(), comboUsuarios.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "El rol fue asignado con exito","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error, intente de nuevo","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarRolActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cargarRoles();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void ComboUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboUsuario1ActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        if(db.crearUsuario(txtNombreUsuario.getText())){
            //db.revocarRolUsuario(txtNombreRol1.getText(), comboUsuarios.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "El usuario fue creado con exito","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error, intente de nuevo","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboUsuario1;
    private javax.swing.JButton btnAsignarRol;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrearRol;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnRemoverRol;
    private javax.swing.JComboBox<String> comboRoles;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel crearRol;
    private javax.swing.JLabel crearRol1;
    private javax.swing.JLabel crearRol2;
    private javax.swing.JLabel crearRol3;
    private javax.swing.JLabel crearRol4;
    private javax.swing.JLabel crearRol5;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel param_header1;
    private javax.swing.JLabel param_header2;
    private javax.swing.JLabel param_header3;
    private javax.swing.JTextField txtNombreRol;
    private javax.swing.JTextField txtNombreRol1;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables



}

