package com.condition;
import java.util.Scanner;
public class DivisibleOrNot {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = input.nextInt();
		System.out.println("Enter a Divisor: ");
		int divisor = input.nextInt();
		
		if(num%divisor == 0){
			System.out.println("The Number is Divisible ");
			
		}
		else {
			System.out.println("The number is not Divisible ");
		}
		
		
	}

}
