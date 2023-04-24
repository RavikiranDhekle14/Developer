package com.staticthiskeyword;

public class AccessModifiers {
	private int x = 100;
	String city = "Pune";
	protected float mark = 70.75f;
	public char alph = 'R';
	
	private void doprivate() {
		System.out.println("this is private");
	}
	public static void main(String[] args) {
		AccessModifiers u = new AccessModifiers();
		System.out.println(u.x);
		u.doprivate();
		System.out.println(u.city);
		System.out.println(u.mark);
		System.out.println(u.alph);
		//for same package with diff class check staticvariable class
		// for diff package diff class check oops shopping class
	}

}
