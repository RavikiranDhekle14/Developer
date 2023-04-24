package com.inheritance;

abstract class Animal {
	    protected String name;

	    public Animal(String name) {
	        this.name = name;
	    }

	    public abstract void makeSound();

	    public void eat() {
	        System.out.println(name + " is eating.");
	    }
	}

abstract class Mammal extends Animal {
	    protected int numLegs;

	    public Mammal(String name, int numLegs) {
	        super(name);
	        this.numLegs = numLegs;
	    }

	    public void walk() {
	        System.out.println(name + " is walking on " + numLegs + " legs.");
	    }
	}

class Dog extends Mammal {
	    public Dog(String name) {
	        super(name, 4);
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(name + " says woof!");
	    }
	}		


public class AbstractClasses {
	public static void main(String[] args) {
		Dog m = new Dog("say woof");
		m.eat();
		m.makeSound();
		m.walk();
		System.out.println("bhoo");
		
	
	}
}
