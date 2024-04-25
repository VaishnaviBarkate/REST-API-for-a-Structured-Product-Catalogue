package com.example.Interview.Task1;

import javax.persistence.Embeddable;

@Embeddable
public class Availability {

	private boolean inStock;
	private int quantity;
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
