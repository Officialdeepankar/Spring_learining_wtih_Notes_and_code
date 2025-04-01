package com.springcore.AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String[] args) {
	
	 ApplicationContext context   = new ClassPathXmlApplicationContext("com/springcore/AmbiguityProblem/config.xml");
	Student sc=context.getBean("StudentBean",Student.class);
	
	System.out.println(sc);
}

}
