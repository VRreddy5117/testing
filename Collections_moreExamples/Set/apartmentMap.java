package com.Set;

import com.collections.map.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class apartmentMap {

    public static void main(String[] args) {

       // Map<String, apartment> apartment = new TreeMap<>();
       // Map<String, apartment> apartment = new LinkedHashMap<>();
        Map<String, apartment> apartment = new HashMap<>();

        apartment.put("Doctor", new apartment(1, "MIG-1", 1000.00));
        apartment.put("Police", new apartment(3, "MIG-3", 3000.00));
        apartment.put("Teacher", new apartment(6, "MIG-6", 6000.00));

        for (Map.Entry<String, apartment> Map1 : apartment.entrySet()) {
            //It will display based on key hashcode
            System.out.println(Map1.getKey() + " : " + Map1.getValue());
        }
    }


}
