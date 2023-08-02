package com.robert.abstractclassdemo;

public class Test {

	public static void main(String[] args) {
			
		Cash laptop = new Cash(1500);
		
//		laptop.paymentDetails();
		
		
		CreditCard tacos = new CreditCard(2.99, "46548436458", "Andrew", "10/21");
		
		tacos.paymentDetails();
	}

}
