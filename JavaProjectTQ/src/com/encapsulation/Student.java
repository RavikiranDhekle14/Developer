package com.encapsulation;

public class Student {
	private int studentID;
	private String name;
	private double percentage;
	//boolean placed= true;
	
	public void setId(int studentID ) {
		this.studentID = studentID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPercentage(double percentage) {
		this.percentage=percentage;
		boolean isPercentage = true;
		
		if(percentage<=60) {
			isPercentage = false;
			
			System.out.println(" percentage cutoff is 60 you are not placed");
		}else {
			
			System.out.println(" you are placed");
		}
	}
	public int getId() {
		return studentID;
	}
	public String getName() {
		return name;
	}
	public double getPercentage() {
		return percentage;
	}
}
