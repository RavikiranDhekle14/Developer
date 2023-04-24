package com.array;
import java.util.Arrays;
import java.util.Scanner;

class Stud {
	int id;
	String name;
	int marks[];

	Stud (int id, String name, int[] marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
	return id + " " + name + " " + Arrays.toString(marks);
	}
	public static int getPercentage (int m[]) {
		int sum = 0;
		for (int j = 0; j < m.length; j++) {
			sum = sum + m[j];
		}
		int per = sum / m.length;
		return per;
	}
	public static void calculatePer(Stud[] s) {
		for (int i = 0; i < s.length; i++) {
			int mk[] = s[i].marks;
			int per = getPercentage(mk);
			if (per > 60) {

				System.out.println(s[i] +" "+ per);
		}
	}
}
public class Student {

	public static void main(String[] args) {
		Stud[] s = new Stud[3];

		

		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter the id"); 
			int id = sc.nextInt(); 

			System.out.println("Enetr the name"); 
			String name = sc.next();

			System.out.println("Enetr the marks"); 
			int marks[] = new int[2]; 
		
		for (int j = 0; j < marks.length; j++) {
			marks[j] = sc.nextInt();

		}
			s[i] = new Stud(id, name, marks);
		}

		System.out.println("............");

		for (int i = 0; i < s.length; i++) { 
		System.out.println(s[i]);
		}
		System.out.println("..........");
		Stud.calculatePer(s);
		}
	}
}
