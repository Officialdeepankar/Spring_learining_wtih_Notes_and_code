package com.SpringJDBC.CRUD.employeeDOA;

import com.SpringJDBC.employee.Model.Employee;

public interface EmployeeDAO {

	
	
	// insert 
	public void insert(Employee emp);
	
	// delete 
	
	public void delete(int id);
	
	// update 
	
	public void update(Employee emp);
	
	// read
	
	public void read(Employee emp);
	
	
	
	public  void   getEmployeeByid(int id); 
	
}
