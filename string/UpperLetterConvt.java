package com.sym.string;
import java.util.Scanner;
public class UpperLetterConvt {
	public  static String Uppercont(String str,String str1) {
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(i%2==0) {
				str1= str1+Character.toString(s).toUpperCase();
			} else {
				str1 = str1+Character.toString(s).toLowerCase();
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = "";
		UpperLetterConvt uc = new UpperLetterConvt();
		System.out.println(uc.Uppercont(str, str1));
	}
}