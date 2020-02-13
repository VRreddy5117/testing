package com.oops;

class Parent1 {
	
	String plat = "jayabheri";
	String vehicle = "TATA";
	double property = 8588525.00;
	
	void members() 
	{ 
		System.out.println("my nominee is my child"); 
	}
	 
	public void consider () {
		String k = "venkat";
		int  H = 5;
		int  L = 10;
		int M = H+L;
		System.out.println("value of M is "+ M);
	}
}

public class Children extends Parent1 {
	
	public static void main (String[] args) {
			Children f = new Children();
			System.out.println(f.plat);
			System.out.println(f.vehicle);
			System.out.println(f.property);
			f.consider();
			f.members();
			
			
		
		
	}

}

