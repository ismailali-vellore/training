package com.test.application;

public class CoreClass {
	
	private String myName = "";
	protected String x = "";
	
	private void setPrivateName(String name)
	{
		this.myName = name;
	}
	public void setPublicName(String name)
	{
		this.myName = name;
	}
	
	protected void setProtectedName(String name)
	{
		this.myName = name;
	}
	
	public String returnName() {
		return this.myName;
	}
	
	public void getName () {
		System.out.println("My name is " + this.myName);
	}
	
	public static void main(String[] args) {
		CoreClass c = new CoreClass();
		c.setPrivateName("Nadeem");
		c.getName();
		
		c.setProtectedName("Sajjad");
		c.getName();
		
		c.setPublicName("Ismail");
		c.getName();
	}
}
