package com.loops;

import java.util.Scanner;

public class Series102030 {
	    public static void main(String[] args) {
	    /*    int term = 10;        
	        System.out.println("The first 10 terms of the series are:");
	        	        for (int i = 1; i <= 10; i++) {
	            System.out.print(term + " ");
	            term += 10;
	    }*/
	    	//Series 1 4 9 16...
//	    	int term=1 ;
//	    	System.out.println("The first 10 terms of the series are:");
//	        for (int i = 1; i <= 10; i++) {
//	        	
//	        	System.out.print(term + " ");
//	        	term += 2 * i + 1;
//	        }  
	    	
	 
//	    	        int term = 1;
//	    	        int diff = 1;
//	    	        
//	    	        System.out.println("The first 10 terms of the series are:");
//	    	        
//	    	        for (int i = 1; i <= 10; i++) {
//	    	            System.out.print(term + " ");
//	    	            term += diff;
//	    	            diff++;
//	    	  } 
	    	
//	  
//	    	        int n = 10;
//	    	        int term = 2;
//	    	        
//	    	        System.out.println("The first " + n + " terms of the series are:");
//	    	        
//	    	        for (int i = 1; i <= n; i++) {
//	    	            if (i % 2 == 0) {
//	    	                System.out.print(-term + " ");
//	    	            } else {
//	    	                System.out.print(term + " ");
//	    	            }
//	    	            term += 2;
//	    	        
//	    	}
	    	
	    	
	   
	    	        Scanner sc = new Scanner(System.in);
	    	        System.out.print("Enter the number of terms: ");
	    	        int n = sc.nextInt();

	    	        int num = 1;
	    	        for (int i = 1; i <= n; i++) {
	    	            System.out.print(num + " ");
	    	            num = num * 10 + 1;
	    	        
	    	    
	    	}

	    	        

	}
}