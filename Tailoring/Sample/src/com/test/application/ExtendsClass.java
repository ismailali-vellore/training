package com.test.application;

public class ExtendsClass extends CoreClass {

	public static void main(String[] args) {
		CoreClass c = new CoreClass();
//		c.setPrivateName("Nadeem");
		c.getName();
		
		c.setProtectedName("Sajjad");
		c.getName();
		
		c.setPublicName("Ismail");
		c.getName();
	}
}
