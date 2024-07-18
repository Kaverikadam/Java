package com.learn.curd.hibernate.ManyToMany.Sec;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class DevloperSec {
	@Id
	int dId;
	String dName;
	
	@ManyToMany
	List<TechSec> tech;

	public DevloperSec() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public DevloperSec(int dId, String dName, List<TechSec> tech) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.tech = tech;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<TechSec> getTech() {
		return tech;
	}

	public void setTech(List<TechSec> tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dId+""+dName+" "+tech;
	}
	

}
