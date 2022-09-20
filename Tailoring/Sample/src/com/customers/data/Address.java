package com.customers.data;

public class Address {
	String address1 = "";
	String address2="";
	String cityName ="";
	int pinCode = 0;
	String stateName = "";
	
	public Address(String add1, String add2, String city, String state, int pin) {
		this.address1 = add1;
		this.address2 = add2;
		this.cityName=city;
		this.pinCode=pin;
		this.stateName=state;
	}
	
	public void setPincode(int pin) {
		this.pinCode = pin;
	}
	

	public void print() {
		System.out.format("Address: %s, %s, %s, %s, %s\n", this.address1, this.address2, this.cityName, this.stateName, this.pinCode);
	}
}
