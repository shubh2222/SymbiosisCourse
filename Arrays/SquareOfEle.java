package com.arrays;

public class SquareOfEle {
	public static void square(int d[]) {
		for(int i=0; i<4; i++) {
			System.out.println(d[i]=d[i]*d[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[] = {2,3,4,5};
		SquareOfEle sq = new SquareOfEle();
		sq.square(d);
	}
}