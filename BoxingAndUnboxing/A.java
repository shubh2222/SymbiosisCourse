package com.mypackage;

public class A {
	public static void main(String[] args) {
		//boxing
		int a =10;
		Integer b = Integer.valueOf(a);
		
		//un boxing
		Integer d =20;
		int r = d.intValue();
		
		//int to string
		int ab =3;
		String jk = Integer.toString(ab); //to convert from int to string
		System.out.println(jk);
		
		//string to int
		String gh ="100";
		int kl = Integer.parseInt(gh); //to convert from string to int
		System.out.println(kl);
		
		//object to string
		Integer mn = 150;
		String kp = mn.toString();
		System.out.println(kp);
		
		//string to object
		String mo ="10";
		Integer po =Integer.parseInt(mo);
		System.out.println(po);
	}
}