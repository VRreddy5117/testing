package com.practice.programs;

import java.util.ArrayList;

public class ArrayListSize {
	public static void main(String[] args) {
		
		ArrayList<Integer> ALS = new ArrayList<Integer> ();
		System.out.println("Before entering an elements array size is "+ ALS.size());
		
		ALS.add(9494);
		ALS.add(9495);
		ALS.add(9496);
		ALS.add(9497);
		System.out.println("Elements size is " + ALS.size());
		
		ALS.remove(3);
		ALS.remove(0);
		System.out.println("after removal arraySize is " + ALS.size());
      
		//elements to display 
		for(Integer EA : ALS)
		{
			System.out.println(EA);
		}
	}

}
