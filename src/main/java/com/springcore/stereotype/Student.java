package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.*;
@Component

public class Student {

	@Value("Aniket Rathore")
	private String studentName;
  @Value("Shajapur")
	private String studentCity;

  @Value("#{temp}")
   private List<String> address;
  @Value("${non.existent.property:20000.0}")
  private double salary;
  public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", address=" + address + "]";
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
}
