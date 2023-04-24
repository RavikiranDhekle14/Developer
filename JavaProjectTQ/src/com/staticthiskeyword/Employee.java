package com.staticthiskeyword;

public class Employee {
	int id ;
	String name ;
	double salary ;
	double pf ;
	
	public void acceptDetails (int id, String name, double salary) {
		this.id = id ;
		this.name=name;
		this.salary=salary;
	}
	public void pfCalculation() {
		//double pf ;
		this.pf=salary*0.12;	
	}
	public void displayDetails () {
		System.out.println(id + " " + name + " " + salary + " " + pf);
	}
	
	public static void main(String[] args) {
		Employee dt = new Employee();
		dt.acceptDetails(352, "SaiRam", 50000);
		dt.pfCalculation();
		dt.displayDetails();
		
	}
	

}
