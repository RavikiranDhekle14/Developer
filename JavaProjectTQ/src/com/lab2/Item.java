package com.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	int item_id ;
	String item_name;
	int item_price;

	public Item(int item_id, String item_name, int item_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}
	
	public static void samePrice (ArrayList<Item> it) {
				
		for  (int i=0; i<it.size(); i++) {
			for (int j=i+1; j<it.size(); j++) {
				if (it.get(i).item_price==it.get(j).item_price) {
					System.out.println(it.get(i) +" "+ it.get(j));
				}
			}
		}
	}
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price + "]";
	}
	public static void availableItem (ArrayList<Item> it) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter item name: ");
		String i_name = sc.next();
		int flag = 0;
		for (int i=0; i<it.size(); i++) {
			if (it.get(i).item_name.equals(i_name)) {
				flag = 1;
			}	
			}
			if (flag == 1) {
				System.out.println("Item is Available");
			} else {
			System.out.println("Item is Unavailable");
				
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<Item> it = new ArrayList<Item>();
		it.add(new Item(1,"Soap",40));
		it.add(new Item(1,"Oil",50));
		it.add(new Item(1,"Shampoo",50));
		
		Item.availableItem(it);
		Item.samePrice(it);
	}

}
