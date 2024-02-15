package com.sym.string;

public class DelHash {
	public static String DelLet(String str) {
		
		for(int i=0; i<str.length()-1;i++) {
			
			if(str.charAt(i) == '#') {
				return str.replace(str.substring(i - 1,i + 1),str.substring(i + 2, i + 3));
			}
	}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DelHash dh = new DelHash();
		String str = "abcde#fgh";
		System.out.println(dh.DelLet(str));
		
	}

}
