package com.practice.programs;

import java.util.HashMap;

public class MapSize_IsEmpty {

	public static void main(String[] args) {

		HashMap<Integer, String> HMS = new HashMap<> ();
		
		System.out.println("Is hashMap empty? :" +HMS.isEmpty());
		
		HMS.put(1,"Amit");
		HMS.put(2,"maharshi");
		HMS.put(3,"modi");
		HMS.put(6,"vivek");
		
         System.out.println("Is hashMap empty? :" +HMS.isEmpty());		
		//System.out.println("size of hashMap: "+HMS.size());
	}

}
