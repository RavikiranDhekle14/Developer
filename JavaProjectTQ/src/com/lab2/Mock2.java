package com.lab2;

import java.util.*;

class Department implements Comparable<Department> {
	int id;
	String name;
	Location l;
	public Department(int id, String name, Location l) {
		super();
		this.id = id;
		this.name = name;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	@Override
	public int compareTo(Department o) {
		return this.l.location.compareTo(o.l.location);	
	}
}
class Location  {
	int l_id;
	String location;
	public Location(int l_id, String location) {
		super();
		this.l_id = l_id;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Location [l_id=" + l_id + ", location=" + location + "]";
	}	
}
public class Mock2 {

	public static void main(String[] args) {
		ArrayList<Department> al = new ArrayList<Department>();
		al.add(new Department (1,"Rajesh",new Location (101,"Pune")));
		al.add(new Department (2,"Mahesh",new Location (201,"Mumbai")));
		al.add(new Department (3,"Dinesh",new Location (301,"Chennai")));
	

		System.out.println();
		
		Collections.sort(al);

		for(Department d:al) {
			System.out.println(d.id+" "+d.name+" "+d.l);
		}
			
	}

}
