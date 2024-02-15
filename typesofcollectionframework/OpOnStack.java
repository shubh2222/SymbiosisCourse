package com.collection.stack;

import java.util.Stack;

public class OpOnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		System.out.println("Capacity Before: "+stack.capacity());
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		for(int i=1; i<7; i++) {
			stack.push(i);
		}
		
		stack.pop();
		stack.push(500);
		stack.push(400);
		System.out.println(stack.peek());
		System.out.println(stack.search(200));
		System.out.println(stack);
		System.out.println("Capacity After: "+stack.capacity());
		
	}

}
