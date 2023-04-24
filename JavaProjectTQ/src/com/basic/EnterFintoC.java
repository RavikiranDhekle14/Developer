package com.basic;

import java.util.Scanner;

public class EnterFintoC {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double tempInFahrenheit = input.nextDouble();
        
        double tempInCelsius = ((tempInFahrenheit-32)*5)/9;
        
        System.out.println("Temperature in degrees Celsius: " + tempInCelsius);
    }


}
