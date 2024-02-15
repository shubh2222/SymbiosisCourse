package com.collection;

public class Product {
	private String productName;
	private int productPrice;
	
	public Product(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		productPrice = productPrice;
	}
}