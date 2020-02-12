package com.oops;

public class Student{ 
	
	//creating a default constructor  
	Student(){
		System.out.println("Student is created");
	}
	
	Student(int i, int j){
		System.out.println("Value : "+i);
	}
	
	//main method  
	public static void main(String args[]){
		
		//calling a default constructor  
		Student stu1 = new Student();
		Student stu2 = new Student(10, 20);
	}  
} 