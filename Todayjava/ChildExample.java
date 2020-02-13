package com.oops;

class ParentExample
{
	static int a = 25;
	void display()
	{
		System.out.print("parent class");
	}
}
public class ChildExample extends ParentExample
{
	static int b = 23;
	void show()
	{
		System.out.print("child class");
	}

public static void main (String[] args) {
		ChildExample ie = new ChildExample();
		System.out.println(ie.b);
		System.out.println(ie.a);
		ie.display();
		ie.show();
		
	}
}
