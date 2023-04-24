package com.loops;
import java.util.Scanner;
public class EvenNo1ton {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n, sum = 0;
	        System.out.print("Enter a positive integer n: ");
	        n = input.nextInt();

	        for (int i = 2; i <= n; i += 2) {
	            sum += i;
	        }

	        System.out.println("Sum of even numbers from 1 to " + n + " is " + sum);
	    
	}


}
