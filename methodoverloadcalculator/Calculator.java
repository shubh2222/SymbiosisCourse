package com.sym.calcu;
import java.util.Scanner;
public class Calculator {
	public static void addition(int a, int b) {
		int add = a + b;
		System.out.println("Addition is: "+add);
	}
	public static void addition(int a, int b,int c) {
		int add = a + b +c;
		System.out.println("Addition is: "+add);
	}
	public static void addition(int a, int b,int c, int d) {
		int add = a + b +c +d;
		System.out.println("Addition is: "+add);
	}
	public static void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println("Subtraction is: "+sub);
	}
	public static void multiplication(int a, int b) {
		int mul = a * b;
		System.out.println("Multiplication is: "+mul);
	}
	public static void division(int a, int b) {
		int div = a / b;
		System.out.println("Division is: "+div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("enter the choice: ");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Press 1 for two parameters\nPress 2 for three parameters\nPress 3 for four parameters");
			int choice =sc.nextInt();
			if(choice == 1)
				cal.addition(10, 20);
			else if (choice == 2)
				cal.addition(10, 20, 30);
			else
				cal.addition(10, 20, 30, 40);
			break;
		case 2:
			cal.subtraction(40, 50);
			break;
		case 3:
			cal.multiplication(10,  40);
			break;
		case 4:
			cal.division(10, 2);
			break;
		}
	}
}
