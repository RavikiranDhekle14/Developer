package com.loops;
import java.util.Scanner;
public class PalimdromNumber {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = input.nextInt();

	        int reversedN = 0;
	        int originalN = n;

	        while (n > 0) {
	            int digit = n % 10;
	            reversedN = reversedN * 10 + digit;
	            n /= 10;
	        }

	        if (originalN == reversedN) {
	            System.out.println(originalN + " is a palindrome number");
	        } else {
	            System.out.println(originalN + " is not a palindrome number");
	        
	    }
	}


}
