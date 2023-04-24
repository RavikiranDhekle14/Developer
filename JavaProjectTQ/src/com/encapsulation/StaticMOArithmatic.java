package com.encapsulation;

public class StaticMOArithmatic {
	
		  public static int add(int num1, int num2) {
		    System.out.println("addition: "+ (num1+num2));
			return num1;
		  }
		  
		  public static double add(double num1, double num2) {
			    System.out.println("addition: "+ (num1+num2));
		    return num1 + num2;
		  }
		  
		  public static int subtract(int num1, int num2) {
			    System.out.println("substract: "+ (num1-num2));
			    return num1 - num2;
		  }
		  
		  public static double subtract(double num1, double num2) {
			    System.out.println("substract: "+ (num1-num2));
		    return num1 - num2;
		  }
		  
		  public static int multiply(int num1, int num2) {
			    System.out.println("multiply: "+ (num1*num2));
		    return num1 * num2;
		  }
		  
		  public static double multiply(double num1, double num2) {
			    System.out.println("multiply: "+ (num1*num2));
		    return num1 * num2;
		  }
		  
		  public static int divide(int num1, int num2) {
			    System.out.println("divide: "+ (num1/num2));
		    return num1 / num2;
		  }
		  
		  public static double divide(double num1, double num2) {
			    System.out.println("divide: "+ (num1/num2));
		    return num1 / num2;
		  }
		  
		  public static void main(String[] args) {
				StaticMOArithmatic math = new StaticMOArithmatic();
				math.add(7, 2.7);
				math.subtract(2, 45);
				math.multiply(4, 6);
				math.divide(6, 5);
			}
}



