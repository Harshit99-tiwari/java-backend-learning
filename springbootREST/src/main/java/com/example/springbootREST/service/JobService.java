package com.example.springbootREST.service;

import com.example.springbootREST.model.JobPost;
import com.example.springbootREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobpost){
        repo.addJob(jobpost);
    }
    public List<JobPost> getallJob(){
        return repo.getAllJobs();
    }
}

