package com.XMLApproach.forInitDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	/*
	 * This method was used earlier before annotation based approach
	 
	 * In this approach we can declare any method to be init() or destroy() using XML of the package
	
	 *Why we use  init() method
	 *solution-There are some operation which needs to be done after constructor initalization and before
	 *using the bean.
	 * eg-a) Data base connection b)Api calling
	 */

	public static void main(String[] args) {
		
/*     	Some changes will be made here also
 *    1) Use AbstractApplication Context
 * 
 * 
 */
		
	
		AbstractApplicationContext  context= new ClassPathXmlApplicationContext("com/XMLApproach/forInitDestroy/config.xml");
		
		
		Student student= context.getBean("StudentBean",Student.class);
		
		System.out.println(student);
		
		/*
		 * To call destroy method we have to register hook (registerShutDownHook)
		 */
		
		context.registerShutdownHook();
		
	}
}
