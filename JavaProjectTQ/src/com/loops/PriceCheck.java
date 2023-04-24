package com.loops;
import java.util.Scanner;

public class PriceCheck {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int milkPrice = 40;
	        int oilPrice = 50;
	        int totalCost = 0;
	        int milkQuantity = 0;
	        int oilQuantity = 0;

	        while (totalCost <= 500) {
	            System.out.print("Enter the quantity of milk (in liters): ");
	            int milk = sc.nextInt();
	            System.out.print("Enter the quantity of oil (in liters): ");
	            int oil = sc.nextInt();

	            int milkCost = milk * milkPrice;
	            int oilCost = oil * oilPrice;

	            totalCost += milkCost + oilCost;
	            milkQuantity += milk;
	            oilQuantity += oil;
	        }

	        System.out.println("Total quantity of milk: " + milkQuantity + " liters");
	        System.out.println("Total quantity of oil: " + oilQuantity + " liters");
	    
	}


}
