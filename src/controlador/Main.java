package controlador;

import java.sql.Connection;
import modelo.Conexion;

public class Main {

    public static void main(String[] args) {
        // Obtén una conexión a la base de datos
        Connection connection = Conexion.getConnection();

        // Realiza operaciones en la base de datos si la conexión es exitosa
        if (connection != null) {
            // Aquí puedes realizar operaciones en la base de datos

            // Cierra la conexión después de usarla
            Conexion.closeConnection(connection);
        }
    }
}
