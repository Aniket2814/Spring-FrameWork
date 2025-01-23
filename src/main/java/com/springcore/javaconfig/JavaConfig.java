package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class JavaConfig {

	@Bean
	public Student getStudent()
	{
		
		//Creating new Object of Student
		Student st=new Student();
		return st;
	}
	
	
}
                                                