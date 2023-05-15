package com.hashmapscode;
import java.util.*;
public class DisplayMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap();
		
		hm.put("Pune", 12);
		hm.put("Dharashiv", 25);
		hm.put("Nashik", 15);
		hm.put("Nagpur", 31);
		System.out.println(hm);
		
		System.out.println(">...............................");
		
		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
		
		Set s = hm.keySet();
		
		
	}

}
