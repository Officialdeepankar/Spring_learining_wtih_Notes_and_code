package com.Spring.DeleteXML.ConstructorExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Bean; 
@Configuration
@ComponentScan(basePackages="com.Spring.DeleteXML.ConstructorExample")

public class config {

      
       
	
	// constructor injection without autowired
	@Bean
	
	public Emp getEmp()
	{
		return new Emp(getAddress());
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address();
	}
}
