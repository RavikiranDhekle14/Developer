package com.ArraylistCode;

import java.util.*;

class Order  {
	int o_id;
	String o_date;
	String color_name;
	public Order(int o_id, String o_date, String color_name) {
		super();
		this.o_id = o_id;
		this.o_date = o_date;
		this.color_name = color_name;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_date=" + o_date + ", color_name=" + color_name + "]";
	}
	
	
	
}
class Customer implements Comparable<Customer>{
	int c_id;
	String c_name;
	String c_city;
	Order o;
	
	public Customer(int c_id, String c_name, String c_city, Order o) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
		this.o = o;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + c_city + ", o=" + o + "]";
	}
	
	@Override
	public int compareTo(Customer al) {
		return this.o.o_date.compareTo(al.o.o_date);
	}
	

}


public class Customer_Manu {
	public static void main (String[]args) {
		ArrayList<Customer> al = new ArrayList<Customer>();
		al.add(new Customer (1,"Mrx", "Mumbai" , new Order (101,"2000-09-21","Fed-ex")));
		al.add(new Customer (2,"Mry", "Mumbai" , new Order (102,"2003-08-20","Fed-ex")));
		al.add(new Customer (3,"Mrz", "Mumbai" , new Order (103,"2001-07-11","Fed-ex")));
		for (Customer a : al) {
		System.out.println(a);
		}
		
		System.out.println("***********************************");
		
		Collections.sort(al);	
		for (Customer a : al) {
			System.out.println(a);
		}
		
		}

}
