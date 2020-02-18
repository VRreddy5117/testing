package com.ExceptionHandling;

public class ExceptionH1 {
	
	public static void main(String[] args) {
		
		System.out.println("before exception");
		
		
		 try {
			 System.out.println("begining");
			 
			 int divide = 10/5;
			 System.out.println(divide);
		 }
		 catch (Exception e){
			 System.out.println("Error occured in try");
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		 }
		 System.out.println("ending of EH1");
	}

}
