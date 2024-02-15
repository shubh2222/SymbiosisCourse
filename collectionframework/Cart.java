package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Cart {
	private ArrayList<Product> list;
	public Cart() {
		this.list = new ArrayList<>();
	}
	public void addItems(Product pd) {
		list.add(pd);
	}
	public void removeItems(String name) {
		Iterator<Product> itr = list.iterator();
		while(itr.hasNext()) {
			Product pd = itr.next();
			if(pd.getProductName()==name) {
				itr.remove();
			}
		}
	}
	public void displayItems(Product pd) {
		for(Product pd1 : list) {
			System.out.println("Product name is "+pd1.getProductName()+"\nProduct Price is "+pd1.getProductPrice());
		}
	}
}
