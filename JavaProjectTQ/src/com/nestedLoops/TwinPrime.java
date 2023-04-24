package com.nestedLoops;
import java.util.Scanner;

public class TwinPrime {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();
	        sc.close();
	        
	        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
	            System.out.println(num1 + " and " + num2 + " are twin prime numbers");
	        } else {
	            System.out.println(num1 + " and " + num2 + " are not twin prime numbers");
	        }
	    }
	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
