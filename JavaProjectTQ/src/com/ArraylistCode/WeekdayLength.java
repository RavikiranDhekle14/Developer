package com.ArraylistCode;

import java.util.ArrayList;

public class WeekdayLength {
	public static void daysLength(ArrayList<String> str) {
		for (int i=0; i<str.size(); i++) {
			if (str.get(i).length()<7) {
				System.out.println(str.get(i));
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Monday");
		str.add("Tuesday");
		str.add("Wednesday");
		str.add("Thursday");
		str.add("Friday");
		str.add("Saturday");
		str.add("Sunday");
		WeekdayLength.daysLength(str);
	}

}
