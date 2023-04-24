package com.loops;

import java.util.Scanner;

public class FrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int[] digitFreq = new int[10];
		while (num>0) {
			int digit = num%10;
			digitFreq[digit]++;
			num/=10;
			 System.out.println("Digit frequency in the given integer:");
		        for (int i = 0; i < 10; i++) {
		            if (digitFreq[i] > 0) {
		                System.out.printf("%d: %d\n", i, digitFreq[i]);
		            }
		        }
		}
	}
}
