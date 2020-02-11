package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        // Set set = new HashSet(); // Display based on hash value of object
        //Set set = new LinkedHashSet(); // Display based on the insertion order
        Set set = new TreeSet(); // Display based on the sorting order
        set.add(101);
        set.add(103);
        set.add(102);
        set.add(106);
        set.add(104);

        System.out.println(set);

    }
}
