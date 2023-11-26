package vista;

import controlador.ControladorHistoriaClinica;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.HistoriaClinica;
import modelo.Paciente;

public class GenerarHistoriaMedicaVista extends javax.swing.JFrame {

    private ControladorHistoriaClinica controladorHistoriaClinica;

    public GenerarHistoriaMedicaVista() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        SetImageLabel(logo, "src/img/logo.png");

        controladorHistoriaClinica = new ControladorHistoriaClinica();

        // Llenar el JComboBox con los DNI de los pacientes al iniciar la ventana
        cargarDnisPacientes();
    }

    // Método para cargar los DNI de los pacientes en el JComboBox
    private void cargarDnisPacientes() {
        // Obtener la lista de DNI de los pacientes desde el controlador
        List<String> dnis = controladorHistoriaClinica.obtenerDnisPacientes();

        // Limpiar el JComboBox
        txtDni.removeAllItems();

        // Agregar los DNI al JComboBox
        for (String dni : dnis) {
            txtDni.addItem(dni);
        }
    }

    // Icono del JFrame
    @Override
    public Image getIconImage() {
        // Obtiene la imagen del icono utilizando la clase Toolkit y la ruta de la imagen.
        // En este caso, la imagen se busca en el recurso del sistema llamado "img/logo.png".
        Image resValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return resValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDni = new javax.swing.JComboBox<>();
        txtAlergias = new javax.swing.JTextField();
        txtTratamientos = new javax.swing.JTextField();
        txtEnfNoPatologicas = new javax.swing.JTextField();
        btnLimpiarDatos = new javax.swing.JButton();
        btnGrabarHistoriaClinica = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtEnfPatologicas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtHistoriaMadre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHistoriaAbuelosPa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtHistoriaAbuelosMa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtHistoriaPadre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar historia clínica");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 243, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 23, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Centro Médico Uribe");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jLabel4.setForeground(new java.awt.Color(18, 23, 33));
        jLabel4.setText("Registro de paciente");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 25));

        jLabel5.setForeground(new java.awt.Color(18, 23, 33));
        jLabel5.setText("Búsqueda de paciente");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 25));

        jLabel6.setForeground(new java.awt.Color(18, 23, 33));
        jLabel6.setText("Generar cita médica");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 25));

        jLabel7.setForeground(new java.awt.Color(18, 23, 33));
        jLabel7.setText("Búsqueda de cita médica");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 25));

        jLabel8.setForeground(new java.awt.Color(18, 23, 33));
        jLabel8.setText("Registro de médico");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 23, 33));
        jLabel9.setText("Generar historia clínica");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 170, 25));

        jLabel10.setForeground(new java.awt.Color(18, 23, 33));
        jLabel10.setText("Registrar atención médica");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 5));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 5));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 5));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 5));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 5));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 5));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 190, 5));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 5));

        jLabel12.setForeground(new java.awt.Color(18, 23, 33));
        jLabel12.setText("Búsqueda de historia clínica");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 25));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel3.setBackground(new java.awt.Color(221, 219, 235));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 23, 33));
        jLabel1.setText("Generar historia clínica");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 23, 33));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Alergias:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(18, 23, 33));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Enfermedades patológicas:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(18, 23, 33));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Tratamientos:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(18, 23, 33));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Enfermedades no patológicas:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 30));

        txtDni.setForeground(new java.awt.Color(18, 23, 33));
        txtDni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI 1", "DNI 2", "DNI 3" }));
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 210, 30));

        txtAlergias.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));

        txtTratamientos.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 210, 30));

        txtEnfNoPatologicas.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtEnfNoPatologicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 30));

        btnLimpiarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarDatos.setForeground(new java.awt.Color(18, 23, 33));
        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 130, 30));

        btnGrabarHistoriaClinica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGrabarHistoriaClinica.setForeground(new java.awt.Color(18, 23, 33));
        btnGrabarHistoriaClinica.setText("Grabar historia clínica");
        btnGrabarHistoriaClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabarHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarHistoriaClinicaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGrabarHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 200, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(18, 23, 33));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("DNI:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 30));

        txtEnfPatologicas.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtEnfPatologicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(18, 23, 33));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Historial médico familiar");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(18, 23, 33));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Madre:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

        txtHistoriaMadre.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtHistoriaMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(18, 23, 33));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Abuelos paternos:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 30));

        txtHistoriaAbuelosPa.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtHistoriaAbuelosPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 210, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(18, 23, 33));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Abuelos maternos:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 200, 30));

        txtHistoriaAbuelosMa.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtHistoriaAbuelosMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 210, 30));

        jLabel13.setForeground(new java.awt.Color(18, 23, 33));
        jLabel13.setText("Complete los siguientes campos para registrar la historia clínica del paciente.");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(18, 23, 33));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Padre:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 30));

        txtHistoriaPadre.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtHistoriaPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 210, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 130, 10));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Paciente
        RegistroPacienteVista RP = new RegistroPacienteVista();
        RP.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Búsqueda de Paciente
        BusquedaPacienteVista BPV = new BusquedaPacienteVista();
        BPV.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Cita Medica
        GenerarCitaMedicaVista RCM = new GenerarCitaMedicaVista();
        RCM.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Cita Medica
        BusquedaCitaMedicaVista BCM = new BusquedaCitaMedicaVista();
        BCM.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Medico
        RegistroMedicoVista RM = new RegistroMedicoVista();
        RM.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Generar Atención Médica
        GenerarAtencionMedicaVista GAM = new GenerarAtencionMedicaVista();
        GAM.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Historia Medica
        BusquedaHistoriaMedicaVista BHM = new BusquedaHistoriaMedicaVista();
        BHM.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnGrabarHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarHistoriaClinicaActionPerformed
        // Obtener los valores de los campos del formulario
        String dniPaciente = (String) txtDni.getSelectedItem();
        String alergias = txtAlergias.getText();
        String enfermedadPatologica = txtEnfPatologicas.getText();
        String tratamiento = txtTratamientos.getText();
        String enfermedadNoPatologica = txtEnfNoPatologicas.getText();
        String historialPadre = txtHistoriaPadre.getText();
        String historialMadre = txtHistoriaMadre.getText();
        String historialAbuelosPat = txtHistoriaAbuelosPa.getText();
        String historialAbuelosMat = txtHistoriaAbuelosMa.getText();

        // Crear un objeto HistoriaClinica con los valores obtenidos
        HistoriaClinica historiaClinica = new HistoriaClinica(
                enfermedadPatologica,
                tratamiento,
                alergias,
                enfermedadNoPatologica,
                historialPadre,
                historialMadre,
                historialAbuelosPat,
                historialAbuelosMat
        );

        // Instanciar el controlador de historia clínica
        ControladorHistoriaClinica controladorHistoriaClinica = new ControladorHistoriaClinica();

        // Llamar al método para insertar la historia clínica en la base de datos
        boolean exito = controladorHistoriaClinica.insertarHistoriaClinica(historiaClinica, dniPaciente);

        // Verificar si la operación fue exitosa
        if (exito) {
            JOptionPane.showMessageDialog(this, "Historia clínica registrada exitosamente.");
            // Puedes agregar más lógica aquí, como limpiar los campos o realizar otras acciones después de la inserción.
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la historia clínica. Por favor, intenta nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGrabarHistoriaClinicaActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        txtDni.setSelectedIndex(0);
        txtAlergias.setText("");
        txtEnfPatologicas.setText("");
        txtTratamientos.setText("");
        txtEnfNoPatologicas.setText("");
        txtHistoriaPadre.setText("");
        txtHistoriaMadre.setText("");
        txtHistoriaAbuelosPa.setText("");
        txtHistoriaAbuelosMa.setText("");
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarHistoriaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarHistoriaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarHistoriaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarHistoriaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarHistoriaMedicaVista().setVisible(true);
            }
        });
    }

    // Establece una imagen en un JLabel y la adapta al tamaño del JLabel.
    private void SetImageLabel(JLabel labelName, String root) {
        // Crea un objeto ImageIcon a partir de la ruta de la imagen
        ImageIcon image = new ImageIcon(root);

        // Crea un objeto Icon escalando la imagen para que se ajuste al tamaño del JLabel
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );

        // Establece el icono en el JLabel
        labelName.setIcon(icon);

        // Actualiza la vista para mostrar la imagen
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGrabarHistoriaClinica;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtAlergias;
    private javax.swing.JComboBox<String> txtDni;
    private javax.swing.JTextField txtEnfNoPatologicas;
    private javax.swing.JTextField txtEnfPatologicas;
    private javax.swing.JTextField txtHistoriaAbuelosMa;
    private javax.swing.JTextField txtHistoriaAbuelosPa;
    private javax.swing.JTextField txtHistoriaMadre;
    private javax.swing.JTextField txtHistoriaPadre;
    private javax.swing.JTextField txtTratamientos;
    // End of variables declaration//GEN-END:variables
}
