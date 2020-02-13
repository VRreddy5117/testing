package com.oops;

public class TestOverloading{ 
	
	public static void main(String[] args){
		Adder add = new Adder();
		System.out.println(add.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	}
}

class Adder{  
	int add(int a, int b){
		return a+b;
	}  
	static int add(int a, int b, int c){
		return a+b+c;
	}  
}