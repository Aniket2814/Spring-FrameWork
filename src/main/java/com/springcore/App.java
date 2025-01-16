package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

          //   ApplicationContext con=  ClassPathXmlApplicationContext("config.xml");
    
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
   Student st=(Student )con.getBean("student1");
   System.out.println(st);
	
	  Student st1=(Student)con.getBean("student2"); System.out.println(st1);
	     }

	
}
