package com.ArraylistCode;

import java.util.*;

public class FrequencyArrayList {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String> ();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Dog");
		animal.add("Caw");
		animal.add("Tiger");
		animal.add("Cat");
		animal.add("Lion");
		HashMap<String, Integer> hm = new HashMap();
		
		for (int i=0; i<animal.size(); i++) {
			boolean visited = false;
			int count =1;
			for (int j=i+1; j<animal.size(); j++) {
				
			if (animal.get(i).equals(animal.get(j))) {
				count++;
				animal.remove(j);
				j--;
				
				}
			}
			//System.out.println(animal.get(i)+" :"+count);
			//hm.put(, count);
			System.out.println(animal);
		}
	}

}
