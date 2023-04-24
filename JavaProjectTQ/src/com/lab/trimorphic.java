package com.lab;

import java.util.Scanner;

public class trimorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cube = 1;
		int temp = num;
		int digit = 0;
		while(temp>0) {
			cube = num*num*num ;
			digit++;
			temp /=10;	
		}
		int lastDigits = cube%(int ) Math.pow(10, digit);
		if (lastDigits == num) {
            System.out.println(num + " is an trimorphic number.");
        } else {
            System.out.println(num + " is not an trimorphic number.");
        }	
	}

}
