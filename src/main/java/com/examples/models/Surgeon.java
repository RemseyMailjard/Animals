package com.examples.models;

public class Surgeon extends Doctor{




 // Doctor is also inheritating properties from person
	//Doctor is-A-Person
	public void performSurgery() {
		System.out.println(firstname + " is performaning surgery");
	}
}
