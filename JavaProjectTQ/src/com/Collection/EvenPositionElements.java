package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenPositionElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(0);
		list.add(8);
		list.add(4);

		Iterator<Integer> itr = list.iterator(); //\\
		while (itr.hasNext()) {
			Integer count = itr.next();
		    if (count % 2 == 0) {
		        System.out.println("Element at even position: " + count);
		    }
		}
		
		for (int i = 0; i < list.size(); i++) { //Even Number
			if (list.get(i) % 2 == 0)
			{
				System.out.println(list.get(i));
			}
		}
		
		System.out.println(".................");
		
		Iterator<Integer> it = list.iterator(); //EvenPosition
		while (it.hasNext()) {
			System.out.println(it.next());
		    if (it.hasNext()) {
		    	it.next();
		    }
		}
	}
}
