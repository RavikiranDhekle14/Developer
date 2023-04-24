package com.loops;
import java.util.Scanner;
public class CheckForAutomorphicOrNot {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int Square = 1;
		int temp = num;
		int digit = 0;
		while(temp>0) {
			Square = num*num ;
			digit++;
			temp /=10;	
		}
		int lastDigits = Square%100;
		if (lastDigits == num) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }	
	}
}
