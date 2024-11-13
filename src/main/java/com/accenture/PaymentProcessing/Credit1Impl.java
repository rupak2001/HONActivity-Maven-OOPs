package com.accenture.PaymentProcessing;

public class Credit1Impl extends Credit1{
	Credit1Impl(String username, String paymentType, long accno) {
		super(username, paymentType, accno);
	}

	void withdrawByCreditCard() {
		System.out.println("Payment done using credit card");
		System.out.println(Payment(username, paymentType, accno));
	}

	
}
