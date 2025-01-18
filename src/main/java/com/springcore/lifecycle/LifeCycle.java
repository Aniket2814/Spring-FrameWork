package com.springcore.lifecycle;

public class LifeCycle {
private int x;

public int getX() {
	return x;
}

public void setX(int x) {
	System.out.println("Setting dependency ");
	this.x = x;
}

@Override
public String toString() {
	return "LifeCycle [x=" + x + "]";
}

public void init()
{
	System.out.println("Init method called");
	}
public void destroy()
{
	
System.out.println("Destroy method Called");
}
}
