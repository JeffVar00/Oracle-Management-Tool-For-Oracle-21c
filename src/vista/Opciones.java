package vista;
import logica.Logica;
import java.awt.Color;
import javax.swing.JFrame;



public class Opciones extends JFrame{
    
    Logica db;
    public String usuario;
    public String contrasena;
    
    
    public Opciones(){
        
        initComponents(); //Carda los elementos del JFrame o JPanel
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        setLocationRelativeTo(null); //Centa la pantalla
        setTitle("Administración de Oracle"); //Título
        setResizable(false);
        this.getContentPane().setBackground(Color.white);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearRespaldos = new javax.swing.JButton();
        btnImportarRespaldo = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnDirectorios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTablespaces = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAuditoria = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTunning = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearRespaldos.setBackground(new java.awt.Color(153, 255, 255));
        btnCrearRespaldos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrearRespaldos.setText("Creacion de respaldos");
        btnCrearRespaldos.setBorder(null);
        btnCrearRespaldos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearRespaldos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearRespaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRespaldosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRespaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 50));

        btnImportarRespaldo.setBackground(new java.awt.Color(255, 204, 102));
        btnImportarRespaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImportarRespaldo.setText("Recuperacion de respaldos");
        btnImportarRespaldo.setBorder(null);
        btnImportarRespaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImportarRespaldo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImportarRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarRespaldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnImportarRespaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 50));

        btnEstadisticas.setBackground(new java.awt.Color(255, 204, 204));
        btnEstadisticas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEstadisticas.setText("Administrar Estadisticas");
        btnEstadisticas.setBorder(null);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 50));

        btnDirectorios.setBackground(new java.awt.Color(255, 204, 255));
        btnDirectorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDirectorios.setText("Administracion de directorios");
        btnDirectorios.setBorder(null);
        btnDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 50));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Administracion de la BD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Estadísticas y Tunning");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        btnTablespaces.setBackground(new java.awt.Color(204, 255, 204));
        btnTablespaces.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTablespaces.setText("Tablespaces de la BD");
        btnTablespaces.setBorder(null);
        btnTablespaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablespacesActionPerformed(evt);
            }
        });
        jPanel1.add(btnTablespaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 250, 50));

        btnRoles.setBackground(new java.awt.Color(204, 255, 204));
        btnRoles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRoles.setText("Roles y Usuarios");
        btnRoles.setBorder(null);
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 50));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Administracion de Tablespaces y Auditoria");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 390, -1));

        btnAuditoria.setBackground(new java.awt.Color(204, 255, 255));
        btnAuditoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAuditoria.setText("Auditoria");
        btnAuditoria.setBorder(null);
        btnAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuditoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAuditoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 250, 50));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("Seguridad de la BD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 20));

        btnTunning.setBackground(new java.awt.Color(204, 204, 255));
        btnTunning.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTunning.setText("Tunning de la BD");
        btnTunning.setToolTipText("");
        btnTunning.setBorder(null);
        btnTunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunningActionPerformed(evt);
            }
        });
        jPanel1.add(btnTunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 250, 50));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Respaldos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setForeground(java.awt.Color.white);

        jMenu1.setText("Salir");

        cerrar_sesion.setText("Cerrar Sesión");
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        db.Desconectar();
        this.setVisible(false);
        Login is = new Login();
        is.cargarUsuarios();
        is.setVisible(true);
    }//GEN-LAST:event_cerrar_sesionActionPerformed

    private void btnCrearRespaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRespaldosActionPerformed

        this.setVisible(false);
        CrearRespaldo cr = new CrearRespaldo();
        cr.usuario=usuario;
        cr.contrasena=contrasena;
        cr.db=this.db;
        cr.op=this;//le pasamos la referencia de esta ventana
        cr.cargarTablasUsuario(); 
        cr.cargarDirectorios();
        cr.setVisible(true);
    }//GEN-LAST:event_btnCrearRespaldosActionPerformed

    private void btnDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminDirectorios ad = new AdminDirectorios();
        ad.usuario=usuario;
        ad.contrasena=contrasena;
        ad.db=this.db;
        ad.op=this;//le pasamos la referencia de esta ventana
        ad.cargarDirectorios();
        ad.cargarUsuarios();
        ad.setVisible(true);
        
    }//GEN-LAST:event_btnDirectoriosActionPerformed

    private void btnImportarRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarRespaldoActionPerformed

        this.setVisible(false);
        RecuperacionRespaldos rr = new RecuperacionRespaldos();
        rr.usuario = usuario;
        rr.contrasena = contrasena;
        rr.db = this.db;
        rr.op = this;//le pasamos la referencia de esta ventana
        rr.cargarTablasUsuario();
        rr.cargarDirectorios();
        rr.setVisible(true);
    }//GEN-LAST:event_btnImportarRespaldoActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed

        this.setVisible(false);
        AdminEstadisticas ae = new AdminEstadisticas();
        ae.usuario=usuario;
        ae.contrasena=contrasena;
        ae.db=this.db;
        ae.op=this;//le pasamos la referencia de esta ventana
        ae.cargarTablasUsuario();
        ae.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        this.setVisible(false);
        Roles rol = new Roles();
        rol.usuario = usuario;
        rol.contrasena = contrasena;
        rol.db = this.db;
        rol.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        rol.setVisible(true);   
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnTablespacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablespacesActionPerformed
        this.setVisible(false);
        Tablespaces tb = new Tablespaces();
        tb.usuario = usuario;
        tb.contrasena = contrasena;
        tb.db = this.db;
        tb.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        tb.setVisible(true);  
    }//GEN-LAST:event_btnTablespacesActionPerformed

    private void btnAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuditoriaActionPerformed
        this.setVisible(false);
        Auditoria aud = new Auditoria();
        aud.usuario = usuario;
        aud.contrasena = contrasena;
        aud.db = this.db;
        aud.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        aud.setVisible(true);  
    }//GEN-LAST:event_btnAuditoriaActionPerformed

    private void btnTunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunningActionPerformed
        this.setVisible(false);
        Tunning aud = new Tunning();
        aud.usuario = usuario;
        aud.contrasena = contrasena;
        aud.db = this.db;
        aud.op = this;
        aud.setVisible(true);
    }//GEN-LAST:event_btnTunningActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnCrearRespaldos;
    private javax.swing.JButton btnDirectorios;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnImportarRespaldo;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnTablespaces;
    private javax.swing.JButton btnTunning;
    private javax.swing.JMenuItem cerrar_sesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
