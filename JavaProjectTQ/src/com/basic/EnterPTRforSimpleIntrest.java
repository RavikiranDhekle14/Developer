package com.basic;
import java.util.Scanner;
public class EnterPTRforSimpleIntrest {
	  public static void main(String[] args){


		double Principal_Amount,Interest_Rate,Time_Period,SimpleInterest;

	     Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Principal Amount : "); 
		Principal_Amount=sc.nextDouble();

		System.out.print("Enter the Time Period in year : "); 
		Time_Period=sc.nextDouble();

		System.out.print("Enter the Interest Rate : "); 
		Interest_Rate=sc.nextDouble();

		SimpleInterest=Principal_Amount+(100*Interest_Rate*Time_Period); 

		System.out.println("Simple Interest : "+SimpleInterest); 

	}
}
