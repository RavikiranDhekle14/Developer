package com.String;

public class SecondOccurrence {
	void secOcc(String str) {
		
		char ch = 't';
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			char a = str.charAt(i); 
		
		if(a == ch && count<1) {
			count++;
			if (count == 2) {
				System.out.println("The second occurance of "+ch+" is at index " + i + ".");
			}
		}else {
			
			System.out.println("The second occurance of character "+ch+" does not occurs in string");
			break;
		}
		
		}
	}

	public static void main(String[] args) {
		String str = "India is Beautiful Country";
		SecondOccurrence so = new SecondOccurrence();
		so.secOcc(str);
	}

}
