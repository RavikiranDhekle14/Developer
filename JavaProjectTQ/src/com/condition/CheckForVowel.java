package com.condition;
import java.util.Scanner;

public class CheckForVowel {

	public static void main (String[]args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a Character: ");
		        char ch = sc.next().charAt(0);
		        if (ch == 'a') {
		        	System.out.println(ch + " is a vowel.");
		        }else if (ch == 'e') {
		        	System.out.println(ch + " is a vowel.");
		      }else if(ch == 'i') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'o') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'u') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'A') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'E') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'I') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'O') {
		            System.out.println(ch + " is a vowel.");
		        } else if(ch == 'U') {
		            System.out.println(ch + " is a vowel.");
		        } else {
		        	System.out.println(ch + " is consonent.");
		        }
		}	        
}
