package com.collection.linkedhashset;

import java.util.LinkedHashSet;

public class OpOnLinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("kbp");
		set.add("satara");
		set.add("Pune");
		set.add("Mumbai");
		set.add("kbp");//does  not allows duplicate values
		set.add(null);
		set.add("karad");
		set.add("sangli");
		set.add(null);//does not store multiple null values
		set.add(new String  ("miraj"));
		System.out.println(set.contains("karad"));
		System.out.println(set.contains(new String ("Pune")));//it uses .equals at back-end
		System.out.println(set);
	}
}