package com.sym.excep;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30};
		try {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		} catch(RuntimeException e) {
			System.out.println("Data not available");
		}
		finally {
			System.out.println("next code");
		}
	}
}