package com.sym.string;
import java.util.Scanner;
public class D {
	public String getCount(String str) {
		int count =0;
		int c=0;
		int sp=0;
		int CountOfConsonant =0;
		str =str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
				count++;
			}else if(Character.isAlphabetic(s)) {
				CountOfConsonant++;
			}
		}
		return "consonants: "+CountOfConsonant+ "vowels: "+count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		D d = new D();
		System.out.println(d.getCount(str));	
	}
}