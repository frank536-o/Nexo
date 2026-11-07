package app.persistence.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private final Connection connection;


    private static final String url = "jdbc:mysql://localhost:3306/nexo_db"; //falta nombre de base de datos
    private static final String userName = "root";
    private static final String password = "";

    private DataBaseConnection() {

        try {

            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexion exitosa a la base de Datos");

        } catch (SQLException e) {
            throw new RuntimeException("Errror al conenctar a la base de datos");
        }
    }

    public static synchronized DataBaseConnection getInstance() {

        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
