package com.Interfaces_abstract;

import java.util.Scanner;

public class BookStoreApp {
	
	public static void main(String[] args) {
		System.out.println("Enter Book Name");
		Scanner sc = new Scanner(System.in);
		String book = sc.next();
		
		if(book.equals("java")) {
			BookStore java = new JavaBook();
			java.bookName();
			java.bookPrice();
		}
		if(book.equals("html")) {
			BookStore html = new HTMLBook();
			html.bookName();
			html.bookPrice();
		}
		
	}

}
