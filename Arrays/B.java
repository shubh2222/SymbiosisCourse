package com.arrays;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object b[] = new Object[4];
		b[0] = 123;
		b[1] = "abc";
		b[2] = true;
		b[3] = null;
		for(Object arr:b) {
			System.out.println(arr);
		}
	}

}
