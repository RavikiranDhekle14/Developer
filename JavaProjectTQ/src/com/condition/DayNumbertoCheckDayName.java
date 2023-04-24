package com.condition;
import java.util.Scanner;

public class DayNumbertoCheckDayName {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the day number (1-7): ");
		        int dayNum = input.nextInt();

		        String dayName = "";

		        switch(dayNum) {
		            case 1:
		                dayName = "Monday";
		                break;
		            case 2:
		                dayName = "Tuesday";
		                break;
		            case 3:
		                dayName = "Wednesday";
		                break;
		            case 4:
		                dayName = "Thursday";
		                break;
		            case 5:
		                dayName = "Friday";
		                break;
		            case 6:
		                dayName = "Saturday";
		                break;
		            case 7:
		                dayName = "Sunday";
		                break;
		            default:
		                System.out.println("Invalid day number.");
		                System.exit(0);
		        }

		        System.out.println("The day is " + dayName + ".");
		    
	}

}
