package com.springcore.referenceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;



public class App {
	
	public static void main (String []args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/referenceinjection/config.xml");
	    Student s1=context.getBean("Student",Student.class);
	    System.out.println(s1.getAddress().getCity());
	
	}

}
