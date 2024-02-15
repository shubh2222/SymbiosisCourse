package com.collection.vector;

import java.util.Vector;

public class OpOnVector {
	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<Integer>();
		vt.addElement(10);
		vt.addElement(20);
		vt.addElement(30);
		vt.addElement(40);
		vt.addElement(50);
		vt.addElement(60);
		System.out.println(vt);
		System.out.println("Initial capacity: "+vt.capacity());
		vt.remove(0);
		System.out.println(vt.elementAt(2));
		System.out.println(vt.isEmpty());
		System.out.println(vt.size());
		System.out.println(vt);
		System.out.println("Cpacity After: "+vt.capacity());
	}
}
