package com.arrays;
import java.util.Scanner;
public class CountOfEvenNo {
	public static int countEven(int c[]) {
		int count =0;
		for(int i:c){
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}
	public static boolean checkNo(int c[], int a) {
		for(int i=0; i<5; i++) {
			if(c[i]==a) {
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c[]= new int[5];
		for(int i=0;i<5; i++) {
			c[i]=sc.nextInt();
		}
		System.out.println("Enter No: ");
		int a = sc.nextInt();
		CountOfEvenNo cv = new CountOfEvenNo();
		System.out.println("total no of even numbers are: "+cv.countEven(c));
		System.out.println(cv.checkNo(c, a));
		
		
	}

}
