package com.arrays;

public class Posneg {
	public static void getposneg(int c[]) {
		for(int i=0; i<5; i++) {
			if(c[i]<0) {
				c[i]=0-c[i];
			}else if(c[i]>0) {
				c[i]=0-c[i];
			}
		}
		for(int arr:c) {
			System.out.println(arr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]= {1,-2,3,4,-5};
		Posneg pn = new Posneg();
		pn.getposneg(c);
	}

}
