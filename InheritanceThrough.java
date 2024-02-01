package com.compiletimepolu;
class parent {
	void m1() {
	System.out.println("in parent");
	}
}
class child extends parent{
	void m1(String a) {
		System.out.println("in child");
	}
}
public class InheritanceThrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch = new child();
		ch.m1();
		ch.m1("kbp");
	}

}
