package com.twoDiamentionalArray;

public class StarPattern {
	
	public static void pyramid () {
		int rows = 5;
		int coloumn = 5;
		for (int i=0; i< rows; i++) {
			for  (int j=i; j<rows; j++) {
				System.out.print("*");
			}
			for (int j=i*2; j< coloumn; j++) {
				System.out.println("*");
			}
		}
	}

	public static void main(String[] args) {
		StarPattern.pyramid();
	}

}
