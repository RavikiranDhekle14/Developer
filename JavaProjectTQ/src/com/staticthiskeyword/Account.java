package com.staticthiskeyword;
import java.util.Scanner;
public class Account {
	int id ;
	String type ;
	double balance ;
	double withdraw_balance;
	double deposite_balance;
	
	public void acceptDetails (int id, String type, double balance) {
		this.id = id ;
		this.type =type;
		this.balance=balance;
	}
	public void totalBalance() {
		Scanner sc=new Scanner(System.in);
		System.out.println("For Amount Withdraw or Deposite: ");
		System.out.println("1. Withdraw: ");
		System.out.println("2. Deposite: ");	
        String choice = sc.nextLine();
		switch(choice) {
		case "Withdraw":
			System.out.println("Enter withdraw_balance: " );
			double withdraw_balance = sc.nextInt();
	//		  // if (balance withdraw_balance) {
				balance=balance-withdraw_balance;
			 //  }else {
				System.out.println("Insuficient balance");
			   }
		//	break;
			
		}
		
		//balance=balance+deposite_balance;
	//}
	public void displayDetails () {
		System.out.println(id + " " + type + " " + balance );
	}
	public static void main(String[] args) {
		Account sc = new Account();
		sc.acceptDetails(111, "saving", 15000);
		sc.totalBalance();
		sc.displayDetails();
	}
}