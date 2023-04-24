package com.basic;
import java.util.Scanner;
public class EnterDaysIntoWeeksMonthsYears {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of days: ");
	        int days = input.nextInt();

	        int years = days / 365;
	        int months = (days / 30);
	        int weeks = (days/7);

	        System.out.println("Years: " + years);
	        System.out.println("Months: " + months);
	        System.out.println("Weeks: " + weeks);
	    
	}


}
