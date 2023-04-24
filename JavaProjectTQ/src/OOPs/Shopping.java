package OOPs;

import java.util.Scanner;

import com.staticthiskeyword.AccessModifiers;

public class Shopping extends AccessModifiers {
	int product_id;
	String product_name;
	int product_price;
	int product_qty;
	
	public void acceptProductDetails(int id, String name, int price, int qty) {
		product_id = id;
		product_name = name;
		product_price = price ;
		product_qty = qty;
	}
	public void calculationBill() {
//		Scanner shopping = new Scanner(System.in);
//		while(product_qty>0) {
//			System.out.println("Enter the name: ");
//			String name = shopping.toString(); 
//			System.out.println("Enter the quantity: ");
//			int qty =shopping.nextInt();
//		}	
		if (product_qty == 0) {
			System.out.println("please enter qty: ");
		}
		int bill = product_qty*product_price;
		
	}
	
	public void display() {
		System.out.println(product_id + " " + product_name + " " + product_price + " " + product_qty);
		System.out.println(product_qty*product_price);
	}

	public static void main(String[] args) {
		Shopping shop1 = new Shopping();
		shop1.acceptProductDetails(101, "T-shirt", 600, 2);
		shop1.display(); 
		shop1.calculationBill();
		
		
		
		//		for check Accessmodifiers in diff package with diff class
//			AccessModifiers u= new AccessModifiers();
//			System.out.println(u.x);
// 			System.out.println(u.city);
//			Shopping q = new Shopping();
//			System.out.println(q.mark);
//			System.out.println(u.mark);
//			System.out.println(u.alph);


	}

}
