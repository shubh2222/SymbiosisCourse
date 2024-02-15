package com.sym.vehicledetail;
import java.util.Scanner;
public class Car extends Vehicle{
	static Scanner sc = new Scanner(System.in);
	public void showDetails() {
		System.out.println("enter model: ");
		model = sc.next();
		System.out.println("enter year: ");
		year = sc.next();
	}
}
