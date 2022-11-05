package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertStringArray {

	public static void main(String[] args) {
		String str[]=new String[] {"nadeem","syed","Sajjad"};
		System.out.println("Orginal array:\n"+Arrays.toString(str));
		List<String>n=new ArrayList<String>(Arrays.asList(str));
		String f="muzammil";
		n.add(f);
		str=n.toArray(str);
		System.out.println("Array with added value:\n"+Arrays.toString(str));

	}

}
