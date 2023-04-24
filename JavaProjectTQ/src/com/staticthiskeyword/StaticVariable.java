package com.staticthiskeyword;

public class StaticVariable {
	int sid;
	String name;
	static int marks ;
	
	public StaticVariable() {
		
		System.out.println("Welcome to Class ...");
		
	}
	public StaticVariable(int sid, String name, int marks) {
		
		System.out.println("Students Details...");
		this.sid=101;
		this.name = "atul";
		marks=75;
		this.showdetails();
	}
	public void showdetails() {
		System.out.println(sid+" "+name+" "+marks);
	}
	public static void main (String[] args) {
		StaticVariable s1= new StaticVariable();	
		marks =78;
		s1.showdetails();
		
		
//		for check Accessmodifiers in same package with diff class
//		AccessModifiers u= new AccessModifiers();
//		System.out.println(u.x);
//		
//		System.out.println(u.city);
//		System.out.println(u.mark);
//		System.out.println(u.alph);
		
	}

}
