package com.sym.string;

public class CountOfVowel {
	public int getCountOfVowels(String str) {
		int count =0;
		str=str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(s == 'a' || s=='e'|| s=='i'|| s=='o'|| s=='u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shubhangi";
		CountOfVowel cv = new CountOfVowel();
		System.out.println(cv.getCountOfVowels(str));
	}
}