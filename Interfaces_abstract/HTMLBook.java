package com.Interfaces_abstract;

public class HTMLBook implements BookStore {

	@Override
	public void bookName() {
		System.out.println("HTML Book");

	}

	@Override
	public void bookPrice() {
		System.out.println("600/-");

	}

}
