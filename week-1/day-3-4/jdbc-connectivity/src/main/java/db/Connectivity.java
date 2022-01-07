package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

    private final Connection connection;

    public Connectivity() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // -> jdbc

        // mysql -u root -p
        // here you are giving username and password for connectivity
        connection = DriverManager.getConnection( // -> jdbc
                "jdbc:mysql://localhost:3306/java_training_db",
                "root",
                "password"
        );// it loads the driver into memory
        connection.setAutoCommit(false);
        connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }
}
