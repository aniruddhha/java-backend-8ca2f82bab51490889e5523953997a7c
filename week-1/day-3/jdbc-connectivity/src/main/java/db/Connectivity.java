package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

    private final Connection connection;

    public Connectivity() throws ClassNotFoundException, SQLException {
        // it loads the driver into memory
        Class.forName("com.mysql.cj.jdbc.Driver");

        // mysql -u root -p
        // here you are giving username and password for connectivity
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_training_db",
                "root",
                "password"
        );

        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }
}
