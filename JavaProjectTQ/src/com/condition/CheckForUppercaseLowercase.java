package com.condition;
import java.util.Scanner;
public class CheckForUppercaseLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character ");
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character.");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character.");
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }
			
	}

}
