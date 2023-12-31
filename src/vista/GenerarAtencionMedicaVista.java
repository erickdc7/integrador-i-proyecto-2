package vista;

import controlador.ControladorAtencionMedica;
import static controlador.ControladorAtencionMedica.obtenerIdEspecialidad;
import static controlador.ControladorAtencionMedica.obtenerIdPaciente;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GenerarAtencionMedicaVista extends javax.swing.JFrame {

    private ControladorAtencionMedica controladorAtencionMedica;

    public GenerarAtencionMedicaVista() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        // Establece la imagen en el JLabel 'logo' utilizando el método SetImageLabel
        SetImageLabel(logo, "src/img/logo.png");

        controladorAtencionMedica = new ControladorAtencionMedica();

        // Llenar el JComboBox txtPaciente con los apellidos de la base de datos
        llenarComboBoxPacientes();

        // Llenar el JComboBox txtEspecialidad con los nombres de las especialidades de la base de datos
        llenarComboBoxEspecialidades();

        // Llenar el JComboBox txtMedico con los apellidos de los médicos de la base de datos
        llenarComboBoxMedicos();
    }

    // Agregar este método en GenerarAtencionMedicaVista
    private void llenarComboBoxPacientes() {
        ControladorAtencionMedica controladorPaciente = new ControladorAtencionMedica();
        List<String> apellidos = controladorPaciente.obtenerApellidosPacientes();

        // Limpiar el combo box antes de agregar los nuevos elementos
        txtPaciente.removeAllItems();

        // Agregar los apellidos al combo box
        for (String apellido : apellidos) {
            txtPaciente.addItem(apellido);
        }
    }

    // En GenerarAtencionMedicaVista
    private void llenarComboBoxEspecialidades() {
        ControladorAtencionMedica controladorEspecialidad = new ControladorAtencionMedica();
        List<String> nombresEspecialidades = controladorEspecialidad.obtenerNombresEspecialidades();

        // Limpiar el combo box antes de agregar los nuevos elementos
        txtEspecialidad.removeAllItems();

        // Agregar los nombres de las especialidades al combo box
        for (String nombreEspecialidad : nombresEspecialidades) {
            txtEspecialidad.addItem(nombreEspecialidad);
        }
    }

    // En GenerarAtencionMedicaVista
    private void llenarComboBoxMedicos() {
        ControladorAtencionMedica controladorMedico = new ControladorAtencionMedica();
        List<String> apellidosMedicos = controladorMedico.obtenerApellidosMedicos();

        // Limpiar el combo box antes de agregar los nuevos elementos
        txtMedico.removeAllItems();

        // Agregar los apellidos de los médicos al combo box
        for (String apellidoMedico : apellidosMedicos) {
            txtMedico.addItem(apellidoMedico);
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
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHistoriaClinica = new javax.swing.JTextField();
        txtMedico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JComboBox<>();
        txtEspecialidad = new javax.swing.JComboBox<>();
        btnRegistrarAtencionMedica = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtIndicacionMedica = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtObsMedica = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar atención médica");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 243, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 23, 33));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Centro Médico Uribe");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 5));

        jLabel9.setForeground(new java.awt.Color(18, 23, 33));
        jLabel9.setText("Registro de paciente");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 25));

        jLabel10.setForeground(new java.awt.Color(18, 23, 33));
        jLabel10.setText("Búsqueda de paciente");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 5));

        jLabel11.setForeground(new java.awt.Color(18, 23, 33));
        jLabel11.setText("Generar cita médica");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 25));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 5));

        jLabel12.setForeground(new java.awt.Color(18, 23, 33));
        jLabel12.setText("Búsqueda de cita médica");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 25));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 5));

        jLabel13.setForeground(new java.awt.Color(18, 23, 33));
        jLabel13.setText("Registro de médico");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 25));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 5));

        jLabel14.setForeground(new java.awt.Color(18, 23, 33));
        jLabel14.setText("Generar historia clínica");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 25));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 5));

        jLabel15.setForeground(new java.awt.Color(18, 23, 33));
        jLabel15.setText("Búsqueda de historia clínica");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 25));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 5));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(18, 23, 33));
        jLabel16.setText("Registrar atención médica");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 170, 25));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 190, 5));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel3.setBackground(new java.awt.Color(221, 219, 235));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 23, 33));
        jLabel1.setText("Registrar atención médica");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(18, 23, 33));
        jLabel2.setText("Complete los siguientes campos para registrar una atención médica.");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 23, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Médico:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 30));

        txtHistoriaClinica.setForeground(new java.awt.Color(18, 23, 33));
        txtHistoriaClinica.setFocusable(false);
        jPanel3.add(txtHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 30));

        txtMedico.setForeground(new java.awt.Color(18, 23, 33));
        txtMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 23, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Paciente:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 23, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 23, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Historia clínica:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 23, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Especialidad:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));

        txtDni.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, 30));

        txtPaciente.setForeground(new java.awt.Color(18, 23, 33));
        txtPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, 30));

        txtEspecialidad.setForeground(new java.awt.Color(18, 23, 33));
        txtEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 210, 30));

        btnRegistrarAtencionMedica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarAtencionMedica.setForeground(new java.awt.Color(18, 23, 33));
        btnRegistrarAtencionMedica.setText("Registrar atención médica");
        btnRegistrarAtencionMedica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarAtencionMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAtencionMedicaActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarAtencionMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 200, 30));

        btnLimpiarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarDatos.setForeground(new java.awt.Color(18, 23, 33));
        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 130, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(18, 23, 33));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha de atención:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 140, 30));

        txtFecha.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(18, 23, 33));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Hora de atención:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, 30));

        txtHora.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 210, 30));

        txtIndicacionMedica.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtIndicacionMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 210, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(18, 23, 33));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Indicaciones médicas:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 140, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(18, 23, 33));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Observación médica:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 140, 30));

        txtObsMedica.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtObsMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 210, 30));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Búsqueda de Paciente
        BusquedaPacienteVista BPV = new BusquedaPacienteVista();
        BPV.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Cita Medica
        GenerarCitaMedicaVista RCM = new GenerarCitaMedicaVista();
        RCM.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Cita Medica
        BusquedaCitaMedicaVista BCM = new BusquedaCitaMedicaVista();
        BCM.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Medico
        RegistroMedicoVista RM = new RegistroMedicoVista();
        RM.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Historia Medica
        GenerarHistoriaMedicaVista RHM = new GenerarHistoriaMedicaVista();
        RHM.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Historia Medica
        BusquedaHistoriaMedicaVista BHM = new BusquedaHistoriaMedicaVista();
        BHM.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Paciente
        RegistroPacienteVista RP = new RegistroPacienteVista();
        RP.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnRegistrarAtencionMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAtencionMedicaActionPerformed
        int idPaciente = obtenerIdPaciente(txtPaciente.getSelectedItem().toString());
        int idEspecialidad = obtenerIdEspecialidad(txtEspecialidad.getSelectedItem().toString());
        String horaAtencion = txtHora.getText();
        String fechaAtencion = txtFecha.getText();
        String observacionMedica = txtObsMedica.getText();
        String indicacionMedica = txtIndicacionMedica.getText();

        // Llamada al controlador para registrar la atención médica
        int idHistoriaClinica = ControladorAtencionMedica.registrarAtencionMedica(idPaciente, idEspecialidad,
                horaAtencion, fechaAtencion, observacionMedica, indicacionMedica);

        if (idHistoriaClinica != -1) {
            // Registro exitoso
            JOptionPane.showMessageDialog(this, "Registro de atención médica exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Error en el registro
            JOptionPane.showMessageDialog(this, "Error en el registro. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Mostrar el ID en el campo txtHistoriaClinica
        txtHistoriaClinica.setText(String.valueOf(idHistoriaClinica));
    }//GEN-LAST:event_btnRegistrarAtencionMedicaActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        txtDni.setText("");
        txtPaciente.setSelectedIndex(0);
        txtHistoriaClinica.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtObsMedica.setText("");
        txtIndicacionMedica.setText("");
        txtEspecialidad.setSelectedIndex(0);
        txtMedico.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(GenerarAtencionMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarAtencionMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarAtencionMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarAtencionMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarAtencionMedicaVista().setVisible(true);
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
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnRegistrarAtencionMedica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JComboBox<String> txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHistoriaClinica;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIndicacionMedica;
    private javax.swing.JComboBox<String> txtMedico;
    private javax.swing.JTextField txtObsMedica;
    private javax.swing.JComboBox<String> txtPaciente;
    // End of variables declaration//GEN-END:variables
}
