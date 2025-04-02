package com.annotationBasedApproach.forInitDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Students {

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	private int id;
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
	
	/*
	 * 
	 * for using postconstruct and predestroy
	 * include below given dependency in POM.xml
	 * <dependency>
   <groupId>javax.annotation</groupId>
   <artifactId>javax.annotation-api</artifactId>
   <version>1.3.2</version>
</dependency>

	 */
	
	@PostConstruct
	public void init()
	{
		System.out.println("init mehtod is called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method is called");
		
	}
	
}
