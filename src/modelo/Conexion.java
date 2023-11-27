package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_centromedico";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Imprimir mensaje de éxito en la conexión
            System.out.println("Conexion exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            // Imprimir mensaje de error en caso de falla en la conexión
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos");
        }
        return connection;
    }

    // Método para cerrar la conexión a la base de datos
    public static void closeConnection(Connection connection) {
        try {
            // Verificar que la conexión no sea nula y esté abierta antes de cerrarla
            if (connection != null && !connection.isClosed()) {
                connection.close();

                // Imprimir mensaje de éxito al cerrar la conexión
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            // Imprimir mensaje en caso de error al cerrar la conexión
            e.printStackTrace();
        }
    }
}
