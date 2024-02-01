package com.compiletimepolu;

public class First {
	public void m1() {
		System.out.println("no parameters");
	}
	public void m1(int a) {
		System.out.println("parameters with int");
	}
	public void m1(String a) {
		System.out.println("String parameters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First ft = new First();
		ft.m1(10);
		ft.m1("shubh");
	}

}
