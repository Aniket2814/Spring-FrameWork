package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {


private Address address;

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Address getAddress() {
	System.out.println("getter");
	return address;
}
@Autowired
@Qualifier("addres1")
public void setAddress(Address address) {
	System.out.println("setter");
	this.address = address;
}

public Emp(Address address) {
	super();
	System.out.println("constructor");
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}




}
