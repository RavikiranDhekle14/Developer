package com.basic;

import java.util.Scanner;

public class EnterValuesAllArithmaticOperation {
	public static void main (String[] args) {
		int p,q,add,sub,mul,div;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter p=" );
	p = sc.nextInt();
	System.out.println("Enter q=" );
	q = sc.nextInt();
	add = p+q;
    sub = p - q ;
    mul = p*q;
    div = p/q;
	System.out.println("Addition="+add +"\n" + "substraction="+sub +"\n" + "multiplication="+mul +"\n" + "division="+div);
}

}
