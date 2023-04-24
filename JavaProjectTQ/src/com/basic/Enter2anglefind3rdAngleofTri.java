package com.basic;
import java.util.Scanner;
public class Enter2anglefind3rdAngleofTri {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the first angle of the triangle: ");
	        double angle1 = input.nextDouble();

	        System.out.print("Enter the second angle of the triangle: ");
	        double angle2 = input.nextDouble();

	        double angle3 = 180 - angle1 - angle2;

	        System.out.println("The third angle of the triangle is: " + angle3);
	    
	}


}
