
package BandaProduccion;


public class IniciarSesion extends javax.swing.JFrame {


    public IniciarSesion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        PanelPrincipalPanel = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("IniciarSesion"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setSize(new java.awt.Dimension(1024, 640));

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 191, 191));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1920, 720));

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
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap(1697, Short.MAX_VALUE))
        );
        PanelPrincipalPanelLayout.setVerticalGroup(
            PanelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(647, 647, 647))
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
    private javax.swing.JLabel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipalPanel;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
