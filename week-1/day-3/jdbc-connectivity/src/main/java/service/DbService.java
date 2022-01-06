package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;

public class DbService {

    private final Connection connection;

    public DbService(Connection connection) {
        this.connection = connection;
    }

    // insert query
    public int create(int empId, String empNm, Date dob, boolean isManager) throws SQLException {
        String sql = "insert into emp_info values(?, ? ,? ,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, empId);
        ps.setString(2, empNm);
        ps.setDate(3, dob);
        ps.setBoolean(4, isManager );
        // above lines create SQL statement

        int affected = ps.executeUpdate(); // actually firing the query
        return affected;
    }

    // update query
    public int update() {
        return 0;
    }

    // delete query
    public int delete() {
        return 0;
    }

    // select query
    public void find() {

    }
}
