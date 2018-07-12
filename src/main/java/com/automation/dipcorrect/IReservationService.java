package com.automation.dipcorrect;

import ecommerce.model.refactored.Item;

public interface IReservationService {
	
	public void reserveInventory(Iterable<Item> items);
	
}
