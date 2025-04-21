// service/JobServiceImpl.java
package com.api.itbackend.service;

import com.api.itbackend.entity.Job;
import com.api.itbackend.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepo;

    public JobServiceImpl(JobRepository jobRepo) {
        this.jobRepo = jobRepo;
    }

    @Override
    public Job saveJob(Job job) {
        return jobRepo.save(job);
    }

    @Override
    public List<Job> saveJobs(List<Job> jobs) {
        return jobRepo.saveAll(jobs);  // Save multiple jobs at once
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    @Override
    public List<Job> getJobsByCompany(String company) {
        return jobRepo.findByCompanyNameContainingIgnoreCase(company);
    }

    @Override
    public List<Job> getJobsBySkill(String skill) {
        return jobRepo.findBySkillsContainingIgnoreCase(skill);
    }
}
