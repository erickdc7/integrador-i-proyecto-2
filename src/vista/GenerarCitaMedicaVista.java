package vista;

import static controlador.ControladorAtencionMedica.obtenerIdEspecialidad;
import controlador.ControladorCitaMedica;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GenerarCitaMedicaVista extends javax.swing.JFrame {

    private final ControladorCitaMedica controladorCitaMedica;

    public GenerarCitaMedicaVista() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        // Establece la imagen en el JLabel 'logo' utilizando el método SetImageLabel
        SetImageLabel(logo, "src/img/logo.png");

        // Inicializar el controlador
        controladorCitaMedica = new ControladorCitaMedica();

        // Llenar el ComboBox de Historia Clínica al iniciar la vista
        llenarComboBoxHistoriaClinica();

        // Llenar el ComboBox de Especialidad
        llenarComboBoxEspecialidad();

        // Llenar el ComboBox de Médicos al iniciar la vista
        llenarComboBoxMedicos();

        // Llenar el ComboBox de Fechas de Atención al iniciar la vista
        llenarComboBoxFechasAtencion();

        // Llenar el ComboBox de Horas de Atención al iniciar la ventana
        llenarComboBoxHorasAtencion();
    }

    // Método para llenar el ComboBox de Horas de Atención
    private void llenarComboBoxHorasAtencion() {
        // Obtener todas las horas de atención desde el controlador
        List<String> horasAtencion = controladorCitaMedica.obtenerTodasHorasAtencion();

        // Limpiar el ComboBox antes de agregar los nuevos elementos
        txtHora.removeAllItems();

        // Agregar las horas al ComboBox
        for (String hora : horasAtencion) {
            txtHora.addItem(hora);
        }
    }

    // Método para llenar el ComboBox de Historia Clínica
    private void llenarComboBoxHistoriaClinica() {
        // Obtener los IDs de historia clínica desde el controlador
        List<Integer> idsHistoriaClinica = controladorCitaMedica.obtenerIdsHistoriaClinica();

        // Limpiar el ComboBox antes de agregar los nuevos elementos
        txtHistoriaClinica.removeAllItems();

        // Agregar los IDs al ComboBox
        for (Integer id : idsHistoriaClinica) {
            txtHistoriaClinica.addItem(String.valueOf(id));
        }
    }

    // Método para llenar el ComboBox de Especialidad
    private void llenarComboBoxEspecialidad() {
        // Obtener los nombres de especialidades desde el controlador
        List<String> nombresEspecialidades = controladorCitaMedica.obtenerNombresEspecialidades();

        // Limpiar el ComboBox antes de agregar los nuevos elementos
        txtEspecialidad.removeAllItems();

        // Agregar los nombres de especialidades al ComboBox
        for (String nombre : nombresEspecialidades) {
            txtEspecialidad.addItem(nombre);
        }
    }

    // Método para llenar el ComboBox de Médicos
    private void llenarComboBoxMedicos() {
        // Obtener los apellidos de los médicos desde el controlador
        List<String> apellidosMedicos = controladorCitaMedica.obtenerApellidosMedicos();

        // Limpiar el ComboBox antes de agregar los nuevos elementos
        txtMedico.removeAllItems();

        // Agregar los apellidos al ComboBox
        for (String apellido : apellidosMedicos) {
            txtMedico.addItem(apellido);
        }
    }

    // Método para llenar el ComboBox de Fechas de Atención
    private void llenarComboBoxFechasAtencion() {
        // Obtener las fechas de atención desde el controlador
        List<String> fechasAtencion = controladorCitaMedica.obtenerFechasAtencion();

        // Limpiar el ComboBox antes de agregar los nuevos elementos
        txtFecha.removeAllItems();

        // Agregar las fechas al ComboBox
        for (String fecha : fechasAtencion) {
            txtFecha.addItem(fecha);
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
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHistoriaClinica = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        btnLimpiarDatos = new javax.swing.JButton();
        btnGrabarCitaMedica = new javax.swing.JButton();
        txtMedico = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JComboBox<>();
        txtHora = new javax.swing.JComboBox<>();
        txtEspecialidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar cita médica");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 243, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 23, 33));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Centro Médico Uribe");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jLabel11.setForeground(new java.awt.Color(18, 23, 33));
        jLabel11.setText("Registro de paciente");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 25));

        jLabel12.setForeground(new java.awt.Color(18, 23, 33));
        jLabel12.setText("Búsqueda de paciente");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 23, 33));
        jLabel13.setText("Generar cita médica");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 170, 25));

        jLabel14.setForeground(new java.awt.Color(18, 23, 33));
        jLabel14.setText("Búsqueda de cita médica");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 25));

        jLabel15.setForeground(new java.awt.Color(18, 23, 33));
        jLabel15.setText("Registro de médico");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 25));

        jLabel16.setForeground(new java.awt.Color(18, 23, 33));
        jLabel16.setText("Generar historia clínica");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 25));

        jLabel17.setForeground(new java.awt.Color(18, 23, 33));
        jLabel17.setText("Registrar atención médica");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 5));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 5));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 5));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 5));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 5));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 5));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 5));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 190, 5));

        jLabel18.setForeground(new java.awt.Color(18, 23, 33));
        jLabel18.setText("Búsqueda de historia clínica");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 25));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel2.setBackground(new java.awt.Color(221, 219, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 23, 33));
        jLabel1.setText("Generar cita médica");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(18, 23, 33));
        jLabel2.setText("Complete los siguientes campos para programar la cita médica.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 23, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Motivo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 23, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Historia clínica:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 23, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 23, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hora:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 23, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Médico:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 23, 33));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Especialidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 30));

        txtHistoriaClinica.setForeground(new java.awt.Color(18, 23, 33));
        txtHistoriaClinica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Historia Clínica 1", "Especialidad 2", "Especialidad 3", "Especialidad 4" }));
        jPanel2.add(txtHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 240, 30));

        txtMotivo.setColumns(20);
        txtMotivo.setForeground(new java.awt.Color(18, 23, 33));
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 240, 110));

        btnLimpiarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarDatos.setForeground(new java.awt.Color(18, 23, 33));
        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 130, 30));

        btnGrabarCitaMedica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGrabarCitaMedica.setForeground(new java.awt.Color(18, 23, 33));
        btnGrabarCitaMedica.setText("Grabar cita médica");
        btnGrabarCitaMedica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabarCitaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarCitaMedicaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabarCitaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 170, 30));

        txtMedico.setForeground(new java.awt.Color(18, 23, 33));
        txtMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico 1", "Médico 2", "Médico 3", "Médico 4" }));
        jPanel2.add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 240, 30));

        txtFecha.setForeground(new java.awt.Color(18, 23, 33));
        txtFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3/12/2023", "5/12/2023", "6/12/2023", "7/12/2023", "9/12/2023" }));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 240, 30));

        txtHora.setForeground(new java.awt.Color(18, 23, 33));
        txtHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:30 a.m.", "9:00 a.m.", "10:30 a.m.", "12:00 p.m.", "14:30 p.m.", "15.00 p.m.", " ", " " }));
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, 30));

        txtEspecialidad.setForeground(new java.awt.Color(18, 23, 33));
        txtEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad 1", "Especialidad 2", "Especialidad 3", "Especialidad 4" }));
        jPanel2.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, 30));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Paciente
        RegistroPacienteVista RP = new RegistroPacienteVista();
        RP.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Búsqueda de Paciente
        BusquedaPacienteVista BPV = new BusquedaPacienteVista();
        BPV.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Cita Medica
        BusquedaCitaMedicaVista BCM = new BusquedaCitaMedicaVista();
        BCM.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Medico
        RegistroMedicoVista RM = new RegistroMedicoVista();
        RM.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Historia Medica
        GenerarHistoriaMedicaVista RHM = new GenerarHistoriaMedicaVista();
        RHM.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Generar Atención Médica
        GenerarAtencionMedicaVista GAM = new GenerarAtencionMedicaVista();
        GAM.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Historia Medica
        BusquedaHistoriaMedicaVista BHM = new BusquedaHistoriaMedicaVista();
        BHM.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnGrabarCitaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarCitaMedicaActionPerformed
        // Obtener los valores de los campos en el formulario
        int idHistoriaClinica = Integer.parseInt((String) txtHistoriaClinica.getSelectedItem());
        int idEspecialidad = obtenerIdEspecialidad(txtEspecialidad.getSelectedItem().toString());
        String fecha = (String) txtFecha.getSelectedItem();
        String hora = (String) txtHora.getSelectedItem();
        String motivo = txtMotivo.getText();

        // Llamada al controlador para registrar la atención médica
        int idCitaMedica = ControladorCitaMedica.guardarCitaMedica(idHistoriaClinica, idEspecialidad, fecha, hora, motivo);

        if (idCitaMedica != -1) {
            // Registro exitoso
            JOptionPane.showMessageDialog(this, "Registro de atención médica exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Error en el registro
            JOptionPane.showMessageDialog(this, "Error en el registro. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGrabarCitaMedicaActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        txtHistoriaClinica.setSelectedIndex(0);
        txtEspecialidad.setSelectedIndex(0);
        txtMedico.setSelectedIndex(0);
        txtFecha.setSelectedIndex(0);
        txtHora.setSelectedIndex(0);
        txtMotivo.setText("");
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
            java.util.logging.Logger.getLogger(GenerarCitaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarCitaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarCitaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarCitaMedicaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarCitaMedicaVista().setVisible(true);
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
    private javax.swing.JButton btnGrabarCitaMedica;
    private javax.swing.JButton btnLimpiarDatos;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> txtEspecialidad;
    private javax.swing.JComboBox<String> txtFecha;
    private javax.swing.JComboBox<String> txtHistoriaClinica;
    private javax.swing.JComboBox<String> txtHora;
    private javax.swing.JComboBox<String> txtMedico;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
}
