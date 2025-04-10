package config;

import utils.ConfigLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = ConfigLoader.get("DB_URL");
    private static final String USER = ConfigLoader.get("DB_USER");
    private static final String PASSWORD = ConfigLoader.get("DB_PASSWORD");

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Error en la conexión.");
        }
    }
}
