package com.condition;

import java.util.Scanner;

public class ElectricityBillCal {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter electricity consumption units: ");
	        int units = sc.nextInt();
	        
	        double billAmount = 0;
	        
	        if (units <= 50) {
	            billAmount = units * 0.5;
	        } else if (units <= 150) {
	            billAmount = 25 + (units - 50) * 0.75;
	        } else if (units <= 250) {
	            billAmount = 100 + (units - 150) * 1.2;
	        } else {
	            billAmount = 220 + (units - 250) * 1.5;
	        }
	        
	        billAmount = billAmount + 0.2 * billAmount; // Add 20% surcharge
	        
	        System.out.println("Electricity bill amount: " + billAmount);
	    
	}


}
