package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//                 LifeCycle li=(LifeCycle) context.getBean("demo");
//	  context.registerShutdownHook();
//                 System.out.println(li);
//	   Pepsi p=(Pepsi) context.getBean("demo1");
//
//System.out.println(p);
		Annotation a=(Annotation)context.getBean("demo2");
		System.out.println(a);
context.registerShutdownHook();

	}

}
