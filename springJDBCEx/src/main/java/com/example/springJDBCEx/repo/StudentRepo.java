package com.example.springJDBCEx.repo;

import com.example.springJDBCEx.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(student s) {
        String sql = "insert into student (name , rollNo, marks) values (?,?,?)";
        int rows = jdbc.update(sql,s.getName(),s.getRollNo(),s.getMarks());
        System.out.println(rows + "effected");
    }

    public List<student> findAll() {
       String sql = "select * from student";
        RowMapper<student> mapper = new RowMapper<student>() {
            @Override
            public student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student s = new student();
                s.setName(rs.getString("name"));
                s.setRollNo(rs.getInt("rollNo"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
           return jdbc.query(sql,mapper);
    }
}
