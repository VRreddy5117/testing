package com.oops;

public class TestOverriding {
	public static void main(String[] args) {
		
	}

}

class RBIBank{
	void loan() {
		System.out.println("house loan interest 10 %");
	}
	
	void minBal(double minbal) {
		System.out.println("1000/-");
	}
}

class SBIBank extends RBIBank{
	void loan() {
		System.out.println("house loan interest 9 %");
	}
	
}

class HDFCBank extends RBIBank{
	void loan() {
		System.out.println("house loan interest 11 %");
	} 
}

