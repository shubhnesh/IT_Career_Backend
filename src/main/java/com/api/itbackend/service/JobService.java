// service/JobService.java
package com.api.itbackend.service;

import com.api.itbackend.entity.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface JobService {
    Job saveJob(Job job);
    List<Job> saveJobs(List<Job> jobs);
    List<Job> getAllJobs();
    List<Job> getJobsByCompany(String company);
    List<Job> getJobsBySkill(String skill);
}
