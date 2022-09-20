package com.tailoring;

public class Measurement {
	int length = 0;
	int bredth = 0;
	float shouldersize = 0;
	float slevesize = 0;
	
	public Measurement(int len, int bred, float Ssize, float SLsize) {
		this.length = len;
		this.bredth = bred;
		this.shouldersize = Ssize;
		this.slevesize = SLsize;
	}
	public void print() {
		System.out.format("ShirtMeasurement: \n%s, \n%s, \n%s, \n%s\n" , this.length,this.bredth,this.shouldersize,this.slevesize);
	}

}
