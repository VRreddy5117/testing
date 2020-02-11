package com.collections.set;

import java.util.*;

public class BookHashSet {

    public static void main(String[] args) {

       // Set<Book> book = new HashSet<>(); // Display based on hash value of object
        Set<Book> book = new LinkedHashSet<>(); // Display based on the insertion order

        book.add(new Book(101, "C++", 2000));
        book.add(new Book(103, "Java 8", 300));
        book.add(new Book(104, "HTML", 100));
        book.add(new Book(102, "Ramayan", 150));
        book.add(new Book(106, "Spring", 700));

        for (Book books : book){
            System.out.println(books);
        }
    }

}
