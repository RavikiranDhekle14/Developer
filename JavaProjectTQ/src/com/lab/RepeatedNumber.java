package com.lab;
import java.util.Scanner;
public class RepeatedNumber {
	public static void main(String[] args) {
		int digit =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println("Enter a Search: ");
		int Search = sc.nextInt();
		int count = 0;
		while (num>0) {
			int rem = num%10;
			if (rem==Search) {
				count++;
			}
			num /= 10;
		}
		System.out.println(" Digit Count is :"+count);		
	}
}
