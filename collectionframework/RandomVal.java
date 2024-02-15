package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class RandomVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ab = new LinkedList<>();
		ab.add(100);
		ab.add(200);
		ab.add(300);
		ab.add(400);
		ab.add(500);
		ab.add(300);
		//System.out.println(ab);
		//Random rn = new Random();
		//int index = rn.nextInt(ab.size());
		//System.out.println(ab.get(index));
		
	//	Random rm = new Random();
	//	Collections.shuffle(ab, rm);
//		System.out.println(ab);
		
		Random rm = new Random();
		int otp = rm.nextInt(10000, 99999);
		System.out.println(otp);
	}

}
