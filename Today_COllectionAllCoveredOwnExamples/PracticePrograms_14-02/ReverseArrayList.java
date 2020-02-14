package com.practice.programs;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("GPREC");
		AL.add("46");
		AL.add("2000");
		
		
		//System.out.println(AL.remove(0));
		AL.remove(1);
		AL.remove(1);
		AL.add(1, "am in second position");
		AL.add(2,"Am in third position");
		
		for(String RAL : AL)
		{
			System.out.println(RAL);
		}
		
		
		/*
		 * System.out.println("before reverse");
		 * 
		 * System.out.println(AL); Collections.reverse(AL);
		 * 
		 * System.out.println("after reverse"); System.out.println(AL);
		 */

	}

}
