package com.basic;

import java.util.Scanner;

public class EnterMarksperOf5sub {
	public static void main (String[] args) {
		double sub1,sub2,sub3,sub4,sub5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 1st subject=" );
		sub1 = sc.nextInt();
		System.out.println("Enter the marks of 2nd subject=" );
		sub2 = sc.nextInt();
		System.out.println("Enter the marks of 3rd subject=" );
		sub3 = sc.nextInt();
		System.out.println("Enter the marks of 4th subject=" );
		sub4 = sc.nextInt();
		System.out.println("Enter the marks of 5th subject=" );
		sub5 = sc.nextInt();
        double percentage = ((sub1+sub2+sub3+sub4+sub5)*100)/550;
        double total = (sub1+sub2+sub3+sub4+sub5);
        double avg = (sub1+sub2+sub3+sub4+sub5)/5.5;
		System.out.println("percentage of 5 Subject ="+percentage +"\n" +"average marks= "+avg +"\n" +"Total marks= "+total);
	}

}
