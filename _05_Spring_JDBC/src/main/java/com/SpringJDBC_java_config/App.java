package com.SpringJDBC_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.CRUD.employeeDOA.EmployeeDAO;
import com.SpringJDBC.employee.Model.Employee;

public class App {
	
	public static void main(String[] args) {
		
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
//		 
//		     JdbcTemplate jd =context.getBean("jdbc",JdbcTemplate.class);
//		     
//		     System.out.println(jd);
//		     
//		 String sql="Insert into students (id, name, age, marks) values (?,?,?,?)";
//		 
//		int i = jd.update(sql,3,"Ankit Kumar",23,98);
//		
//		System.out.println("Succefully inserted"+i);		 		
//		
		 // New employee is being created 
		 
		 
		 
		 
		 Employee GenEmp=context.getBean("employee",Employee.class);
		 EmployeeDAO dao= context.getBean("empdao",EmployeeDAO.class);
		 System.out.println("welcome to Employee management through JDBC");
//		-----------------------INSERT---------------------------
//		 GenEmp.setId(2);
//		 GenEmp.setName("Pooja Prajapati");
//		 GenEmp.setAge(22);
//		 GenEmp.setDepartment("Finance");
//		 GenEmp.setSalary(65000);
//		 dao.insert(GenEmp);
		 
//		 ---------------------- UPDATING---------------------------
//		 GenEmp.setId(1);
//		 GenEmp.setName("Shivmangal Singh");
//		 GenEmp.setAge(25);
//		 GenEmp.setDepartment("HR");
//		 GenEmp.setSalary(76000);
//		 dao.update(GenEmp);
//		
	//--------------------------DELETE----------------------- 
		// dao.delete(1);
		 
		 
		 
		  
	}

}
