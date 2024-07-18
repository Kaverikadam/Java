package com.NewDemoOfOneToOne;

import javax.persistence.*;

@Entity
public class Fresher1 {
	@Id
	int Id;
	String name;
	@OneToOne
	Job1 job;
	public Fresher1() {
	}
	public Fresher1(int id, String name, Job1 job) {
		super();
		Id = id;
		this.name = name;
		this.job = job;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job1 getJob() {
		return job;
	}
	public void setJob(Job1 job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id+" "+name+" "+job;
	}
	
}
