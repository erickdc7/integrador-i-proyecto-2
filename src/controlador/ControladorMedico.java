package controlador;

import modelo.Conexion;
import modelo.Medico;
import modelo.Especialidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorMedico {

    // Método para insertar un nuevo médico en la base de datos
    public boolean insertarMedico(Medico medico) {
        // Obtener la conexión a la base de datos
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "INSERT INTO Medico (id_especialidad, t_nombres_medico, t_apellidos_medico, t_dni_medico, t_edad_medico, t_genero_medico, t_celular_medico, t_correo_medico) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer los parámetros en la consulta SQL
                    statement.setInt(1, medico.getEspecialidad().getIdEspecialidad());
                    statement.setString(2, medico.getNombres());
                    statement.setString(3, medico.getApellidos());
                    statement.setString(4, medico.getDni());
                    statement.setInt(5, medico.getEdad());
                    statement.setString(6, medico.getGenero());
                    statement.setString(7, medico.getCelular());
                    statement.setString(8, medico.getCorreo());

                    // Ejecutar la consulta y obtener el número de filas afectadas
                    int filasAfectadas = statement.executeUpdate();

                    // Verificar si al menos una fila fue insertada con éxito
                    return filasAfectadas > 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos
                Conexion.closeConnection(connection);
            }
        }

        // Devolver falso si la conexión es nula
        return false;
    }

    // Método para obtener todas las especialidades desde la base de datos
    public List<Especialidad> obtenerEspecialidades() {
        // Lista para almacenar las especialidades
        List<Especialidad> especialidades = new ArrayList<>();

        // Obtener la conexión a la base de datos
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                // Consulta SQL para obtener todas las especialidades
                String sql = "SELECT * FROM Especialidad";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            // Obtener los datos de la especialidad desde el resultado de la consulta
                            int idEspecialidad = resultSet.getInt("id_especialidad");
                            String nombreEspecialidad = resultSet.getString("t_nombre_especialidad");
                            String descripcionEspecialidad = resultSet.getString("t_descripcion_especialidad");
                            String restriccionEspecialidad = resultSet.getString("t_restriccion_especialidad");

                            // Crear un objeto Especialidad con los datos obtenidos y agregarlo a la lista
                            Especialidad especialidad = new Especialidad(idEspecialidad, nombreEspecialidad, descripcionEspecialidad, restriccionEspecialidad);
                            especialidades.add(especialidad);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos
                Conexion.closeConnection(connection);
            }
        }

        // Devolver la lista de especialidades
        return especialidades;
    }

    // Método para obtener una especialidad por su nombre desde la base de datos
    public Especialidad obtenerEspecialidadPorNombre(String nombreEspecialidad) {
        // Obtener la conexión a la base de datos
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                // Consulta SQL para obtener la especialidad por nombre
                String sql = "SELECT * FROM Especialidad WHERE t_nombre_especialidad = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer el nombre de la especialidad en la consulta
                    statement.setString(1, nombreEspecialidad);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            // Obtener los datos de la especialidad desde el resultado de la consulta
                            int idEspecialidad = resultSet.getInt("id_especialidad");
                            String descripcionEspecialidad = resultSet.getString("t_descripcion_especialidad");
                            String restriccionEspecialidad = resultSet.getString("t_restriccion_especialidad");

                            // Crear un objeto Especialidad con los datos obtenidos y devolverlo
                            return new Especialidad(idEspecialidad, nombreEspecialidad, descripcionEspecialidad, restriccionEspecialidad);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Cerrar la conexión a la base de datos
                Conexion.closeConnection(connection);
            }
        }

        // Devolver null si la conexión es nula o no se encuentra la especialidad
        return null;
    }

}
