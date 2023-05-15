package com.ArraylistCode;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortList {

	public static void main(String[] args) {
		ArrayList<String> stud = new ArrayList<String>();
		stud.add("Nikita");
		stud.add("Amit");
		stud.add("Shweta");
		stud.add("Rajesh");
		
		System.out.println(stud);
		Collections.sort(stud);
		System.out.println(stud);
		
	}

}
