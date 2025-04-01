package com.XMLApproach.forInitDestroy;

public class Student {

	
	private int id;
	private String name;
	
	
	// getter setter for id and name
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void init()
	{
		System.out.println("Init method called ");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method called ");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
