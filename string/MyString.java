package com.sym.string;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Mumbai";
		System.out.println(a);
		
		String b = new String("Mumbai");
		System.out.println(b);
		
		char c[] = {'D','E','L','H','I'};
		String d = new String(c);
		System.out.println(d);
		
		char e[] = {65,66,67};
		String f = new String(e);
		System.out.println(f);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}

}
