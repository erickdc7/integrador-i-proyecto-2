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

    // Método para obtener la lista de IDs de historias clínicas desde la base de datos
    public List<Integer> obtenerIdsHistoriaClinica() {
        // Inicializar la lista de IDs de historias clínicas
        List<Integer> idsHistoriaClinica = new ArrayList<>();

        // Obtener una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Verificar que la conexión sea exitosa
        if (connection != null) {
            try {
                // Consulta SQL para obtener los IDs de historias clínicas
                String sql = "SELECT id_historia_clinica FROM historia_clinica";
                try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        // Obtener el ID de la historia clínica desde el resultado
                        int idHistoriaClinica = resultSet.getInt("id_historia_clinica");

                        // Agregar el ID a la lista
                        idsHistoriaClinica.add(idHistoriaClinica);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos en cualquier caso (éxito o error)
                Conexion.closeConnection(connection);
            }
        }

        // Devolver la lista de IDs de historias clínicas
        return idsHistoriaClinica;
    }

    // Método para obtener la lista de nombres de especialidades desde la base de datos
    public List<String> obtenerNombresEspecialidades() {
        // Inicializar la lista de nombres de especialidades
        List<String> nombresEspecialidades = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener los nombres de las especialidades
            String sql = "SELECT t_nombre_especialidad FROM Especialidad";

            // Crear un PreparedStatement y un ResultSet
            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar los nombres a la lista
                while (resultSet.next()) {
                    // Obtener el nombre desde el resultado
                    String nombreEspecialidad = resultSet.getString("t_nombre_especialidad");

                    // Agregar el nombre a la lista
                    nombresEspecialidades.add(nombreEspecialidad);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver la lista de nombres de especialidades
        return nombresEspecialidades;
    }

    // Método para obtener la lista de apellidos de médicos desde la base de datos
    public List<String> obtenerApellidosMedicos() {
        // Inicializar la lista de apellidos de médicos
        List<String> apellidosMedicos = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener los apellidos de los médicos
            String sql = "SELECT t_apellidos_medico FROM Medico";

            // Crear un PreparedStatement y un ResultSet
            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar los apellidos a la lista
                while (resultSet.next()) {
                    // Obtener el apellido desde el resultado
                    String apellidoMedico = resultSet.getString("t_apellidos_medico");

                    // Agregar el apellido a la lista
                    apellidosMedicos.add(apellidoMedico);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver la lista de apellidos de médicos
        return apellidosMedicos;
    }

    // Método para obtener la lista de fechas de atención desde la base de datos
    public List<String> obtenerFechasAtencion() {
        // Inicializar la lista de fechas de atención
        List<String> fechasAtencion = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener las fechas de atención
            String sql = "SELECT DISTINCT fecha_atencion FROM Atencion_Medica";

            // Crear un PreparedStatement y un ResultSet
            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Recorrer los resultados y agregar las fechas a la lista
                while (resultSet.next()) {
                    // Obtener la fecha desde el resultado
                    String fechaAtencion = resultSet.getString("fecha_atencion");

                    // Agregar la fecha a la lista
                    fechasAtencion.add(fechaAtencion);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver la lista de fechas de atención
        return fechasAtencion;
    }

    // Método para obtener la lista de todas las horas de atención desde la base de datos
    public List<String> obtenerTodasHorasAtencion() {
        // Inicializar la lista de horas de atención
        List<String> horasAtencion = new ArrayList<>();

        // Establecer la conexión con la base de datos
        try (Connection connection = Conexion.getConnection()) {
            // Consulta SQL para obtener todas las horas de atención
            String sql = "SELECT DISTINCT hora_atencion FROM Atencion_Medica";

            // Crear un PreparedStatement y un ResultSet
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Recorrer los resultados y agregar las horas a la lista
                    while (resultSet.next()) {
                        // Obtener la hora desde el resultado
                        String horaAtencion = resultSet.getString("hora_atencion");

                        // Agregar la hora a la lista
                        horasAtencion.add(horaAtencion);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver la lista de horas de atención
        return horasAtencion;
    }

    // Método para guardar una cita médica en la base de datos
    public static int guardarCitaMedica(int idHistoriaClinica, int idEspecialidad, String fecha, String hora, String motivo) {
        // Inicializar la conexión
        Connection conn = null;

        // Inicializar el ID de la cita médica
        int idCitaMedica = -1;

        try {
            // Obtener la conexión a la base de datos
            conn = Conexion.getConnection();

            // Query para insertar la cita médica en la base de datos
            String query = "INSERT INTO Cita_Medica (id_especialidad, fecha_cita, hora_cita, t_motivo_cita) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                // Establecer los parámetros en el PreparedStatement
                pstmt.setInt(1, idEspecialidad);
                pstmt.setString(2, fecha);
                pstmt.setString(3, hora);
                pstmt.setString(4, motivo);

                // Ejecutar la consulta
                pstmt.executeUpdate();

                // Obtener el ID autogenerado
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        // Obtener el ID autogenerado
                        idCitaMedica = generatedKeys.getInt(1);
                        System.out.println("ID autogenerado: " + idCitaMedica);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión a la base de datos
            Conexion.closeConnection(conn);
        }

        // Devolver el ID de la cita médica
        return idCitaMedica;
    }

    // Método para obtener el ID de una especialidad por su nombre desde la base de datos
    public static int obtenerIdEspecialidad(String nombreEspecialidad) {
        // Inicializar el ID de la especialidad
        int idEspecialidad = 0;

        // Obtener la conexión a la base de datos
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "SELECT id_especialidad FROM especialidad WHERE t_nombre_especialidad = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer el parámetro en el PreparedStatement
                    statement.setString(1, nombreEspecialidad);

                    ResultSet resultSet = statement.executeQuery();

                    // Verificar si hay resultados y obtener el ID de la especialidad
                    if (resultSet.next()) {
                        idEspecialidad = resultSet.getInt("id_especialidad");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos
                Conexion.closeConnection(connection);
            }
        }

        // Devolver el ID de la especialidad
        return idEspecialidad;
    }
}
