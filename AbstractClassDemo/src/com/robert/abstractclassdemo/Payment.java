package com.robert.abstractclassdemo;

public abstract class Payment {
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails() {
		System.out.println("Payment Amount: " + this.amount);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
