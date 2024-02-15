package com.sym.string;
import java.util.Scanner;
public class Upper {
	public static String UpperCaseString(String str,String str1,String str2) {
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(i%2==0) {
				str1 =str1+Character.toString(s).toUpperCase();
			} else {
				str2 = str2+Character.toString(s).toLowerCase();
			}
		}
		return str1+"\n"+str2.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = "";
		String str2="";
		Upper up = new Upper();
		System.out.println(up.UpperCaseString(str, str1, str2));
				
	}

}
