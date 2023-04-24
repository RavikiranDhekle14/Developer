package com.inheritance;


class MyClass {
    final String message = "Hello from MyClass!"; // final instance variable

    public void printMessage() {
        System.out.println(message);
    }
}

final class MySubClass extends MyClass { // final subclass
    @Override
    public void printMessage() {
        System.out.println("Hello from MySubClass!");
    }
}


// class PIValue{
//	 final double pi = 3.14;
//	 public final void areaOfCircle() {
//		 double r = 5;
//		 double area = pi*r*r;
//		 System.out.println("the area of circle:  "+area);
//	 } 
// }
// class Perimeter extends PIValue {
//	 public void perimeterOfCircle() {
//		 int r =2;
//		 //this.pi = 45; cannot change the final value of variabl
//		 double peri = pi*r;
//	 } 
// }
// class areaCir {
//	 public final void areaOfCircle() {
//		 double r = 2;
//		 double pi = 0;
//		double area = pi*r*r;
//		 System.out.println("the area of circle:  "+area);
//	 }
// }

public class FinalKeyword {

	public static void main(String[] args) {
//		PIValue p = new PIValue();
//		System.out.println();
		 final int constant = 42; // final variable

	        final MyClass myObj = new MyClass(); // final reference variable
	        myObj.printMessage();

	        final MySubClass mySubObj = new MySubClass(); // final subclass reference variable
	        mySubObj.printMessage();

	}

}
