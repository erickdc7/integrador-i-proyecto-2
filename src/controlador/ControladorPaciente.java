package controlador;

import modelo.Conexion;
import modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorPaciente {

    public boolean insertarPaciente(Paciente paciente) {
        Connection connection = Conexion.getConnection();

        if (connection != null) {
            try {
                String sql = "INSERT INTO Paciente (t_nombres_paciente, t_apellidos_paciente, t_dni_paciente, t_edad_paciente, t_genero_paciente, t_correo_paciente, t_celular_paciente, t_direccion_paciente, t_distrito_paciente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, paciente.getNombres());
                    statement.setString(2, paciente.getApellidos());
                    statement.setString(3, paciente.getDni());
                    statement.setInt(4, paciente.getEdad());
                    statement.setString(5, paciente.getGenero());
                    statement.setString(6, paciente.getCorreo());
                    statement.setString(7, paciente.getCelular());
                    statement.setString(8, paciente.getDireccion());
                    statement.setString(9, paciente.getDistrito());

                    int filasAfectadas = statement.executeUpdate();

                    // Verificar si al menos una fila fue insertada con éxito
                    return filasAfectadas > 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexion.closeConnection(connection);
            }
        }

        return false; // Si la conexión es nula
    }

}
