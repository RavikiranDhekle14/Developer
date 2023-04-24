package com.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class TheatreScreen {
	String name;
	String city;
	int screen[];
	
	public TheatreScreen(String name, String city, int screen[]) {
		
		this.name=name;
		this.city=city;
		this.screen=screen;
	}
	
	
	
	@Override
	public String toString() {
		return "TheatreScreen [name=" + name + ", city=" + city + ", screen=" + Arrays.toString(screen) + "]";
	}



	public static void main(String[] args) {
	
		TheatreScreen ts [] = new TheatreScreen [3];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ts.length; i++)
		{
			System.out.println("Enter the Theatre name: ");
			String name = sc.next();
			
			System.out.println("Enter the city: ");
			String city = sc.next();
			
			System.out.println("Enter the numbers of screen: ");
			int size = sc.nextInt();
			int screen [] = new int [size];
			for (int j=0; j<size; j++) {
				screen [j] = sc.nextInt();
			}
			ts [i] = new TheatreScreen(name,city,screen);
			
		}
		for (int i = 0; i < ts.length; i++)
		{
		System.out.println(ts[i]);
		}
	}

}
