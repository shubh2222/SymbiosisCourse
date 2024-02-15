package com.sym.string;

public class AlternateVowel {
	public static boolean Alternatevow(String str) {
		for(int i=0; i<str.length()-1; i++) {
			char s = str.charAt(i);
				if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
					char c = str.charAt(i+2);
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
						return true;
					}
				}
			
		}
		return false;
	}
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="banana";
		AlternateVowel av = new AlternateVowel();
		System.out.println(av.Alternatevow(str));
	}
}