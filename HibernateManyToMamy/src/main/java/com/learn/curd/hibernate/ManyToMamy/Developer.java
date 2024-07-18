package com.learn.curd.hibernate.ManyToMamy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
	@Id
	int did;
	String name;
	
	@ManyToMany
	List<Tech> tech;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int did, String name, List<Tech> tech) {
		super();
		this.did = did;
		this.name = name;
		this.tech = tech;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tech> getTech() {
		return tech;
	}
	public void setTech( List<Tech> tech) {
		// TODO Auto-generated method stub
		this.tech = tech;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return did+" "+name+" "+tech;
	}

	
	
}
