package com.robert.interfacedemo;

public class Dog extends Pet implements HousePet {

	public Dog() {
		super("random dog name", "dog");
	}
	
	public Dog(String name) {
		super(name, "dog");
	}


	@Override
	public void showAffection() {
		System.out.println("licks on owner");
		
	}

	@Override
	public void askForFood() {
		System.out.println("put chin on owners leg, begs, stares at you attently");
	}

}
