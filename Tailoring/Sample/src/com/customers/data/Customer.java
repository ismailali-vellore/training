package com.customers.data;

public class Customer {
	String name;
	int age;
	Address communicationAddress;
	Address permanentAddress;
	String education;
	int cno;

	public Customer() {
		
	}
	
	public Customer(String custName) {
		this.name = custName;
	}
	
	public Customer (String custName, int age) {
		this.name = custName;
		this.age = age;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setpublicAge(int age) {
		this.age = age;
	}

	public void setCommunicationAddress(Address address) {
		this.communicationAddress = address;
	}
	
	public void setPermanentAddress(Address address) {
		this.permanentAddress = address;
	}

	public void setpublicEducation(String education) {
		this.education = education;
	}

	public void setpublicCno(int cno) {
		this.cno = cno;
	}

	public void getName() {
		System.out.println("customer name:" + this.name);
	}

	public void getAge() {
		System.out.println("customer age:" + this.age);
	}

	public Address getCommunicationAddress() {
		return this.communicationAddress;
	}
	
	public Address getPermanentAddress() {
		return this.permanentAddress;
	}

	public void getEducation() {
		System.out.println("customer education:" + this.education);
	}

	public void getCno() {
		System.out.println("customer cno:" + this.cno);
	}
	
	

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setname("Nadeed");
		c1.setpublicAge(21);
		c1.setpublicEducation("B.E");
		
		Address a1 = new Address("No12, 11th Street", "Madhina Nagar", "Vellore", "TN", 632013);
		c1.setCommunicationAddress(a1);
		
		
		c1.getCommunicationAddress().setPincode(560001);
		
		a1.setPincode(740005);
		
		c1.setPermanentAddress(new Address("Roja mettu street", "Konavattam", "Vellore", "TN", 632013));
		c1.getPermanentAddress().setPincode(632000);
		
		
		
		c1.getName();
		c1.getAge();
		c1.getEducation();
		c1.getCommunicationAddress().print();
		c1.getPermanentAddress().print();
				
/*		
		c2.getName();
		c2.getAge();
		
		c3.getName();
		c3.getAge();
*/		
		
		
		

	}

	
}
