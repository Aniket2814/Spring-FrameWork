package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
private String subject;

public Annotation() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSubject() {
	return subject;
}

@Override
public String toString() {
	return "Annotation [subject=" + subject + "]";
}

public void setSubject(String subject) {
	this.subject = subject;
}

@PostConstruct
public void start()
{
System.out.println("initializing bean");
}
@PreDestroy
public void end()
{
System.out.println("DEstroy method called");
}
}
