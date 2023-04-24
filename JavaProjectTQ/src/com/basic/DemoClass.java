package com.basic;
//
public class DemoClass {
//	public static void main(String[] args) {
//		int n= 50;
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			if(i%2==0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//	}
//
//}
 

//	public static void main(String[] args){
//		int i=1; int k=1;
//		while(i++<=5)
//		{
//		k*=i;
//		}
//		System.out.println("k="+k+" i="+i);
	
	//public class PatternExample {
	    public static void main(String[] args) {
	        int n = 4;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("   ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }

}
