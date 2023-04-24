package com.loops;
import java.util.Scanner;
public class Mathexp {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a positive integer n: ");
	        int n = input.nextInt();

	        int sum = 0;
	        int factorial = 1;

	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	            sum += factorial;
	        }

	        System.out.println("The sum of the factorials from 1 to " + n + " is " + sum);
	    
	}


}
