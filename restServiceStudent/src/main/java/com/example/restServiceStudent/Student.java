package com.example.restServiceStudent;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // To add student as a table in database. Treat Student class as a table and every Student Object as an entry into the table Student.
public class Student {
	@Id // New Id will be created every time a new student object is created.
	@GeneratedValue(strategy = GenerationType.AUTO) //// New Id will be created every time a new student object is created automatically.
	private long id ;
	private String name ;
	private int age ;
	private String address ;
	
	public Student() {	
	}
	
	public Student(String name, int age, String address) {
		this.name = name ;
		this.age = age ;
		this.address = address ;	
	}
	
	public String getName() {
		return name ;
	}
	
	public int getAge() {
		return age ;
	}
	
	public String getAddress() {
		return address ;
	}
	
}
