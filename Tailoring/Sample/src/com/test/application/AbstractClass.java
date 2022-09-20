package com.test.application;

 abstract class AbstractClass {
	
	String myName = "";
	String x = "";
	
	abstract void setPrivateName(String name);
	public abstract void setPublicName(String name);
	
	abstract void setProtectedName(String name);
	
	public abstract String returnName();
	
	public abstract void getName ();
	
}
