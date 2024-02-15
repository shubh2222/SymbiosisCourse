package com.homework;
import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double r = Math.sqrt(n)+1;
		System.out.println(r*r);
	}
	
	
}
