package com.jspiders.const_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee 
{
   public static void main(String[] args) 
   {
	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/jspiders/const_injection/constructor.xml");
	 Employee e =(Employee)context.getBean("Employee");
	 System.out.println(e);
	  
	  
	  
   }
}
