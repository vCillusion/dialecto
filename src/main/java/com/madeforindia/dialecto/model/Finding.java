package com.madeforindia.dialecto.model;

import java.util.List;

public class Finding {
	
	private int count;
	private List<Product> products;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
