package com.ArraylistCode;

import java.util.ArrayList;

class  College {
	void display (ArrayList<String> al) {
		System.out.println("Sinhgad college");
	}
}

class  Student extends College {
	 void list (ArrayList<String> al) {
		
		System.out.println("1st year student :" + al);
	}
}



public class MockTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akash");
		al.add("Shweta");
		al.add("Rajesh");
		al.add("Nikita");
		
		
		Student c = new Student ();
		c.list(al);
	}

}
