package com.nisum.POC;

import java.util.*;

public class ListPoc {


    public static void main(String[] args) {

        //ArrayList example // ordered list // retrieval is faster

        ArrayList<String> list = new ArrayList<String>();
        list.add("s1");
        list.add("s3");
        list.add("s2");
        list.add("s4");
        list.add("s1");  //duplicate string

        for (String s: list
             ) {
            System.out.println(s);
        }

        //LinkedList example // ordered list // insertion and deletion is faster

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("s1");
        list2.add("s3");
        list2.add("s2");
        list2.add("s4");
        list2.add("s1");  //duplicate string

        for (String s: list2
        ) {
            System.out.println(s);
        }


        //Set // duplicates not allowed

        Set<Integer> set = new HashSet<Integer>();
        // unordered set
        set.add(10);
        set.add(30);
        set.add(45);
        set.add(10);

        for (Integer s: set
        ) {
            System.out.println(s);
        }


        //Set // duplicates not allowed

        Set<Integer> set2 = new LinkedHashSet<Integer>();

        set2.add(10);
        set2.add(50);
        set2.add(45);
        set2.add(10);

        for (Integer s: set2
        ) {
            System.out.println(s);
        }

        Set<Integer> set3 = new TreeSet<Integer>();

        set3.add(10);
        set3.add(50);
        set3.add(45);
        set3.add(10);

        for (Integer s: set3
        ) {
            System.out.println(s);
        }

        Map<String, String> map = new HashMap<String,String>();

        map.put("key1","value1");
        map.put("key3","value2");
        map.put("key4","value3");
        map.put("key2","value4");

        for (Map.Entry entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        Map<String, String> map2 = new LinkedHashMap<String,String>();

        map2.put("key1","value1");
        map2.put("key3","value2");
        map2.put("key2","value3");
        map2.put("key4","value4");

        for (Map.Entry entry:map2.entrySet()
        ) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        Map<String, String> map3 = new TreeMap<String,String>();

        map3.put("key4","value4");
        map3.put("key3","value3");
        map3.put("key2","value2");
        map3.put("key1","value1");

        for (Map.Entry entry:map3.entrySet()
        ) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
