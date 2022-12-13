package com.example.alienRestAPI;

import org.springframework.stereotype.Component;


//@Component("lap1") //This will create an object of class Laptop and name the object as lap1.
@Component
public class Laptop {
	private int lId ;
	private String brand ;
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brand=" + brand + "]";
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void compile() {
		System.out.println("Compiling");
	}
}
