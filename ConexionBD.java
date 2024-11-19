package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private Connection connection;

    public ConexionBD() {
        try {
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/covid", "root", "password");
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
