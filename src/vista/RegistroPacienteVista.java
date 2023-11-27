package vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelo.Paciente;
import controlador.ControladorPaciente;
import javax.swing.JOptionPane;

public class RegistroPacienteVista extends javax.swing.JFrame {

    private ControladorPaciente controladorPaciente;

    public RegistroPacienteVista() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        // Establece la imagen en el JLabel 'logo' utilizando el método SetImageLabel
        SetImageLabel(logo, "src/img/logo.png");

        // Inicializa el controlador de paciente
        controladorPaciente = new ControladorPaciente();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnLimpiarDatos = new javax.swing.JButton();
        btnRegistrarPaciente = new javax.swing.JButton();
        txtGenero = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de paciente");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 243, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 23, 33));
        jLabel9.setText("Registro de paciente");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 23, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Centro Médico Uribe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jLabel10.setForeground(new java.awt.Color(18, 23, 33));
        jLabel10.setText("Búsqueda de paciente");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 25));

        jLabel11.setForeground(new java.awt.Color(18, 23, 33));
        jLabel11.setText("Generar cita médica");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 25));

        jLabel12.setForeground(new java.awt.Color(18, 23, 33));
        jLabel12.setText("Búsqueda de cita médica");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 25));

        jLabel13.setForeground(new java.awt.Color(18, 23, 33));
        jLabel13.setText("Registro de médico");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 25));

        jLabel14.setForeground(new java.awt.Color(18, 23, 33));
        jLabel14.setText("Generar historia clínica");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 25));

        jLabel15.setForeground(new java.awt.Color(18, 23, 33));
        jLabel15.setText("Registrar atención médica");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 5));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 5));

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

        jLabel19.setForeground(new java.awt.Color(18, 23, 33));
        jLabel19.setText("Búsqueda de historia clínica");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 25));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel2.setBackground(new java.awt.Color(221, 219, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 23, 33));
        jLabel1.setText("Registro de paciente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 23, 33));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombres:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, 30));

        txtNombres.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 23, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 30));

        txtDni.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 23, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Edad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 140, 30));

        txtEdad.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 23, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Género:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 23, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Correo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 30));

        txtCorreo.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 23, 33));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Dirección:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 30));

        txtDireccion.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 210, 30));

        btnLimpiarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarDatos.setForeground(new java.awt.Color(18, 23, 33));
        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 130, 30));

        btnRegistrarPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarPaciente.setForeground(new java.awt.Color(18, 23, 33));
        btnRegistrarPaciente.setText("Registrar paciente");
        btnRegistrarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 170, 30));

        txtGenero.setForeground(new java.awt.Color(18, 23, 33));
        txtGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, 30));

        jLabel17.setForeground(new java.awt.Color(18, 23, 33));
        jLabel17.setText("Complete los siguientes campos con la información del paciente.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 360, -1));

        txtApellidos.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(18, 23, 33));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Apellidos:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(18, 23, 33));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Celular:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 30));

        txtCelular.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 210, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(18, 23, 33));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Distrito:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 30));

        txtDistrito.setForeground(new java.awt.Color(18, 23, 33));
        jPanel2.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 210, 30));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 550));

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

        // Abre la nueva ventana Generar Atención Médica
        GenerarAtencionMedicaVista GAM = new GenerarAtencionMedicaVista();
        GAM.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana Busqueda de Historia Medica
        BusquedaHistoriaMedicaVista BHM = new BusquedaHistoriaMedicaVista();
        BHM.setVisible(true);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        // Obtener los datos de la vista
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String dni = txtDni.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String genero = txtGenero.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String celular = txtCelular.getText();
        String direccion = txtDireccion.getText();
        String distrito = txtDistrito.getText();

        // Crear un objeto Paciente con los datos de la vista
        Paciente paciente = new Paciente(0, nombres, apellidos, dni, edad, genero, correo, celular, direccion, distrito);

        // Llamar al método insertarPaciente del controlador
        boolean registroExitoso = controladorPaciente.insertarPaciente(paciente);

        // Verificar si el registro fue exitoso
        if (registroExitoso) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro de paciente exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error al registrar paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        // Limpiar los campos
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtGenero.setSelectedIndex(0);
        txtCorreo.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        txtDistrito.setText("");
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
            java.util.logging.Logger.getLogger(RegistroPacienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPacienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPacienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPacienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPacienteVista().setVisible(true);
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
    private javax.swing.JButton btnRegistrarPaciente;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JComboBox<String> txtGenero;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
