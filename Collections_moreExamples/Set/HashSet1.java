package com.Set;

import java.util.*;

class HashSet1 {  //un ordered elements
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
    //    while (i.hasNext()) {
          //  System.out.println(i.next());
      //  }
        for ( String a: set ) {
            System.out.println(a);
        }
    }
} 