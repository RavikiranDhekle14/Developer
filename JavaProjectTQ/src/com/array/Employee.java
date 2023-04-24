package com.array;

import java.util.Scanner;

class Department {
	int emp_id;
	String name;
	double salary;
	
	Department(int emp_id, String name, double salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		
		
		
	}
	
	public String toString() {
		return emp_id + " " + name + " " + salary ;
		
	}
	
}


public class Employee {

	public static void main(String[] args) {
		Department[] emp = new Department[3];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < emp.length; i++)
		{
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String namee = sc.next();
			System.out.println("Enter the salary");
			double sal = sc.nextDouble();
			
			emp[i] =new Department(id, namee, sal);
			
			if (sal>60000.00) {
				System.out.println(emp[i]);
			
		}
	}
		System.out.println("...................");
		for (int i = 0; i<emp.length; i++)	
		{
			System.out.println(emp[i]);
			System.out.println("...................");

		}

	}
}
