package com.SpringJDBC.CRUD.employeeDOA;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.employee.Model.Employee;

public class EmployeDAOIMP implements EmployeeDAO {
    
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		
		String sql="Insert into employee (id, Name, age, department, salary) values(?,?,?,?,?)";
		
	int i=	jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getAge(),emp.getDepartment(),emp.getSalary());
		
       System.out.println("data inserted "+i);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="Delete from employee where id =? ";
		
		int i=jdbcTemplate.update(sql,id);
		
		System.out.println("Deletion happed ? ="+i);
		
		
		
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		
		String sql= "Update employee set Name=?,age=?,department=?,salary=? where id = ?";
		
		int i=jdbcTemplate.update(sql,emp.getName(),emp.getAge(),emp.getDepartment(),emp.getSalary(),emp.getId());
		
		System.out.println("Update Happened ? ="+i);
	}

	@Override
	public void read(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeByid(int id) {
		// TODO Auto-generated method stub
		
	}

}
