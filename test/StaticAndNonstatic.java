package com.sym.stat;
public class StaticAndNonstatic {
	static int a =20;
	int b = 30;
	//static method
	public static void display() {
		System.out.println("static method");
	}
	//non static method
	public void displayMeth() {
		System.out.println("nonstatic method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling static method
		StaticAndNonstatic.display();
		//calling non static method 
		StaticAndNonstatic obj = new StaticAndNonstatic();
		obj.displayMeth();
		//calling static variable
		System.out.println(StaticAndNonstatic.a);
		//calling non static variable
		System.out.println(obj.b);
	}
}