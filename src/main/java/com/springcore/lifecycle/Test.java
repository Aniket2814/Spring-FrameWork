package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
                 LifeCycle li=(LifeCycle) context.getBean("demo");
	  context.registerShutdownHook();
                 System.out.println(li);
	}

}
