package com.String;

import java.util.Scanner;

public class EmailValidation {
	void  emailVerification(String email) {
		 boolean verify = false;
		for (int i=0; i<email.length(); i++) {
			char ch = email.charAt(i);
			if (ch=='@' || ch=='.' || ch>='a' && ch<='z') {
				
				verify = true ;
				//		
			
			}
		} if (verify == true) {
			System.out.println("Email is validate : "+email);	
		}else {
			System.out.println("Email is not validate: ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email ID: ");
		String email = sc.nextLine();
		EmailValidation ev = new EmailValidation();
		ev.emailVerification(email);
		
	}

}
