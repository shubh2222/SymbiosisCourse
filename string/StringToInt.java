package com.sym.string;
import java.util.Scanner;
public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		int res = Integer.parseInt(str);
		System.out.println(res);
	}
}