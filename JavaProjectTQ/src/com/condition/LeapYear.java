package com.condition;
import java.util.Scanner;

public class LeapYear {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int year;
	        System.out.print("Enter a year: ");
	        year = input.nextInt();

	        boolean isLeap = false;
	        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	            isLeap = true;
	        }

	        if (isLeap) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        
	    }
	}


}
