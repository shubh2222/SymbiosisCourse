package com.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class OpOnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(10);
		list.add(20);
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		set.add(20);//duplicate values are not allowed
		set.add(70);
		set.add(null);//multiple null values are not allowed
		//set.addAll(list);
		set.retainAll(list);
		System.out.println(set);
		System.out.println("before: "+set);
		set.remove(20);
		System.out.println("after: "+set);
		System.out.println(set.contains(20));
		System.out.println(set.size());
		//set.clear();
		//System.out.println("after: "+set);
		//System.out.println(set.isEmpty());
		System.out.println(set.removeAll(set));
		System.out.println(set);
	}
}