package com.springcore.ci;

public class Addition {
private int  a;
private int b;
public Addition(double a,double b)
{
this.a=(int)a;
this.b=(int)b;
System.out.println("Constructor:Double,Double");
}

public Addition(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("Constructor:int,int");
}
public void doSum()
{
	System.out.println("a= " +a);
	System.out.println("b= " +b);
System.out.println("Sum="+(a+b));	
}

}
