package com.sym.string;
import java.util.Scanner;
public class MyDish {
	public static boolean feast(String beast, String dish) {
		char d = beast.charAt(0);
		char e = dish.charAt(0);
		int f = dish.length()-1;
		char g = dish.charAt(f);
		
		if(d==e && d==g) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal: ");
		String animal = sc.next();
		System.out.println("Enter fish: ");
		String dish = sc.next();
		MyDish md = new MyDish();
		boolean res= md.feast("dear","dead");
		System.out.println(res);
		
	}

}
