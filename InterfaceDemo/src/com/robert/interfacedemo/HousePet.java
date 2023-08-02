package com.robert.interfacedemo;

public interface HousePet {
	//default: useable
	public default void play() {
		System.out.println("playing...");
	}

	// abstract : has to completed when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
}
