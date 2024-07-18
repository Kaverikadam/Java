package com.NewDemoOfOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Job1 {
	
	@Id
	int jobId;
	String designation;
	int salary;
	
	@OneToOne
	Fresher1 fresher;

	public Job1() {
		
	}

	public Job1(int jobId, String designation, int salary, Fresher1 fresher) {
		super();
		this.jobId = jobId;
		this.designation = designation;
		this.salary = salary;
		this.fresher = fresher;
	}

	public int getJobId() {
		return jobId;
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

	public Fresher1 getFresher() {
		return fresher;
	}

	public void setFresher(Fresher1 fresher) {
		this.fresher = fresher;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return jobId+" "+designation+" "+salary+" "+fresher;
	}

	public void setJobId(int jobId) {
		// TODO Auto-generated method stub
		this.jobId = jobId;

		
	}
	
}
