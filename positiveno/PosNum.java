package com.pos.no;
import java.util.Scanner;
public class PosNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			num = sc.nextInt();
		} while(num>=0);
		System.out.println(num);
	}
}