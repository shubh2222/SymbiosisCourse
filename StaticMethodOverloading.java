package com.compiletimepolu;

public class StaticMethodOverloading {
	 public static void m1() {
		 System.out.println("no parameters");
	 }
	 public static void m1(int a) {
		 System.out.println("with int parameter");
	 }
	 public static void m1(String a) {
		 System.out.println("With string paramter");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodOverloading.m1(10);
		StaticMethodOverloading.m1();
		StaticMethodOverloading.m1("kbp");
	}
}
