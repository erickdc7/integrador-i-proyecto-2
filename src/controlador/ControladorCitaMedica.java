package controlador;

import modelo.Conexion;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorCitaMedica {

    public List<Integer> obtenerIdsHistoriaClinica() {
        List<Integer> idsHistoriaClinica = new ArrayList<>();
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "SELECT id_historia_clinica FROM historia_clinica";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int idHistoriaClinica = resultSet.getInt("id_historia_clinica");
                        idsHistoriaClinica.add(idHistoriaClinica);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return idsHistoriaClinica;
    }

    public List<String> obtenerNombresEspecialidades() {
        List<String> nombresEspecialidades = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener los nombres de las especialidades
            String sql = "SELECT t_nombre_especialidad FROM Especialidad";

            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar los nombres a la lista
                while (resultSet.next()) {
                    String nombreEspecialidad = resultSet.getString("t_nombre_especialidad");
                    nombresEspecialidades.add(nombreEspecialidad);
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir durante la consulta
            e.printStackTrace();
        }

        return nombresEspecialidades;
    }

    public List<String> obtenerApellidosMedicos() {
        List<String> apellidosMedicos = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener los apellidos de los médicos
            String sql = "SELECT t_apellidos_medico FROM Medico";

            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar los apellidos a la lista
                while (resultSet.next()) {
                    String apellidoMedico = resultSet.getString("t_apellidos_medico");
                    apellidosMedicos.add(apellidoMedico);
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir durante la consulta
            e.printStackTrace();
        }

        return apellidosMedicos;
    }

    public List<String> obtenerFechasAtencion() {
        List<String> fechasAtencion = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener las fechas de atención
            String sql = "SELECT DISTINCT fecha_atencion FROM Atencion_Medica";

            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar las fechas a la lista
                while (resultSet.next()) {
                    String fechaAtencion = resultSet.getString("fecha_atencion");
                    fechasAtencion.add(fechaAtencion);
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir durante la consulta
            e.printStackTrace();
        }

        return fechasAtencion;
    }

    public List<String> obtenerTodasHorasAtencion() {
        List<String> horasAtencion = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener todas las horas de atención
            String sql = "SELECT DISTINCT hora_atencion FROM Atencion_Medica";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Recorrer los resultados y agregar las horas a la lista
                    while (resultSet.next()) {
                        String horaAtencion = resultSet.getString("hora_atencion");
                        horasAtencion.add(horaAtencion);
                    }
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir durante la consulta
            e.printStackTrace();
        }

        return horasAtencion;
    }

    public static int guardarCitaMedica(int idHistoriaClinica, int idEspecialidad, String fecha, String hora, String motivo) {
        Connection conn = null;
        int idCitaMedica = -1;

        try {
            conn = Conexion.getConnection(); // Obtener la conexión

            // Query para insertar la cita médica en la base de datos
            String query = "INSERT INTO Cita_Medica (id_especialidad, fecha_cita, hora_cita, t_motivo_cita) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setInt(1, idEspecialidad);
                pstmt.setString(2, fecha);
                pstmt.setString(3, hora);
                pstmt.setString(4, motivo);

                // Ejecutar la consulta
                pstmt.executeUpdate();

                // Obtener el ID autogenerado
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idCitaMedica = generatedKeys.getInt(1);
                        System.out.println("ID autogenerado: " + idCitaMedica);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones (ajusta según tus necesidades)
        } finally {
            Conexion.closeConnection(conn); // Cerrar la conexión
        }

        return idCitaMedica;
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
