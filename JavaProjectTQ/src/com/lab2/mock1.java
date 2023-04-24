package com.lab2;

import java.util.Date;

class Insurance {
	
	int insuranceNumber;
	 String issueDate;
	
	public Insurance(int insuranceNumber, String issueDate)
	{
		this.insuranceNumber = insuranceNumber;
		this.issueDate = issueDate;
	}
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public String getIssuedate() {
		return issueDate;
	}
	public String toString() {
		return "Car Details: Insurance Number- "+insuranceNumber+" Date- "+issueDate;
	}
}



class Car {
	
	private String carColor;
	private int carNumber;
	private Insurance insurance;
	
	public Car(String carColor, int carNumber, Insurance insurance) {
		this.carColor= carColor;
		this.carNumber= carNumber;
		this.insurance=insurance;
	}
	public String getcarColor() {
		return carColor;
	}
	public int getcarNumber() {
		return carNumber;
	}
	public Insurance insurance() {
		return insurance;
	}
	public String toString() {
		return " Car Color- "+carColor+" Car Number- "+carNumber;
	}
}
public class mock1 {

	public static void main(String[] args) {
		
		Insurance ins = new Insurance(1001,"01jan2023" );
		Car car = new Car("Black", 123, ins);
		ins.getInsuranceNumber();
		ins.getIssuedate();
		car.getcarColor();
		car.getcarNumber();
		car.insurance();
		System.out.println("The car info :"+ins+car);
		
	}

}
