package com.lab;
import java.util.Scanner;
public class ATM {
	String name = "Ravi_D" ;
	int pass = 1234;
	public void AcceptDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = sc.next();
		System.out.println("Enter your password: ");
		int password=sc.nextInt();
		this.name=name;
		this.pass=pass;
		if(Name.equals(name) && password==pass) {
			System.out.println("Welcome! ");	
		}else {
			System.out.println("Invalid name or password");
		}	
	}
	public void manu() {
		Scanner sc = new Scanner(System.in);
		double balance = 1000.00;
		while (true) {
			System.out.println("Manu: ");
			System.out.println("1. deposite");
			System.out.println("2. Withdrow");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			System.out.print("Enter amount to deposite: ");
			double depositeAmount =sc.nextDouble();
			balance += depositeAmount;
			System.out.println("Deposite successfull. balance is: "+balance);
			break;
			case 2:
				System.out.println("Enter amount to withdraw: ");
				double withdrawAmount=sc.nextDouble();
				if(withdrawAmount>balance) {
					System.out.println("Insufficient balance.");
				}else {
					balance -= withdrawAmount;
					System.out.println("withdraw successful. current balance: "+balance);
				}
				break;
			case 3:
				System.out.println("Your current balance: "+balance);
				break;
			case 4:
				System.out.println("Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
	public static void main(String[]args) {
		ATM atm = new ATM();
		atm.AcceptDetail();
		atm.manu();
		System.out.println();
	}
}
