package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String ar[])
{
	
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
    Person temp=(Person)context.getBean("person");
System.out.println(temp);

}
}
