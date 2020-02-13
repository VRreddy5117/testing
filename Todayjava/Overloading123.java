package com.oops;

public class Overloading123 {
	public static void main(String[] args) {

		man mg = new man();



		System.out.println("today is not a good-day"); 
		System.out.println(mg.family);
		System.out.println(mg.gender); 
		System.out.println(mg.relation);
		System.out.println(mg.wear);

	}
}	
class human {

	String gender = "female";
	String relation = "mother";
	int family  = 8;

	void convert() {
		family = 6;
		gender = "female";
		relation = "brother";
		System.out.println("this is from method");
	}
}

class man extends human {
	String gender = "male";
	String wear = "shirt";
	int family = 5;
}






