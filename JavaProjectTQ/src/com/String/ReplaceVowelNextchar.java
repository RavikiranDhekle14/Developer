package com.String;

import java.util.Scanner;

public class ReplaceVowelNextchar {
	public static void replaceVowel (String str) {
		String temp = "";
		char vowels [] = {'a','e','i','o','u'};
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == vowels[0] || str.charAt(i) == vowels[1] || str.charAt(i) == vowels[2] || str.charAt(i) == vowels[3] || str.charAt(i) == vowels[4] ) {
				temp = temp + str.charAt(i+1);	
			}else {
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String str = sc.nextLine();
		ReplaceVowelNextchar.replaceVowel(str);
	}

}
