package com.array;
import java.util.Arrays;
import java.util.Scanner;
class OddNumber{
	public void odd (int a[]) {
		int sum = 0;
		System.out.println(" Odd Elements from an array = ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			
			sum += a[i];
			}	
		} 	
		System.out.println("Sum of odd number: "+sum);
	}
	public void evenPosition(int a[]) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println("Element of even position :"+a[i]);
		}
	}
	public void findMinNum(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimun Number : "+min);
	}
}
class ReverseArray {
	public void revers(int a[]) {
		System.out.println(Arrays.toString(a));
		int j = a.length - 1;
		
		for (int i = 0; i <a.length /2; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the element for array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		OddNumber a = new OddNumber();
		a.odd(arr);
		a.evenPosition(arr);
		a.findMinNum(arr);
		
		ReverseArray b = new ReverseArray();
		b.revers(arr);
	}
}
