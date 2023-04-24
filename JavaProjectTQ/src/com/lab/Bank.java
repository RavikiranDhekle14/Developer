package com.lab;

class RBI{
	public void loanDistribution(){
		int loanper = 50;
		System.out.println("RBI Loan Distribution: "+ loanper);
	}
}
class SBI extends RBI {
	 public void loanDistribution(){
		super.loanDistribution();
		display();
		int eduloanper = 25;
		int homeloanper = 25;
		System.out.println("SBI Loan Distribution: "+ eduloanper+" "+homeloanper);
	}
	 void display() {
		 System.out.println(" ");
	 }
}
class AXIS extends RBI {
	public void loanDistribution() {
		int carloanper = 10;
		int eduloanper = 20;
		int homeloanper = 20;
		System.out.println("AXIS Loan Distribution: "+carloanper+" "+eduloanper+" "+homeloanper);
	}
}



public class Bank {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		AXIS axis = new AXIS();	
		axis.loanDistribution();
		sbi.loanDistribution();
		
	}

}
