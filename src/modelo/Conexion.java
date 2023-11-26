package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_centromedico";
    private static final String USER = "root"; // Reemplaza con tu nombre de usuario de MySQL
    private static final String PASSWORD = ""; // Reemplaza con tu contraseña de MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el controlador JDBC de MySQL
            connection = DriverManager.getConnection(URL, USER, PASSWORD); // Establecer la conexión
            System.out.println("Conexion exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos");
        }
        return connection;
    }

    // Cierra la conexión a la base de datos
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
