package com.studentCRUD.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// 1) For auto incrementing the value of id 
	private long id;
	private String name;
	private String email;
	private String course;
	public Student(long id, String name, String email, String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	
	public Student()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
