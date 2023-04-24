package com.lab;

abstract class Father
{
	String laptop = "You Get Laptop";
	int marks;
	void display() {
		System.out.println("If you get pass...:"+laptop);
	}
	abstract void Pass();
	Father(){
		System.out.println("Get Degree");
	}
	Father(int marks){
		this();
		this.marks=marks;
	}
}
abstract class Child extends Father{
	Child(){
		super();
	}
	//@override
	void Pass() {
		System.out.println("I get Laptop, I am Pass" );
	}
}
public class abstractClass {

	public static void main(String[] args) {

	}

}
