package com.Interfaces_abstract;

public class NumberOfStudents implements School {

	@Override
	public void englishMedium() {
		System.out.println("number of students : 100");
	}

	@Override
	public void teluguMedium() {
	  System.out.println("number of students : 200");
	}

}
