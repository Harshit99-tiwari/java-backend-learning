package com.example.springJDBCEx.service;

import com.example.springJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springJDBCEx.model.student;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
     @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void  addStudent(student s){
        repo.save(s);
    }

    public List<student> getAllStudent() {
        return repo.findAll();
    }
}
