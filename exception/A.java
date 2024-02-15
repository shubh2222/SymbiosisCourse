package com.sym.excep;

public class A {
	public static void main(String[] args) {
		try {
			throw new Ashish();
		} catch(Ashish e) {
			System.out.println("Handled");
		}
	}
}