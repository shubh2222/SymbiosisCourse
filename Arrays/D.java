package com.arrays;

public class D {
	public static void printele(int d[]) {
		for(int i=0; i<7; i++) {
			if(d[i]==4) {
				d[i]=11;
			}
		}
			for(int arr:d) {
				System.out.println(arr);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[] = {1,2,3,4,5,6,4};
		D dm = new D();
		dm.printele(d);
	}

}
