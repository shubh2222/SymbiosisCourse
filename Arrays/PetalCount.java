package com.arrays;
import java.util.Scanner;
public class PetalCount {
	public static String petal(String str[],int count) {
		for(int i=0; i<str.length; i++) {
			i=(count%str.length) +1 ;
				return str[i];			
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"iloveyou","alot","madly","passionately","deeply","NotAtAll"};
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		PetalCount pc = new PetalCount();
		System.out.println(pc.petal(str, count));
	}
}