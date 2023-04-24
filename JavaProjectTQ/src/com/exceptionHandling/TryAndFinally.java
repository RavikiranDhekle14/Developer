package com.exceptionHandling;

public class TryAndFinally {

	public static void main(String[] args) {
		System.out.println("hii");
	
		try {
			int x = 10;
			int	divide = x/0;
			System.out.println(divide);
		}
		finally
		{
			System.out.println("hey");
		}
		System.out.println("hello");
	}

}
