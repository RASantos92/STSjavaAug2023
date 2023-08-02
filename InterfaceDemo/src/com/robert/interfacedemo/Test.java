package com.robert.interfacedemo;

public class Test {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Cowboy");
		
		Cat cat1 = new Cat("Momo");
		
		dog1.play();
		dog1.askForFood();
		dog1.showAffection();
		
		System.out.println("**********************************************\n");
		
		cat1.play();
		cat1.askForFood();
		cat1.showAffection();
		

	}

}
