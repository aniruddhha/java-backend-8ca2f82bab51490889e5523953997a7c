package service;

import java.sql.*;

public class DbService {

    private final Connection connection;

    public DbService(Connection connection) {
        this.connection = connection;
    }

    // insert query - saving data to database
    public int create(int empId, String empNm, Date dob, boolean isManager) throws SQLException {
        String sql = "insert into emp_info values(?, ? ,? ,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, empId);
        ps.setString(2, empNm);
        ps.setDate(3, dob);
        ps.setBoolean(4, isManager );
        // above 5 lines create SQL statement

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

    // select query - reading the data from database
    public void find() throws SQLException {
        String sql = "select * from emp_info";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); // logical representation of physical table
        while(rs.next()) {
            int id = rs.getInt("emp_id");
            String name = rs.getString("emp_name");
            Date dob = rs.getDate("dob");
            boolean isManager = rs.getBoolean("is_manager");

            System.out.println(" id : "+id + " name : " + name +" dob : "+dob.toString() +" Manager : "+isManager);
        }
        rs.close(); // important to close the result set
    }
}
