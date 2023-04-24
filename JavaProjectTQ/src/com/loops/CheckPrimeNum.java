package com.loops;
import java.util.Scanner;

public class CheckPrimeNum {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int num;
	        System.out.print("Enter a positive integer: ");
	        num = input.nextInt();

	        int i = 2;
	        boolean isPrime = true;
	        while (i <= num / 2) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	            i++;
	        }

	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        
	    }
	}


}
