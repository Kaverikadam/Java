package com.learn.curd.hibernate.BikeAndRider;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rider {
	@Id
	int RID;
	String name;
	
	@OneToMany
	List<Bike> bikes;
	
	
	public Rider() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rider(int rID, String name, List<Bike> bikes) {
		super();
		RID = rID;
		this.name = name;
		this.bikes = bikes;
	}

	public int getRID() {
		return RID;
	}


	public void setRID(int rID) {
		RID = rID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Bike> getBikes() {
		return bikes;
	}


	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}


	@Override
	public String toString() {
		return RID+" "+name+" "+bikes;
	}
	
}
