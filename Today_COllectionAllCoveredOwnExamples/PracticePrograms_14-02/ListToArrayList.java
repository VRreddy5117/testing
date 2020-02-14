package com.practice.programs;


// List array to ArrayList
import java.util.LinkedList;
import java.util.List;

public class ListToArrayList {
	public static void main(String[] args) {
		
		List<String> AL = new LinkedList<String> ();
		AL.add("IT");
		AL.add("CSE");
		AL.add("ME");
		AL.add("CE");
		
		System.out.println("List to ArrayList");
		  String LAL[]=AL.toArray(new String[AL.size()]);

		
		for (String L : LAL)
		{
			System.out.println(L);
		}
		
	}

}
