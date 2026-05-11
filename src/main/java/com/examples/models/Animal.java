package com.examples.models;



// This is the superclass (Parent class)

public class Animal {
	 String name;
	private int age;


	public Animal() {

		System.out.println("Every animal will be constructed from the animal constructor class. This is the animal calling it");
	}

	public Animal(String name) {
		System.out.println("When you use the keyword super... it calls  the super constructor");
		System.out.println("You know that " + name + " is a type of animal");
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("This animal is eating.");
	}

	public void makeSound() {
		System.out.println("This animal makes a sound.");
	}
}