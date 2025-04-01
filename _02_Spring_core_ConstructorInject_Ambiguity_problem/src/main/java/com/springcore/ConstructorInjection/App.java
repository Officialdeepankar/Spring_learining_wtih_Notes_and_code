package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context   = new ClassPathXmlApplicationContext("com/springcore/ConstructorInjection/configConstructorInjection.xml");
         
         Student student1= context.getBean("StudentBean",Student.class);
         
         System.out.println(student1);
         
    
    
    }
}
