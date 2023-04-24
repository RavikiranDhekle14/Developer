package com.basic;

public class UnaryOperator {
	public static void main (String[] args) {
		int a,b,c;
		a= 4;
		b= 3;
	    a = ++a;
	    b = --b;
	    c = ++a + --b ;
		System.out.println("value of a="+a +"\n" + "value of b="+b +"\n" + "value of c="+c);
		
	}

}
