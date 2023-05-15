package com.ArraylistCode;

import java.util.ArrayList;
import java.util.Scanner;

class Department {
	int d_id;
	String d_name;
	Employee e;
	public Department(int d_id, String d_name, Employee e) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", e=" + e + "]";
	}
}
class Employee {
	int e_id;
	String e_name;
	float salary;
	

	public Employee(int e_id, String e_name, float salary) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.salary = salary;
	}

	 void sameDept (ArrayList<Department> al) {
		for (int i = 0; i<al.size(); i++) {
			for (int j=1+i; i<al.size(); i++) {
				if (al.get(i).d_name==al.get(j).d_name ) {
					System.out.println(al);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", salary=" + salary + "]";
	}
	
}

public class CorporationClass {
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ");
		ArrayList<Department> al = new ArrayList<Department> ();
		al.add(new  Department (1, "HR", new Employee (101, "Pooja", 21000)) );
		al.add(new  Department (2, "tech", new Employee (202, "Rajesh", 31000)) );
		al.add(new  Department (3, "HR", new Employee (102, "Shweta", 35000)) );
		al.add(new  Department (4, "head", new Employee (301, "Nikita", 61000)) );
		
	//	Employee e = new Employee();
		//e.sameDept(al);
		for (Department a:al)
		{
			System.out.println(a);
		}
		


	}


}
