package com.sym.string;
import java.util.Scanner;
public class PalindromeString {
	public static boolean isPalindrome(String str, String s) {
		for(int i=str.length()-1; i>=0; i--) {
			s=s+str.charAt(i);
		}
		if(str.equals(s)) 
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "";
		PalindromeString ps = new PalindromeString();
		System.out.println(ps.isPalindrome(str, s));
	}
}