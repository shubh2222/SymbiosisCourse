package com.sym.inter;
import java.util.Scanner;
public class Circle implements Shape {
	public float calculateArea() {
		System.out.println("enter radius");
		Scanner sc = new Scanner(System.in);
		final float pi = 3.14f;
		float r = sc.nextFloat();
		float area = pi*r*r;
		return area;
	}
}
