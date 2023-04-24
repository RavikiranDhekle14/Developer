package com.basic;
import java.util.Scanner;

public class EnterNumberToCalculateSquerRoot {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = input.nextDouble();

	        double squareRoot = Math.sqrt(number);

	        System.out.println("Square root of " + number + " is " + squareRoot);
	    
	}


}
