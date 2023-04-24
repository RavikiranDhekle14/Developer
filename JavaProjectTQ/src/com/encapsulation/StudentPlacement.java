package com.encapsulation;

public class StudentPlacement {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(111);
		student.setName("Ravi");
		student.setPercentage(75.35);
		
		
		student.getPercentage();
		System.out.println(student.getName()+" "+student.getPercentage());
	}

}
