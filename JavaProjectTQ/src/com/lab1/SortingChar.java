package com.lab1;

 class SortingChar {
	 static void sorting(char arr[]) {
		 for (int i=0; i<arr.length; i++) {
				for (int j= (i+1); j<arr.length; j++) {
					if (arr[i]<arr[j])
					{
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		 for (char r :  arr) {
				System.out.println(r);
	 }
	
	 }

	public static void main(String[] args) {
		char arr[] = {'e','f','t','y','a'};
		sorting(arr);
	}

}
