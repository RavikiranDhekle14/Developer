package com.basic;
import java.util.Scanner;
public class EnterCelciousconvertintoFer {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in degrees Celsius: ");
        double tempInCelsius = input.nextDouble();
        
        double tempInFahrenheit = (tempInCelsius * 1.8) + 32;
        
        System.out.println("Temperature in degrees Fahrenheit: " + tempInFahrenheit);
    }

}
