package com.test;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {

		Stack x = new Stack();
		x.push(12);
		x.push(34);
		x.push(89);

		System.out.println(x);

		System.out.println(x.peek());

		x.pop();

		System.out.println(x);

	}

}
