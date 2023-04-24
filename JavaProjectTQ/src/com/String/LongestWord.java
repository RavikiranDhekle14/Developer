package com.String;

import java.util.Arrays;

public class LongestWord {
	public static void maxWord(String s) {
		String sp[] = s.split(" ");
		String largeWord = sp[0];
		System.out.println(Arrays.toString(sp));
		for (int i=1; i<sp.length; i++)
		{
			if(sp[i].length() > largeWord.length())
			{
				largeWord = sp[i];
			}
		}
		System.out.println(largeWord);
	}
	public static void main(String[] args) {
		String s =  "India is beautiful country";
		LongestWord obj = new LongestWord();
		obj.maxWord(s);
	}

}
