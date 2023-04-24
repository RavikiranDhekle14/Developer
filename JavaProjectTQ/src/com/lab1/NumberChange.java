package com.lab1;

import java.util.Scanner;

public class NumberChange {
	void display (int num[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbert to be replaced with 0 :");
			int n = sc.nextInt();
		for (int  i = 0; i < num.length; i++) {
			if (num[i] == n) {
				num[i] = 0;
			}
			System.out.println(num[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) { 
		int num[] = {10, 20, 30, 40, 30, 10, 30};
		NumberChange r = new NumberChange();
		r.display(num);
		
	}

}
