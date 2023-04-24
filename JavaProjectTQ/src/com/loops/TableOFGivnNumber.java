package com.loops;
import java.util.Scanner;
public class TableOFGivnNumber {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	        System.out.println("Table of " + number + ":");
	       
	        for (int i = 1; i <= 10; i++) {
	        	 int table = (number * i);
	            System.out.println(number + " x " + i + " = " + table);
	        }
	    }
}
