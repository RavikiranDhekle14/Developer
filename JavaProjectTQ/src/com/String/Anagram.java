package com.String;

import java.util.Scanner;

public class Anagram {
	public static void checkAnagram(String str1, String str2) {
		if (str1.length()==str2.length()) {
			String st1 = str1.toLowerCase();
			String st2 = str2.toLowerCase();
			
			System.out.println(st1+" "+st2);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

}
