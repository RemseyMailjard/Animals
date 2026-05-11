package com.examples.models;

// Dog is a child class, also called a subclass, of Animal.
public class Dog extends Animal {

	public Dog(String name) {
		super(name); // Calls the constructor of the parent class Animal
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " says: Woof!");
	}
}