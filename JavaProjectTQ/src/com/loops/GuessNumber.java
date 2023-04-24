package com.loops;
import java.util.Scanner;

public class GuessNumber {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int keyNumber = 4;
	        int numberOfTries = 0;

	        System.out.println("Guess the number! It's a single digit number.");
	        int guessNumber = sc.nextInt();
	        numberOfTries++;

	        while (guessNumber != keyNumber) {
	            System.out.println("Incorrect! Please try again.");
	            guessNumber = sc.nextInt();
	            numberOfTries++;
	        }

	        System.out.println("the number is Correct " + numberOfTries + " tries.");
	    
	}


}
