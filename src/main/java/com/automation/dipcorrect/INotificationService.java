package com.automation.dipcorrect;

public interface INotificationService {
	
	public void notifyCustomerOrderCreated(Cart cart) throws OrderException;
	
}
