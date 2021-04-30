
package BandaProduccion;

public class ControlProduccion extends javax.swing.JFrame {

    public ControlProduccion() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        ControlProduccionPanel = new javax.swing.JPanel();
        txtUsuarioID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("Empleado"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setSize(new java.awt.Dimension(1024, 640));

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 191, 191));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1024, 640));

        ControlProduccionPanel.setBackground(new java.awt.Color(34, 34, 34));
        ControlProduccionPanel.setPreferredSize(new java.awt.Dimension(1024, 64));

        txtUsuarioID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUsuarioID.setForeground(new java.awt.Color(242, 242, 242));
        txtUsuarioID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarioID.setText("Usuario ID");
        txtUsuarioID.setFocusable(false);
        txtUsuarioID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtUsuarioID.setInheritsPopupMenu(false);
        txtUsuarioID.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout ControlProduccionPanelLayout = new javax.swing.GroupLayout(ControlProduccionPanel);
        ControlProduccionPanel.setLayout(ControlProduccionPanelLayout);
        ControlProduccionPanelLayout.setHorizontalGroup(
            ControlProduccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlProduccionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuarioID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap(1646, Short.MAX_VALUE))
        );
        ControlProduccionPanelLayout.setVerticalGroup(
            ControlProduccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlProduccionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuarioID, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ControlProduccionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1818, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(ControlProduccionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(647, 647, 647))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlProduccionPanel;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel txtUsuarioID;
    // End of variables declaration//GEN-END:variables
}
