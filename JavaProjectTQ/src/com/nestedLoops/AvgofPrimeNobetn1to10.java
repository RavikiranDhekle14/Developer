package com.nestedLoops;
public class AvgofPrimeNobetn1to10 {
	    public static void main(String[] args) {
	        int sum = 0;
	        int count = 0;
	        for (int i = 2; i <= 10; i++) { 
	            boolean isPrime = true;
	            for (int j = 2; j <= i/2; j++) { 
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }if (isPrime) {
	                sum += i;
	                count++;
	            }
	        }
	        double average = (double)sum / count;
	        System.out.println("Average of prime numbers between 1 and 10 is: " + average);
	}
}
