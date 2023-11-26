package controlador;

import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorAtencionMedica {

    public static int registrarAtencionMedica(int idPaciente, int idEspecialidad, String horaAtencion,
            String fechaAtencion, String observacionMedica, String indicacionMedica) {
        int idHistoriaClinica = 0;
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                // Insertar datos en la tabla atencion_medica
                String sql = "INSERT INTO atencion_medica (id_paciente, id_especialidad, hora_atencion, fecha_atencion, t_estado_atencion, t_observacion_medica, t_indicacion_medica) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setInt(1, idPaciente);
                    statement.setInt(2, idEspecialidad);
                    statement.setString(3, horaAtencion);
                    statement.setString(4, fechaAtencion);
                    statement.setString(5, "En proceso");
                    statement.setString(6, observacionMedica);
                    statement.setString(7, indicacionMedica);

                    statement.executeUpdate();

                    // Obtener el ID autogenerado
                    ResultSet generatedKeys = statement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        idHistoriaClinica = generatedKeys.getInt(1);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }
        return idHistoriaClinica;
    }

    // Método para obtener la lista de apellidos de pacientes
    public List<String> obtenerApellidosPacientes() {
        Connection connection = Conexion.getConnection();
        List<String> apellidos = new ArrayList<>();

        if (connection != null) {
            try {
                String sql = "SELECT t_apellidos_paciente FROM Paciente";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        String apellido = resultSet.getString("t_apellidos_paciente");
                        apellidos.add(apellido);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return apellidos;
    }

    // Método para obtener la lista de nombres de especialidades
    public List<String> obtenerNombresEspecialidades() {
        Connection connection = Conexion.getConnection();
        List<String> nombresEspecialidades = new ArrayList<>();

        if (connection != null) {
            try {
                String sql = "SELECT t_nombre_especialidad FROM especialidad";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        String nombreEspecialidad = resultSet.getString("t_nombre_especialidad");
                        nombresEspecialidades.add(nombreEspecialidad);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return nombresEspecialidades;
    }

    // Método para obtener la lista de apellidos de médicos
    public List<String> obtenerApellidosMedicos() {
        Connection connection = Conexion.getConnection();
        List<String> apellidosMedicos = new ArrayList<>();

        if (connection != null) {
            try {
                String sql = "SELECT t_apellidos_medico FROM medico";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        String apellidoMedico = resultSet.getString("t_apellidos_medico");
                        apellidosMedicos.add(apellidoMedico);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return apellidosMedicos;
    }

    public static int obtenerIdPaciente(String nombrePaciente) {
        int idPaciente = 0;
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "SELECT id_paciente FROM paciente WHERE t_apellidos_paciente = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, nombrePaciente);

                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        idPaciente = resultSet.getInt("id_paciente");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }
        return idPaciente;
    }

    public static int obtenerIdEspecialidad(String nombreEspecialidad) {
        int idEspecialidad = 0;
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "SELECT id_especialidad FROM especialidad WHERE t_nombre_especialidad = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, nombreEspecialidad);

                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        idEspecialidad = resultSet.getInt("id_especialidad");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }
        return idEspecialidad;
    }

}
