package controlador;

import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorAtencionMedica {

    // Método para registrar una atención médica en la base de datos
    public static int registrarAtencionMedica(int idPaciente, int idEspecialidad, String horaAtencion,
            String fechaAtencion, String observacionMedica, String indicacionMedica) {
        // Inicializar el ID de la historia clínica
        int idHistoriaClinica = 0;

        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Verificar que la conexión sea exitosa
        if (connection != null) {
            try {
                // Insertar datos en la tabla atencion_medica
                String sql = "INSERT INTO atencion_medica (id_paciente, id_especialidad, hora_atencion, fecha_atencion, t_estado_atencion, t_observacion_medica, t_indicacion_medica) VALUES (?, ?, ?, ?, ?, ?, ?)";

                // Usar un PreparedStatement para prevenir SQL injection y mejorar rendimiento
                try (PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    // Establecer los valores de los parámetros
                    statement.setInt(1, idPaciente);
                    statement.setInt(2, idEspecialidad);
                    statement.setString(3, horaAtencion);
                    statement.setString(4, fechaAtencion);
                    statement.setString(5, "En proceso");
                    statement.setString(6, observacionMedica);
                    statement.setString(7, indicacionMedica);

                    // Ejecutar la actualización en la base de datos
                    statement.executeUpdate();

                    // Obtener el ID autogenerado (clave primaria)
                    ResultSet generatedKeys = statement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        // Obtener el ID autogenerado
                        idHistoriaClinica = generatedKeys.getInt(1);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver el ID de la historia clínica (puede ser 0 si hay un error)
        return idHistoriaClinica;
    }

    // Método para obtener la lista de apellidos de pacientes
    public List<String> obtenerApellidosPacientes() {
        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Inicializar una lista para almacenar los apellidos
        List<String> apellidos = new ArrayList<>();

        // Verificar que la conexión sea exitosa
        if (connection != null) {
            try {
                // Consulta SQL para obtener apellidos
                String sql = "SELECT t_apellidos_paciente FROM Paciente";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                    // Iterar a través de los resultados y agregar cada apellido a la lista
                    while (resultSet.next()) {
                        String apellido = resultSet.getString("t_apellidos_paciente");
                        apellidos.add(apellido);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver la lista de apellidos (puede estar vacía si hay un error)
        return apellidos;
    }

    // Método para obtener la lista de nombres de especialidades
    public List<String> obtenerNombresEspecialidades() {
        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Inicializar una lista para almacenar los nombres de especialidades
        List<String> nombresEspecialidades = new ArrayList<>();

        if (connection != null) {
            try {
                // Consulta SQL para obtener nombres de especialidades
                String sql = "SELECT t_nombre_especialidad FROM especialidad";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                    // Iterar a través de los resultados y agregar cada nombre de especialidad a la lista
                    while (resultSet.next()) {
                        String nombreEspecialidad = resultSet.getString("t_nombre_especialidad");
                        nombresEspecialidades.add(nombreEspecialidad);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver la lista de nombres de especialidades (puede estar vacía si hay un error)
        return nombresEspecialidades;
    }

    // Método para obtener la lista de apellidos de médicos
    public List<String> obtenerApellidosMedicos() {
        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Inicializar una lista para almacenar los apellidos de médicos
        List<String> apellidosMedicos = new ArrayList<>();

        if (connection != null) {
            try {
                // Consulta SQL para obtener apellidos de médicos
                String sql = "SELECT t_apellidos_medico FROM medico";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                    // Iterar a través de los resultados y agregar cada apellido de médico a la lista
                    while (resultSet.next()) {
                        String apellidoMedico = resultSet.getString("t_apellidos_medico");
                        apellidosMedicos.add(apellidoMedico);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver la lista de apellidos de médicos (puede estar vacía si hay un error)
        return apellidosMedicos;
    }

    // Método para obtener el ID de un paciente por su nombre
    public static int obtenerIdPaciente(String nombrePaciente) {
        // Inicializar el ID del paciente
        int idPaciente = 0;

        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Verificar que la conexión sea exitosa
        if (connection != null) {
            try {
                // Consulta SQL para obtener el ID de un paciente
                String sql = "SELECT id_paciente FROM paciente WHERE t_apellidos_paciente = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer el parámetro en la consulta SQL
                    statement.setString(1, nombrePaciente);

                    // Ejecutar la consulta y obtener el conjunto de resultados
                    ResultSet resultSet = statement.executeQuery();

                    // Verificar si hay un resultado y obtener el ID del paciente
                    if (resultSet.next()) {
                        idPaciente = resultSet.getInt("id_paciente");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver el ID del paciente (puede ser 0 si no se encuentra el paciente)
        return idPaciente;
    }

    // Método para obtener el ID de una especialidad por su nombre
    public static int obtenerIdEspecialidad(String nombreEspecialidad) {
        // Inicializar el ID de la especialidad
        int idEspecialidad = 0;

        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Verificar que la conexión sea exitosa
        if (connection != null) {
            try {
                // Consulta SQL para obtener el ID de una especialidad
                String sql = "SELECT id_especialidad FROM especialidad WHERE t_nombre_especialidad = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer el parámetro en la consulta SQL
                    statement.setString(1, nombreEspecialidad);

                    // Ejecutar la consulta y obtener el conjunto de resultados
                    ResultSet resultSet = statement.executeQuery();

                    // Verificar si hay un resultado y obtener el ID de la especialidad
                    if (resultSet.next()) {
                        idEspecialidad = resultSet.getInt("id_especialidad");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver el ID de la especialidad (puede ser 0 si no se encuentra la especialidad)
        return idEspecialidad;
    }

}
