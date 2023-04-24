package com.lab1;

public class CharacterReplace {
	
	void show (char arr[]) {
		int temp = 2;
		for (char i = 0; i < arr.length; i++) {
			if (arr[i] == 'y' || arr[i] =='z') {
				arr[i] = (char) (arr[i]-24);
			}else {
				arr[i] = (char) (arr[i] + temp);
			}
			System.out.println(arr[i]);
		}
	}	
	public static void main(String[] args) {
		char arr[] = { 'a', 'e', 's', 'z'};
		CharacterReplace a = new CharacterReplace();
		a.show(arr);
	}

}
