package com.Set;

import java.util.*;

class LinkedHashSet {  // insertion order
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        java.util.LinkedHashSet<String> set = new java.util.LinkedHashSet();

        java.util.LinkedHashSet met = new java.util.LinkedHashSet();
        met.add("reddy");
        met.add("raman");

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (Object a:met) {
            System.out.println(a);
        }
    }
}

class TreeSet3{
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());
    }
}