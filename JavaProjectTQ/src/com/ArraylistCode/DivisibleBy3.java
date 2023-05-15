package com.ArraylistCode;

import java.util.*;

public class DivisibleBy3 {
	 public static void isDivBy3 (ArrayList <Integer> al) {
		int num = 0;
		 for (int i=0; i<al.size(); i++) {
			if (al.get(i) % 3 == 0) {
				num = al.get(i);
				 System.out.println(num);
			}
		}
	System.out.println("...............");	
	}
	 
	 public static void remove (ArrayList <Integer> al) {
		 int num1 = 0;
		 for (int i=0; i<al.size(); i++) {
			if (al.get(i) % 3 == 0) {
				num1 = al.remove(i);
				
				System.out.println(num1);
			}
		}
		 System.out.println(al);
	 }
	 
//	 public static void itretormeth(ArrayList<Integer> al) {
//		 Iterator <Integer> itr = al.iterator();
//		 
//		 while (itr.hasNext()) {
//			 if (itr.next()%3 ==0) {
//				 itr.remove();
//			 }
//			 System.out.println(itr.next());
//		 }
//		 System.out.println(al);
//	 }
//	

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer> ();
		al.add(12);
		al.add(5);
		al.add(9);
		al.add(7);
		System.out.println(al);
		
		DivisibleBy3.isDivBy3(al);
		DivisibleBy3.remove(al);
	//	DivisibleBy3.itretormeth(al);
	}

}
