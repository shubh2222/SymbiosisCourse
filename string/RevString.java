package com.sym.string;
public class RevString {
	public String ReverseString(String str,String s) {
		for(int i=str.length()-1; i>=0; i--) {
			s = s+str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		String str = "shubhangi";
		String s = "";
		RevString rs = new RevString();
		System.out.println(rs.ReverseString(str, s));		
	}
}