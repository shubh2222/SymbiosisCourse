package com.sym.string;

public class UpperOfWord {
	public static String UpperWord(String str) {
		String str1="";
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(Character.isWhitespace(s)) {
				str1 += Character.toString(str.charAt(i+1)).toUpperCase();
			}else {
				str1 += s;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "shubh an";
		UpperOfWord u = new UpperOfWord();
		System.out.println(u.UpperWord(str));
	}
}