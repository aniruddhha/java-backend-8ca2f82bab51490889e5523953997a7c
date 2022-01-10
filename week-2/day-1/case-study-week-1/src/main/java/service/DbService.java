package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class DbService {
    private final Connection connection;

    public DbService(Connection connection) {
        this.connection = connection;
    }

    public int createNewAccount(int acNum, double amt, String acHldNm, Date crDt, boolean status) throws SQLException {
        var sql = "insert into bank_account values (?, ?, ?, ?, ?)";
        var ps1 = connection.prepareStatement(sql); // here you are creating sql
        ps1.setInt(1, acNum);
        ps1.setDouble(2, amt);
        ps1.setString(3, acHldNm);
        ps1.setDate(4, crDt);
        ps1.setBoolean(5, status);

        var affected = ps1.executeUpdate();
        connection.commit();

        return affected;
    }

    public void printAllAccounts() {

    }
}
