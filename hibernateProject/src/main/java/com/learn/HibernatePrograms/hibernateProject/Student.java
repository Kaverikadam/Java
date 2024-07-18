package com.learn.HibernatePrograms.hibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	int roll;
	String name;
	int mraks;
	public Student() {
		
	}
	public Student(int roll, String name, int mraks) {
		super();
		this.roll = roll;
		this.name = name;
		this.mraks = mraks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMraks() {
		return mraks;
	}
	public void setMraks(int mraks) {
		this.mraks = mraks;
	}
	
}
