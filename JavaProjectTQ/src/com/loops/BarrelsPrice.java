package com.loops;

public class BarrelsPrice {
	    public static void main(String[] args) {
	        int price = 89;
	        int totalBarrels = 20;

	        for (int i = 1; i <= totalBarrels; i++) {
	            int barrels = i <= 10 ? i : (totalBarrels - i + 1);
	            int barrelPrice = barrels * (price - barrels);
	            System.out.println("Price of " + i + " barrels: " + barrelPrice + "rs.");
	        }
	}


}
