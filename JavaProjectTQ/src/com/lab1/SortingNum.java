package com.lab1;

import java.util.Arrays;

public class SortingNum {
	static void sort ( int arr[]) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int r : arr) {
			System.out.println(r);
		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {2,4,5,6,7,8,1};
		sort(arr);
	}
}
