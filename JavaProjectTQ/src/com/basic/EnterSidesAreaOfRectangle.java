package com.basic;

import java.util.Scanner;

public class EnterSidesAreaOfRectangle {
	public static void main (String[] args) {
		int l,b,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length=" );
		l = sc.nextInt();
		System.out.println("Enter the value of width=" );
		b = sc.nextInt();
        area = l*b;
		System.out.println("Area of Rectangle="+area);
	}

}
