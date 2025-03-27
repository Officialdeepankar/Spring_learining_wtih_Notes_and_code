package com.springcore.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	
	public static void main (String []args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/primitive/config.xml");
		Student s1=context.getBean("Student",Student.class);
		System.out.println(s1);
		
	}
}
