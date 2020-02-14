package com.practice.programs;

import java.util.HashSet;

public class Travers_HashSet {
	public static void main(String[] args) {
		
		HashSet<String> HS = new HashSet<String> ();
		
		HS.add("salesforce");
		HS.add("java");
		HS.add("selenium");
		HS.add("c++");
		HS.add("spring");

		System.out.println("HashSet Traverese");
		for( String S : HS ) 
		{
			System.out.println(S);
		}
	}

}
