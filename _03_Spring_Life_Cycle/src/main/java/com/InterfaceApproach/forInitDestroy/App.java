package com.InterfaceApproach.forInitDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
	 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/InterfaceApproach/forInitDestroy/config.xml");
	 context.registerShutdownHook();
	 
	 Student stu=context.getBean("StudentBean",Student.class);
	 
	 System.out.println(stu);
	}
}
