package com.ani.springdata.jdbc.service;

import com.ani.springdata.jdbc.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Service
public class DbService {

    @Autowired
    private JdbcTemplate template;

    public void saveOperation(int empId, String empName, String dob, boolean isManager) {
        template.update(con -> {
            var sql = "insert into emp_info values (?, ?, ? ,? )";

            var ps = con.prepareStatement(sql);
                ps.setInt(1, empId);
            ps.setString(2, empName);
            ps.setDate(3, Date.valueOf(dob));
            ps.setBoolean(4, isManager);
            return ps;
        });
    }
    
    public void saveOpV2(Emp emp) {
        var sql = "insert into emp_info values (?, ?, ? ,? )";
        template.update(sql, emp.getId(), emp.getName(), emp.getDob(), emp.getManager());        
    }
    
    public List<Emp> findEmployees() {
        var sql = "select * from emp_info";

        List<Emp> employees = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                var emp = new Emp();
                emp.setId(rs.getInt("emp_id"));
                emp.setName(rs.getString("emp_name"));
                emp.setDob(rs.getDate("dob").toString());
                emp.setManager(rs.getBoolean("is_manager"));

                return emp;
            }
        });

        employees = template.query(sql, (rs, rowNum) -> new Emp(
                rs.getInt("emp_id"),
                rs.getString("emp_name"),
                rs.getDate("dob").toString(),
                rs.getBoolean("is_manager")
            )
        );

        return employees;
    }

    public Emp findEmployeeById(int id) {
        var sql = "select * from emp_info where emp_id = ?";
        return template.queryForObject(
                sql,
                (rs, cnt) -> new Emp(
                        rs.getInt("emp_id"),
                        rs.getString("emp_name"),
                        rs.getDate("dob").toString(),
                        rs.getBoolean("is_manager")
                ),
                id
        );
    }


    public void promoteEmployee(Emp emp) {
        var sql = "update emp_info set is_manager = true where emp_id = ?";
        template.update(sql, emp.getId());
    }
}
