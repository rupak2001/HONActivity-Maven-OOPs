package com.accenture.PaymentProcessing;

public abstract class Credit2 {
	String username;
	String paymentType;
	long accno;
	
	Credit2(String username,String paymentType,long accno){
		this.username = username;
		this.paymentType = paymentType;
		this.accno = accno;
	}
	
	public String Payment(String username,String paymentType,long accno) {
		return new String("user is: "+username+"\nPayment Type is: "
					+paymentType+"\nAccount number is: "+accno);
	}
	
	abstract void withdrawByPaypal();
}
