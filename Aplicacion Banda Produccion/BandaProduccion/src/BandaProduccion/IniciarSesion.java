package BandaProduccion;

import Clases.LogIn;
import ConexionDB.Conexion;
import ConexionDB.DataBase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IniciarSesion extends javax.swing.JFrame {

    //clases
    Conexion con;//clase
    DataBase db;
    Connection conn;//libreria 
    LogIn log;

    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        //instanciar
        con = new Conexion();
        conn = con.getConexion();
        db = new DataBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        PanelPrincipalPanel = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JLabel();
        PanelDatosGral = new javax.swing.JPanel();
        jLabelError = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("IniciarSesion"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setSize(new java.awt.Dimension(1024, 640));

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 191, 191));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1024, 640));

        PanelPrincipalPanel.setBackground(new java.awt.Color(34, 34, 34));
        PanelPrincipalPanel.setPreferredSize(new java.awt.Dimension(1024, 64));

        PanelPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PanelPrincipal.setForeground(new java.awt.Color(242, 242, 242));
        PanelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.setText("Panel Principal");
        PanelPrincipal.setFocusable(false);
        PanelPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.setInheritsPopupMenu(false);
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout PanelPrincipalPanelLayout = new javax.swing.GroupLayout(PanelPrincipalPanel);
        PanelPrincipalPanel.setLayout(PanelPrincipalPanelLayout);
        PanelPrincipalPanelLayout.setHorizontalGroup(
            PanelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelPrincipalPanelLayout.setVerticalGroup(
            PanelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDatosGral.setBackground(new java.awt.Color(13, 13, 13));
        PanelDatosGral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.white));
        PanelDatosGral.setForeground(new java.awt.Color(250, 250, 250));
        PanelDatosGral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelDatosGral.setMinimumSize(new java.awt.Dimension(400, 230));
        PanelDatosGral.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelError.setBackground(new java.awt.Color(209, 49, 53));
        jLabelError.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 255, 255));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelError.setAutoscrolls(true);
        jLabelError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelError.setMaximumSize(new java.awt.Dimension(0, 30));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(112, 112, 112));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtUsuario.setMaximumSize(new java.awt.Dimension(352, 30));
        txtUsuario.setMinimumSize(new java.awt.Dimension(352, 30));
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(352, 30));

        jLabelPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña:");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(112, 112, 112));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setToolTipText("");
        txtPassword.setAlignmentX(1.0F);
        txtPassword.setAlignmentY(1.0F);
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtPassword.setMaximumSize(new java.awt.Dimension(352, 30));
        txtPassword.setMinimumSize(new java.awt.Dimension(352, 30));
        txtPassword.setName(""); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(352, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(13, 13, 13));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosGralLayout = new javax.swing.GroupLayout(PanelDatosGral);
        PanelDatosGral.setLayout(PanelDatosGralLayout);
        PanelDatosGralLayout.setHorizontalGroup(
            PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosGralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(PanelDatosGralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelDatosGralLayout.setVerticalGroup(
            PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosGralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnIniciarSesion)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(PanelDatosGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(PanelDatosGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void TimerTime() {
        Timer timer = new Timer();
        TimerTask tare = new TimerTask() {
            @Override
            public void run() {
                jLabelError.setText("");
                jLabelError.setOpaque(false);
            }
        };
        timer.scheduleAtFixedRate(tare, 1000, 2000);
    }

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (!verificarCampos()) {
            TimerTime();
        } else {
            dbTipoUsuario();
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    
    public void dbTipoUsuario() {
        boolean estatus = false;
        try {
            String registro;
            log = new LogIn();
            log.setUsuario(txtUsuario.getText());
            log.setPassword(txtPassword.getText());
            registro = db.IniciarSesion(conn, log);
            if (registro.equals("0")) {
                estatus = true;
                txtBorderColors(estatus);
                limpiarCampos();
                ControlProduccion cp = new ControlProduccion();
                cp.setVisible(true);
                this.setVisible(false);
            }else if(registro.equals("1")){
                estatus = true;
                txtBorderColors(estatus);
                limpiarCampos();
                System.out.println("aqui es admin" + registro);
                Administrador admin = new Administrador();
                admin.setVisible(true);
                this.setVisible(false);
            } else {
                jLabelError.setText("No se encontro el usuario");
                jLabelError.setOpaque(true);
                txtBorderColors(estatus);
                TimerTime();
            }
        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verificarCampos() {
        int n=0;
        if (txtUsuario.getText().equals("")) {
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            n+=1;
        }else{
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        
        if(txtPassword.getText().equals("")){
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            n+=1;
        }else{
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        
        if(n!=0){
            jLabelError.setText("Datos incompletos");
            jLabelError.setOpaque(true);
            return false;
        }else {
            return true;
        }
    }

    public void limpiarCampos() {
        txtPassword.setText("");
        txtUsuario.setText("");
    }

    public void txtBorderColors(boolean obj) {
        if (!obj) {
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
        } else {
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatosGral;
    private javax.swing.JLabel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipalPanel;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
