// controller/JobController.java
package com.api.itbackend.controller;

import com.api.itbackend.entity.Job;
import com.api.itbackend.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*") // Allow frontend access
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // POST multiple jobs
    @PostMapping("/bulk")
    public List<Job> postJobs(@RequestBody List<Job> jobs) {
        return jobService.saveJobs(jobs);
    }
    
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/company")
    public List<Job> getJobsByCompany(@RequestParam String name) {
        return jobService.getJobsByCompany(name);
    }

    @GetMapping("/skill")
    public List<Job> getJobsBySkill(@RequestParam String skill) {
        return jobService.getJobsBySkill(skill);
    }
}
