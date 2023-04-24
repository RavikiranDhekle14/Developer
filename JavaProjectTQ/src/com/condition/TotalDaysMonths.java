package com.condition;
import java.util.Scanner;

public class TotalDaysMonths {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int month, year;
	        System.out.print("Enter the month (1-12): ");
	        month = input.nextInt();
	        System.out.print("Enter the year: ");
	        year = input.nextInt();

	        int daysInMonth = 0;
	        switch (month) {
	            case 1: // January
	            case 3: // March
	            case 5: // May
	            case 7: // July
	            case 8: // August
	            case 10: // October
	            case 12: // December
	                daysInMonth = 31;
	                break;
	            case 4: // April
	            case 6: // June
	            case 9: // September
	            case 11: // November
	                daysInMonth = 30;
	                break;
	            case 2: // February
	                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	                    daysInMonth = 29;
	                } else {
	                    daysInMonth = 28;
	                }
	                break;
	            default:
	                System.out.println("Invalid month");
	                break;
	        }
	        System.out.println("Number of days in the month: " + daysInMonth);
	}
}
