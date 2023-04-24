package com.basic;
import java.util.Scanner;
public class EnterNumberAndPowerforResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
	

}
