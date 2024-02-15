package com.collection.treeset;

import java.util.ArrayList;
import java.util.TreeSet;

public class OpOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);
		list.add(100);
		list.add(200);
		TreeSet<Integer> set = new TreeSet();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(200);//does not allows duplicate values
		//set.add(null); null values are not allowed
		//set.addAll(list);
		//set.retainAll(list);
		//System.out.println("Initial Capacity: "+set.ca);
		System.out.println(set.size());
		System.out.println(set.contains(300));
		//System.out.println(set.remove(200));
		System.out.println(set);
		
		
		TreeSet<String> str = new TreeSet();
		str.add("aki");
		str.add("dolly");
		str.add("mini");
		str.add("xyz");
		str.add("xbc");
		System.out.println(str.contains("xyz"));
		System.out.println(str.size());
		//set.add(null);   null values are not allowed
		System.out.println(str);//it checks all characters belonging into the string and then op will in alpahabetical order
	
		
	}
}