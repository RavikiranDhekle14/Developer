package com.basic;

import java.util.Scanner;

public class EnterPTRandCalculateCI {

  public static void main(String[] args){


	double Principal_Amount,Interest_Rate,Time_Period,CompoundInterest;

     Scanner sc=new Scanner(System.in);

	System.out.print("Enter the Principal Amount : "); 
	Principal_Amount=sc.nextDouble();

	System.out.print("Enter the Time Period in year : "); 
	Time_Period=sc.nextDouble();

	System.out.print("Enter the Interest Rate : "); 
	Interest_Rate=sc.nextDouble();

	CompoundInterest=Principal_Amount * Math.pow((1 + Interest_Rate/100),Time_Period); 

	System.out.println("");
	System.out.println("Compound Interest : "+CompoundInterest); 

	

	}

}
