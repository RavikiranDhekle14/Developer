package com.loops;

import java.util.Scanner;

public class ProductOfdigit {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n , product,digit ;
			System.out.println("Enter Number: ");
			n = sc.nextInt();
			 product = 1;
			 while (n>0) {
				 digit = n%10;
				 product *= digit ;
				n/= 10;
			 }
			 System.out.println("product of digit in the given number: " + product);
		
	}

}
