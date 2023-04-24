package com.loops;
import java.util.Scanner;
public class krushnamurtiorNot {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int n = input.nextInt();

	        int sum = 0;
	        int temp = n;

	        while (temp > 0) {
	            int digit = temp % 10;
	            int factorial = 1;

	            for (int i = 1; i <= digit; i++) {
	                factorial *= i;
	            }

	            sum += factorial;
	            temp /= 10;
	        }

	        if (sum == n) {
	            System.out.println(n + " is a Krishnamurthy number");
	        } else {
	            System.out.println(n + " is not a Krishnamurthy number");
	        
	    }
	}


}
