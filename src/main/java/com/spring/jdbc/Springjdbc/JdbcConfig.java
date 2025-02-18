package com.spring.jdbc.Springjdbc;

import javax.sql.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Springjdbc.dao.*;

@Configuration
public class JdbcConfig {
@Bean("ds")
public DataSource  getDataSource()
{
	DriverManagerDataSource d=new DriverManagerDataSource();
	d.setDriverClassName("com.mysql.cj.jdbc.Driver");
   d.setUrl("jdbc:mysql://localhost:3306/springjdbc?allowPublicKeyRetrieval=true&useSSL=false");
   d.setUsername("root");
   d.setPassword("Aniket@440");
return d;
}
	
@Bean("jdbcTemplate")
public JdbcTemplate getTemplate()
{
	JdbcTemplate jdbc=new JdbcTemplate();
	jdbc.setDataSource(getDataSource());
	
	return jdbc;
}	
@Bean("studentdao")
public StudentDao getStudentDao()
{
	StudentDaoImpl s=new StudentDaoImpl();
	s.setJdbctemplate(getTemplate());
return  s;
}
	
}
