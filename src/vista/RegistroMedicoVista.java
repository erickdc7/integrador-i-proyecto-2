package vista;

import controlador.ControladorMedico;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Especialidad;
import modelo.Medico;

public class RegistroMedicoVista extends javax.swing.JFrame {

    private ControladorMedico controladorMedico;

    public RegistroMedicoVista() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        // Establece la imagen en el JLabel 'logo' utilizando el método SetImageLabel
        SetImageLabel(logo, "src/img/logo.png");

        controladorMedico = new ControladorMedico();

        // Inicializar el JComboBox de Especialidad con los datos de la base de datos
        cargarEspecialidades();
    }

    // Icono del JFrame
    @Override
    public Image getIconImage() {
        // Obtiene la imagen del icono utilizando la clase Toolkit y la ruta de la imagen.
        // En este caso, la imagen se busca en el recurso del sistema llamado "img/logo.png".
        Image resValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return resValue;
    }

    // Método para cargar las especialidades en el JComboBox
    private void cargarEspecialidades() {
        ControladorMedico controladorMedico = new ControladorMedico();
        List<Especialidad> especialidades = controladorMedico.obtenerEspecialidades();

        // Limpiar el modelo actual del JComboBox
        txtEspecialidad.removeAllItems();

        // Agregar las especialidades al JComboBox
        for (Especialidad especialidad : especialidades) {
            txtEspecialidad.addItem(especialidad.getNombreEspecialidad());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnRegistrarMedico = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        txtGenero = new javax.swing.JComboBox<>();
        txtEspecialidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de médico");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 243, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 23, 33));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Centro Médico Uribe");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jLabel9.setForeground(new java.awt.Color(18, 23, 33));
        jLabel9.setText("Registro de paciente");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 25));

        jLabel11.setForeground(new java.awt.Color(18, 23, 33));
        jLabel11.setText("Búsqueda de paciente");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 25));

        jLabel12.setForeground(new java.awt.Color(18, 23, 33));
        jLabel12.setText("Generar cita médica");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 25));

        jLabel13.setForeground(new java.awt.Color(18, 23, 33));
        jLabel13.setText("Búsqueda de cita médica");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(18, 23, 33));
        jLabel14.setText("Registro de médico");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 25));

        jLabel15.setForeground(new java.awt.Color(18, 23, 33));
        jLabel15.setText("Generar historia clínica");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 25));

        jLabel16.setForeground(new java.awt.Color(18, 23, 33));
        jLabel16.setText("Registrar atención médica");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 5));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 5));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 5));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 5));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 5));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 5));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 5));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 190, 5));

        jLabel18.setForeground(new java.awt.Color(18, 23, 33));
        jLabel18.setText("Búsqueda de historia clínica");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 25));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel3.setBackground(new java.awt.Color(221, 219, 235));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 23, 33));
        jLabel1.setText("Registro de médico");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(18, 23, 33));
        jLabel2.setText("Complete los siguientes campos con la información del médico.");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 23, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombres:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        txtNombres.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 23, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Edad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, 30));

        txtEdad.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 23, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Género:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 23, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Especialidad:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 23, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("DNI:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 30));

        txtDni.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));

        btnRegistrarMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarMedico.setForeground(new java.awt.Color(18, 23, 33));
        btnRegistrarMedico.setText("Registrar médico");
        btnRegistrarMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, 30));

        btnLimpiarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarDatos.setForeground(new java.awt.Color(18, 23, 33));
        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 130, 30));

        txtGenero.setForeground(new java.awt.Color(18, 23, 33));
        txtGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 30));

        txtEspecialidad.setForeground(new java.awt.Color(18, 23, 33));
        txtEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiología", "Dermatología", "Neurología", "Pediatría", "Psiquiatría", "Oftalmología", "Ginecología", "Obstetricia", "Ortopedia" }));
        jPanel3.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 23, 33));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Celular:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, 30));

        txtCelular.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(18, 23, 33));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Apellidos:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 30));

        txtApellidos.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(18, 23, 33));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Correo:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 30));

        txtCorreo.setForeground(new java.awt.Color(18, 23, 33));
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 210, 30));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Paciente
        RegistroPacienteVista RP = new RegistroPacienteVista();
        RP.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Búsqueda de Paciente
        BusquedaPacienteVista BPV = new BusquedaPacienteVista();
        BPV.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Cita Medica
        GenerarCitaMedicaVista RCM = new GenerarCitaMedicaVista();
        RCM.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Cita Medica
        BusquedaCitaMedicaVista BCM = new BusquedaCitaMedicaVista();
        BCM.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Registro de Historia Medica
        GenerarHistoriaMedicaVista RHM = new GenerarHistoriaMedicaVista();
        RHM.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Generar Atención Médica
        GenerarAtencionMedicaVista GAM = new GenerarAtencionMedicaVista();
        GAM.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Historia Medica
        BusquedaHistoriaMedicaVista BHM = new BusquedaHistoriaMedicaVista();
        BHM.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btnRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicoActionPerformed
        // Obtener los valores de los campos del formulario
        String dni = txtDni.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String especialidadSeleccionada = (String) txtEspecialidad.getSelectedItem(); // Obtener la especialidad seleccionada
        String genero = (String) txtGenero.getSelectedItem(); // Obtener el género seleccionado
        int edad = Integer.parseInt(txtEdad.getText());
        String celular = txtCelular.getText();
        String correo = txtCorreo.getText();

        // Obtener el objeto Especialidad correspondiente a la opción seleccionada
        Especialidad especialidad = controladorMedico.obtenerEspecialidadPorNombre(especialidadSeleccionada);

        // Crear un objeto Medico con los datos ingresados
        Medico medico = new Medico(especialidad, nombres, apellidos, dni, edad, genero, celular, correo);

        // Insertar el médico en la base de datos
        boolean exito = controladorMedico.insertarMedico(medico);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Médico registrado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el médico.");
        }
    }//GEN-LAST:event_btnRegistrarMedicoActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtGenero.setSelectedIndex(0); // Reiniciar ComboBox
        txtEspecialidad.setSelectedIndex(0); // Reiniciar ComboBox
        txtCelular.setText("");
        txtCorreo.setText("");
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
            java.util.logging.Logger.getLogger(RegistroMedicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMedicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMedicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMedicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMedicoVista().setVisible(true);
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
    private javax.swing.JButton btnRegistrarMedico;
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
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JComboBox<String> txtEspecialidad;
    private javax.swing.JComboBox<String> txtGenero;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
