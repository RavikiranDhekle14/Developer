package com.lab;

public class Cycle {
	String brand_name;
	String color;
	int no_of_wheels;
	
	Cycle(){
		this("Hero", "Black", 2);
		System.out.println("I am a default constructor: ");	
	}
	public Cycle(int price, int speed) {
		//this.();
		System.out.println("Price of the Cycle: " + price);
		System.out.println("Speed of cycle in KM are: "+speed);	
	}
	public Cycle(String brand_name, String color,int no_of_wheels) {
		this.brand_name=brand_name;
		this.color=color;
		this.no_of_wheels=no_of_wheels;
	}
	public void display() {
		System.out.println("Brand name: "+brand_name+"\n color: "+color+"\n no_of_wheels: "+no_of_wheels);
	}
	public static void main(String[] args) {
		Cycle c=new Cycle();
		c.display();
	}
}
