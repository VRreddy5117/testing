package com.Interfaces_abstract;

public class JavaBook implements BookStore {

	@Override
	public void bookName() {
		System.out.println("Java Book");

	}

	@Override
	public void bookPrice() {
		System.out.println("1000/-");

	}

}
