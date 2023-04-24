package com.lab;

public class Bike {
	String model;
	String name;
	MotorBike type;
	public Bike(String model, String name, MotorBike type) {
		this.model=model;
		this.name=name;
		this.type=type;	
	}
	public String toString() {
		return model + " " + name + " " + type;
	}
	public static void main(String[] args) {
		Bike bk= new Bike("Version3", "FZ", new MotorBike("Sports"));
		System.out.println(bk);
	}

}
class MotorBike{
	String type;
	public MotorBike(String type) {
		this.type=type;
	}
	public String toString() {
		return " "+ type;
	}
}
