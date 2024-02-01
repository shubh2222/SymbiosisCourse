package com.interfaceabbeg;
import java.util.Scanner;
public class Operations {
	static Scanner sc = new Scanner(System.in);
	public static void getMobiles() {
		System.out.println("Press 1 for iphone\t Press 2 for samsung: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			Iphone obj = new Iphone();
			System.out.println("id \t name \t price \t category");
			System.out.println(obj.getProductId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getCategory());
			break;
		case 2:
			Samsung sam = new Samsung();
			System.out.println("id \t name \t price \t category");
			System.out.println(sam.getProductId()+"\t"+sam.getName()+"\t"+sam.getPrice()+"\t"+sam.getCategory());
			break;
		}
   }
	public static void getTv() {
		System.out.println("Press 1 for LG\t Press 2 for Onida: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			LG obj1 = new LG();
			System.out.println("id \t name \t price \t category");
			System.out.println(obj1.getProductId()+"\t"+obj1.getName()+"\t"+obj1.getPrice()+"\t"+obj1.getCategory());
			break;
		case 2:
			Onida obj2 = new Onida();
			System.out.println("id \t name \t price \t category");
			System.out.println(obj2.getProductId()+"\t"+obj2.getName()+"\t"+obj2.getPrice()+"\t"+obj2.getCategory());
			break;
		}
	}
	public static void getAc() {
		System.out.println("Press 1 for Ac1\t Press 2 for Ac2: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			Ac1 obj3 = new Ac1();
			System.out.println("id \t name \t price \t category");
			System.out.println(obj3.getProductId()+"\t"+obj3.getName()+"\t"+obj3.getPrice()+"\t"+obj3.getCategory());
			break;
		case 2:
			Ac2 obj4 = new Ac2();
			System.out.println("id \t name \t price \t category");
			System.out.println(obj4.getProductId()+"\t"+obj4.getName()+"\t"+obj4.getPrice()+"\t"+obj4.getCategory());
			break;
		}
	}
	
}