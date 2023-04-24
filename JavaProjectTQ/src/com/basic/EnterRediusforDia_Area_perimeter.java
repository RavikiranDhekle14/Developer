package com.basic;

import java.util.Scanner;

public class EnterRediusforDia_Area_perimeter {
	public static void main (String[] args) {
		double r,d,area,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of redius=" );
		r = sc.nextInt();
		perimeter= 2*3.14*r;
		d= 2*r;
		area= 3.14*r*r;
		System.out.println("Diameter="+d +"\n" +"Area of Circle="+area + "\n" +"Perimeter of Circle="+perimeter);
	}

}
