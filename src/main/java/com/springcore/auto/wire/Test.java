package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ar[])
	{
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/config.xml");
	Emp e=context.getBean("emp1",Emp.class);
	System.out.println(e);
	}
}
