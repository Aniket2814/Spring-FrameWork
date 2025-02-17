package com.spring.jdbc.Springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
	public int delete(int studentID)
	{
		String query="delete from student where id=?";
		int r=this.jdbctemplate.update(query,studentID);
		
		return r;
	}


	@Override
	public Student getStudent(int studentID) {
		
		//select Single Student data
		String query="select * from student where id=?";
	RowMapper<Student> rowMapper=new  RowMapperImp();
	
		Student st=this.jdbctemplate.queryForObject(query,rowMapper, studentID);
		return st;
	}


	@Override
	public List<Student> getAllStudent() {
	String query1="select * from student";
	List<Student> st= this.jdbctemplate.query(query1,new RowMapperImp());
		return st;
	}
}
