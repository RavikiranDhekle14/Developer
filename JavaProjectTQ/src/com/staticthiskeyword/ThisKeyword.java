package com.staticthiskeyword;
public class ThisKeyword {
	int x=20;
	int y = 30;
	int z = 40;
	
	public ThisKeyword (int x, int y, int z) {
		this.x=x;
		 this.y = y;
		 this.z = z;
	}
	public ThisKeyword () {
	
		this(10, 20, 30);
		System.out.println(x+" "+y+" "+ z);
	}
	public static void main(String[] args) {
		ThisKeyword t= new ThisKeyword();
		t.showoutput();
	}
	public void showoutput() {
		//System.out.println();
	}
}
