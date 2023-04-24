package com.innerclassDemo;

class Outer {
	int x = 20;
	
	class InnerClass {
		public void show() {
			System.out.println("X ="+x);
		}
	}
}
public class InnerClassdemo1 {

	public static void main(String[] args) {

	Outer o = new Outer();
	Outer.InnerClass ic = o.new InnerClass();
	ic.show();
	}

}
