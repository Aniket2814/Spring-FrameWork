package com.spring.jdbc.Springjdbc.dao;

import java.util.List;

import com.spring.jdbc.Springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
 public int change(Student student);
 public int delete (int studentID);
 
 public Student getStudent(int studentID);
 
 public List<Student> getAllStudent();
}
