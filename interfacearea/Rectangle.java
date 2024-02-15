package com.sym.inter;
import java.util.Scanner;
public class Rectangle implements Shape {
	public float calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int a = sc.nextInt();
		System.out.println("enter breadth");
		int b = sc.nextInt();
		int area = a*b;
		return area;
	}
}