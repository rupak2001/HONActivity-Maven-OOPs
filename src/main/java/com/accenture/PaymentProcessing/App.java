package com.accenture.PaymentProcessing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Credit1Impl impl1 = new Credit1Impl("user1", "credit card", 12345);
        impl1.withdrawByCreditCard();
        
        System.out.println();
        
		Credit2Impl impl2 = new Credit2Impl("user2","pay pal",23434);
		impl2.withdrawByPaypal();
    }
}
