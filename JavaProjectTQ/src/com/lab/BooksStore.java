package com.lab;

public class BooksStore {
	int bookID;
	String bookName;
	double bookprice;
	public void setID (int bookID) {
		this.bookID=bookID;
	}
	public void setName (String bookName) {
		this.bookName=bookName;
	}
	public void setPrice (double bookprice) {
		this.bookprice=bookprice;
		if (bookprice>500.00) {
		double	discount = bookprice*0.10;
		this.bookprice = bookprice-discount;
		}else {
			this.bookprice = bookprice*1;
		}
	}
	public int getID() {
		return bookID;
	}
	public String getName () {
		return bookName;
	}
	public double getPrice () {
		return bookprice;
	}
	
	public static void main(String[] args) {
		BooksStore bp = new BooksStore();
		bp.setID(111);
		bp.setName("Belive_in_Your_Self");
		bp.setPrice(600.00);
		bp.getPrice();
		System.out.println(bp.getName()+" $ price "+bp.getPrice());
	}
}
