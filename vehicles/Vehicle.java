package com.sym.vehicledetail;
import java.util.Scanner;
public class Vehicle {
	public String model;
	public String year;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Car cr = new Car();
		Motorcycle ml = new Motorcycle();
		System.out.println("Press 1 for car\n Press 2 for motorcycle");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			cr.showDetails();
			break;
		case 2:
			ml.showDetails();
			break;
		}
	}
}
