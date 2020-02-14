package com.HashMap.Iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_entrySet_forEach {
	public static void main(String[] args) {
		HashMap<String, String> HMI = new HashMap<> ();

		HMI.put("Hyderabad", "500");
		HMI.put("Chile", "200");
		HMI.put("USA", "1000");
		HMI.put("Pak", "150");

		System.out.println("HashMap iterator ");


		Set<Map.Entry<String, String>> ES = HMI.entrySet();
		for (Map.Entry entry : ES) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

		}
	}
} 	
