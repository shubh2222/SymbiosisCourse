package com.sym.excep;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =0;
		try {
			int c = a/b;
			System.out.println(c);
		} catch(NullPointerException e) {
			System.out.println("cant divide by zero");
		}
	}
}
