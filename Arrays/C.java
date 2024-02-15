package com.arrays;
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c[] = new int[5];
		for(int i=0; i<5; i++) {
			c[i]=sc.nextInt();
		}
		for(int arr:c) {
			System.out.println(arr);
		}
	}

}
