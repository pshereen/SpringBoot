package com.example.alienRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Uses Singleton Design Pattern. Only one object of class Alien is created.
//@Scope(value = "prototype") //Creates multiple objects of class Alien whenever getBean is called.
public class Alien {
	private int aId ;
	private String aName ;
	private String tech ;
	
	//@Qualifier("lap1") //Search the object by name lap1 in the Spring container.
	@Autowired // Search for the object of the type Laptop in the Spring container.
	private Laptop lap1;
	public Laptop getLaptop() {
		return lap1;
	}
	public void setLaptop(Laptop lap1) {
		this.lap1 = lap1;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Inside show function.");
		lap1.compile();
	}
	
}
