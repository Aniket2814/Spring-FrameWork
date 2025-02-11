package com.spring.jdbc.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
         System.out.println( "Program Started" );
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/Springjdbc/config.xml");
                JdbcTemplate temp=context.getBean("jdbcTemplate",JdbcTemplate.class);
                  String query="insert into student(id,name,city) values(?,?,?)";
                  
                 int result= temp.update(query,101,"Aniket Rathore ","Indore");
    System.out.println("No.of Rows Affected ...." +result);
    }
}
