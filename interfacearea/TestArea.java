package com.sym.inter;
import java.util.Scanner;
public class TestArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 Circle cl = new Circle();
		 Rectangle rl = new Rectangle();
		System.out.println("Press 1 for Circle\nPress 2 for Rectangle");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(cl.calculateArea());
			break;
		case 2:
			System.out.println(rl.calculateArea());
			break;
		}
	}
}
