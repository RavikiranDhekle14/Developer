package com.ArraylistCode;

import java.util.ArrayList;

public class FruitsContainers { 
	public void display (ArrayList<String> c1, ArrayList<String> c2) {
		ArrayList<String> temp = new ArrayList<String> ();
		
		for (int i=0; i<c1.size(); i++) {
			if (c2.contains(c1.get(i))) {
				continue;
			}
			temp.add(c1.get(i));
		}
			for (int i=0; i<c2.size(); i++) {
				if (c1.contains(c2.get(i))) {
					continue;		
				}
				temp.add(c2.get(i)) ;

			}
			System.out.println(temp);
	}

	

	public static void main(String[] args) {
	ArrayList<String> c1 = new ArrayList<String> ();
	c1.add("Mango");
	c1.add("Apple");
	c1.add("Kiwi");
	c1.add("Pineapple");
	
	ArrayList<String> c2 = new ArrayList<String> ();
	c2.add("Mango");
	c2.add("Banana");
	c2.add("Kiwi");
	c2.add("Watermelon");
	
	FruitsContainers fc = new FruitsContainers();
	fc.display(c1, c2);

	}

}
