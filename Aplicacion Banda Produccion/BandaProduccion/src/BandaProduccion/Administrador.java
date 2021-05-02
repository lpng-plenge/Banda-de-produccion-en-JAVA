
package BandaProduccion;


public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        AdminPanel = new javax.swing.JPanel();
        UsuarioID = new javax.swing.JLabel();
        jLabelControlUsuario = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelPerfil = new javax.swing.JLabel();
        comBoxPerfil = new javax.swing.JComboBox<>();
        jLabelAPaterno = new javax.swing.JLabel();
        txtAPaterno = new javax.swing.JTextField();
        jLabelAMaterno = new javax.swing.JLabel();
        txtAMaterno = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabaelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabelusuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("Administrador"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setSize(new java.awt.Dimension(1024, 640));

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 191, 191));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));

        AdminPanel.setBackground(new java.awt.Color(34, 34, 34));
        AdminPanel.setPreferredSize(new java.awt.Dimension(1024, 64));

        UsuarioID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UsuarioID.setForeground(new java.awt.Color(242, 242, 242));
        UsuarioID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioID.setText("Administrador ID");
        UsuarioID.setFocusable(false);
        UsuarioID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UsuarioID.setInheritsPopupMenu(false);
        UsuarioID.setMaximumSize(new java.awt.Dimension(115, 22));
        UsuarioID.setMinimumSize(new java.awt.Dimension(115, 22));
        UsuarioID.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(UsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuarioID, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelControlUsuario.setBackground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelControlUsuario.setForeground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setText("Control de Usuarios");

        jLabelId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(13, 13, 13));
        jLabelId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelId.setText("Id:");
        jLabelId.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelId.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelId.setPreferredSize(new java.awt.Dimension(120, 19));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(112, 112, 112));
        txtId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtId.setToolTipText("");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtId.setMinimumSize(new java.awt.Dimension(200, 30));
        txtId.setName(""); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(200, 30));

        btnBuscarId.setBackground(new java.awt.Color(108, 117, 125));
        btnBuscarId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarId.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarId.setText("Buscar");
        btnBuscarId.setMaximumSize(new java.awt.Dimension(125, 30));
        btnBuscarId.setMinimumSize(new java.awt.Dimension(125, 30));
        btnBuscarId.setPreferredSize(new java.awt.Dimension(125, 30));

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(13, 13, 13));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre(s):");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(120, 19));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(112, 112, 112));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setToolTipText("");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 30));
        txtNombre.setName(""); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(13, 13, 13));
        jLabelPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPerfil.setText("Perfil:");
        jLabelPerfil.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelPerfil.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelPerfil.setPreferredSize(new java.awt.Dimension(120, 19));

        comBoxPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        comBoxPerfil.setMinimumSize(new java.awt.Dimension(120, 30));
        comBoxPerfil.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabelAPaterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAPaterno.setForeground(new java.awt.Color(13, 13, 13));
        jLabelAPaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAPaterno.setText("Apellido Paterno:");
        jLabelAPaterno.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelAPaterno.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelAPaterno.setPreferredSize(new java.awt.Dimension(120, 19));

        txtAPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAPaterno.setForeground(new java.awt.Color(112, 112, 112));
        txtAPaterno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAPaterno.setToolTipText("");
        txtAPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtAPaterno.setMinimumSize(new java.awt.Dimension(200, 30));
        txtAPaterno.setName(""); // NOI18N
        txtAPaterno.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelAMaterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAMaterno.setForeground(new java.awt.Color(13, 13, 13));
        jLabelAMaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAMaterno.setText("Apellido Materno:");
        jLabelAMaterno.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelAMaterno.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelAMaterno.setPreferredSize(new java.awt.Dimension(120, 19));

        txtAMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAMaterno.setForeground(new java.awt.Color(112, 112, 112));
        txtAMaterno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAMaterno.setToolTipText("");
        txtAMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtAMaterno.setMinimumSize(new java.awt.Dimension(200, 30));
        txtAMaterno.setName(""); // NOI18N
        txtAMaterno.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(13, 13, 13));
        jLabelTel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTel.setText("Telefono:");
        jLabelTel.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelTel.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelTel.setPreferredSize(new java.awt.Dimension(120, 19));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(112, 112, 112));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtTelefono.setMinimumSize(new java.awt.Dimension(200, 30));
        txtTelefono.setName(""); // NOI18N
        txtTelefono.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabaelDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabaelDireccion.setForeground(new java.awt.Color(13, 13, 13));
        jLabaelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabaelDireccion.setText("Dirección:");
        jLabaelDireccion.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabaelDireccion.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabaelDireccion.setPreferredSize(new java.awt.Dimension(120, 19));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(112, 112, 112));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setToolTipText("");
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtDireccion.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDireccion.setName(""); // NOI18N
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(13, 13, 13));
        jLabelusuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelusuario.setText("Usuario:");
        jLabelusuario.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelusuario.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelusuario.setPreferredSize(new java.awt.Dimension(120, 19));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(112, 112, 112));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtUsuario.setMinimumSize(new java.awt.Dimension(200, 30));
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(13, 13, 13));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword.setText("Contraseña:");
        jLabelPassword.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelPassword.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelPassword.setPreferredSize(new java.awt.Dimension(120, 19));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(112, 112, 112));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtPassword.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPassword.setName(""); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(200, 30));

        btnNuevo.setBackground(new java.awt.Color(21, 127, 251));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setMaximumSize(new java.awt.Dimension(120, 40));
        btnNuevo.setMinimumSize(new java.awt.Dimension(120, 40));
        btnNuevo.setPreferredSize(new java.awt.Dimension(120, 40));

        btnCancelar.setBackground(new java.awt.Color(243, 124, 34));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));

        btnGuardar.setBackground(new java.awt.Color(21, 149, 136));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setPreferredSize(new java.awt.Dimension(120, 40));

        btnEliminar.setBackground(new java.awt.Color(209, 49, 53));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 40));

        btnSalir.setBackground(new java.awt.Color(13, 13, 13));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Cerrar Sesion");
        btnSalir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnSalir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnSalir.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelControlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabaelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabelControlUsuario)
                .addGap(60, 60, 60)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabaelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel UsuarioID;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comBoxPerfil;
    private javax.swing.JLabel jLabaelDireccion;
    private javax.swing.JLabel jLabelAMaterno;
    private javax.swing.JLabel jLabelAPaterno;
    private javax.swing.JLabel jLabelControlUsuario;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelusuario;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
