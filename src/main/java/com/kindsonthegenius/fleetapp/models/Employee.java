package com.kindsonthegenius.fleetapp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper=false)
public class Employee extends Person {
	
	@ManyToOne
	@JoinColumn(name="employeetypeid", insertable=false, updatable=false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	private String photo;
	private String username;
	private String firstname;
	private String lastname;
	
	@ManyToOne
	@JoinColumn(name="jobtitleid", insertable=false, updatable=false)
	private JobTitle jobTitle;
	private Integer jobtitleid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date hireDate;
		
	

	public Employee(EmployeeType employeeType, Integer employeetypeid, String photo, String username, String firstname,
			String lastname, JobTitle jobTitle, Integer jobtitleid, Date hireDate) {
		
		this.employeeType = employeeType;
		this.employeetypeid = employeetypeid;
		this.photo = photo;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.jobTitle = jobTitle;
		this.jobtitleid = jobtitleid;
		this.hireDate = hireDate;
	}
	
		public Employee() {
				
			}

	@Override
	public String toString() {
		return "Employee [employeeType=" + employeeType + ", employeetypeid=" + employeetypeid + ", photo=" + photo
				+ ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", jobTitle="
				+ jobTitle + ", jobtitleid=" + jobtitleid + ", hireDate=" + hireDate + "]";
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Integer getEmployeetypeid() {
		return employeetypeid;
	}

	public void setEmployeetypeid(Integer employeetypeid) {
		this.employeetypeid = employeetypeid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getJobtitleid() {
		return jobtitleid;
	}

	public void setJobtitleid(Integer jobtitleid) {
		this.jobtitleid = jobtitleid;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	
}
