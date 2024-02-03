package com.myshop.home;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Operations {
	static Scanner sc = new Scanner(System.in);
	static Appliances ap = new Appliances();
	public void setData() {
		System.out.println("*****Product Info*****");
		System.out.println("Enter product Id");
		int id = sc.nextInt();
		ap.setProductId(id);
		System.out.println("enter product name");
		ap.setProductName(sc.next());
		System.out.println("enter price");
		double price = sc.nextDouble();
		double GST = price+((price*18)/100);
    	ap.setPrice(price);
    	ap.setGST(GST);
		
	}
	public void getData() {
		System.out.println(ap.getProductId()+"\t"+ap.getProductName()+"\t"+ap.getPrice()+"\t"+ap.getGST());
		
	}
	public void updateData() {
		System.out.println("Press 1 for update id\nPress 2 for update name\nPress 3 for update price");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter new id");
			int id = sc.nextInt();
			ap.setProductId(id);
			System.out.println("Product Id is updated at:"+LocalDateTime.now());
			break;
		case 2:
			System.out.println("enter new name");
			ap.setProductName(sc.next());
			System.out.println("Product name is updated at:"+LocalDateTime.now());
			break;
		case 3:
			System.out.println("enter new price");
			ap.setPrice(sc.nextDouble());
			System.out.println("Product price is updated at:"+LocalDateTime.now());
			break;
		}
	}
}
