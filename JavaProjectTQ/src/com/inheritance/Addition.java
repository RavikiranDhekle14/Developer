package com.inheritance;
 interface Runnable{
	public default void Runnable() {
		System.out.println("This is the Interface.");
		 
	 }
 }
abstract class Runner implements Runnable{
	String name;
	void displaly() {
		System.out.println("This is abstract class");
	}
}
class Run extends Runner{
	Run(){
		System.out.println("This is inheritance");
		
	}
	void Runner(){
		System.out.println("this is implemented of");
		
	}
}









public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
