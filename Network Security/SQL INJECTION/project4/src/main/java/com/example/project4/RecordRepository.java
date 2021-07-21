package com.example.project4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;


@Repository
public class RecordRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Record record)
    {
        String sql="INSERT INTO users "+"(user_id,username,password,role,enabled,failed_attempt,account_non_locked,registration_time) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1,record.getUser_id());
                ps.setString(2, record.getUsername());
                ps.setString(3, record.getPassword());
                ps.setString(4,record.getRole());
                ps.setBoolean(5,record.isEnabled());
                ps.setInt(6,record.getFailed_attempt());
                ps.setBoolean(7,record.isAccount_non_locked());
                long millis=System.currentTimeMillis();
                ps.setTimestamp(8,record.getRegistration_time());
                return ps;
            }
        });
    }


}








