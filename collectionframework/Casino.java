package com.collection;

import java.util.ArrayList;
import java.util.Random;

public class Casino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("TV");
		list.add("AC");
		list.add("Mobile");
		list.add("Better Luck Next Time");
		Random rm = new Random();
		int index = rm.nextInt(list.size());
		System.out.println(list.get(index));
		
		
	}

}
