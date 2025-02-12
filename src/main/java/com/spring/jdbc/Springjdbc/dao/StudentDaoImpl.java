package com.spring.jdbc.Springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
private JdbcTemplate jdbctemplate;


public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}


public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}
public int change (Student st)
{
	String query="update student set name=?,city=? where id=?";
	
	int r=this.jdbctemplate.update(query,st.getName(),st.getCity(),st.getId());
	
return r;
}

public int insert(Student student) {
	 String query="insert into student(id,name,city) values(?,?,?)";
	 int result= this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
	
	return result;
}
	
}
