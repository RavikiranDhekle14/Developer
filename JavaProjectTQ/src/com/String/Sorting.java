package com.String;

import java.util.Arrays;

public class Sorting {
	 void sorting(String[] str) {
		String[] s =  str ;
		for (int i=0;  i<s.length; i++ ) {
			for (int j=i+1; j<s.length; j++) {
				if(s[i].compareTo(s[j]) <0) {
					String temp1 = s[i];
					s[i] =s[j];
					s[j] = temp1;
				}
			}	
		}
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		String str =  "Mumbai, Pune, Banglore, Amravati";
		Sorting ss = new Sorting();
		ss.sorting(str);
	}

}
