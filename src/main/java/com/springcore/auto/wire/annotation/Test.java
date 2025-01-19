package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ar[])
	{
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");
	Emp e=context.getBean("em",Emp.class);
	System.out.println(e);
	}
}
