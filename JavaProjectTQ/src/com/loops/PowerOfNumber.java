package com.loops;
import java.util.Scanner;

	public class PowerOfNumber {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the base: ");
	        double base = input.nextDouble();

	        System.out.print("Enter the index: ");
	        int index = input.nextInt();

	        double result = 1;

	       // for (int i = 0; i < index; i++) {
	       //     result *= base;
	       // }
	        int i = 0 ;
	        while ( i < index) {
	        	result *= base;
	        	i++;
	        }

	        System.out.println(base + " raised to the power of " + index + " is " + result);
	    
	}
}
