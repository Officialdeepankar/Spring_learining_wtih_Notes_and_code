//package com.annotationBasedApproach.forInitDestroy;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.InterfaceApproach.forInitDestroy.Student;
/*
 * @postconstruct and @preDestroy not working due to depreciation
 * It works on java 9 only not on above versions sadly
 * So , i am commiting the code for reference but this package code will not work
 * 
 */
//public class App {
//
//	public static void main(String[] args) {
//		
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/annotationBasedApproach/forInitDestroy/config.xml");
//		 context.registerShutdownHook();
//		 
//		 Students stu=context.getBean("StudentBean",Students.class);
//		 
//		 System.out.println(stu);
//	}
//}
