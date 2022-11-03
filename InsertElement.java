package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		int arr[] =  {1,2,3,4,5,6};
		int n=arr.length;
		int newarr[]=new int[n+1];
		int value=7;
		int index=3;
		int j=0;
	System.out.println(Arrays.toString(arr));
		/*Scanner sc=new Scanner(System.in);
		System.out.println("index:");
		index = sc.nextInt();
		System.out.println("Value:");
		value =sc.nextInt();*/
		for(int i=0;i<newarr.length;i++) {
			if(i==index) {
				newarr[i]=value;
			}
			else {
				newarr[i]=arr[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
	

}
