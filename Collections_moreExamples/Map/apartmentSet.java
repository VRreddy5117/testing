package com.Map;

import java.util.HashMap;
import java.util.Map;

public class apartmentSet {

    public static void main(String[] args) {


        Map<String, apartment> apartment = new HashMap<>();

        apartment.put("Doctor", new apartment(1, "MIG-1", 1000.00));
        apartment.put("Police", new apartment(3, "MIG-3", 3000.00));
        apartment.put("Teacher", new apartment(6, "MIG-6", 6000.00));

        //It will display based on key hashcode
        for (Map.Entry<String, com.Map.apartment> Map1 : apartment.entrySet()) {
            System.out.println(Map1.getKey() + " : " + Map1.getValue());
        }
    }


}
