package com.spring.jdbc.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Springjdbc.dao.StudentDao;
import com.spring.jdbc.Springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
         System.out.println( "Program Started" );
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/Springjdbc/config.xml");
                StudentDao sd= context.getBean("std" ,StudentDao.class);            
//                Student s=new Student();
//                s.setId(102);
//                s.setName("Abc1");
//                s.setCity("Shajapur111");
//                int result=sd.change(s);
                
                
//    System.out.println("No.of Data Changed ...." +result);
//                           int r= sd.delete(102);
//                            System.out.println("No. of rows Deleted :" +r);
    Student st=sd.getStudent(101);
    System.out.println(st);
    }
    
}
