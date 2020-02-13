package com.oops;

public class InheritanceTest {
	public static void main(String[] args) {


		Child c = new Child();
		c.members();
		c.prop();
		c.add(10);

	}

}


class Parent {

	double property = 100000.00;
	void members() {
		System.out.println("4 Members");
	}
	
	void add(int i) {
		System.out.println(i);
	}

}

class Child extends Parent {

	void prop(){
		System.out.println("property : "+property);
	}
	
	void add(int i, int j) {
		System.out.println(i+j);
	}

}

