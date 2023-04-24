package com.nestedLoops;
import java.util.Scanner;
public class StarPattern {

	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter the number of rows: ");
//	        int rows = sc.nextInt();
//  	Square Star Pattern
//	        for (int i = 1; i <= rows; i++) {
//	            for (int j = 1; j <= rows; j++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        
//	    }
	        // Right Triangle StarPattern

//	                for (int i = 1; i <= rows; i++) {
//	                    for (int j = 1; j <= i; j++) {
//	                        System.out.print("* ");
//	                    }
//	                    System.out.println();   
//	        }  
	        //triangle disending type
	        
//	        for (int i = rows; i >= 1; i--) {
//	            for (int j = rows-i; j>0; j--) {
//	                System.out.print(" ");
//	            }
//	            for (int j=1; j<=i; j++) {
//	            	System.out.print(j+" ");
//	            }
//	            System.out.println();
//	        }
	        
	        for(int i = 5; i > 0;i-- ){
	        	int mysteryInt = 100;
	        	mysteryInt -= i;
	        System.out.println(mysteryInt);
	        }

	        
	        //Inverted Triangle StarPattern
//	        for (int i = 1; i >= rows; i--) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
	        // Special star pattern
	        
//	        if (rows % 2 != 0) {
//	            int mid = (rows + 1) / 2;
//	            for (int i = 1; i <= rows; i++) {
//	                for (int j = 1; j <= rows; j++) {
//	                    if (i == mid || j == mid) {
//	                        System.out.print("* ");
//	                    } else {
//	                        System.out.print("  ");
//	                    }
//	                }
//	                System.out.println();
//	            }
//	        } else {
//	            System.out.println("Number of rows must be odd.");
//	        }
	    }
}
