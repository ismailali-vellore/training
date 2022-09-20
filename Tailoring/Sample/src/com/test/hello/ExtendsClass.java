package com.test.hello;

import com.test.application.CoreClass;

public class ExtendsClass extends CoreClass {
	
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	@Override
	public void getName() {
		System.out.println("Hello " + returnName());
	}

	public static void main(String[] args) {
		ExtendsClass c = new ExtendsClass();
//	c.setPrivateName("Nadeem");
		c.getName();
		
		c.setProtectedName("Sajjad");
		c.getName();
		
		c.setPublicName("Ismail");
		c.getName();
		
		c.sayHello();
		
	}
}
