package com.basic;

import java.util.Scanner;

public class EnterValuesandperimeterOfRectangle {
		public static void main (String[] args) {
			int l,b,perimeter;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of length=" );
			l = sc.nextInt();
			System.out.println("Enter the value of width=" );
			b = sc.nextInt();
	        perimeter = 2 *(l+b);
			System.out.println("perimeter of Rectangle="+perimeter);
		}
}
