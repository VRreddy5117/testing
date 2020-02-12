package com.basic;

public class Variables {
	
	int id = 101; // instance variable
	static String name = "Java Technology"; //static variable
	
	//normal method
	void msg() {
		String msg = "Local Variables"; //local variables
		System.out.println(msg);
	}
	
	//static method
	static void add() {
		int a = 10, b = 20, c = a+b;
		System.out.println(name+" : "+c);
	}
	
	public static void main(String[] args) {
		Variables.add(); // static method calling using class name
		
		//calling methods by creating object
		Variables obj = new Variables();
		obj.msg();
		obj.add();
	}
	

}
