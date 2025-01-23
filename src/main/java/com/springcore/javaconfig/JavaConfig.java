package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class JavaConfig {
     @Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	  
	@Bean(name = {"hello" ,"student"})
	public Student getStudent()
	{
		
		//Creating new Object of Student
		Student st=new Student(getSamosa());
		return st;
	}
	
	
}
                                                