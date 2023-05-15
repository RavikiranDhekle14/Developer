package com.ArraylistCode;

import java.util.ArrayList;
public class PrimeNumberFromArraylist {
	public static void primeno (ArrayList<Integer> al) {
		int prime = 0;
		for (int i=2; i*i<al.size(); i++) {
			if (al.get(i)% al.get(i)==0) {
				prime = al.get(i);
				System.out.println("Prime Numbers are :"+ prime );
			}
		}
	System.out.println(prime);
	}
	
		
		
		
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(3);
		al.add(7);
		al.add(4);
		al.add(5);
		al.add(4);
		
		System.out.println("Arraylist : "+al);
		PrimeNumberFromArraylist.primeno(al);
	}		
}

	

