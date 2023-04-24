package com.loops;

public class OddNo1to20 {

	public static void main(String[] args) {
		int total = 0 ;
		for(int i=1; i<=20; i++) {
			if(i%2 != 0) {
				total++;
			}
		}
		System.out.println("Total odd numbers between 1 to 20 is: "+ total);
	}

}
