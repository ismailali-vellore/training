package com.Arrays;

public class SearchigAnStringArray {

	public static void main(String[] args) {
		String str[]=new String[] {"syed","nadeem","Sajjad","muzammil"};
		boolean x=false;
		String I="nadeem";
		int index=0;
		for(int i=0;i<str.length;i++) {
			if(I.equals(str[i])) {
				index=i;
				x=true;
				break;
			}
			
		}
		if(x) {
			System.out.println(I+ " is founded in index "+index);
		}
		else {
			System.out.println(I+ " is not found");
		}

	}

}
