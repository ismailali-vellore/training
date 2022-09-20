package com.test.application;

public class InstanceClass {
	public static void main(String[] args) {
		
	}
	
	public static void main1(String[] args) {
		CoreClass c = new CoreClass();
//		c.setPrivateName("Nadeem");
		c.getName();
		
		c.setProtectedName("Sajjad");
		c.getName();
		
		c.setPublicName("Ismail");
		c.getName();
	}
}
