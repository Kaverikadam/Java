package com.learn.curd.hibernate.OneToOneObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fresher {
	
	@Id
	int id;
	String name;
	
	@OneToOne
	Job job;
	
	public Fresher() {
		
	}
	
	
	public Fresher(int id, String name, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+job;
	}
	
	
	

}
