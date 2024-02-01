package com.addition;
import java.util.Scanner;
public class Calculations {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition is: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations cl = new Calculations();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no: ");
		int num1 = sc.nextInt();
		System.out.println("enter second no: ");
		int num2 = sc.nextInt();
		cl.add(num1,  num2);
	}

}
