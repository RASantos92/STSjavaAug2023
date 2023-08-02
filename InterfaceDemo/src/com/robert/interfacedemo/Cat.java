package com.robert.interfacedemo;

public class Cat extends Pet implements HousePet{

	public Cat() {
		super("random cat name", "cat");
	}
	
	public Cat(String name) {
		super(name, "cat");
	}

	@Override
	public void showAffection() {
		System.out.println("purrr....");
		
	}

	@Override
	public void askForFood() {
		System.out.println("meow.... follow master");
	}

}
