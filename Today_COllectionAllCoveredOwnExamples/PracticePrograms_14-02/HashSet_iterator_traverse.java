package com.practice.programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_iterator_traverse {
	public static void main(String[] args) {
		
		HashSet<String> HSI = new HashSet<String> ();
		
		HSI.add("Ecom");
		HSI.add("OMS");
		HSI.add("HomePage");
		HSI.add("Promotions");
		
		Iterator<String> IHS = HSI.iterator();
		System.out.println("HashSet contains:");
		
		while (IHS.hasNext()) {
			System.out.println(IHS.next());
		}
	}

}
