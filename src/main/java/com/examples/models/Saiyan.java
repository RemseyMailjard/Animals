package com.examples.models;

public class Saiyan extends Fighter {

	public Saiyan(String name, int powerLevel, int health) {
		super(name, powerLevel, health);
	}

	public void transform() {
		int newPowerLevel = getPowerLevel() * 2;
		setPowerLevel(newPowerLevel);

		System.out.println(getName() + " transforms into Super Saiyan!");
		System.out.println("New power level: " + getPowerLevel());
	}
}