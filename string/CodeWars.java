package com.sym.string;

public class CodeWars {

	public static int strCount(String str, char letter) {
		int count =0;
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)==letter) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CodeWars cw = new CodeWars();
		int result = cw.strCount("shubhangi",'h');
		System.out.println(result);
	}

}
