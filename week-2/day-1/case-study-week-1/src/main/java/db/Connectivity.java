package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Connectivity {

    private final Connection connection;

    public Connectivity() throws SQLException {

        new Driver(); // initialize the mysql driver

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/week1_case_study_db",
                "root",
                "password"
        ); // trying to make a connectivity

        connection.setAutoCommit(false); // enabling txn management
        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }
}
