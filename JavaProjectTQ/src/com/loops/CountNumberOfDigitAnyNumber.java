package com.loops;
import java.util.Scanner;
public class CountNumberOfDigitAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , count ;
		System.out.println("Enter Number: ");
		n = sc.nextInt();
		 count = 0;
		 while (n !=0) {
			n/= 10;
			count++;
		 }
		 System.out.println("number of digit in the given number: " + count);
	}

}
