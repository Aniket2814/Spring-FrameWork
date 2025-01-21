package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/stereotype/annotationconfig.xml");
        Student s=con.getBean("student",Student.class);
	System.out.println(s);
	System.out.println(s.getAddress().getClass().getName());
	System.out.println(s.getSalary());
	
	System.out.println(s.hashCode());
Student s1=	con.getBean("student" ,Student.class);
	
	System.out.println(s1.hashCode());
	
	Teacher t1=con.getBean("t1",Teacher.class);

	Teacher t2=con.getBean("t1",Teacher.class);
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	}

}
