package com.String;

public class FirstCharCap {
	void firstCapChar(String str) {
		String[] words = str.split("\\s");
		System.out.println(words);
	}

	public static void main(String[] args) {
		String str = "india is beautiful country";
		FirstCharCap fc = new FirstCharCap();
		fc.firstCapChar(str);
	}

}
