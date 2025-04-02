package com.Spring.DeleteXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Bean; 
@Configuration
@ComponentScan(basePackages="com.Spring.DeleteXML")

public class config {

      
       
	
	
	@Bean
	
	public Emp getEmp()
	{
		return new Emp();
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address();
	}
}
