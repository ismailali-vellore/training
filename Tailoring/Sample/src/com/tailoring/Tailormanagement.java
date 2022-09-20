package com.tailoring;

public class Tailormanagement {
	String name;
	int age;
	int no;
	String Dresscode;
	Measurement size;
	PantMearsurement measuring;
	int date;
    int Ddate;
	int Amount;
	
	public Tailormanagement() {
		
	}
	public Tailormanagement(String Cname) {
		this.name = Cname;
	}
	public Tailormanagement(String Cname , int age) {
		this.name = Cname;
		this.age = age;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setpublicAge(int age) {
		this.age = age;
	}
	public void setpublicno(int phoneno) {
		this.no = phoneno;
	}
	public void setdressname(String Dressname) {
		this.Dresscode = Dressname;
	}
	public void setSize(Measurement measurement) {
		this.size = measurement;
	}
	public void setmeasure(PantMearsurement measure) {
		this.measuring = measure;	
	}
	public void setpublicDate(int Duedate) {
		this.date = Duedate;
	}
	public void setpublicdate(int Delivarydate) {
		this.Ddate = Delivarydate;
	}
	public void setpublicammount(int Ammount) {
		this.Amount = Ammount;
	}
	
	public void getName() {
		System.out.println("Customer name:" + this.name);
	}
	public void getage() {
		System.out.println("Customer age:" + this.age);
	}
	public void getNumber() {
		System.out.println("Customer Number:" + this.no);
	}
	public void getdressname() {
		System.out.println("Dresstype:" + this.Dresscode);
	}
	public Measurement getmeasurement() {
		return this.size;
	}
	public PantMearsurement getmeasure() {
		return this.measuring;
	}
	public void getDuedate() {
		System.out.println("dress duedate" + this.date);
	}
	public void getDelivarydate() {
		System.out.println("dress delivarydate" + this.Ddate);
	}
	public void getAmmount() {
		System.out.println("Ammount:" + this.Amount);
	}
	
	public static void main (String[] args){
		
		Tailormanagement t1 = new Tailormanagement();
		t1.setname("Nadeem");
		t1.setpublicno(99528678);
		t1.setpublicAge(21);
		t1.setpublicammount(5000);
		t1.setpublicDate(12-05-2022);
		t1.setpublicdate(25-05-2022);
		
		Measurement m1 = new Measurement(12, 5, 6, 7);
		PantMearsurement p1 = new PantMearsurement(7,4,5);
		t1.setSize(m1);
		t1.setmeasure(p1);
	    t1.getName();
	    t1.getNumber();
	    t1.getage();
	    t1.getdressname();
	    t1.getmeasurement().print();
	    t1.getmeasure().print();
	    t1.getDuedate();
	    t1.getDelivarydate();
	    t1.getAmmount();
	    }

}
