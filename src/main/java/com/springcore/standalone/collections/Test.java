package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
	  Person p=con.getBean("friend",Person.class);
	System.out.println(p);
	System.out.println(p.getFriends().getClass().getName());  
	System.out.println(p.getProperty());
	}

}
