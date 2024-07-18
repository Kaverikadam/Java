package com.learn.curd.hibernate.ManyToMamy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tech {
	@Id
	int tid;
	String tName;
	
	@ManyToMany
	List<Developer> dev;

	public Tech() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tech(int tid, String tName, List<Developer> dev) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.dev = dev;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTName() {
		return tName;
	}

	public void setTName(String tName) {
		this.tName = tName;
	}

	public List<Developer> getDev() {
		return dev;
	}



	public void setDev(List<Developer> dev) {
		// TODO Auto-generated method stub
		this.dev = dev;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tid+" "+tName+" "+dev;
	}
}
