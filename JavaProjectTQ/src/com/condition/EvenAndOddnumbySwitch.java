package com.condition;

import java.util.Scanner;

public class EvenAndOddnumbySwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        switch(num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            case 1:
                System.out.println(num + " is an odd number.");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
	}

}
