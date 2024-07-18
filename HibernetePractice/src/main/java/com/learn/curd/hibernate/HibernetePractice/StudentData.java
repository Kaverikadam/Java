package com.learn.curd.hibernate.HibernetePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {
	@Id
	int st_id;
	String st_name;
	int st_marks;
	
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}




	public StudentData(int st_id, String st_name, int st_marks) {
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_marks = st_marks;
	}




	public int getSt_id() {
		return st_id;
	}


	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}


	public String getSt_name() {
		return st_name;
	}


	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}


	public int getSt_marks() {
		return st_marks;
	}


	public void setSt_marks(int st_marks) {
		this.st_marks = st_marks;
	}


	@Override
	public String toString() {
		return "StudentData [st_id=" + st_id + ", st_name=" + st_name + ", st_marks=" + st_marks + "]";
	}
	
	
	

}
