package com.condition;
import java.util.Scanner;
public class AlphabtSymbolNumber {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        char ch;
	        System.out.print("Enter any character: ");
	        ch = input.next().charAt(0);

	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            System.out.println(ch + " is an Alphabet.");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println(ch + " is a Digit.");
	        } else {
	            System.out.println(ch + " is a Special Character.");
	        
	    }
	}


}
