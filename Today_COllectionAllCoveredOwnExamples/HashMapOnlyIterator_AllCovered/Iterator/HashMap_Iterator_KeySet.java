package com.HashMap.Iterator;

import java.util.HashMap;
import java.util.Set;


public class HashMap_Iterator_KeySet {

	public static void main(String[] args) {
		HashMap<String, String> HMI = new HashMap<> ();

		HMI.put("Hyderabad", "500");
		HMI.put("Chile", "200");
		HMI.put("USA", "1000");
		HMI.put("Pak", "150");

		System.out.println("HashMap iterator ");

		Set<String> keySet = HMI.keySet();
		java.util.Iterator<String> keySetIterator = keySet.iterator();

		while (keySetIterator.hasNext()) {

			String key = keySetIterator.next();
			System.out.println("key: " + key + " value: " + HMI.get(key));

		}
	}
}
