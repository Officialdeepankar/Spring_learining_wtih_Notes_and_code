package com.SpringJDBC_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.SpringJDBC.CRUD.employeeDOA.EmployeDAOIMP;
import com.SpringJDBC.CRUD.employeeDOA.EmployeeDAO;
import com.SpringJDBC.employee.Model.Employee;

import javax.sql.DataSource;

@Configuration
public class config {

	
	// step-1) Make Data source 
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource  =new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/student");
		datasource.setUsername("root");
		datasource.setPassword("Deep@2003");
		return datasource;
	}
	
	@Bean("jdbc")
	
	public JdbcTemplate getJdbctemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		
		return jd;
	}
	
	
//	New bean needs to be defined here because we are using DAO layer in annotation
	
	@Bean("empdao")
	public EmployeeDAO getEmpDAO()
	{
		EmployeDAOIMP dao=new EmployeDAOIMP();
		
		dao.setJdbcTemplate(getJdbctemplate());
		return dao;
	}
	 
	
	@Bean("employee")
	
	public Employee getEmployee()
	{
		return new Employee();
	}
}
