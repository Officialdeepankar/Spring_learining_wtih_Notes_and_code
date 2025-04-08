package com.springmvc.model;


import jakarta.persistence.Id;


import jakarta.persistence.Entity;



@Entity
public class Student {

	@Id
	private int id;
	
	
	public Student()
	{
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
