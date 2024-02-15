package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(500);
		list.add(500);
		list.add(600);
		System.out.println(list);
		Iterator itr = list.iterator();
		System.out.println(list);
		
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(list);
		}
		while(li.hasPrevious()) {
			System.out.println(list);
		}
	}	
}
