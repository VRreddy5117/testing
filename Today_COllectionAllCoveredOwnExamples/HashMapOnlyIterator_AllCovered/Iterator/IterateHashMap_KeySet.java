package com.HashMap.Iterator;

import java.util.HashMap;


public class IterateHashMap_KeySet {

	public static void main(String[] args) {
		HashMap<String, Integer> HMI = new HashMap<> ();
		
		HMI.put("Hyderabad", 500);
		HMI.put("Chile", 200);
		HMI.put("USA", 1000);
		HMI.put("Pak", 150);
		
		System.out.println("HashMap iterator ");
		for(String out :HMI.keySet()) {
            System.out.println("key :" +out + ": value :" +HMI.get(out));			
		}

	}

}
