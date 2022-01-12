package com.ani.springdata.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

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
            ps.setBoolean(4, false);
            return ps;
        });
    }

    public void selectCars() {
        // complete this code
    }
}
