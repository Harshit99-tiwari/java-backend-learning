package com.example.springbootREST.controller;


import com.example.springbootREST.model.JobPost;
import com.example.springbootREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
     public List<JobPost> getAllJobs(){
         return service.getallJob();
     }

     @GetMapping("jobPost/{jobpostid}")
     public JobPost getJob(@PathVariable int jobpostid) {
        return service.getJob(jobpostid);
     }
     @PostMapping("/jobPost")
     public void addJob(@RequestBody JobPost jobpost){
        service.addJob(jobpost);
     }

}
