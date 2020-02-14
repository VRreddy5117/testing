package com.practice.programs;


// traverse ArrayList
import java.util.ArrayList;

public class Traverse_arrayList {
	
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String> ();
		ar.add("venkat");
		ar.add("reddy");
		ar.add("annem");
		ar.add("raman");
		ar.add("reddy");
		
		System.out.print("print arraylist");
		
		for (String re : ar)
		{
			System.out.println(re);
		}
	}
}
