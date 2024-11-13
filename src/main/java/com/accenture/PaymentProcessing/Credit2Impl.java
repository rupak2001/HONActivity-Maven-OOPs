package com.accenture.PaymentProcessing;

public class Credit2Impl extends Credit2{
	Credit2Impl(String username, String paymentType, long accno) {
		super(username, paymentType, accno);
	}

	void withdrawByPaypal() {
		System.out.println("Payment done using paypal");
		System.out.println(Payment(username, paymentType, accno));
	}

}
