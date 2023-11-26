package controlador;

import modelo.Conexion;
import modelo.HistoriaClinica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorHistoriaClinica {

    // Método para obtener el id_paciente por DNI
    private int obtenerIdPacientePorDNI(String dni) {
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "SELECT id_paciente FROM Paciente WHERE t_dni_paciente = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, dni);
                    ResultSet resultSet = statement.executeQuery();

                    if (resultSet.next()) {
                        return resultSet.getInt("id_paciente");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return -1; // Retorna -1 si no se encuentra el paciente
    }

    // Método para insertar una nueva historia clínica
    public boolean insertarHistoriaClinica(HistoriaClinica historiaClinica, String dniPaciente) {
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                // Obtener el id_paciente a partir del DNI
                int idPaciente = obtenerIdPacientePorDNI(dniPaciente);

                if (idPaciente != -1) {
                    String sql = "INSERT INTO historia_clinica (id_paciente, t_enfermedad_patologica, t_tratamiento, t_alergias, t_enfermedad_no_patologica, t_historial_padre, t_historial_madre, t_historial_abuelos_pat, t_historial_abuelos_mat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        statement.setInt(1, idPaciente);
                        statement.setString(2, historiaClinica.getEnfermedadPatologica());
                        statement.setString(3, historiaClinica.getTratamiento());
                        statement.setString(4, historiaClinica.getAlergias());
                        statement.setString(5, historiaClinica.getEnfermedadNoPatologica());
                        statement.setString(6, historiaClinica.getHistorialPadre());
                        statement.setString(7, historiaClinica.getHistorialMadre());
                        statement.setString(8, historiaClinica.getHistorialAbuelosPat());
                        statement.setString(9, historiaClinica.getHistorialAbuelosMat());

                        int filasAfectadas = statement.executeUpdate();

                        // Verificar si al menos una fila fue insertada con éxito
                        return filasAfectadas > 0;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return false; // Si la conexión es nula o no se pudo obtener el id_paciente
    }

    // Método para obtener la lista de DNI de pacientes
    public List<String> obtenerDnisPacientes() {
        Connection connection = Conexion.getConnection();

        List<String> dnis = new ArrayList<>();

        if (connection != null) {
            try {
                String sql = "SELECT t_dni_paciente FROM Paciente";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        String dni = resultSet.getString("t_dni_paciente");
                        dnis.add(dni);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return dnis;
    }
}
