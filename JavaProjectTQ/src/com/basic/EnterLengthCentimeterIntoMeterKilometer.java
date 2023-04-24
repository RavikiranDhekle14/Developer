package com.basic;
import java.util.Scanner;

public class EnterLengthCentimeterIntoMeterKilometer {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter length in centimeters: ");
	        double lengthInCm = input.nextDouble();

	        double lengthInM = lengthInCm / 100.0;
	        double lengthInKm = lengthInCm / 100000.0;
	        double lengthInMm = lengthInCm * 10.0;

	        System.out.println("Length in meters: " + lengthInM);
	        System.out.println("Length in kilometers: " + lengthInKm);
	        System.out.println("Length in Milimeters: " + lengthInMm);

	    
	}

}
