package com.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class StudentHashMap {

    public static void main(String[] args) {
       // Map<String, Student> student = new HashMap<>(); // Hashmap diasplay based on the hashcode of key
        //Map<String, Student> student = new LinkedHashMap<>(); //LinkedHashMap display based on the insertion order
        Map<String, Student> student = new TreeMap<>(); //TreeMap display based on the ascending order

        student.put("student-1", new Student(101, "Modiji", "IT", 3000.00));
        student.put("student-2", new Student(102, "Ramana", "EEE", 3300.00));
        student.put("student-4", new Student(104, "Arjuna", "IT", 2000.00));
        student.put("student-5", new Student(105, "Drona", "ME", 3000.00));
        student.put("student-3", new Student(103, "Krishna", "CSE", 3200.00));


        for (Map.Entry<String, Student> map : student.entrySet()){
            //It will display based on key hashcode
            System.out.println(map.getKey() +" : "+map.getValue());
        }

    }
}
