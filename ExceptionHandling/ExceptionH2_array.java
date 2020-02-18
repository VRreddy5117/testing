package com.ExceptionHandling;

public class ExceptionH2_array {

	public static void main(String[] args) {

		System.out.println("Before indexing values");
		try {
			System.out.println("giving values indexwise");
			int i[]  = new int[4];
			i[5] = 300;
			System.out.println(i[4]);
			

		}
		catch (Exception e)
		{
			System.out.println("error in indexing");
			e.printStackTrace();
		}
		System.out.println("passed");
		


	}

}
