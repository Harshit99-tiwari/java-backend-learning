package com.example.springJDBCEx.repo;

import com.example.springJDBCEx.model.student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(student s) {
        System.out.println("added");
    }

    public List<student> findAll() {
        List<student> students = new ArrayList<>();
        return students;
    }
}
