package com.innerclassDemo;

class MyOuterClass {
	int x = 30;
	public void input() {
		class MyInnerClass {			
			public void display() {
				System.out.println("Hiii");
			}		
		}
		MyInnerClass m = new MyInnerClass();
		m.display();
	}

}


public class LocalDemo {

	public static void main(String[] args) {
		
		MyOuterClass n = new MyOuterClass();
		n.input();
	}

}
