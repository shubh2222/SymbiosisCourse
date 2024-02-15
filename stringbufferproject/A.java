package com.sym.stringbuff;

public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 class Appliances {
			private int productId;
			private String productName;
			private double price;
			private double GST;
			private int stock;
			
			public int getStock() {
				return stock;
			}
			public void setStock(int stock) {
				this.stock = stock;
			}
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
			
			@Override
			public String toString() {
				return "Appliances [productId=" + productId + ", productName=" + productName + ", price=" + price
						+ ", GST=" + GST + ", stock=" + stock + "]";
			}
			

		}

		StringBuffer sb = new StringBuffer();
		System.out.println("initial capacity: "+sb.capacity());
		sb.append("Mumbai-");
		sb.append("Pune-");
		sb.append("Satara-");
		sb.append("Karad-");
		sb.append("Kolhapur");
		System.out.println("capacity: "+sb.capacity());
		System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer();
		sb1.append("-Sangli");
		sb1.append("-Miraj");
		
		sb.append(sb1);
		System.out.println(sb);
		System.out.println("capacity: "+sb.capacity());
		Appliances ap = new Appliances();
		ap.setGST(100);
		ap.setPrice(20);
		ap.setProductId(1);
		ap.setProductName("shubh");
		ap.setStock(10);
		sb.append(ap);
		System.out.println(sb);
	}

}
