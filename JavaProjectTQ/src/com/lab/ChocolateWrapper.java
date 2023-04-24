package com.lab;

import java.util.Scanner;

class ChocolateShop {
	int money;
	int price;
	int wrappers;
	int chocolates;
 
	void ChocolateShop(int money, int price, int wrappers,int chocolates) {
			 this.money=money;
		     this.price=price;
		     this.wrappers=wrappers;
		     this.chocolates=chocolates;
    	   
    	}
       public void calculation() {
    	  
    	  
	        System.out.print("Enter the amount of money you have: ");
    		Scanner sc = new Scanner(System.in);
    		int money = sc.nextInt();
	        int price=1;
	        int chocolates = 1;
	        int wrappers = 1;
           while (money == price) {
               chocolates++;     
                wrappers++;       
               money = price;  
              
               if (wrappers == 3) {
                   chocolates=money+chocolates;   
                   wrappers += 2;  
               }
           }
           System.out.println(money+" "+price+" "+chocolates+" "+wrappers);        
           }

}

public class ChocolateWrapper {
	

	public static void main(String[] args) {
		
		ChocolateShop ch = new ChocolateShop();
		ch.calculation();
		//ch.Show();
		System.out.println();
	}
}
