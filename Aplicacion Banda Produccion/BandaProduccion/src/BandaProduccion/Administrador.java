package BandaProduccion;

import Clases.CerrarSesion;
import Clases.Usuario;
import ConexionDB.Conexion;
import ConexionDB.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administrador extends javax.swing.JFrame {

    //variable global
    String usuario = txtUsuarioAdmin.getText();
    boolean _alertas=false;
    //clases
    Conexion con;
    DataBase db;
    Connection conn;
    Usuario us;
    CerrarSesion cS;

    public Administrador() {
        if (usuario.equals("")) {
            Salir();
        } else {
            initComponents();
            setLocationRelativeTo(null);
            //instanciar
            con = new Conexion();
            conn = con.getConexion();
            db=new DataBase();
            usuarioConectado = new Timer(10,payActionListener);
            timer = new Timer(1000,acciones);
            usuarioConectado.start();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        AdminPanel = new javax.swing.JPanel();
        jLabelControlUsuario = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
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
        btnEditar = new javax.swing.JButton();

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

        txtUsuarioAdmin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUsuarioAdmin.setForeground(new java.awt.Color(242, 242, 242));
        txtUsuarioAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarioAdmin.setToolTipText("");
        txtUsuarioAdmin.setFocusable(false);
        txtUsuarioAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtUsuarioAdmin.setInheritsPopupMenu(false);
        txtUsuarioAdmin.setMaximumSize(new java.awt.Dimension(115, 22));
        txtUsuarioAdmin.setMinimumSize(new java.awt.Dimension(115, 22));
        txtUsuarioAdmin.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuarioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelControlUsuario.setBackground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelControlUsuario.setForeground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setText("Control de Usuarios");

        jLabelError.setBackground(new java.awt.Color(209, 49, 53));
        jLabelError.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 255, 255));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelError.setAutoscrolls(true);
        jLabelError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelError.setMaximumSize(new java.awt.Dimension(0, 30));
        jLabelError.setMinimumSize(new java.awt.Dimension(0, 30));
        jLabelError.setPreferredSize(new java.awt.Dimension(0, 30));

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
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

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
        txtNombre.setEnabled(false);
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
        comBoxPerfil.setEnabled(false);
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
        txtAPaterno.setEnabled(false);
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
        txtAMaterno.setEnabled(false);
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
        txtTelefono.setEnabled(false);
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
        txtDireccion.setEnabled(false);
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
        txtUsuario.setEnabled(false);
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
        txtPassword.setEnabled(false);
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
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(243, 124, 34));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(21, 149, 136));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(209, 49, 53));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(13, 13, 13));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Cerrar Sesion");
        btnSalir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnSalir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnSalir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(149, 119, 203));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEditar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
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
                                    .addComponent(jLabelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(76, 76, 76)
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
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabelControlUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
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
                .addGap(40, 40, 40)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
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
    Timer timer,usuarioConectado;
    
    public void TimerTime() {
        jLabelError.setText("");
        jLabelError.setOpaque(false);
        timer.stop();
    }
    public ActionListener payActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String activo = "";
                cS = new CerrarSesion();
                cS.setUsuario(usuario);
                activo = db.getRefresh(conn, cS);
                //Si se llega a modifcar
                switch (activo) {
                    case "null":
                        Salir();
                        break;
                    case "1":
                        break;
                    case "0":
                        Salir();
                        break;
                    default:
                        break;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    //tiempo para los errores
    private int seg;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            seg++;
            if(seg % 2 == 0){
                TimerTime();
            }
        }
    };
    
    public void HabilitarTextFields() {
        txtId.setEnabled(false);
        txtNombre.setEnabled(true);
        txtAPaterno.setEnabled(true);
        txtAMaterno.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtPassword.setEnabled(true);
        comBoxPerfil.setEnabled(true);
    }

    public void DeshabilitarFields() {
        txtId.setEnabled(true);
        txtNombre.setEnabled(false);
        txtAPaterno.setEnabled(false);
        txtAMaterno.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
        comBoxPerfil.setEnabled(false);
    }

    public void CleanFields() {
        jLabelError.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtAPaterno.setText("");
        txtAMaterno.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
        comBoxPerfil.setSelectedIndex(0);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtAPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtAMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
    }

    public boolean ValidateFields() {
        String n = txtNombre.getText(), aP = txtAPaterno.getText(),
                aM = txtAMaterno.getText(), tel = txtTelefono.getText(),
                dir = txtDireccion.getText(), usua = txtUsuario.getText(),
                pass = txtPassword.getText();
        int con = 0;

        if (n.equals("")) {
            txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (aP.equals("")) {
            txtAPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtAPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (aM.equals("")) {
            txtAMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtAMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (tel.equals("")) {
            txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (dir.equals("")) {
            txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (usua.equals("")) {
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (pass.equals("")) {
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
            con += 1;
        } else {
            txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        }
        if (con == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Salir() {
        try {
            usuarioConectado.stop();
            cS = new CerrarSesion();
            cS.setUsuario(txtUsuarioAdmin.getText());
            cS.setEstatus();
            db.CerrarSesion(conn, cS);
            IniciarSesion ini = new IniciarSesion();
            ini.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            txtId.setText(String.valueOf(db.getID(conn)));
            HabilitarTextFields();
            btnNuevo.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnBuscarId.setEnabled(false);
        } catch (SQLException ex) {
            //Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!ValidateFields()) {
            jLabelError.setText("Datos incompletos");
            jLabelError.setOpaque(true);
            timer.start();
        } else {
            us = new Usuario();
            us.setId(Integer.parseInt(txtId.getText()));
            us.setNombres(txtNombre.getText());
            us.setApellidoPaterno(txtAPaterno.getText());
            us.setApellidoMaterno(txtAMaterno.getText());
            us.setTelefono(txtTelefono.getText());
            us.setDireccion(txtDireccion.getText());
            us.setUsuario(txtUsuario.getText());
            us.setPassword(txtPassword.getText());
            us.setTipo(comBoxPerfil.getSelectedIndex());
            boolean valor;
            valor = db.Salvar(conn, us);
            if (valor) {
                CleanFields();
                DeshabilitarFields();
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnBuscarId.setEnabled(true);
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
            } else {
                jLabelError.setText("Usuario repetido");
                jLabelError.setOpaque(true);
                txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
                timer.start();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CleanFields();
        DeshabilitarFields();
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscarId.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        boolean estatus;
        //colocar validacion de caracteres no validos a-zA-Z y caracteres especiales 
        try {
            Integer.parseInt(txtId.getText());
            estatus = true;
        } catch (NumberFormatException e) {
            estatus = false;
        }
        if (txtId.getText().equals("") || !estatus) {
            jLabelError.setText("Usuario no encontrado");
            jLabelError.setOpaque(true);
            timer.start();
        } else {
            int id = Integer.valueOf(txtId.getText());
            try {
                if (id > db.getID(conn) || id == db.getID(conn)) {
                    jLabelError.setText("Usuario no encontrado");
                    jLabelError.setOpaque(true);
                    timer.start();
                } else {
                    try {
                        String[] registro;
                        us = new Usuario();
                        us.setId(Integer.parseInt(txtId.getText()));
                        registro = db.Buscar(conn, us);
                        if ("null".equals(registro[0])) {
                            jLabelError.setText("Usuario no encontrado");
                            jLabelError.setOpaque(true);
                            timer.start();
                        } else {
                            txtNombre.setText(registro[0]);
                            txtAPaterno.setText(registro[1]);
                            txtAMaterno.setText(registro[2]);
                            txtTelefono.setText(registro[3]);
                            txtDireccion.setText(registro[4]);
                            txtUsuario.setText(registro[5]);
                            txtPassword.setText(registro[6]);
                            comBoxPerfil.setSelectedIndex(Integer.parseInt(registro[7]));
                            HabilitarTextFields();
                            btnNuevo.setEnabled(false);
                            btnGuardar.setEnabled(false);
                            btnCancelar.setEnabled(true);
                            btnEditar.setEnabled(true);
                            btnEliminar.setEnabled(true);
                            btnBuscarId.setEnabled(false);
                        }
                    } catch (SQLException ex) {
                        //Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            us = new Usuario();
            us.setId(Integer.parseInt(txtId.getText()));
            db.Eliminar(conn, us);
            DeshabilitarFields();
            btnNuevo.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnBuscarId.setEnabled(true);
            CleanFields();
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!ValidateFields()) {
            jLabelError.setText("Datos incompletos");
            jLabelError.setOpaque(true);
            timer.start();
        } else {
            us = new Usuario();
            us.setId(Integer.parseInt(txtId.getText()));
            us.setNombres(txtNombre.getText());
            us.setApellidoPaterno(txtAPaterno.getText());
            us.setApellidoMaterno(txtAMaterno.getText());
            us.setTelefono(txtTelefono.getText());
            us.setDireccion(txtDireccion.getText());
            us.setUsuario(txtUsuario.getText());
            us.setPassword(txtPassword.getText());
            us.setTipo(comBoxPerfil.getSelectedIndex());
            boolean valor = db.Editar(conn, us);
            if (valor) {
                CleanFields();
                DeshabilitarFields();
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnBuscarId.setEnabled(true);
                btnEliminar.setEnabled(false);
            } else {
                jLabelError.setText("Usuario repetido");
                jLabelError.setOpaque(true);
                txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
                timer.start();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comBoxPerfil;
    private javax.swing.JLabel jLabaelDireccion;
    private javax.swing.JLabel jLabelAMaterno;
    private javax.swing.JLabel jLabelAPaterno;
    private javax.swing.JLabel jLabelControlUsuario;
    private javax.swing.JLabel jLabelError;
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
    public static final javax.swing.JLabel txtUsuarioAdmin = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
