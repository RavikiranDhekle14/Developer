package com.exceptionHandling;

class Passwords  extends RuntimeException {
	 public void InvalidPassword(String pass) {
//		super (pass);
	}
	void validatePassword(String pass) throws Passwords {
		if(pass.length() > 8) {
			throw new Passwords();
		}else {
			System.out.println("Invalid Pass");
		}
	}
}



public class CustomException {
	

	public static void main(String[] args) {
		String pass = "123456758";
		Passwords i = new Passwords();
		try {
			i.validatePassword(pass);
		} catch (Passwords e) {
			System.out.println(e.getMessage());
		}
	}

	
}
