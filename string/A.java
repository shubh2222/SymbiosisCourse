package com.sym.string;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Mumbai";
		String b = "Mumbai";
		String c = new String("Pune");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.charAt(0));//return value present at particular index
		System.out.println(a.codePointAt(0));//returns ASCII value
		System.out.println(a.compareTo(b));//returns 0 if values are same and if there are diff in start symbol then it gives diff
		System.out.println(a.codePointBefore(1));//return ASCII value which is before at particular index
		System.out.println(a.compareToIgnoreCase(c));
		System.out.println(a.codePointCount(0, 6));
		System.out.println(a.concat(b));//combine both strings together
		System.out.println(a.contentEquals(b));
	}

}
