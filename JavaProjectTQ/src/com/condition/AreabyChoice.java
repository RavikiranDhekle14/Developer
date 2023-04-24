package com.condition;
import java.util.Scanner;
public class AreabyChoice {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("Choose a shape to calculate the area:");
		        System.out.println("1. Circle");
		        System.out.println("2. Rectangle");
		        System.out.println("3. Triangle");
		        System.out.println("4. Square");
		      //  int choice = input.nextInt();
		        String choice = input.nextLine();

		        switch(choice) {
		            case "Circle" :
		                System.out.print("Enter the radius of the circle: ");
		                double radius = input.nextDouble();
		                double areaCircle = Math.PI * Math.pow(radius, 2);
		                System.out.println("The area of the circle is: " + areaCircle);
		                break;
		            case "Rectangle" :
		                System.out.print("Enter the length of the rectangle: ");
		                double length = input.nextDouble();
		                System.out.print("Enter the width of the rectangle: ");
		                double width = input.nextDouble();
		                double areaRectangle = length * width;
		                System.out.println("The area of the rectangle is: " + areaRectangle);
		                break;
		            case "Triangle":
		                System.out.print("Enter the base of the triangle: ");
		                double base = input.nextDouble();
		                System.out.print("Enter the height of the triangle: ");
		                double height = input.nextDouble();
		                double areaTriangle = 0.5 * base * height;
		                System.out.println("The area of the triangle is: " + areaTriangle);
		                break;
		            case "Square":
		                System.out.print("Enter the side of the square: ");
		                double side = input.nextDouble();
		                double areaSquare = side * side;
		                System.out.println("The area of the square is: " + areaSquare);
		                break;
		            default:
		                System.out.println("Invalid choice!");
		                break;
		        }

	}

}
