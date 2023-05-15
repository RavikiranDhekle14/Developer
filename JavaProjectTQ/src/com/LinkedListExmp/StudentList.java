package com.LinkedListExmp;

import java.util.*;

 class Stud {
	int id;
	String name;
	String [] hobbies;

	public Stud(int id, String name, String [] hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	
}

public class StudentList {
	
	public static void main(String[] args) {
		LinkedList<Stud> sl = new LinkedList<Stud>();
		sl.add(new Stud(1,"Pooja", new String [] {"Gaming", "Gardening"}));
		sl.add(new Stud(2,"Shweta", new String [] {"Reading", "Writting"}));
		sl.add(new Stud(3,"Nikita", new String [] {"watching Tv", "Gaming"}));
		
		for (Stud s:sl) {
		System.out.println(s);
		}
	}
}
