package com.twoDiamentionalArray;
import java.util.Scanner;

public class Addition {
	public static void addOfTwoArr(int arr[][], int arr1[][] ) {
		int sum[][] = new int[2][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		for (int i=0; i<sum.length; i++) {
			for (int j=0; j<sum[i].length; j++) {
				sum[i][j] = arr[i][j] + arr1[i][j];
		System.out.println("Sum of the array element: "+sum[i][j]);
			}
	}
}
	public static void main(String[] args) {
		int[][] arr = new int [2] [2]; 
		int[][] arr1= new int [2] [2]; 
		 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = sc.nextInt();
			}
		}
		System.out.println("Enter the array element: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i] [j] = sc.nextInt();
			}
		}
		Addition.addOfTwoArr(arr, arr1);
	}

}
