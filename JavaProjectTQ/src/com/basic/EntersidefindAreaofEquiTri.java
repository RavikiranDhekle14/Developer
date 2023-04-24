package com.basic;
import java.util.Scanner;
public class EntersidefindAreaofEquiTri {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the side length of the equilateral triangle: ");
	        double sideLength = input.nextDouble();

	        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);

	        System.out.println("The area of the equilateral triangle is: " + area);
	    
	}


}
