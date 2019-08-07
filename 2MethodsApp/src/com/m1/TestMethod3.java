package com.m1;
class Manipulate {
	int add(int a, int b) {
		int c = a + b;
		return c;
	}

}

public class TestMethod3 {

	public static void main(String[] args) {
		Manipulate m = new Manipulate();

		int a = 90;
		int b = 67;
		int sum = m.add(a, b);

		System.out.println(" The sum of " + a + " and " + b + " is : " + sum);

	}

}
