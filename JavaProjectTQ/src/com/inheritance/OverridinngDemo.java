package com.inheritance;

class Birds {
	public void fly() {
		System.out.println("All birds are fly in sky");
	} 
}
class Kite extends Birds {
	public void fly() {
		System.out.println("Kite fly higher in sky");
	}
}
class Hen extends Birds {
	public void fly() {
		System.out.println("Hen are'n fly in sky");
	}
}
class Crow extends Birds {
	public void fly() {
		System.out.println("Crow are fly in sky");
		super.fly();
	}
}


public class OverridinngDemo {
	public static void main(String[] args) {
		Birds br = new Crow();
		Birds br1 = new Hen();
		Birds br2 = new Kite();
		br.fly();
		br1.fly();
		br2.fly();
		
	}

}
