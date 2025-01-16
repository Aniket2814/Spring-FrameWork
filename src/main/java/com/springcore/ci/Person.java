package com.springcore.ci;

public class Person {

	private int PersonId;
	private String name;
	
	Person (int PersonId,String name)
	{
		this.PersonId=PersonId;
		this.name=name;
	}
     @Override
	public String toString()
	{
		
	return this.name+ " : " +this.PersonId;
		
	}
}
