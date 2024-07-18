package com.learn.curd.hibernate.BikeAndRider;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Bike {
	@Id
	 int EngNo;
	String Brand;
	int cost;
	
	@ManyToOne
	Rider rider;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int engNo, String brand, int cost, Rider rider) {
		super();
		EngNo = engNo;
		Brand = brand;
		this.cost = cost;
		this.rider = rider;
	}

	public int getEngNo() {
		return EngNo;
	}

	public void setEngNo(int engNo) {
		EngNo = engNo;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return EngNo+" "+Brand+" "+cost+" "+rider;
	}
	 
	 
	 
}
