package com.collection;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pd = new Product("Orange", 600);
		Product pd2 = new Product("Apple", 300);
		Product pd3 = new Product("Guava", 400);
		Product pd4 = new Product("Mango", 500);
		Cart cart = new Cart();
		cart.addItems(pd);
		cart.addItems(pd2);
		cart.addItems(pd3);
		cart.addItems(pd4);
		cart.removeItems("Apple");
		cart.displayItems(pd2);
	}
	
}