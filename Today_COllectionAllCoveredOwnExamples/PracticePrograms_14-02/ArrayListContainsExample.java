package com.practice.programs;

import java.util.ArrayList;

public class ArrayListContainsExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(16486);
		AL.add(16487);
		AL.add(16488);
		AL.add(16489);
		
		if (AL.contains(16480))
		{
			System.out.println("present in list");
		}
		else
		{
			System.out.println("Not present in list");
		}
	}

}
