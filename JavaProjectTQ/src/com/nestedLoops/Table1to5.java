package com.nestedLoops;

public class Table1to5 {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) { // loop for each number
	            System.out.println("Multiplication table of " + i + ":");
	            for (int j = 1; j <= 10; j++) { // loop for multiplying the number
	                System.out.println(i + " x " + j + " = " + (i*j));
	            }
	            System.out.println(); // add a blank line between tables
	        
	    }
	}

}
