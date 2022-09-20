package com.test.hello;

import com.test.application.CoreClass;

public class InstanceClass {

	public static void main(String[] args) {
		CoreClass c = new CoreClass();
//		c.setPrivateName("Nadeem");
		c.getName();
		
//		c.setProtectedName("Sajjad");
		c.getName();
		
		c.setPublicName("Ismail");
		c.getName();
	}
}
