package com.loops;

import java.util.Scanner;

public class TableOfgivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		for(int i = 1; i<= 10; i++) {
			int result = number*i;
			System.out.println(number + " X "+ i +" = " + result);
		}
	}

}
