package com.springcore.ci;

public class Person {

	private int PersonId;
	private String name;
	private Certi certi;
	Person (int PersonId,String name,Certi certi)
	{
		this.PersonId=PersonId;
		this.name=name;
		this.certi=certi;
	}
     @Override
	public String toString()
	{
		
	return this.name+ " : " +this.PersonId+ " :  " +this.certi.name;
		 
	}
}
