
package com.lab;
import java.util.Scanner;
public class MovieTicket {
	String name;
	int age;
	String movie;
	int price;

	public void acceptDetail(String name,int age, String movie,int price) {
		this.name=name;
		this.age=age;
		this.movie=movie;
		this.price=price;	
	}
	public void Coupon() {
		System.out.println("You have a coupon? :");
		System.out.println("1. Yes");
		System.out.println("2. No");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice==1) {
		int discount = (int) (price*0.15);
		price = price-discount;
		}else {
			this.price= price;
		}
	}
	public void show() {
		System.out.println(name+" "+age+" "+movie+" "+price+"Rs.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add your details: ");
		String name=sc.next();
		 int age =sc.nextInt();
		String movie =sc.next();
		MovieTicket movieTicket = new MovieTicket();
		movieTicket.acceptDetail(name, age, movie, 200);
		movieTicket.Coupon();
		movieTicket.show();
	}
}
