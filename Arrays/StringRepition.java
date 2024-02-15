package com.arrays;
import java.util.Scanner;
public class StringRepition {
	public static boolean getstrrepeat(String str) {
		char s[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(Character.toString(s[i]).compareTo(Character.toString(s[j]))==0){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		StringRepition sp = new StringRepition();
		System.out.println(sp.getstrrepeat(str));
	}

}
