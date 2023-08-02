package com.robert.abstractclassdemo;

public class CreditCard extends Payment {
	
	private String cardNum, ownerName, expDate;

	public CreditCard(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName; 
		this.expDate = expDate;
	}
	
	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("Card Num: " + this.cardNum + " Owner: " + this.ownerName + " expDate: " + this.expDate );
	}

}
