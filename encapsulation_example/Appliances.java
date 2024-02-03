package com.myshop.home;

public class Appliances {
	private int productId;
	private String productName;
	private double price;
	private double GST;
	
	public double getGST() {
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
	   this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
