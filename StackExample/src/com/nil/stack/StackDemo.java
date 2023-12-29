package com.nil.stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack stack = new Stack(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		// print stack
		stack.printStack();

		// get height
		stack.getHeight();

		System.out.println(stack.pop().value);
		stack.getHeight();

	}

}
