package com.springcore.collectionInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class App {
	public static void main( String[] args )
    {
        
		ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/collectionInjection/config.xml");
      
		Collections c=context.getBean("collection",Collections.class);
		
		System.out.println(c);
    
    
    }
}
