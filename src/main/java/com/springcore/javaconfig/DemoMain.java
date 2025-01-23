package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
public static void main(String[] args) {
ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);	
                          Student s= con.getBean("st",Student.class);
    System.out.println(s);
    s.study();
    
}
}
