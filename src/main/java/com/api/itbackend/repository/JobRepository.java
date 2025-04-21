// repository/JobRepository.java
package com.api.itbackend.repository;

import com.api.itbackend.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByCompanyNameContainingIgnoreCase(String companyName);
    List<Job> findBySkillsContainingIgnoreCase(String skill);

}
