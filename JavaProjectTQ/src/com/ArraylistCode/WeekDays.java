package com.ArraylistCode;

import java.util.ArrayList;

public class WeekDays {
	public static void remDays (ArrayList<String> days) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i=0; i<days.size(); i++) {
			for (int j=i+1; j<days.size(); j++) {
			if (days.get(i) == days.get(j) ) {
			days.remove(j);
			//System.out.println(days.get(i));
			}
			}
			temp.add(days.get(i));
		}
		System.out.println(temp);
	}
	

	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>();
		days.add("Sun");
		days.add("Mon");
		days.add("Sun");
		days.add("Tue");
		days.add("Wed");
		days.add("Mon");
		WeekDays.remDays(days);
	}

}
