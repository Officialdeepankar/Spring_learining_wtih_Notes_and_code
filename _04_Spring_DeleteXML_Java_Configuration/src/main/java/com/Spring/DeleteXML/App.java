package com.Spring.DeleteXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          ApplicationContext context = new  AnnotationConfigApplicationContext(config.class);

         
//         Emp e1=context.getBean("emp",Emp.class);
          
          /*
           * Below "getEmp" is used to get the Bean
           */
          Emp e1=context.getBean("getEmp",Emp.class);
         System.out.println(e1);
    }
}
