package com.lab;
class Person {
	int personID;
	String name;	
	public Person(int personID, String name) {
		this.personID=personID;
		this.name=name;
	}	
	public String toString() {
		return personID + " " + name;
	}	
}
public class Address {
	int pincode;
	String city;
	Person per;
	 public Address(int pincode, String city, Person per) {
		 this.pincode=pincode;
		 this.city=city;
		 this.per=per;
	 }
	public String toString() {
		return pincode + " " + city + " " + per;
	}
	public static void main(String[] args) {
//		Person per1 = new Person(101, "Yash");
//		Address add = new Address(411052, "pune", per1);
		
		Address add = new Address(411052, "pune", new Person(101, "yash"));
		System.out.println(add);
	}
}
