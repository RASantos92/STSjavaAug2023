package com.robert.inheritancedemo;

public class FrontEndDev extends Developer {
	
	private boolean isArtistic;
	
	public FrontEndDev() {
		super("no name front end dev", 18, 100000);
		this.isArtistic = false;
	}
	
	public FrontEndDev(String name) {
		super(name);
		this.setAge(21);
		this.age = 21;
		this.setSalary(120000);
		this.isArtistic = true;
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("is Artistic: " + this.isArtistic);
	}
	
	public void giveRaise(double amount) {
		 this.setSalary(this.getSalary() + amount);
//		 this.salary += amount;
	}

}
