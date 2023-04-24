package com.lab;


class Animal1{
	static int a;
	static final int legs ;
	static
	{
		legs = 4;
	}
	public void behaviour() {
		a=5;
		System.out.println("Dog have "+legs+" legs");
	}
	Animal1()
	{
		
		System.out.println("Dog is Animal");
	}
	static int a(int a, int b){
		return a+b;
		
	}
	static double a(int a, int b, int c) {
		return a+b+c;
		
		
	}
	
	
}

public class MockProgram {

	public static void main(String[] args) {
		Animal1 a = new Animal1();
		a.behaviour();
		System.out.println(Animal1.a(5,6));
		System.out.println(Animal1.a(1, 2, 3));
	}

}
