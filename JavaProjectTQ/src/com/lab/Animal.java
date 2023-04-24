package com.lab;
class Veg_NonVeg {	
	String foodtype;
}
class Dog extends Veg_NonVeg{
	
	public void showFood(String foodtype) {
		foodtype = "Non Veg";
		System.out.println(foodtype);
	}
}
class Cow extends Veg_NonVeg{
	public void showFood(String foodtype) {
		this.foodtype = foodtype;
		System.out.println(foodtype);
	}
}
public class Animal{
	public static void main(String[] args) {
		Cow cw = new Cow();
		Dog dg = new Dog();
		dg.showFood("Non Veg");
		cw.showFood("veg");
	}
}
