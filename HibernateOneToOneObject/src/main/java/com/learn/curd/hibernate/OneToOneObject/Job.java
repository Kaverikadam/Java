package com.learn.curd.hibernate.OneToOneObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Job {
	@Id
	int job_id;
	String designation;
	int salary;
	@OneToOne
	Fresher fresher;
	
	
	public Job() {
		
	}
	public Job(int job_id, String designation, int salary, Fresher fresher) {
		super();
		this.job_id = job_id;
		this.designation = designation;
		this.salary = salary;
		this.fresher = fresher;
	}
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Fresher getFresher() {
		return fresher;
	}
	
	public void setFresher(Fresher f1) {
		// TODO Auto-generated method stub
		this.fresher = fresher;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return job_id+" "+designation+" "+salary+" "+fresher;
	}
	
	
	
}
