package com.String;

import java.util.Scanner;

public class Palandrome {
	public static void checkPalindrome(String str) {
		String s = str;
		
		StringBuffer str1 = new StringBuffer(s);
		str1.reverse();
		String rev = str1.toString();
		
		if(rev.equals(str))
			{
			System.out.println(s+" is a palindrome.");	
			} else {
				System.out.println(s+" is not a palindrome");
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word");
		String str = sc.nextLine();
		Palandrome.checkPalindrome(str);
	}

}
