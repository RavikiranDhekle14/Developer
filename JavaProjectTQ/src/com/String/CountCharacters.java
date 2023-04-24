package com.String;

import java.util.Scanner;

public class CountCharacters {

	public static void count(String str) {
		int vovelcount = 0;
		int digitcount = 0;
		int specialchar = 0;
		int consonentcount = 0;
		String s = str;
		s = s.toLowerCase();
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i)>='0' && s.charAt(i)<='9'){
				digitcount++;
			}else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
				vovelcount++;
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				consonentcount++;
			}else {
				specialchar++;
			}
		}
		System.out.println("Digit Count: "+digitcount);
		System.out.println("vovel Count: "+vovelcount);
		System.out.println("consonent count : "+consonentcount);
		System.out.println("specialchar Count: "+specialchar);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();
		
		CountCharacters.count(str);
	}

}
