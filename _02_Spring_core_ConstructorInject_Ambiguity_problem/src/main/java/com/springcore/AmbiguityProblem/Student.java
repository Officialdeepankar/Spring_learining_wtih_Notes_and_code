package com.springcore.AmbiguityProblem;



public class Student {

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	private int id;
	private String name;
	private String address;

	
	public Student(String name, String address)
	{
		this.name=name;
		this.address=address;
		System.out.println("Student(name,id)  2nd is called");
	}
	
	// constructor 1st
	public Student(int id,String name)
	{
	    this.id=id;
	    this.name=name;
	    System.out.println("Student(id,name) 1 st is called");
	}
	
	// constructor 2nd;
	

	
	
	
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
	
	
	
	
	
	
}
