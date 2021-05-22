package BandaProduccion;

import Clases.GraphicsX;
import ConexionUNO.InterfaceSerial;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;
import org.opencv.videoio.VideoCapture;

public class ControlProduccion extends javax.swing.JFrame {

    //variables globales
    String[] tempDatos;
    public static String sources = "D:\\Usuarios\\Luis Pablo Personal y Creativo\\Documentos\\GitHub\\JAVA-Banda-Produccion\\haarcascades\\haarcascade_frontalface_alt.xml"; //fotografias xml
    CascadeClassifier faceDetector = new CascadeClassifier(sources);
    boolean _cambioPestana= false, _activarVideo=true;
    //clases
    InterfaceSerial res;
    GraphicsX ObGraphicsX;

    public ControlProduccion() {
        if (txtUsuarioEmpl.getText().equals("")) {
            Salir();
        } else {
            initComponents();
            setLocationRelativeTo(null);
            //res = new InterfaceSerial();
            //res.initialize();
            timer = new Timer(10, acciones);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        ControlProduccionPanel = new javax.swing.JPanel();
        jLabelIngresados = new javax.swing.JLabel();
        txtIngresados = new javax.swing.JTextField();
        jLabelDefectuoso = new javax.swing.JLabel();
        txtDefectuosos = new javax.swing.JTextField();
        jLabelSalida = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        jLabelControlUsuario = new javax.swing.JLabel();
        jLabelEstatusGrafico = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanelGraficas = new javax.swing.JPanel();
        jPanelChartVelocidad = new javax.swing.JPanel();
        jPanelChartPiston = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanelVideo = new javax.swing.JPanel();
        txtNumeroEncontradas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("Empleado"); // NOI18N
        setSize(new java.awt.Dimension(1024, 640));

        jTabbedPane1.setBackground(new java.awt.Color(34, 34, 34));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1024, 640));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 191, 191));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1024, 640));

        ControlProduccionPanel.setBackground(new java.awt.Color(34, 34, 34));
        ControlProduccionPanel.setPreferredSize(new java.awt.Dimension(1024, 64));

        txtUsuarioEmpl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUsuarioEmpl.setForeground(new java.awt.Color(242, 242, 242));
        txtUsuarioEmpl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarioEmpl.setFocusable(false);
        txtUsuarioEmpl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtUsuarioEmpl.setInheritsPopupMenu(false);
        txtUsuarioEmpl.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout ControlProduccionPanelLayout = new javax.swing.GroupLayout(ControlProduccionPanel);
        ControlProduccionPanel.setLayout(ControlProduccionPanelLayout);
        ControlProduccionPanelLayout.setHorizontalGroup(
            ControlProduccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlProduccionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuarioEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlProduccionPanelLayout.setVerticalGroup(
            ControlProduccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlProduccionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuarioEmpl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelIngresados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelIngresados.setForeground(new java.awt.Color(13, 13, 13));
        jLabelIngresados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelIngresados.setText("Ingresados:");
        jLabelIngresados.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelIngresados.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelIngresados.setPreferredSize(new java.awt.Dimension(120, 19));

        txtIngresados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIngresados.setForeground(new java.awt.Color(112, 112, 112));
        txtIngresados.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIngresados.setToolTipText("");
        txtIngresados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 127, 251)));
        txtIngresados.setEnabled(false);
        txtIngresados.setMinimumSize(new java.awt.Dimension(200, 30));
        txtIngresados.setName(""); // NOI18N
        txtIngresados.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelDefectuoso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDefectuoso.setForeground(new java.awt.Color(13, 13, 13));
        jLabelDefectuoso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDefectuoso.setText("Defectuosos:");
        jLabelDefectuoso.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelDefectuoso.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelDefectuoso.setPreferredSize(new java.awt.Dimension(120, 19));

        txtDefectuosos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDefectuosos.setForeground(new java.awt.Color(112, 112, 112));
        txtDefectuosos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDefectuosos.setToolTipText("");
        txtDefectuosos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 49, 53)));
        txtDefectuosos.setEnabled(false);
        txtDefectuosos.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDefectuosos.setName(""); // NOI18N
        txtDefectuosos.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelSalida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSalida.setForeground(new java.awt.Color(13, 13, 13));
        jLabelSalida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSalida.setText("Salida:");
        jLabelSalida.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabelSalida.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabelSalida.setPreferredSize(new java.awt.Dimension(120, 19));

        txtSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(112, 112, 112));
        txtSalida.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSalida.setToolTipText("");
        txtSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 149, 136)));
        txtSalida.setEnabled(false);
        txtSalida.setMinimumSize(new java.awt.Dimension(200, 30));
        txtSalida.setName(""); // NOI18N
        txtSalida.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelControlUsuario.setBackground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelControlUsuario.setForeground(new java.awt.Color(13, 13, 13));
        jLabelControlUsuario.setText("Banda de Produccion");

        jLabelEstatusGrafico.setBackground(new java.awt.Color(13, 13, 13));
        jLabelEstatusGrafico.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelEstatusGrafico.setForeground(new java.awt.Color(13, 13, 13));
        jLabelEstatusGrafico.setText("Estatus Grafico");

        btnSalir.setBackground(new java.awt.Color(13, 13, 13));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Cerrar Sesion");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnSalir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnSalir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnPausar.setBackground(new java.awt.Color(243, 124, 34));
        btnPausar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPausar.setForeground(new java.awt.Color(255, 255, 255));
        btnPausar.setText("Pausar");
        btnPausar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPausar.setEnabled(false);
        btnPausar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnPausar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnPausar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(21, 149, 136));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnIniciar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnIniciar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jPanelChartVelocidad.setBackground(new java.awt.Color(21, 127, 251));
        jPanelChartVelocidad.setMinimumSize(new java.awt.Dimension(460, 200));
        jPanelChartVelocidad.setPreferredSize(new java.awt.Dimension(460, 200));
        jPanelChartVelocidad.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelChartVelocidadLayout = new javax.swing.GroupLayout(jPanelChartVelocidad);
        jPanelChartVelocidad.setLayout(jPanelChartVelocidadLayout);
        jPanelChartVelocidadLayout.setHorizontalGroup(
            jPanelChartVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanelChartVelocidadLayout.setVerticalGroup(
            jPanelChartVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelChartPiston.setBackground(new java.awt.Color(209, 49, 53));
        jPanelChartPiston.setMinimumSize(new java.awt.Dimension(460, 200));
        jPanelChartPiston.setPreferredSize(new java.awt.Dimension(460, 200));
        jPanelChartPiston.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelChartPistonLayout = new javax.swing.GroupLayout(jPanelChartPiston);
        jPanelChartPiston.setLayout(jPanelChartPistonLayout);
        jPanelChartPistonLayout.setHorizontalGroup(
            jPanelChartPistonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelChartPistonLayout.setVerticalGroup(
            jPanelChartPistonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelGraficasLayout = new javax.swing.GroupLayout(jPanelGraficas);
        jPanelGraficas.setLayout(jPanelGraficasLayout);
        jPanelGraficasLayout.setHorizontalGroup(
            jPanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChartVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addComponent(jPanelChartPiston, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        jPanelGraficasLayout.setVerticalGroup(
            jPanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGraficasLayout.createSequentialGroup()
                .addComponent(jPanelChartVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelChartPiston, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ControlProduccionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelControlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)
                        .addComponent(jLabelEstatusGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDefectuoso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDefectuosos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ControlProduccionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelControlUsuario)
                    .addComponent(jLabelEstatusGrafico))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabelIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabelDefectuoso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtDefectuosos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel2.setkGradientFocus(180);
        kGradientPanel2.setkStartColor(new java.awt.Color(191, 191, 191));

        jPanelVideo.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelVideoLayout = new javax.swing.GroupLayout(jPanelVideo);
        jPanelVideo.setLayout(jPanelVideoLayout);
        jPanelVideoLayout.setHorizontalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelVideoLayout.setVerticalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        txtNumeroEncontradas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumeroEncontradas.setText("No. de Encontrados");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtNumeroEncontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(854, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtNumeroEncontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Camara", kGradientPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Inicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //tiempo
    private Timer timer;
    private int seg, cs, velocidad, piston, mult = 5, defectuosos, entrada, salida;

    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs++;
            if (cs == 100) {
                cs = 0;
                ++seg;
                if (seg % mult == 0) {
                    defectuosos++;
                    velocidad = 0;
                    piston = 1;
                } else {
                    entrada++;
                    salida = entrada - defectuosos;
                    piston = 0;
                    velocidad = 400;
                }
            }
            graficarDatos();
        }
    };

    //limpiar campos y salir
    public void limpiarCampos() {
        cs = 0;
        seg = 0;
        velocidad = 0;
        piston = 0;
        entrada = 0;
        defectuosos = 0;
        salida = 0;
        _cambioPestana = false;
        txtIngresados.setText("");
        txtDefectuosos.setText("");
        txtSalida.setText("");
        this.jPanelChartVelocidad.setLayout(null);
        this.jPanelChartPiston.setLayout(null);
        graficarDatos();
    }

    public void Salir() {
        
        IniciarSesion ini = new IniciarSesion();
        ini.setVisible(true);
        this.setVisible(false);
        System.exit(0);
    }

    //botones
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (timer.isRunning()) {
            timer.stop();
        }
        btnIniciar.setText("Iniciar");
        limpiarCampos();
        Salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        _activarVideo=false;
        prenderCamara();
        timer.stop();
        btnIniciar.setEnabled(true);
        btnPausar.setEnabled(false);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        timer.start();
        _activarVideo=true;
        prenderCamara();
        btnIniciar.setText("Reanudar");
        btnIniciar.setEnabled(false);
        btnPausar.setEnabled(true);
        btnSalir.setEnabled(false);
    }//GEN-LAST:event_btnIniciarActionPerformed
   
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(!_cambioPestana){
            _cambioPestana =true;
        }else{
            _cambioPestana = false;
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged
    //graficas
    public void pistonActivo(int data1, int data2) {
        try {
            int[][] Array = {{data1, data2}};
            int[] Canal = new int[256];
            ObGraphicsX = new GraphicsX();
            //copiar a la matriz
            System.arraycopy(Array[0], 0, Canal, 0, Array[0].length);
            ObGraphicsX.piston(Canal, jPanelChartPiston);

        } catch (Exception e) {
            System.err.println("No se puedo graficar");
        }
    }

    public void velocidadBanda(int data1, int data2) {
        try {
            int[][] Array = {{data1, data2}};
            ObGraphicsX = new GraphicsX();
            int[] Canal = new int[256];
            ObGraphicsX = new GraphicsX();
            //copiar a la matriz
            System.arraycopy(Array[0], 0, Canal, 0, Array[0].length);
            ObGraphicsX.velocidadBanda(Canal, jPanelChartVelocidad);

        } catch (Exception e) {
            System.err.println("No se puedo graficar");
        }
    }

    //mandando datos
    public void graficarDatos() {
        int tiempo;
        tiempo = cs;
        if (tiempo == 10) {
            velocidadBanda(seg, velocidad);
            pistonActivo(seg, piston);
            tiempo = 0;
            openCv();
        }
    }

    public void openCv() {
        //depende de OpenCV
        txtIngresados.setText(String.valueOf(entrada));
        txtDefectuosos.setText(String.valueOf(defectuosos));
        txtSalida.setText(String.valueOf(salida));
    }
    public void prenderCamara() {
        (new Thread() {
            public void run() {
                VideoCapture capture = new VideoCapture(1);
                capture.open(0);

                MatOfRect rostros = new MatOfRect();
                MatOfByte mem = new MatOfByte();

                Mat frame = new Mat();
                Mat frame_gray = new Mat();
                //Mat RCI =null;
                Rect[] facesArray;
                Graphics g;
                BufferedImage buff = null;
                while (capture.read(frame)&&_activarVideo) {
                    if (frame.empty()) {
                        System.out.println("No hay Conexion con la camara");
                        break;
                    } else {
                        try {
                           //Saturacion 
                            long Umbral = 5000000;
                            int [] color =new int [2];
                            color[0] = new Color (255,255,255).getRGB();
                            color[1] = new Color (0,0,0).getRGB();
                            
                            //Procesos de reconocimiento
                            g = jPanelVideo.getGraphics();
                            Imgproc.cvtColor(frame, frame_gray, Imgproc.COLOR_BGR2GRAY);
                            Imgproc.equalizeHist(frame_gray, frame_gray);
                            double w = frame.width();
                            double h = frame.height();
                            faceDetector.detectMultiScale(frame_gray, rostros,
                                    1.1,
                                    2,
                                    0 | Objdetect.CASCADE_SCALE_IMAGE,
                                    new Size(30, 30),
                                    new Size(w, h)
                            );
                            facesArray = rostros.toArray();
                            //System.out.println("Numero de rostros" + facesArray.length);
                            
                            for (int i = 0; i < facesArray.length; i++) {
                                Point centerPoint = new Point(
                                        (facesArray[i].x + facesArray[i].width * 0.5),
                                        (facesArray[i].y + facesArray[i].height * 0.5)
                                );
                                Imgproc.ellipse(frame,
                                        centerPoint,
                                        new Size(facesArray[i].width * 0.5, facesArray[i].height * 0.5),
                                        0,
                                        0,
                                        360,
                                        new Scalar(255, 255, 255),
                                        4,
                                        8,
                                        0
                                );
                                
                                Mat faceROIMat = frame_gray.submat(facesArray[i]);
                                Imgproc.rectangle(frame,
                                        new Point(facesArray[i].x, facesArray[i].y),
                                        new Point((facesArray[i].x + facesArray[i].width), (facesArray[i].y + facesArray[i].height)),
                                        new Scalar(123, 213, 23, 120)
                                );
                                Imgproc.putText(frame,
                                        "Ancho: " + faceROIMat.width() + "Alto: " + faceROIMat.height() + "x= " + facesArray[i].x + "y= " + facesArray[i].y,
                                        new Point(facesArray[i].x, facesArray[i].y - 20),
                                        1,
                                        1,
                                        new Scalar(255, 255, 255)
                                );
                            }
                            int no = facesArray.length;
                            //Mandar al label si se identifica
                            txtNumeroEncontradas.setText(String.valueOf(no));

                            Imgcodecs.imencode(".jpg", frame, mem);
                            Image img;
                            
                            img = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                            buff = (BufferedImage) img;
                            //cambio de color de la imagen
                            for (int i = 0; i < buff.getWidth(); i++) {
                                for (int j = 0; j < buff.getHeight(); j++) {
                                    if (buff.getRGB(i, j) < -Umbral *2) {
                                        buff.setRGB(i, j, color[0]);
                                    } else {
                                        buff.setRGB(i, j, color[1]);
                                    }
                                }
                            }
                           
                            if(_cambioPestana){
                                jPanelVideo.removeAll();
                            }else{
                                //renderizado
                                g.drawImage(buff, 0, 0, jPanelVideo.getWidth(), jPanelVideo.getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ControlProduccion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if (!_activarVideo) {
                    capture=null;
                    jPanelVideo.removeAll();
                    txtNumeroEncontradas.setText("");
                    Thread.interrupted();
                }
            }
        }).start();
    }
         
    //principal
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
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlProduccion().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlProduccionPanel;
    public static final javax.swing.JButton btnIniciar = new javax.swing.JButton();
    public static final javax.swing.JButton btnPausar = new javax.swing.JButton();
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelControlUsuario;
    private javax.swing.JLabel jLabelDefectuoso;
    private javax.swing.JLabel jLabelEstatusGrafico;
    private javax.swing.JLabel jLabelIngresados;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JPanel jPanelChartPiston;
    private javax.swing.JPanel jPanelChartVelocidad;
    private javax.swing.JPanel jPanelGraficas;
    private javax.swing.JPanel jPanelVideo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtDefectuosos;
    private javax.swing.JTextField txtIngresados;
    private javax.swing.JLabel txtNumeroEncontradas;
    private javax.swing.JTextField txtSalida;
    public static final javax.swing.JLabel txtUsuarioEmpl = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
