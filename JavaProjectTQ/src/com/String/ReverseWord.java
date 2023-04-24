package com.String;
 class ReverseWord {
	void reverse (String str) {
		String[] s= str.split("//s");
		String reverse = " ";
		
			for (int i = 0; i<s.length; i++) {
				String word = s[i];
			}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "India is Beautiful Country";
		ReverseWord rw = new ReverseWord();
		rw.reverse(str);
	}

}
