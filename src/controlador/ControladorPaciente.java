package controlador;

import modelo.Conexion;
import modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorPaciente {

    // Método para insertar un nuevo paciente en la base de datos
    public boolean insertarPaciente(Paciente paciente) {
        // Obtener la conexión a la base de datos
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "INSERT INTO Paciente (t_nombres_paciente, t_apellidos_paciente, t_dni_paciente, t_edad_paciente, t_genero_paciente, t_correo_paciente, t_celular_paciente, t_direccion_paciente, t_distrito_paciente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Establecer los valores del paciente en la consulta SQL
                    statement.setString(1, paciente.getNombres());
                    statement.setString(2, paciente.getApellidos());
                    statement.setString(3, paciente.getDni());
                    statement.setInt(4, paciente.getEdad());
                    statement.setString(5, paciente.getGenero());
                    statement.setString(6, paciente.getCorreo());
                    statement.setString(7, paciente.getCelular());
                    statement.setString(8, paciente.getDireccion());
                    statement.setString(9, paciente.getDistrito());

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

        // Devolver false si la conexión es nula
        return false;
    }

}
