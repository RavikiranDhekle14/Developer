package com.lab1;

class SecondSmallest {
	    void secondNum () {
	      int[] arr = { 10, 5, 8, 3, 2, 7 };
	      
	      int smallest = 0;
	      int secondSmallest = 0+1;
	      
	      for (int i = 0; i < arr.length; i++) {
	         if (arr[i] < smallest) {
	            secondSmallest = smallest;
	            smallest = arr[i];
	         } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	            secondSmallest = arr[i];
	         }
	      }
	      
	      System.out.println("Second smallest element: " + secondSmallest);
	   }
	}



public class SecondSmallestNo {

	public static void main(String[] args) {
		
		
		SecondSmallest s = new SecondSmallest();
		s.secondNum();
	}

}
