package com.springcore.ConstructorInjection;

import java.util.List;
import java.util.Set;
import java.util.Map;
public class Student {

	
	private int id;
	private List<String>Names;
	private Set<String>PhoneNum;
	private Map<String,String>Courses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getNames() {
		return Names;
	}
	public void setNames(List<String> names) {
		Names = names;
	}
	public Set<String> getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(Set<String> phoneNum) {
		PhoneNum = phoneNum;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	
	// constructor
	public Student(int id, List<String> names, Set<String> phoneNum, Map<String, String> courses) {
		System.out.println("Constructor has been called of student");
		this.id = id;
		Names = names;
		PhoneNum = phoneNum;
		Courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Names=" + Names + ", PhoneNum=" + PhoneNum + ", Courses=" + Courses + "]";
	}
	
	
	
	
	
	
}
