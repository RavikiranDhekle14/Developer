package com.ArraylistCode;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	int id;
	String name;
	int salary;
	public EmployeeList(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void display (ArrayList<String> emp) {
		
		
	}
	public static void main(String[] args) {
		ArrayList<String> emp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=3; i++)
		{
			System.out.println("Enter Employee ID: ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String name = sc.next();
			System.out.println("Enter Employee Salary: ");
			int salary = sc.nextInt();
			
			
			
		}

	}

}
