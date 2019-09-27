package com.test;

class A {

	int a;
	int b;

	A() {
		System.out.println(" from A()");
		a = 12;
		b = 34;
	}

	void m1() {
		System.out.println("from m1()");
		System.out.println(a);
		System.out.println(b);
	}
}

public class TestConstructor {
	public static void main(String[] args) {

		A a = new A();
		a.m1();

	}

}
