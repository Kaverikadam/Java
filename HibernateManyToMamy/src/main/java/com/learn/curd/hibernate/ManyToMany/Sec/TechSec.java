package com.learn.curd.hibernate.ManyToMany.Sec;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TechSec {
	
	@Id
	int tId;
	String tName;
	
	@ManyToMany
	List<DevloperSec> dev;

	public TechSec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechSec(int tId, String tName, List<DevloperSec> dev) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.dev = dev;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public List<DevloperSec> getDev() {
		return dev;
	}

	public void setDev(List<DevloperSec> dev) {
		this.dev = dev;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tId+" "+tName+" "+dev;
	}
}
