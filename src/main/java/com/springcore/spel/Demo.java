package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

@Value("#{11+22}")
private int x;

@Value("#{8>9?12:13}")
private int y;
@Value("#{T(java.lang.Math).sqrt(169)}")
private int z;

@Value("#{T(java.lang.Math).PI}")
private double pi;

@Value("#{new java.lang.String('Aniket Rathore')}")
private String name;



public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Value("#{true}")
private boolean isActive;
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public double getPi() {
	return pi;
}
public void setPi(double pi) {
	this.pi = pi;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive + "]";
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
}
