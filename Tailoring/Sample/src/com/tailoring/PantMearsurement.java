package com.tailoring;

public class PantMearsurement {
	int length = 0;
	int hipsize = 0;
	int bredth = 0;
	
	public PantMearsurement(int len , int Hsize , int bread) {
		this.length = len;
		this.hipsize = Hsize;
		this.bredth = bread;
	}
	public void print() {
		System.out.format("Pantmeasurement: \n%s , \n%s , \n%s", this.length,this.bredth,this.hipsize);
	}

}
