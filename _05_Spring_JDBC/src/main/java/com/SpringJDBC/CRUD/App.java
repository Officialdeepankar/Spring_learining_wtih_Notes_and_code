package com.SpringJDBC.CRUD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	
	public static void main(String[] args) {
		
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		 
		     JdbcTemplate jd =context.getBean("jdbc",JdbcTemplate.class);
		     
		     System.out.println(jd);
		     
		 String sql="Insert into students (id, name, age, marks) values (?,?,?,?)";
		 
		int i = jd.update(sql,3,"Ankit Kumar",23,98);
		
		System.out.println("Succefully inserted"+i);
		
		
		  
	}

}
