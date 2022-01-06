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
        connection.commit();
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
        connection.commit();
        rs.close(); // important to close the result set
    }

    public void findEmployeeByName(String name) throws SQLException {

        String sql = "select * from emp_info where emp_name = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            int id = rs.getInt("emp_id");
            String nm = rs.getString("emp_name");
            Date dob = rs.getDate("dob");
            boolean isManager = rs.getBoolean("is_manager");
            System.out.println(" id : "+id + " name : " + nm +" dob : "+dob.toString() +" Manager : "+isManager);
        }

        rs.close();
    }

    public void txnDemo(int empId, String name, Date dob, boolean isManager, int upId) throws SQLException {
        var sql1 = "insert into emp_info values(?, ? , ?, ?)";
        var ps1 = connection.prepareStatement(sql1);
        ps1.setInt(1, empId);
        ps1.setString(2, name);
        ps1.setDate(3, dob);
        ps1.setBoolean(4, isManager);
        var aff1 = ps1.executeUpdate();
//        connection.commit();

        var sql2 = "update emp_info set emp_name = 'none' where emp_id = ?";
        var ps2 = connection.prepareStatement(sql2);
        ps2.setInt(1, upId);
        var aff2 = ps2.executeUpdate();
        if(aff2 == 0) connection.rollback();

        connection.commit();
    }
}
