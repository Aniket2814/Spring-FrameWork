package com.springcore.standalone.collections;

import java.util.*;

public class Person {
@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + "]";
	}

private List<String> friends;
private Map<String,Integer> fees;
public Properties getProperty() {
	return property;
}

public void setProperty(Properties property) {
	this.property = property;
}

private Properties property;
public Map<String, Integer> getFees() {
	return fees;
}

public void setFees(Map<String, Integer> fees) {
	this.fees = fees;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


}
