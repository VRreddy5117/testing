package com.oops;

public class Student{ 
	
	//creating a default constructor  
	Student(){
		System.out.println("Student is created");
	}
	
	Student(int i, int j){
		System.out.println("Value : "+i);
	}
	
  	 int age(int k, int l) {
		System.out.println("Value :"+k);
		return k+l;
	}
	
	//main method  
	public static void main(String args[]){
		
		//calling a default constructor  
		Student stu1 = new Student();
		Student stu2 = new Student(10, 20);
		System.out.println(stu2.age(10, 20));;
	}  
} 