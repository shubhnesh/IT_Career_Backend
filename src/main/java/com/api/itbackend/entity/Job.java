// entity/Job.java
package com.api.itbackend.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;


@Entity
public class Job {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotNull(message = "Company name is required")
    @NotEmpty(message = "Company name cannot be empty")
    private String companyName;

    @NotNull(message = "Role is required")
    @NotEmpty(message = "Role cannot be empty")
    private String role;

    @NotNull(message = "Location is required")
    @NotEmpty(message = "Location cannot be empty")
    private String location;

    @NotNull(message = "Job type is required")
    @NotEmpty(message = "Job type cannot be empty")
    private String jobType;

    @NotNull(message = "Skills are required")
    @NotEmpty(message = "Skills cannot be empty")
    private String skills;

    private String link;
    private String postedBy;
    private String experience;
    private String salary;
    private String jobDescription;
    
    
    @Override
	public String toString() {
		return "Job [id=" + id + ", companyName=" + companyName + ", role=" + role + ", location=" + location
				+ ", jobType=" + jobType + ", skills=" + skills + ", link=" + link + ", postedBy=" + postedBy
				+ ", experience=" + experience + ", salary=" + salary + ", jobDescription=" + jobDescription
				+ ", getId()=" + getId() + ", getCompanyName()=" + getCompanyName() + ", getRole()=" + getRole()
				+ ", getLocation()=" + getLocation() + ", getJobType()=" + getJobType() + ", getSkills()=" + getSkills()
				+ ", getLink()=" + getLink() + ", getPostedBy()=" + getPostedBy() + ", getExperience()="
				+ getExperience() + ", getSalary()=" + getSalary() + ", getJobDescription()=" + getJobDescription()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Job(Long id, String companyName, String role, String location, String jobType, String skills, String link,
			String postedBy, String experience, String salary, String jobDescription) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.role = role;
		this.location = location;
		this.jobType = jobType;
		this.skills = skills;
		this.link = link;
		this.postedBy = postedBy;
		this.experience = experience;
		this.salary = salary;
		this.jobDescription = jobDescription;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
    
    
}
