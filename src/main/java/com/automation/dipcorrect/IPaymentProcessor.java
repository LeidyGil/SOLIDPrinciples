package com.automation.dipcorrect;

import ecommerce.model.refactored.PaymentDetails;

public interface IPaymentProcessor {
	
	public void processCreditCard(PaymentDetails paymentDetails, double amount);
	
}
