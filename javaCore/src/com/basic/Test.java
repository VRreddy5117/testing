package com.basic;

// class declaration
public class Test {

	//Normal method
	void add() {
		System.out.println("Addition");
	}

	// Main Method, JVM starts execution from here
	public static void main(String[] args) {
		System.out.println("My First Program");

		//Object creation
		Test test = new Test();

		//Method calling
		test.add();
	}
}
